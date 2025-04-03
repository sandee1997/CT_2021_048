package Q_05;

public class Main {
    public static void main(String[] args) {
        Course course=new Course();
        Lecturer lecturer=new Lecturer();
        Student student=new Student();

        course.setCourseName("OOP");
        course.setCourseCode("CTEC-22043");

        lecturer.setLecturerName("Mr.Silva");
        lecturer.setCourseTeaching("OOP");

        student.setStudentName("Sandeepa");
        student.setDegreeName("Information and Communication Technology");
        student.setCourseFollowing("OOP");

        System.out.println(course.getCourseName()+" "+course.getCourseCode());
        System.out.println(lecturer.getLecturerName()+" "+lecturer.getCourseTeaching());
        System.out.println(student.getStudentName()+" "+student.getDegreeName()+" "+student.getCourseFollowing());
    }
}
