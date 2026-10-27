$ErrorActionPreference = 'Stop'
$ProgressPreference = 'SilentlyContinue'
$installRoot = Join-Path $env:USERPROFILE '.gradle\manual-dists'
$gradleDir = Join-Path $installRoot 'gradle-8.7'
if (Test-Path (Join-Path $gradleDir 'bin\gradle.bat')) { exit 0 }
New-Item -ItemType Directory -Force -Path $installRoot | Out-Null
$archive = Join-Path $installRoot 'gradle-8.7-bin.zip'
try {
    Write-Host 'Downloading Gradle 8.7 from services.gradle.org ...'
    Invoke-WebRequest -Uri 'https://services.gradle.org/distributions/gradle-8.7-bin.zip' -OutFile $archive -UseBasicParsing
    Expand-Archive -LiteralPath $archive -DestinationPath $installRoot -Force
    if (-not (Test-Path (Join-Path $gradleDir 'bin\gradle.bat'))) { throw 'Missing gradle.bat' }
} catch {
    Write-Error $_
    exit 1
} finally {
    if (Test-Path $archive) { Remove-Item -LiteralPath $archive -Force }
}
