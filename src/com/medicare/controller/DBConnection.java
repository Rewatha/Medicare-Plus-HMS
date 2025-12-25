/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medicare.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RewSum
 */
public class DBConnection {

    private static final String HOST = "db.cffzumgxvtfsfarulqrj.supabase.co";

    private static final String DB_NAME = "postgres";

    private static final String USER = "postgres";

    private static final String PASSWORD = "MediCareDB4321@#T21";

    private static final String PORT = "5432";

    public static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:postgresql://" + HOST + ":" + PORT + "/" + DB_NAME + "?sslmode=require";

            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(url, USER, PASSWORD);
            System.out.println("Connected to Supabase successfully!");

        } catch (ClassNotFoundException | SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }
}
