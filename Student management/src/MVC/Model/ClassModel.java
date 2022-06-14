package MVC.Model;

public class ClassModel {
    private String classId;

    private String className;
    private String teacherId;

    public ClassModel() {
    }

    public ClassModel(String classId, String className, String teacherId) {
        this.classId = classId;
        this.className = className;
        this.teacherId = teacherId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "ClassModel{" +
                "classId='" + classId + '\'' +
                ", className='" + className + '\'' +
                ", teacherId='" + teacherId + '\'' +
                '}';
    }

    public String getClassInfo() {
        return "ClassModel{" +
                "classId='" + classId + '\'' +
                ", className='" + className + '\'' +
                ", teacherId='" + teacherId + '\'' +
                '}';
    }

    // toString2 that export to csv
    public String getClassInfo2() {
        return classId + "," + className + "," + teacherId;
    }

}
