#!/usr/bin/env bash

CLASSES="lib/jaudiotagger.jar:lib/commons-io.jar:classes/."
MAIN="JTagScraper"

echo "Running..."
if [[ $OSTYPE == linux-gnu ]]; then
  java -cp $CLASSES $MAIN $1
elif [[ $OSTYPE == cygwin ]]; then
  java -cp `cygpath -wp $CLASSES` $MAIN $1
else 
  echo "Unknown platform."
fi
echo "Done."