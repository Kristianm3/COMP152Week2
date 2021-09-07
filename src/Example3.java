import java.util.ArrayList;
import java.util.Scanner;

public class Example3 {
    public static void main (String[] args) {
        var studentNames = new ArrayList<String>();
        var reader = new Scanner(System.in);
        var userResponse = "";
        while(!userResponse.equals("Done")) {
            System.out.println("Enter next name or 'Done' to end: ");
            userResponse = reader.nextLine();
            if(!userResponse.equals("Done")); {
                studentNames.add(userResponse);
            }
        }
    }
}