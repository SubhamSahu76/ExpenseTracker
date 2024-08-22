/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnect {
    public static Connection conn;
    public static Statement st;

    static {
        try {
           
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb?useSSL=false", "root", "Subham@7643");

            // Create a statement object
            st = conn.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
