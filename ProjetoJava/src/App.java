import java.util.Scanner;

public class App {

    public static void Check(int money){
        System.out.println("You have " + money + '$');
    }
    
    public static int Add(int money, int value){
        System.out.println("New ammount: " + (money + value) + '$');
        return money + value;
    }
    
    public static int Withdraw(int money, int value){
        System.out.println("New ammount: " + (money - value) + '$');
        return money - value;
    }

    
    public static void main(String[] args) throws Exception {
        Scanner scanIn = new Scanner(System.in);
        int money = 0, value = 0, choice = 0;
        while (choice != -99){
            //System.out.println("[1] Check Money\n[2] Deposite Money\n[3] Withdraw Money\n[-99] Leave ");
            System.out.println("--------------------\n[1] Check Money    |\n[2] Deposite Money |\n[3] Withdraw Money |\n[-99] Leave        | \n--------------------");
            choice = Integer.parseInt(scanIn.nextLine());
            if (choice == 1){
                Check(money);
            } else if (choice == 2){
                System.out.println("How much do you want to deposite?");
                value = Integer.parseInt(scanIn.nextLine());
                money = Add(money, value);
            } else if (choice == 3){
                System.out.println("How much do you want to withdraw?");
                value = Integer.parseInt(scanIn.nextLine());
                if (value <= money){
                    money = Withdraw(money, value);
                } else {
                    System.out.println("The value you entered is bigger than the one in your account (lowkey poor aahh nigga)");
                }
                
            } else if (choice == -99){
                System.out.println("Program finished with no erros.");
                System.exit(0);
            } else {
                System.out.println("Error program closed for safety.");
                System.exit(0);
            }
        }
        scanIn.close();
    }
}
