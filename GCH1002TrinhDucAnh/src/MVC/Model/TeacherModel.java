package MVC.Model;

public class TeacherModel extends PersonModel {
    private String teacherId;

    public TeacherModel() {
    }

    public TeacherModel(String name, String id, String email, String phone, String address, String dob,
            String teacherId) {
        super(name, id, email, phone, address, dob);
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "TeacherModel{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", teacherId='" + teacherId + '\'' +
                '}';
    }

    // toString2 that export to csv
    public String getTeacherInfo2() {
        return name + "," + id + "," + email + "," + phone + "," + address + "," + dob + "," + teacherId;
    }
}
