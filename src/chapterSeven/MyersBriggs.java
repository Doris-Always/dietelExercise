package chapterSeven;

import java.util.Locale;
import java.util.Scanner;

public class MyersBriggs {

    public static void main(String[] args) {
        checkPersonality();
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

    static void checkPersonality(){
        System.out.printf("%n%s","Select A or B\n","\t 1.\tA.expend energy,enjoy groups\n\t B.Conserve energy,enjoy one-on-one");
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


        }
        System.out.printf("%n%s","Select A or B\n","\t 1.\tA.interpret literally\n\t B.look for meaning and personality");
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
        }
        System.out.printf("%n%s","Select A or B\n","\t 1.\tA.logical,thinking,questioning\n\t B.empathic ,feeling,accommodation");
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
        }
        System.out.printf("%n%s","Select A or B\n","\t 1.\tA.organised,orderly\n\t B.flexible,adaptable");
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
        }

        System.out.printf("%n%s","Select A or B\n","\t 1.\tA.more outgoing,think aloud\n\t B.more reserved,think to yourself");
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
        }
        System.out.printf("%n%s","Select A or B\n","\t 1.\tA.practical,realistic,experiential\n\t B.imaginative,innovative,theoretical");
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
        }

        System.out.printf("%n%s","Select A or B\n","\t 1.\tA.candid,straight forward,frank\n\t B.tactful,kind encouraging");
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
        }

        System.out.printf("%n%s","Select A or B\n","\t 1.\tA.plan,schedule\n\t B.unplanned ,spontaneous");
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
        }

        System.out.printf("%n%s","Select A or B\n","\t 1.\tA.seek many tasks,public activities,interaction with others" +
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
        }
        System.out.printf("%n%s","Select A or B\n","\t 1.\tA.standard,usual,conventional\n\t B.different,novel,unique");
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
        }

        System.out.printf("%n%s","Select A or B\n","\t 1.\tA.firm,tend to criticise,hold the line\n\t B.gentle,tend to appreciate ,conciliate");
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
        }

        System.out.printf("%n%s","Select A or B\n","\t 1.\tA.regulated,structured\n\t B.easygoing,live and let live");
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
        }

    }

}
