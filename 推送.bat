@echo off
setlocal EnableDelayedExpansion
cd /d "%~dp0"

set "GIT=D:\tools\portablegit\cmd\git.exe"
if not exist "%GIT%" set "GIT=git"
set GIT_SSH_COMMAND=ssh -o BatchMode=yes -o StrictHostKeyChecking=no

echo ================================================
echo  Push lchengzhijian to Gitee + GitHub
echo ================================================
echo.

%GIT% status --short
echo.

echo [1/3] Stage and commit changes...
%GIT% add -A 2>nul
%GIT% diff --cached --quiet
if not errorlevel 1 goto nocommit

set /p MSG=Commit message, Enter for [update]: 
if "%MSG%"=="" set MSG=update
%GIT% commit -q -m "%MSG%"
echo   committed
goto step2

:nocommit
echo   nothing to commit
echo.

:step2
echo [2/3] Push to Gitee...
%GIT% push origin master
set RC1=%errorlevel%
echo   exit code: %RC1%
echo.

echo [3/3] Push to GitHub...
%GIT% push github master
set RC2=%errorlevel%
echo   exit code: %RC2%
echo.

echo ================================================
if not "%RC1%"=="0" goto fail1
if not "%RC2%"=="0" goto fail2
echo  SUCCESS - both platforms updated
echo    https://gitee.com/lbh_cangku/lchengzhijian
echo    https://github.com/lbhf-1/lchengzhijian
goto end

:fail1
echo  FAILED on Gitee, step 2
goto end

:fail2
echo  FAILED on GitHub, step 3. Gitee part finished ok.

:end
echo ================================================
pause
