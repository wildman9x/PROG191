/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package MVC.Controller;

import MVC.Model.StudentModel;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JTable;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wildm
 */
public class studentControllerTest {

    public studentControllerTest() {
    }

    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        // if a message dialog saying "Register successfully" is shown, then this test
        // is passed
        // student information include name, id, email, phone number, address, dob,
        // mathGrade, englishGrade, classId
        String name = randomString(20);
        String id = randomString(20);
        String email = randomEmail(20);
        String phone = randomPhone(10);
        String address = randomString(20);
        String dob = randomDob();
        int mathGrade = randomGrade();
        int englishGrade = randomGrade();
        String classId = randomString(20);
        studentController instance = new studentController();
        boolean expResult = true;
        instance.registerStudent(name, id, email, phone, address, dob, mathGrade, englishGrade, classId);
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

    // random email generator
    public String randomEmail(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) ((int) (Math.random() * 26) + 97));
        }
        return sb.toString() + "@gmail.com";
    }

    // random phone number generator that consists of all integer
    public String randomPhone(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((int) (Math.random() * 10));
        }
        return sb.toString();
    }

    // random date of birth generator, date, month, year are separated by "/"
    public String randomDob() {
        StringBuilder sb = new StringBuilder();
        int date = (int) (Math.random() * 30) + 1;
        int month = (int) (Math.random() * 12) + 1;
        int year = (int) (Math.random() * 100) + 1900;
        sb.append(date);
        sb.append("/");
        sb.append(month);
        sb.append("/");
        sb.append(year);
        return sb.toString();

    }

    // random grade generator
    public int randomGrade() {
        return (int) (Math.random() * 100) + 1;
    }

    @Test
    public void testPopulateTable() {
        System.out.println("populateTable");
        studentController instance = new studentController();
        instance.getStudentList();
        // new JTable is populated with student information
        // JTable expResult = null;

        JTable result = new JTable();
        instance.populateTable(result);
        // if isNull is true, then this test is fails
        assertNotNull(instance.isNull);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testGetStudentList() {
        System.out.println("getStudentList");
        studentController instance = new studentController();
        // student list is returned
        // ArrayList<Student> expResult = null;
        studentController.studentList.clear();
        ArrayList<StudentModel> result = null;
        instance.getStudentList();
        // if result is not null, then this test is passed
        assertNotNull(studentController.studentList);

        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testInit() {
    }

    @Test
    public void testCheckEmail() {
    }

    @Test
    public void testCheckDate() {
    }

    @Test
    public void testCheckPhone() {
    }

    @Test
    public void testCheckStudent() {
    }

    @Test
    public void testReadStudentFromFile() {
    }

    @Test
    public void testFindStudent() {
    }

    @Test
    public void testEditStudent() {
    }

    @Test
    public void testFindStudentByName() {
    }

    @Test
    public void testFindStudentByClassId() {
    }

    @Test
    public void testDeleteStudent() {
    }

    @Test
    public void testDeleteAllStudent() {
    }

    @Test
    public void testCheckGrade() {
    }

    @Test
    public void testCancel() {
    }

    @Test
    public void testAddStudent() {
    }

    @Test
    public void testSortStudentByGpaAscending() {
    }

    @Test
    public void testSortStudentByGpaDescending() {
    }

}
