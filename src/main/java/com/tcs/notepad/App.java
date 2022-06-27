package com.tcs.notepad;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Hello JDBC!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            Connection connection = DataSource.getConnection();
            NoteDAO noteDAO = new NoteDAO(connection);

            /*
             * Note newNote = new Note("Second Note", "Hello again! :P");
             * noteDAO.createNote(newNote);
             */

            List<Note> allNotes = noteDAO.getAllNotes();
            System.out.println(allNotes);

            /*
             * Note firstNote = noteDAO.getNote(1);
             * System.out.println(firstNote);
             */

            /*
             * Note secondNote = noteDAO.getNote(2);
             * secondNote.setContent("Hello over and over again :O");
             * noteDAO.editNote(secondNote);
             */

            /* noteDAO.deleteNote(1); */
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
