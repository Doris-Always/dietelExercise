package chapterSeven;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class MyersBriggs {

    public static void main(String[] args) {
        checkPersonality();
        compareDifferentPersonality();

    }

    static Scanner scanner = new Scanner(System.in);

    static String [][] personality = new String[5][8];
    static String response;

    static int aC1 = 0;
    static int bC1 =0;
    static int aC2 =0;
    static int bC2 =0;
    static int aC3 =0;
    static int bC3 =0;
    static int aC4 =0;
    static int bC4 =0;

    static String a1 = "exroverted";
    static String b1 ="introverted";
    static String a2 ="sensitive";
    static String b2 ="intuitive";
    static String a3 ="thinker";
    static String b3 ="feeler";
    static String a4 ="judgemental";
    static String b4 ="Perceptor";
    static void checkPersonality(){
        System.out.printf("%n%s%s%n","Select A or B\n" ,"\t 1.\tA.expend energy,enjoy groups\n\t B.Conserve energy,enjoy one-on-one");
        response = scanner.nextLine();
        switch (response.toUpperCase()){
            case "A":
                personality[0][0] = "A";
                aC1++;
                break;

            case "B":
                personality[0][1] = "B";
                bC1++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC1++;
                    bC1++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }


        }
        System.out.printf("%n%s%s%n","Select A or B\n","\t 2.\tA.interpret literally\n\t B.look for meaning and personality");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[0][2] = "A";
                aC2++;
                break;

            case "B":
                personality[0][3] = "B";
                bC2++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC2++;
                    bC2++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }
        System.out.printf("%n%s%s%n","Select A or B\n","\t 3.\tA.logical,thinking,questioning\n\t B.empathic ,feeling,accommodation");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[0][4] = "A";
                aC3++;
                break;

            case "B":
                personality[0][5] = "B";
                bC3++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC3++;
                    bC3++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }
        System.out.printf("%n%s%s%n","Select A or B\n","\t 4.\tA.organised,orderly\n\t B.flexible,adaptable");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[0][6] = "A";
                aC4++;
                break;

            case "B":
                personality[0][7] = "B";
                bC4++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC4++;
                    bC4++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }

        System.out.printf("%n%s%s%n","Select A or B\n","\t 5.\tA.more outgoing,think aloud\n\t B.more reserved,think to yourself");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[1][0] = "A";
                aC1++;
                break;

            case "B":
                personality[1][1] = "B";
                bC1++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC1++;
                    bC1++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }

        }
        System.out.printf("%n%s%s%n","Select A or B\n","\t 6.\tA.practical,realistic,experiential\n\t B.imaginative,innovative,theoretical");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[1][2] = "A";
                aC2++;
                break;

            case "B":
                personality[1][3] = "B";
                bC2++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC2++;
                    bC2++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }

        System.out.printf("%n%s%s%n","Select A or B\n","\t 7.\tA.candid,straight forward,frank\n\t B.tactful,kind encouraging");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[1][4] = "A";
                aC3++;
                break;

            case "B":
                personality[1][5] = "B";
                bC3++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC3++;
                    bC3++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }

        System.out.printf("%n%s%s%n","Select A or B\n","\t 8.\tA.plan,schedule\n\t B.unplanned ,spontaneous");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[1][6] = "A";
                aC4++;
                break;

            case "B":
                personality[1][7] = "B";
                bC4++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC4++;
                    bC4++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }

        System.out.printf("%n%s%s%n","Select A or B\n","\t 9.\tA.seek many tasks,public activities,interaction with others" +
                "\n\t B.seek privately,solitary activities with quiet to concentrate");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[2][0] = "A";
                aC1++;
                break;

            case "B":
                personality[2][1] = "B";
                bC1++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC1++;
                    bC1++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }
        System.out.printf("%n%s%s%n","Select A or B\n","\t 10.\tA.standard,usual,conventional\n\t B.different,novel,unique");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[2][2] = "A";
                aC2++;
                break;

            case "B":
                personality[2][3] = "B";
                bC2++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC2++;
                    bC2++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }

        System.out.printf("%n%s%s%n","Select A or B\n","\t 11.\tA.firm,tend to criticise,hold the line\n\t B.gentle,tend to appreciate ,conciliate");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[2][4] = "A";
                aC3++;
                break;

            case "B":
                personality[2][5] = "B";
                bC3++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC3++;
                    bC3++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }

        System.out.printf("%n%s%s%n","Select A or B\n","\t 12.\tA.regulated,structured\n\t B.easygoing,live and let live");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[2][6] = "A";
                aC4++;
                break;

            case "B":
                personality[2][7] = "B";
                bC4++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC4++;
                    bC4++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }

        System.out.printf("%n%s%s%n","Select A or B\n","\t 13.\tA.external,communicative,express yourself\n\t " +
                "B.internal,reticent,keep to yourself");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[3][0] = "A";
                aC1++;
                break;

            case "B":
                personality[3][1] = "B";
                bC1++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC1++;
                    bC1++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }

        }
        System.out.printf("%n%s%s%n","Select A or B\n","\t 14.\tA.focus on here-and-now\n\t" +
                " B.look to the future,global perspective");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[3][2] = "A";
                aC2++;
                break;

            case "B":
                personality[3][3] = "B";
                bC2++;
                break;
            default:
            if(response.equals("A") || response.equals("B") ){
                aC2++;
                bC2++;
            }
            else{
                throw new RuntimeException("Invalid entry");

            }
        }
        System.out.printf("%n%s%s%n","Select A or B\n","\t 15.\tA.tough-minded,just\n\t" +
                " B.tender-hearted,merciful");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[3][4] = "A";
                aC3++;
                break;

            case "B":
                personality[3][5] = "B";
                bC3++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC3++;
                    bC3++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }
        System.out.printf("%n%s%s%n","Select A or B\n","\t 16.\tA.preparation,plan ahead\n\t" +
                " B.go with flow,adapt as you go");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[3][6] = "A";
                aC4++;
                break;

            case "B":
                personality[3][7] = "B";
                bC4++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC4++;
                    bC4++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }
        System.out.printf("%n%s%s%n","Select A or B\n","\t 17.\tA.active,initiate\n\t " +
                "B.reflective,deliberate");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[4][0] = "A";
                aC1++;
                break;

            case "B":
                personality[4][1] = "B";
                bC1++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC1++;
                    bC1++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }

        System.out.printf("%n%s%s%n","Select A or B\n","\t 18.\tA.facts,things,what is\n\t" +
                " B.ideas,dreams,what could be,philosophical");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[4][2] = "A";
                aC2++;
                break;

            case "B":
                personality[4][3] = "B";
                bC2++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC2++;
                    bC2++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }
        System.out.printf("%n%s%s%n","Select A or B\n","\t 19.\tA.matter of fact,issue-oriented\n\t" +
                " B.sensitive,people-oriented,compassionate");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[4][4] = "A";
                aC3++;
                break;

            case "B":
                personality[4][5] = "B";
                bC3++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC3++;
                    bC3++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }
        System.out.printf("%n%s%s%n","Select A or B\n","\t 20.\tA.control,govern\n\t" +
                " B.latitude,freedom");
        response = scanner.nextLine();
        switch (response.toUpperCase()){

            case "A":
                personality[4][6] = "A";
                aC4++;
                break;

            case "B":
                personality[4][7] = "B";
                bC4++;
                break;
            default:
                if(response.equals("A") || response.equals("B") ){
                    aC4++;
                    bC4++;
                }
                else{
                    throw new RuntimeException("Invalid entry");

                }
        }


    }

    public static void compareDifferentPersonality(){

        if (aC1 > bC1){
            System.out.println("You are" +""+ a1);
        } else {
            System.out.println("You are " + " "+ b1);
        }

        if (aC2 > bC1){
            System.out.println("You are " + " " +a2 );
        }else{
            System.out.println("You are " + " " +b2 );
        }
        if (aC3 > bC3){
            System.out.println("You are a " + " " +a3 );
        }else{
            System.out.println("You are a " + " " +b3 );
        }
        if (aC4 > bC4){
            System.out.println("You are " + " " +a4 );
        }else{
            System.out.println("You are a " + " " +b4 );
        }

    }


 }