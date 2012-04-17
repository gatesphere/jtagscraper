// jtagscraper
// Jacob Peck
// 20120416

import org.jaudiotagger.tag.*;
import org.jaudiotagger.audio.*;
import java.io.*;

public class JTagScraperXMLDocument {
  String contents = null;
  Tag tag;
  AudioHeader header;
  
  public JTagScraperXMLDocument(Tag t, AudioHeader h) { this.tag = t; this.header = h; }
  
  public JTagScraperXMLDocument populateContents() {
    StringBuilder sb = new StringBuilder();
    sb.append("<?xml ?>\n");
    sb.append("  <song>\n");
    sb.append("    <artist>" + tag.getFirst(FieldKey.ARTIST) + "</artist>\n");
    sb.append("    <album_artist>" + tag.getFirst(FieldKey.ALBUM_ARTIST) + "</album_artist>\n");
    sb.append("    <album>" + tag.getFirst(FieldKey.ALBUM) + "</album>\n");
    sb.append("    <track>" + tag.getFirst(FieldKey.TRACK) + "</track>\n");
    sb.append("    <title>" + tag.getFirst(FieldKey.TITLE) + "</title>\n");
    sb.append("    <year>" + tag.getFirst(FieldKey.YEAR) + "</year>\n");
    sb.append("    <genre>" + tag.getFirst(FieldKey.GENRE) + "</genre>\n");
    sb.append("    <track_length>" + header.getTrackLength() + "</track_length>\n");
    sb.append("  </song>\n");
    contents = sb.toString();
    return this;
  }
  
  public JTagScraperXMLDocument saveFile(String filename) throws Exception {
    FileWriter fw = new FileWriter(new File(filename));
    fw.write(contents);
    fw.flush();
    fw.close();
    return this;
  }
}
