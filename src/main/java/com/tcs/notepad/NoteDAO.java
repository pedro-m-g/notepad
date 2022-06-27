package com.tcs.notepad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NoteDAO {

  private Connection connection;

  public NoteDAO(Connection connection) {
    this.connection = connection;
  }

  public boolean createNote(Note note) throws SQLException {
    String query = "INSERT INTO note (title, content) VALUES (?, ?)";
    try (PreparedStatement statement = connection.prepareStatement(query)) {
      statement.setString(1, note.getTitle());
      statement.setString(2, note.getContent());
      return statement.execute();
    }
  }

  public Note getNote(int id) throws SQLException {
    String query = "SELECT * FROM note WHERE id = ?";
    try (PreparedStatement statement = connection.prepareStatement(query)) {
      statement.setInt(1, id);

      Note note = null;

      ResultSet rs = statement.executeQuery();
      while (rs.next()) {
        String title = rs.getString("title");
        String content = rs.getString("content");
        note = new Note(id, title, content);
        break;
      }
      return note;
    }
  }

  public List<Note> getAllNotes() throws SQLException {
    String query = "SELECT * FROM note";
    try (Statement statement = connection.createStatement()) {
      ResultSet rs = statement.executeQuery(query);
      List<Note> notes = new ArrayList<>();
      while (rs.next()) {
        int id = rs.getInt("id");
        String title = rs.getString("title");
        String content = rs.getString("content");
        Note note = new Note(id, title, content);
        notes.add(note);
      }
      return notes;
    }
  }

  public boolean deleteNote(int id) throws SQLException {
    String query = "DELETE FROM note WHERE id = ?";
    try (PreparedStatement statement = connection.prepareStatement(query)) {
      statement.setInt(1, id);
      return statement.execute();
    }
  }

  public boolean editNote(Note note) throws SQLException {
    String query = "UPDATE note SET title = ?, content = ? WHERE id = ?";
    try (PreparedStatement statement = connection.prepareStatement(query)) {
      statement.setString(1, note.getTitle());
      statement.setString(2, note.getContent());
      statement.setInt(3, note.getId());
      return statement.execute();
    }
  }

}
