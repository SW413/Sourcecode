#!/usr/bin/env bash
find . -type f -not -name '*.g4' -not -name '*.sh' | xargs rm
java -jar /usr/local/lib/antlr-4.5-complete.jar ourLang.g4
javac ourLang*.java 