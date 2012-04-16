// jtagscraper
// Jacob Peck
// 20120416

// standard java stuff
import java.io.*;
import java.util.*;

// apache commons io
import org.apache.commons.io.*;
import org.apache.commons.io.filefilter.*;

// jaudiotagger
import org.jaudiotagger.audio.*;
import org.jaudiotagger.tag.*;
import org.jaudiotagger.audio.exceptions.*;

public class JTagScraper {
  public static void main(String[] args) throws Exception {
    if(args.length != 1) usage();
    File library = new File(args[0]);
    Collection<File> files = FileUtils.listFiles(library,
                                                 FileFileFilter.FILE,
                                                 DirectoryFileFilter.DIRECTORY);
    
    AudioFile a = null;
    Tag t = null;
    for(File f : files) {
      try {  
        a = AudioFileIO.read(f);
        t = a.getTag();
        System.out.println(f.getName());
      } catch (CannotReadException ex) {
        // skip file
        continue;
      }
    }

  }
  
  public static void usage() {
    System.out.println("Usage: ./run.sh <music_library_location>");
    System.exit(-1);
  }
}