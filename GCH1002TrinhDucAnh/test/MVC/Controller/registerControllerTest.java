/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package MVC.Controller;

import org.junit.Test;

import MVC.Model.UserModel;

import static org.junit.Assert.*;

/**
 *
 * @author wildm
 */
public class registerControllerTest {

    public registerControllerTest() {
    }

    @Test
    public void testRegisterUser() {
        // if a message dialog saying "Register successfully" is shown, then this test
        // is passed
        System.out.println("registerUser");
        // username and password of random string
        String username = randomString(20);
        String password = randomString(20);
        registerController instance = new registerController();
        boolean expResult = true;
        instance.registerUser(username, password);
        boolean result = instance.isRegister;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    // random string generator
    public String randomString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) ((int) (Math.random() * 26) + 97));
        }
        return sb.toString();
    }

    @Test
    public void testWriteUserToFile() {
        System.out.println("writeUserToFile");
        String fileName = "user.csv";
        UserModel user = new UserModel("", "");
        registerController instance = new registerController();
        instance.writeUserToFile(fileName, user.getUserInfo2());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testCancel() {
        // the current window closes and loginGUI opens

        System.out.println("cancel");
        registerController instance = new registerController();
        instance.cancel();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");

    }

    @Test
    public void testCheckUserName() {
        // check username "admin", if exist, then the test passes
        System.out.println("checkUserName");
        String userName = "admin";
        registerController instance = new registerController();
        boolean expResult = true;
        boolean result = instance.checkUserName(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testReadUserFromFile() {
        // read user from file, if the user is admin, then the test passes
        System.out.println("readUserFromFile");
        String fileName = "user.csv";
        registerController instance = new registerController();
        instance.readUserFromFile(fileName, instance.userList);
        boolean expResult = true;
        boolean result = false;
        for (UserModel user : instance.userList) {
            if (user.getUserName().equals("admin")) {
                result = true;
                break;
            }
        }
    }

}
