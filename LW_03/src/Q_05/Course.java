package Q_05;

public class Course {
    private String courseName,courseCode;
    private Lecturer lecture;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecture() {
        return lecture;
    }

    public void setLecture(Lecturer lecture) {
        this.lecture = lecture;
    }
}
