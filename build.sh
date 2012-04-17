#!/usr/bin/env bash

SRC="src/"
LIB="lib/jaudiotagger.jar:lib/commons-io.jar:classes/."
CLASSES="classes/"

echo "Building..."

if [ ! -e "$CLASSES" ]; then
  mkdir $CLASSES
fi

if [[ $OSTYPE == linux-gnu ]]; then
  javac -cp $LIB -sourcepath $SRC -d $CLASSES $1 $SRC/*.java
elif [[ $OSTYPE == cygwin ]]; then
  javac -cp `cygpath -wp $LIB` -sourcepath $SRC -d $CLASSES $1 $SRC/*.java
else
  echo "Unknown platform."
fi
echo "Done."
