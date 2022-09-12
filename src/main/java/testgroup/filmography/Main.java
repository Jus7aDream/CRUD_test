package testgroup.filmography;

import javax.sound.midi.Soundbank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 * @ In the name of Allah, most gracious and most merciful 12.09.2022
 */
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=Europe/Moscow&useSSL=false";
        String username = "root";
        String password = "Qaz123321";
        System.out.println("Connecting...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
