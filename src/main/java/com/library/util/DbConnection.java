package com.library.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String URL = "jdbc:mysql://avnadmin:AVNS_PPMcIA3iHVb8U8fpyp6@mysql-2941b198-khadijagoumarzouazte-43d2.a.aivencloud.com:17966/defaultdb?ssl-mode=REQUIREDmysql://avnadmin:AVNS_PPMcIA3iHVb8U8fpyp6@mysql-2941b198-khadijagoumarzouazte-43d2.a.aivencloud.com:17966/library_db?ssl-mode=REQUIRED";
    private static final String USER = "avnadmin";
    private static final String PASSWORD = "AVNS_PPMcIA3iHVb8U8fpyp6";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Database connection error", e);
        }
    }
}
