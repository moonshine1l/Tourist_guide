package ru.moonshine.tourist_guide.activity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {
    Connection conn;
    String tourTitle;

    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            {
                try {
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_db", "root", "");
                    Statement st = conn.createStatement();
                    ResultSet tourTitle = st.executeQuery("Select title from journey");
                    String result = "";

                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }
    }

}
