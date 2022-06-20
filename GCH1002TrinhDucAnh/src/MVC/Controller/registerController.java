package MVC.Controller;

import MVC.Model.*;
import MVC.View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
// import write to file
import java.io.File;
import java.io.FileWriter;

public class registerController {
    static ArrayList<UserModel> userList = new ArrayList<UserModel>();
    static boolean isRegister = false;

    // Create a user object from UserModel and write the login information to file
    // user.csv
    public static void registerUser(String userName, String userPassword) {
        // check if the userName is already exist
        if (!checkUserName(userName)) {
            UserModel user = new UserModel(userName, userPassword);
            // String userInfo = user.getUserInfo();
            String userInfo2 = user.getUserInfo2();
            String fileName = "user.csv";
            writeUserToFile(fileName, userInfo2);
            JOptionPane.showMessageDialog(null, "Register successfully");
            isRegister = true;
            // go to loginGUI
            LoginGUI loginGUI = new LoginGUI();
            loginGUI.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "UserName is already exist");
        }
    }

    // write to file
    public static void writeUserToFile(String fileName, String userInfo2) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            // write to file
            FileWriter fw = new FileWriter(file, true);
            fw.write(userInfo2 + "\n");
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Cancel function that return to LoginGUI
    public static void cancel() {
        LoginGUI loginGUI = new LoginGUI();
        loginGUI.setVisible(true);
    }

    // Check if userName is already exist
    public static boolean checkUserName(String userName) {
        boolean isExist = false;
        String fileName = "user.csv";
        readUserFromFile(fileName, userList);
        for (UserModel user : userList) {
            if (user.getUserName().equals(userName)) {
                isExist = true;
                break;
            }
        }
        return isExist;
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
                userList.add(user);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
