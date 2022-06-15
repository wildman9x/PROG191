package MVC.Controller;

import MVC.Model.*;
import MVC.View.*;
import MVC.View.StudentListGUI;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.io.*;

public class studentController {
    // List of students
    public static ArrayList<StudentModel> studentList = new ArrayList<StudentModel>();

    // Create a new studentModel object, add it to studentList, and write to file
    // String name, String id, String email, String phone, String address, String
    // dob, int mathGrade,
    // int englishGrade, double gpa, String classId
    public static void registerStudent(String name, String id, String email, String phone, String address, String dob,
            int mathGrade, int englishGrade, String classId) {
        // check if the student is already exist
        if (!checkStudent(id) && checkEmail(email) && checkPhone(phone) && checkGrade(englishGrade)
                && checkGrade(mathGrade)) {

            StudentModel student = new StudentModel(name, id, email, phone, address, dob, mathGrade, englishGrade,
                    classId);
            // String studentInfo = student.getStudentInfo();
            String studentInfo2 = student.getStudentInfo2();
            String fileName = "student.csv";
            writeStudentToFile(fileName, studentInfo2);

        } else {
            if (checkStudent(id)) {
                JOptionPane.showMessageDialog(null, "Student already exists");
            }
            if (!checkEmail(email)) {
                JOptionPane.showMessageDialog(null, "Invalid email address");
            }
            if (!checkPhone(phone)) {
                JOptionPane.showMessageDialog(null, "Invalid phone number");
            }
            if (!checkGrade(englishGrade)) {
                JOptionPane.showMessageDialog(null, "Invalid english grade");
            }
            if (!checkGrade(mathGrade)) {
                JOptionPane.showMessageDialog(null, "Invalid math grade");
            }
        }
    }

    // populate table, read from studentList and write to table with their id, name,
    // class, math, eng, gpa
    public static void populateTable(JTable table) {
        // clear table
        table.setModel(new DefaultTableModel());
        // populate table
        for (StudentModel student : studentList) {
            String[] row = { student.getId(), student.getName(), student.getClassId(), student.getMathGrade() + "",
                    student.getEnglishGrade() + "", student.getGpa() + "" };
            ((DefaultTableModel) table.getModel()).addRow(row);
        }

    }

    // get studentList
    public static ArrayList<StudentModel> getStudentList() {
        String fileName = "student.csv";
        readStudentFromFile(fileName, studentList);
        return studentList;
    }

    // initial function that read from file and populate studentList
    public static void init(JTable table) {
        String fileName = "student.csv";
        readStudentFromFile(fileName, studentList);
        populateTable(table);
    }

    // check the email format
    public static boolean checkEmail(String email) {
        boolean isValid = false;
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
        if (email.matches(emailRegex)) {
            isValid = true;
        }
        return isValid;
    }

    // check the date format
    public static boolean checkDate(String date) {
        boolean isValid = false;
        String dateRegex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)"
                + "(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|"
                + "(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|"
                + "(?:(?:16|[2468][048]|[3579][26])00))))$|"
                + "(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        if (date.matches(dateRegex)) {
            isValid = true;
        }
        return isValid;
    }

    // Check phone number format
    public static boolean checkPhone(String phone) {
        boolean isValid = false;
        String phoneRegex = "^[0-9]{10}$";
        if (phone.matches(phoneRegex)) {
            isValid = true;
        }
        return isValid;
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

    // StudentID to find
    public static String idToFind;

    // Find student by id
    public static StudentModel findStudent(String id) {
        StudentModel student = null;
        String fileName = "student.csv";
        // clear studentList
        studentList.clear();
        readStudentFromFile(fileName, studentList);
        for (StudentModel s : studentList) {
            if (s.getId().equals(id)) {
                student = s;
            }
        }
        return student;
    }

    // edit student provided with id
    public static void editStudent(String name, String id, String email, String phone, String address, String dob,
            int mathGrade, int englishGrade, String classId) {
        StudentModel student = findStudent(id);
        if (student != null && checkEmail(email) && checkPhone(phone) && checkGrade(englishGrade)
                && checkGrade(mathGrade)) {
            student.setName(name);
            student.setEmail(email);
            student.setPhone(phone);
            student.setAddress(address);
            student.setDob(dob);
            student.setMathGrade(mathGrade);
            student.setEnglishGrade(englishGrade);
            // calculate gpa
            student.calculateGpa2();
            student.setClassId(classId);

            // studentList.clear();
            // studentList = getStudentList();
            // deleteAllStudent();
            // go through the list, find the student with matching id, delete it
            deleteStudent(id);
            String fileName = "student.csv";
            // // write all the list back to file
            // for (StudentModel s : studentList) {
            // String studentInfo = s.getStudentInfo2();
            // writeStudentToFile(fileName, studentInfo);
            // }

            String studentInfo2 = student.getStudentInfo2();

            writeStudentToFile(fileName, studentInfo2);

            // success dialog
            JOptionPane.showMessageDialog(null, "Edit student successfully");
        } else if (student == null) {
            JOptionPane.showMessageDialog(null, "Student not found");
        }
        if (!checkEmail(email)) {
            JOptionPane.showMessageDialog(null, "Email is not valid");
        }
        if (!checkPhone(phone)) {
            JOptionPane.showMessageDialog(null, "Phone is not valid");
        }
        if (checkGrade(englishGrade) == false) {
            JOptionPane.showMessageDialog(null, "English grade is not valid");
        }
        if (checkGrade(mathGrade) == false) {
            JOptionPane.showMessageDialog(null, "Math grade is not valid");
        }

    }

    // Find student by name and return a list of students
    public static ArrayList<StudentModel> findStudentByName(String name) {
        ArrayList<StudentModel> studentList = new ArrayList<StudentModel>();
        String fileName = "student.csv";
        readStudentFromFile(fileName, studentList);
        ArrayList<StudentModel> studentList2 = new ArrayList<StudentModel>();
        for (StudentModel student : studentList) {
            if (student.getName().contains(name)) {
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

    // check grade if it is valid
    public static boolean checkGrade(int grade) {
        boolean isValid = false;
        if (grade >= 0 && grade <= 100) {
            isValid = true;
        }
        return isValid;
    }

    // Cancel function that return to StudentListGUI
    public static void cancel() {
        StudentListGUI studentListGUI = new StudentListGUI();
        studentListGUI.setVisible(true);
    }

    // add button click, change to addStudentGUI
    public static void addStudent() {
        addStudentGUI addStudentGUI = new addStudentGUI();
        addStudentGUI.setVisible(true);
    }

    // Sort the student list by gpa ascending
    public static void sortStudentByGpaAscending() {
        studentList.clear();
        studentList = getStudentList();
        Collections.sort(studentList, new Comparator<StudentModel>() {
            @Override
            public int compare(StudentModel o1, StudentModel o2) {
                // round up the return
                return (int) Math.round(o1.getGpa() - o2.getGpa());
            }
        });
        // studentList.clear();
    }

    // Sort the student list by gpa descending
    public static void sortStudentByGpaDescending() {
        studentList.clear();
        studentList = getStudentList();
        Collections.sort(studentList, new Comparator<StudentModel>() {
            @Override
            public int compare(StudentModel o1, StudentModel o2) {
                // round up the return
                return (int) Math.round(o2.getGpa() - o1.getGpa());
            }
        });
        // studentList.clear();
    }
}
