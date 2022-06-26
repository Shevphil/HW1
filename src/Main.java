import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creates an instance of the scanner class
        Scanner nameInput = new Scanner(System.in) ;
        System.out.print("Enter first name");

        //Creates variable to store input in
        String fName = nameInput.next();

        System.out.print("Enter middle name");
        String mName = nameInput.next();

        System.out.print("Enter last name");
        String lName = nameInput.next();

        System.out.printf(lName + "," + " " + fName.charAt(0) + "." + mName.charAt(0) + ".");
    }
}

//Has many inputs, if splicing can be figured out, less code needed