package chapterSeven;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class StudentSummary {
    static Scanner scanner = new Scanner(System.in);
    private static List<StudentReport> studentSummary = new ArrayList<>();
    public static void main(String[] args) {
//        StudentSummary forSummary = new StudentSummary();
        takeStudentInformation();
        System.out.println(getListOfStudentInfo());


    }
    public static void summary(){
        System.out.println( printStudentSummary());
    }
    public static String printStudentSummary (){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(dashRepeater("===",50))
                .append(header())
                .append(dashRepeater("===",50));
        return stringBuilder.toString();
    }

    private static String dashRepeater(String dashFormat, int numberOfRepetition) {
        return dashFormat.repeat(numberOfRepetition);
    }
    public static String header(){
        return "\n\nSTUDENT\t\tSUB1\t\tSUB2\t\tSUB3\t\tTOTAL\t\tAVE\t\tPOS\n";
    }

    public static String getListOfStudentInfo(){
        StringBuilder listOfStudentInfo = new StringBuilder();
        for (StudentReport studentInfo : studentSummary){
            listOfStudentInfo
                    .append(studentInfo.getStudentName()).append("\t\t")
                    .append(studentInfo.getSub1()).append("\t\t")
                    .append(studentInfo.getSub2()).append("\t\t")
                    .append(studentInfo.getSub3()).append("\t\t")
                    .append("\n");
        }
        return listOfStudentInfo.toString();
    }

    public static void takeStudentInformation(){
        StudentReport report = new StudentReport();

        System.out.println("What is the student name?");
        report.setStudentName(scanner.next());
        scanner.nextLine();

        System.out.println("add subject 1 score");
        report.setSub1(scanner.nextDouble());

        System.out.println("add subject 2 score");
        report.setSub2(scanner.nextDouble());


        System.out.println("add subject 3 score");
        report.setSub3(scanner.nextDouble());

        studentSummary.add(report);

        System.out.println("have more information to add?\nEnter yes/no ");
        String answer = scanner.next();

        if (Objects.equals(answer, "yes")){
            takeStudentInformation();
        }else {
            summary();
        }

    }
}
