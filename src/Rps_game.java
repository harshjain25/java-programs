import java.util.Random;
import java.util.Scanner;
public class Rps_game {
    public static void main(String[] args) {
        //0 for rock
        //1 for paper
        //2 for scissor
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 0 for Rock \n 1 for paper \n 2 for Scissor");
            int userinput = sc.nextInt();

            Random random = new Random();
            int computerinput = random.nextInt(3);

            if (userinput > 2 && userinput < 1) {
                throw new IndexOutOfBoundsException();
            }
            else if (userinput == computerinput) System.out.println("Draw");
            else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0
                    || userinput == 2 && computerinput == 1) {
                System.out.println("You Win!");
            }
            else {
                System.out.println("Computer Win!");
            }
        }
        catch (Exception obj) {
            System.out.println(obj);
            }
        finally{
            System.out.println("Thank you for playing this game....");
                }
    }
}
