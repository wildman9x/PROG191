package MVC.Model;

public class StudentModel extends PersonModel {

    // Math and English grade
    private int mathGrade;
    private int englishGrade;
    // GPA
    private double gpa;
    // Class
    private String classId;

    public StudentModel() {
    }

    public StudentModel(String name, String id, String email, String phone, String address, String dob, int mathGrade,
            int englishGrade, double gpa, String classId) {
        super(name, id, email, phone, address, dob);
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.gpa = gpa;
        this.classId = classId;
    }

    // StudentModel method but dont take in gpa
    public StudentModel(String name, String id, String email, String phone, String address, String dob, int mathGrade,
            int englishGrade, String classId) {
        super(name, id, email, phone, address, dob);
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.gpa = calculateGpa();
        this.classId = classId;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // calculate GPA
    public double calculateGpa() {
        double gpa = (double) (getMathGrade() + getEnglishGrade()) / 2;
        return gpa;
    }

    // void function calculateGpa()
    public void calculateGpa2() {
        setGpa(calculateGpa());
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", mathGrade=" + mathGrade +
                ", englishGrade=" + englishGrade +
                ", gpa=" + gpa +
                ", classId='" + classId + '\'' +
                '}';
    }

    public String getStudentInfo() {
        return "StudentModel{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", mathGrade=" + mathGrade +
                ", englishGrade=" + englishGrade +
                ", gpa=" + gpa +
                ", classId='" + classId + '\'' +
                '}';
    }

    // tostring2 that export to csv
    public String getStudentInfo2() {
        return name + "," + id + "," + email + "," + phone + "," + address + "," + dob + "," + mathGrade + ","
                + englishGrade + "," + gpa + "," + classId;
    }

}
