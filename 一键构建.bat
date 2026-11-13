@echo off
setlocal
cd /d "%~dp0"

rem Prefer the provisioned JDK 17 for running Gradle; fall back to MCreator's bundled JDK.
set "JDK17=C:\Users\Administrator\.gradle\jdks\eclipse_adoptium-17-amd64-windows.2"
if exist "%JDK17%\bin\java.exe" (
    set "JAVA_HOME=%JDK17%"
) else (
    set "JAVA_HOME=D:\Users\Administrator\Desktop\users\MCreator\jdk"
)
set "PATH=%JAVA_HOME%\bin;%PATH%"

echo ============================================
echo  Building lchengzhijian (Forge 1.20.1)
echo  JAVA_HOME = %JAVA_HOME%
echo ============================================
echo.

call gradlew.bat build --console=plain
if errorlevel 1 goto fail

echo.
echo ============================================
echo  BUILD OK. Output jar:
echo ============================================
dir /b "build\libs\*.jar"
echo.
echo Copy it into .minecraft\mods (needs Forge 1.20.1).
goto end

:fail
echo.
echo ============================================
echo  BUILD FAILED - see the errors above.
echo ============================================

:end
echo.
pause
