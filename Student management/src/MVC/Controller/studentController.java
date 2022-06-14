package MVC.Controller;

import MVC.Model.*;
import MVC.View.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.io.*;

public class studentController {
    // List of students
    static ArrayList<StudentModel> studentList = new ArrayList<StudentModel>();

    // Create a new studentModel object, add it to studentList, and write to file
    // String name, String id, String email, String phone, String address, String
    // dob, int mathGrade,
    // int englishGrade, double gpa, String classId
    public static void registerStudent(String name, String id, String email, String phone, String address, String dob,
            int mathGrade, int englishGrade, double gpa, String classId) {
        // check if the student is already exist
        if (!checkStudent(id)) {
            StudentModel student = new StudentModel(name, id, email, phone, address, dob, mathGrade, englishGrade, gpa,
                    classId);
            // String studentInfo = student.getStudentInfo();
            String studentInfo2 = student.getStudentInfo2();
            String fileName = "student.csv";
            writeStudentToFile(fileName, studentInfo2);
        } else {
            JOptionPane.showMessageDialog(null, "Student already exists");
        }
    }

    private static void writeStudentToFile(String fileName, String studentInfo) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            // write to file
            FileWriter fw = new FileWriter(file, true);
            fw.write(studentInfo + "\n");
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // check if the student is already exist
    public static boolean checkStudent(String id) {
        boolean isExist = false;
        String fileName = "student.csv";
        readStudentFromFile(fileName, studentList);
        for (StudentModel student : studentList) {
            if (student.getId().equals(id)) {
                isExist = true;
            }
        }
        return isExist;
    }

    // read from file
    public static void readStudentFromFile(String fileName, ArrayList<StudentModel> studentList) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            // read from file
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] studentInfo = line.split(",");
                StudentModel student = new StudentModel(studentInfo[0], studentInfo[1], studentInfo[2], studentInfo[3],
                        studentInfo[4], studentInfo[5], Integer.parseInt(studentInfo[6]),
                        Integer.parseInt(studentInfo[7]),
                        Double.parseDouble(studentInfo[8]), studentInfo[9]);
                studentList.add(student);
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Find student by id
    public static StudentModel findStudent(String id) {
        StudentModel student = null;
        String fileName = "student.csv";
        readStudentFromFile(fileName, studentList);
        for (StudentModel s : studentList) {
            if (s.getId().equals(id)) {
                student = s;
            }
        }
        return student;
    }

    // edit student provided with id
    public static void editStudent(String id, String name, String email, String phone, String address, String dob,
            int mathGrade, int englishGrade, double gpa, String classId) {
        StudentModel student = findStudent(id);
        if (student != null) {
            student.setName(name);
            student.setEmail(email);
            student.setPhone(phone);
            student.setAddress(address);
            student.setDob(dob);
            student.setMathGrade(mathGrade);
            student.setEnglishGrade(englishGrade);
            student.setGpa(gpa);
            student.setClassId(classId);
            String studentInfo2 = student.getStudentInfo2();
            String fileName = "student.csv";
            writeStudentToFile(fileName, studentInfo2);
        } else {
            JOptionPane.showMessageDialog(null, "Student not found");
        }
    }

    // Find student by name and return a list of students
    public static ArrayList<StudentModel> findStudentByName(String name) {
        ArrayList<StudentModel> studentList = new ArrayList<StudentModel>();
        String fileName = "student.csv";
        readStudentFromFile(fileName, studentList);
        ArrayList<StudentModel> studentList2 = new ArrayList<StudentModel>();
        for (StudentModel student : studentList) {
            if (student.getName().equals(name)) {
                studentList2.add(student);
            }
        }
        return studentList2;
    }

    // Find student by classId and return a list of students
    public static ArrayList<StudentModel> findStudentByClassId(String classId) {
        ArrayList<StudentModel> studentList = new ArrayList<StudentModel>();
        String fileName = "student.csv";
        readStudentFromFile(fileName, studentList);
        ArrayList<StudentModel> studentList2 = new ArrayList<StudentModel>();
        for (StudentModel student : studentList) {
            if (student.getClassId().equals(classId)) {
                studentList2.add(student);
            }
        }
        return studentList2;
    }

    // Find student id and delete it
    public static void deleteStudent(String id) {
        StudentModel student = findStudent(id);
        if (student != null) {
            studentList.remove(student);
            String studentInfo2 = student.getStudentInfo2();
            String fileName = "student.csv";
            deleteAllStudent();
            for (StudentModel s : studentList) {
                writeStudentToFile(fileName, s.getStudentInfo2());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Student not found");
        }
    }

    // Delete data on the file and replace with the new studentList
    public static void deleteAllStudent() {
        String fileName = "student.csv";
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, false);
            fw.write("");
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
