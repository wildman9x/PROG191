/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package MVC.Controller;

import MVC.Model.UserModel;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author wildm
 */
public class loginControllerTest {
    
    public loginControllerTest() {
    }

    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "admin";
        String password = "admin";
        loginController instance = new loginController();
        boolean expResult = true;
        instance.loginUser(username, password);
        boolean result = instance.isLogin;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    @Test
    public void testLoginUserWrong() {
        System.out.println("loginUser");
        String username = "vavaerbreberberbresssaasa";
        String password = "vagregergererbervavav";
        loginController instance = new loginController();
        boolean expResult = false;
        instance.loginUser(username, password);
        boolean result = instance.isLogin;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }


    @Test
    public void testReadUserFromFile() {
        System.out.println("readUserFromFile");
        String fileName = "user.csv";
        ArrayList<UserModel> userList = new ArrayList<UserModel>();
        loginController instance = new loginController();
        instance.readUserFromFile(fileName, userList);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testRegister() {
        // The current window closes and a new window is opened
        System.out.println("register");

        loginController instance = new loginController();
        instance.register();
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
