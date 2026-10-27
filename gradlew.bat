@echo off
setlocal
set "PROJECT_DIR=%~dp0"
set "GRADLE_HOME=%USERPROFILE%\.gradle\manual-dists\gradle-8.7"
if not exist "%GRADLE_HOME%\bin\gradle.bat" (
  echo [INFO] Dang tai Gradle 8.7 lan dau qua PowerShell...
  powershell.exe -NoProfile -ExecutionPolicy Bypass -File "%PROJECT_DIR%scripts\bootstrap-gradle.ps1"
  if errorlevel 1 (
    echo [ERROR] Tai Gradle that bai. Kiem tra Internet, hoac mo project bang Android Studio.
    exit /b 1
  )
)
call "%GRADLE_HOME%\bin\gradle.bat" %*
exit /b %ERRORLEVEL%
