import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        System.out.println("Please enter a command ");
        Scanner scan = new Scanner(System.in);
        String pass = scan.nextLine();
        String stp = "stop";

        while(!pass.equals(stp)){
            System.out.println("Wrong command try again ");
            pass = scan.nextLine();
            System.out.println(pass);
        }



    }
}
