# jtagscraper
Jacob M. Peck

## Overview
A small program to scrape the ID3 tags from a
large music collection and provide an XML database
of the results.

## License
jtagscraper is BSD Licensed.

### jaudiotagger
jaudiotagger is licensed under the LGPL license.

### Apache Commons IO
Apache Commons IO is licenced under the Apache License 2.0.

## Compilation
Run the following on a UNIX/Cygwin machine:
    
    ./build.sh

## Usage
Run like so:

    ./run.sh /path/to/music/library/root

For example, on my Windows box, my music resides at C:\Users\Jake\Music.  I'd do:

    ./run.sh C:/Users/Jake/Music

(assuming a cygwin install...)

On my linux box:

    ./run.sh ~/music/

You will end up with a large collection of XML files in the data/ directory.

-->Jake