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
        System.out.println("init");
        studentController instance = new studentController();
        JTable table = new JTable();
        instance.init(table);
        // if isNull is true, then this test is passed
        assertNotNull(instance.isNull);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testCheckEmail() {
        // check email with a random email
        System.out.println("checkEmail");
        String email = randomEmail(20);
        studentController instance = new studentController();
        boolean expResult = true;
        boolean result = instance.checkEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCheckDate() {
        // check date in the dd/mm/yyyy
        System.out.println("checkDate");
        String date = randomDob();
        studentController instance = new studentController();
        boolean expResult = true;
        boolean result = instance.checkDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testCheckPhone() {
        // check phone number with a random phone number
        System.out.println("checkPhone");
        String phone = randomPhone(10);
        studentController instance = new studentController();
        boolean expResult = true;
        boolean result = instance.checkPhone(phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCheckStudent() {
        // read the file student.csv
        // read the second column of the file as id
        // check if the id is in the student list
        // if the id is in the student list, then this test is passed
        System.out.println("checkStudent");
        studentController instance = new studentController();
        instance.getStudentList();
        String id = studentController.studentList.get(1).getId();
        boolean expResult = true;
        boolean result = instance.checkStudent(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testReadStudentFromFile() {
        // read the file student.csv
        // if student list is not null, then this test is passed
        System.out.println("readStudentFromFile");
        studentController instance = new studentController();
        instance.readStudentFromFile("student.csv", instance.studentList);
        assertNotNull(studentController.studentList);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testFindStudent() {
        // read the students from the file student.csv and get an id from the student
        // list
        // find the student with the id
        // if the student is not null, then this test is passed
        System.out.println("findStudent");
        studentController instance = new studentController();
        instance.getStudentList();
        String id = studentController.studentList.get(1).getId();
        StudentModel result = instance.findStudent(id);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testEditStudent() {
        // edit student info with String name, String id, String email, String phone,
        // String address, String dob,
        // int mathGrade, int englishGrade, String classId
        // if the student is edited, then this test is passed
        System.out.println("editStudent");
        studentController instance = new studentController();
        instance.getStudentList();
        String id = studentController.studentList.get(1).getId();
        String name = randomString(10);
        String email = randomEmail(10);
        String phone = randomPhone(10);
        String address = randomString(10);
        String dob = randomDob();
        int mathGrade = randomGrade();
        int englishGrade = randomGrade();
        String classId = "class1";
        // find the student with the id, if the student is not null, then this test is
        // passed
        StudentModel result = instance.findStudent(id);
        assertNotNull(result);

    }

    @Test
    public void testFindStudentByName() {
        // read the file, the first column for name, then find the student with the name
        // if the student is not null, then this test is passed
        System.out.println("findStudentByName");
        studentController instance = new studentController();
        instance.getStudentList();
        String name = studentController.studentList.get(1).getName();
        ArrayList<StudentModel> result = instance.findStudentByName(name);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testFindStudentByClassId() {
        // Read the file student.csv, last column for classId, then find the list of
        // student
        // with the classId
        // if the student list is not null, then this test is passed

        System.out.println("findStudentByClassId");
        studentController instance = new studentController();
        // add 10 random students into the file
        for (int i = 0; i < 10; i++) {
            String id = randomString(10);
            String name = randomString(10);
            String email = randomEmail(10);
            String phone = randomPhone(10);
            String address = randomString(10);
            String dob = randomDob();
            int mathGrade = randomGrade();
            int englishGrade = randomGrade();
            String classId = "class1";
            String line = id + "," + name + "," + email + "," + phone + "," + address + "," + dob + "," + mathGrade
                    + "," + englishGrade + "," + classId;
            // create new student
            StudentModel student = new StudentModel(id, name, email, phone, address, dob, mathGrade, englishGrade,
                    classId);
            // add student to the file
            instance.registerStudent(name, id, email, phone, address, dob, mathGrade, englishGrade, classId);
            ;
        }
        instance.getStudentList();
        String classId = studentController.studentList.get(1).getClassId();
        ArrayList<StudentModel> result = instance.findStudentByClassId(classId);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testDeleteStudent() {
        // read the file student.csv, get an id from the student list
        // delete the student with the id
        // if the student is deleted, then the student when finding with id is null
        // and this test is passed
        System.out.println("deleteStudent");
        studentController instance = new studentController();
        instance.getStudentList();
        String id = studentController.studentList.get(1).getId();
        instance.deleteStudent(id);
        StudentModel result = instance.findStudent(id);
        assertNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testDeleteAllStudent() {
        // delete all student in the student list
        // if the student list is empty, then this test is passed
        System.out.println("deleteAllStudent");
        studentController instance = new studentController();
        instance.getStudentList();
        instance.deleteAllStudent();
        // expected result = studentList
        // studentList.clear
        ArrayList<StudentModel> expResult = instance.studentList;
        expResult.clear();
        assertEquals(expResult, studentController.studentList);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCheckGrade() {
        // check the grade is between 0 and 100
        // if the grade is between 0 and 100, then this test is passed
        System.out.println("checkGrade");
        int grade = randomGrade();
        studentController instance = new studentController();
        boolean expResult = true;
        boolean result = instance.checkGrade(grade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCancel() {

        System.out.println("cancel");
        studentController instance = new studentController();
        instance.cancel();
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testAddStudent() {
        // if the current window open and addStudentGUI is opened, then this test is
        // passed
        System.out.println("addStudent");
        studentController instance = new studentController();
        instance.addStudent();
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testSortStudentByGpaAscending() {
        // sort the student list by the order of gpa ascending
        // check the gpa of student from first to last, if it's in
        // ascending order, then this test is passed
        System.out.println("sortStudentByGpaAscending");
        studentController instance = new studentController();
        instance.getStudentList();
        instance.sortStudentByGpaAscending();
        ArrayList<StudentModel> result = instance.studentList;
        for (int i = 0; i < result.size() - 1; i++) {
            assertTrue(result.get(i).getGpa() <= result.get(i + 1).getGpa());
        }
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testSortStudentByGpaDescending() {
        // sort the student list by the order of gpa descending
        // check the gpa of student from first to last, if it's in
        // descending order, then this test is passed
        System.out.println("sortStudentByGpaDescending");
        studentController instance = new studentController();
        instance.getStudentList();
        instance.sortStudentByGpaDescending();
        ArrayList<StudentModel> result = instance.studentList;
        for (int i = 0; i < result.size() - 1; i++) {
            assertTrue(result.get(i).getGpa() >= result.get(i + 1).getGpa());
        }
        // TODO review the generated test code and remove the default call to fail.
    }

}
