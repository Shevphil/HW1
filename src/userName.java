import java.util.Scanner;

public class userName {
    public static void main(String[] args) {
        Scanner nameBuild = new Scanner(System.in);

        System.out.print("Enter first name");
        //Creates variable to store input in
        String fName = nameBuild.next();

        System.out.print("Enter last name");
        //Creates variable to store input in
        String lName = nameBuild.next();

        System.out.print("Enter four digits");
        int year = nameBuild.nextInt();

        String fPart = lName.substring(0,5);
        char sPart = fName.charAt(0);
        String tPart = Integer.toString(year);
//        String altPart = (tPart.substring(tPart.length()-1));
        String altPartTwo = (tPart.substring(tPart.length()-2));
        System.out.printf(fPart + sPart + altPartTwo );
    }
}


//this is okay, but did not use % as instructed and have not yet