package chapterSeven;

public class StudentReport {
    private double sub1;
    private double sub2;
    private double sub3;
    private String studentName;
    private double totalScorePerStudent = 0.0;

    public StudentReport(double subjectScores, String studentName, double totalScorePerStudent) {

        this.studentName = studentName;
        this.totalScorePerStudent = totalScorePerStudent;
    }

    public StudentReport() {

    }


    public double getSub1() {
        return sub1;
    }

    public void setSub1(double sub1) {
        this.sub1 = sub1;
    }

    public double getSub2() {
        return sub2;
    }

    public void setSub2(double sub2) {
        this.sub2 = sub2;
    }

    public double getSub3() {
        return sub3;
    }

    public void setSub3(double sub3) {
        this.sub3 = sub3;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getTotalScorePerStudent() {
        return totalScorePerStudent;
    }

    public void setTotalScorePerStudent(double totalScorePerStudent) {
        this.totalScorePerStudent += totalScorePerStudent;
    }
}
