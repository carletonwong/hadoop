package Java1;


public class CourseManagement {

    public static void main(String[] args)
    {
        Student student = new Student(234, 'L');
        student.setStudentType('S');

        System.out.println(Integer.toString(student.getStudentId()) + ' ' + student.getStudentType());

    }
}
