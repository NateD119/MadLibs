import java.util.Scanner;


public class MadLibs {
    public static void main(String[] args) {
        //here the variables are created for the ladlib, however the variables do not get initialized and given a value
        //until the user enters the requested information into the program.
        String adjective1;
        String girlsName;
        String adjective2;
        String occupation;
        String place;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String mansName;

        //created an object of the Scanner class
        Scanner sc = new Scanner(System.in);

        //Here is assigning the variables with values.
        System.out.print("Enter an adjective: ");
        adjective1 = sc.nextLine();
        System.out.print("Enter a girl's name: ");
        girlsName = sc.nextLine();
        System.out.print("Enter an adjective: ");
        adjective2 = sc.nextLine();
        System.out.print("Enter an occupation: ");
        occupation = sc.nextLine();
        System.out.print("Enter a place: ");
        place = sc.nextLine();
        System.out.print("Enter a piece of clothing: ");
        clothing = sc.nextLine();
        System.out.print("Enter a hobby: ");
        hobby = sc.nextLine();
        System.out.print("Enter an adjective: ");
        adjective3 = sc.nextLine();
        System.out.print("Enter another occupation: ");
        occupation2 = sc.nextLine();
        System.out.print("Enter a boy's name: ");
        boysName = sc.nextLine();
        System.out.print("Enter a man's name: ");
        mansName = sc.nextLine();

        //Outputting the story with the variable values plugged into the story.
        System.out.println("There once was a " + adjective1 + " girl named " + girlsName + " , who " +
                " was a " + adjective2 + "  " + occupation + " in the Kingdom of " + place + " . " + " She loved to wear " +
                clothing + " and to " + hobby + " . She wanted to marry the " + adjective3 + "  " +occupation2 + " named " +
                boysName + " but her father, King " + mansName + " forbid her from seeing him.");


    }
}
