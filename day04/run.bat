@echo off
set /p fname=실행할 파일이름:
javac %fname%.java

java %fname%