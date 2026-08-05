#!/bin/bash

ANTLR_JAR="/home/pablo03/compilator_java_resources/antlr-4.13.2-complete.jar"

GRAMMAR="CodexLatinus.g4"

PACKAGE="com.pablocompany.practica.no1.compi2.compiler.generated"

OUTPUT_DIR="generated"

echo "======================================"
echo " Generando parser con ANTLR4"
echo "======================================"

java -jar "$ANTLR_JAR" \
    -visitor \
    -listener \
    -long-messages \
    -package "$PACKAGE" \
    -o "$OUTPUT_DIR" \
    "$GRAMMAR"

echo ""
echo "Generación finalizada."
