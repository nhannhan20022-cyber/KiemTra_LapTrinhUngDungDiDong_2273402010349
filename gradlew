#!/bin/sh
set -eu
DIR="$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)"
GRADLE_HOME="${HOME}/.gradle/manual-dists/gradle-8.7"
if [ ! -x "${GRADLE_HOME}/bin/gradle" ]; then
  echo "Downloading Gradle 8.7 (first run)..."
  mkdir -p "${HOME}/.gradle/manual-dists"
  TMP_ZIP="${HOME}/.gradle/manual-dists/gradle-8.7-bin.zip"
  if command -v curl >/dev/null 2>&1; then
    curl -fLsS --retry 2 -o "$TMP_ZIP" https://services.gradle.org/distributions/gradle-8.7-bin.zip
  elif command -v wget >/dev/null 2>&1; then
    wget -q -O "$TMP_ZIP" https://services.gradle.org/distributions/gradle-8.7-bin.zip
  else
    echo 'Install curl or wget, or open this project in Android Studio' >&2
    exit 1
  fi
  unzip -oq "$TMP_ZIP" -d "${HOME}/.gradle/manual-dists"
  rm -f "$TMP_ZIP"
fi
exec "${GRADLE_HOME}/bin/gradle" -p "$DIR" "$@"
