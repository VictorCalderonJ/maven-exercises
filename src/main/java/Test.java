import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Something: ");
        String usersInput = sc.nextLine();
        System.out.println("You Entered: " + usersInput);
        if (!StringUtils.isNumeric(usersInput)) {
            System.out.println( usersInput + " is not a number");
            System.out.println("Flipped case: " + StringUtils.swapCase(usersInput));
            System.out.println("Reversed: " + StringUtils.reverse(usersInput));
        } else {
            System.out.println( usersInput + " Has a number");
        }
    }
}
