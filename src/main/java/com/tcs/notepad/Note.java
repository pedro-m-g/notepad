package com.tcs.notepad;

public class Note {

  private int id;

  private String title;

  private String content;

  public Note(String title, String content) {
    this(0, title, content);
  }

  public Note(int id, String title, String content) {
    this.id = id;
    this.title = title;
    this.content = content;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String toString() {
    String format = "\nNote #%d\n========================\n%s\n\n%s\n\n";
    return String.format(format, id, title, content);
  }

}
