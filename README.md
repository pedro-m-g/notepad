# Notepad

Sample project to practice queries to mysql

1. Install Java
  - Download JDK from [https://adoptopenjdk.net/](https://adoptopenjdk.net/) (Prefer the latest LTS version)
  - Run the installer (msi file)

2. Install Maven
  - Go to [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi) and download "Binary zip archive" file.

  - Unzip the folder to `C:\apache-maven-3.8.6` folder

  - Add `C:\apache-maven-3.8.6\bin` to `PATH` environment variable

  - Create `M2_HOME` environment variable and set it to `C:\apache-maven-3.8.6`

  - Execute the following commands to test installation:
    `mvn --version`
    `java -version`

3. Install MySQL Community Edition
  - Go to `https://dev.mysql.com/downloads/installer/`
  - Download any of the installers (prefer web unless you need to install offline)
  - Run the installer
  - Select "Custom Setup"
  - Exclude "MySQL for Visual Studio"
  - Proceed with download and installation
  - Configure password "root"4

4. Create database

5. Create project
  - Execute the following command in your workspace:
    `mvn archetype:generate`

  - Press `Enter` to choose default template

  - Press `Enter` again to choose latest template version

  - Enter "com.tcs" as groupId

  - Enter "notepad" as artifactId

  - Press `Enter` to choose default version

  - Enter "com.tcs.notepad" as package

  - Press `Enter` to confirm project creation

  - This will create a folder named `notepad` with a starter template

6. Install JDBC connector
  - Search for library in google, prefixing search with "maven", for example "maven jdbc connector"

  - Select the Maven Repository link

  - Choose the latest version ("8.0.29") link

  - Copy the code snippet

  - Paste the code snippet in the `dependencies` section of the `pom.xml` file

  - Execute the following command in your project's directory:
    `mvn install`

7. Create a DataSource class

9. Create a Model class

8. Create a DataAccessObject class

10. Use the DataAccessObject class to perform queries
