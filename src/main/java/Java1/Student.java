package Java1;


public class Student {
    private int studentId;
    private char studentType;

    public Student(int id, char type)
    {
        studentId = id;
        studentType = type;
    }

    public char getStudentType() {
        return studentType;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }
}
