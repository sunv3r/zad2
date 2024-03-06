package org.example.start;

import org.example.user.User;

import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.Scanner;

import static org.example.logic.Logic.*;

public abstract class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        scanner = new Scanner(System.in);
        connectToDatabase();
        showMainMenu();
        closeConnection();
    }
}

