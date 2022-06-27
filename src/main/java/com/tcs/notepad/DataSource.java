package com.tcs.notepad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {

  private DataSource() {
  }

  private static Connection connection;

  public static Connection getConnection() throws SQLException {
    if (connection == null) {
      String dbms = "mysql";
      String server = "localhost";
      String port = "3306";
      String database = "notepad";

      String urlFormat = "jdbc:%s://%s:%s/%s";
      String url = String.format(urlFormat, dbms, server, port, database);

      Properties connectionProperties = new Properties();
      connectionProperties.put("user", "root");
      connectionProperties.put("password", "root");

      connection = DriverManager.getConnection(url, connectionProperties);
    }
    return connection;
  }

}
