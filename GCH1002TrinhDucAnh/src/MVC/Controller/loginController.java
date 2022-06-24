package MVC.Controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import MVC.Model.*;
import MVC.View.*;

public class loginController {
    static ArrayList<UserModel> userList = new ArrayList<UserModel>();
    static boolean isLogin = false;

    // Read from file user.csv and create a new user object for each line
    // user.csv
    public static void loginUser(String userName, String userPassword) {

        String fileName = "user.csv";
        readUserFromFile(fileName, userList);
        isLogin = false;
        for (UserModel user : userList) {
            if (user.getUserName().equals(userName) && user.getUserPassword().equals(userPassword)) {
                isLogin = true;
                break;
            }
        }
        if (isLogin) {
            JOptionPane.showMessageDialog(null, "Login successfully");
            // go to StudenListGUI
            StudentListGUI studentListGUI = new StudentListGUI();
            studentListGUI.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Login failed");
            // reopen LoginGUI
            LoginGUI loginGUI = new LoginGUI();
            loginGUI.setVisible(true);
        }
    }

    // Check if the input userName and userPassword is correct
    public void checkLogin(String userName, String userPassword) {

        String fileName = "user.csv";
        readUserFromFile(fileName, userList);
        isLogin = false;
        for (UserModel user : userList) {
            if (user.getUserName().equals(userName) && user.getUserPassword().equals(userPassword)) {
                isLogin = true;
                break;
            }
        }
        if (isLogin) {
            JOptionPane.showMessageDialog(null, "Login successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Login failed");
        }
    }

    // Read from file user.csv and create a new user object for each line
    public static void readUserFromFile(String fileName, ArrayList<UserModel> userList) {
        String line = "";
        String cvsSplitBy = ",";
        try {
            // Read from file user.csv
            java.io.FileReader fileReader = new java.io.FileReader(fileName);
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line by comma
                String[] userInfo = line.split(cvsSplitBy);
                // Create a new user object
                UserModel user = new UserModel(userInfo[0], userInfo[1]);
                // Add the user object to the userList
                userList.add(user);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Register function that go to RegisterGUI
    public static void register() {
        RegisterGUI registerGUI = new RegisterGUI();
        registerGUI.setVisible(true);

    }

}
