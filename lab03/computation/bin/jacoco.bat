#!/bin/bash

# Download the correct JARs from
# https://www.jacoco.org/jacoco/

# Remove any class files from dist and all jacoco coverage files
#./bin/clean

# Compile the application
#javac -encoding UTF-8 --source-path src -d dist src/*.java

# Compile the tests
#javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java

# Run the agent
#java -javaagent:lib/jacocoagent.jar -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path

# Generate a report
#java -jar lib/jacococli.jar report jacoco.exec --classfiles dist --sourcefiles src --html report

# Open the report
#open ./report/index.html

@echo off

REM Download the correct JARs from
REM https://www.jacoco.org/jacoco/

REM Remove any class files from dist and all jacoco coverage files
call bin\clean

REM Compile the application
javac -encoding UTF-8 -sourcepath src -d dist src\*.java

REM Compile the tests
javac -encoding UTF-8 -sourcepath test -d dist -cp dist;lib\junit-platform-console-standalone-1.7.1.jar test\*.java

REM Run the agent
java -javaagent:lib\jacocoagent.jar -jar lib\junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path

REM Generate a report
java -jar lib\jacococli.jar report jacoco.exec --classfiles dist --sourcefiles src --html report

REM Open the report
start report\index.html