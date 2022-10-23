package first;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte right = 3;
        int balance=1500;
        int select;
        while(right>0){
            System.out.print("Enter your username:");
            String userName = input.nextLine();
            System.out.print("Enter your password:");
            String password = input.nextLine();

            if(userName.equals("brnets") && password.equals("123456789") ){
                System.out.println("Welcome Beren");
                do {
                    System.out.print("1-Paying \n2-Withdraw \n3-Balance Inquiry\n4-Exit\nWhich transaction do you want to make?:");
                    select=input.nextInt();
                switch(select) {
                    case 1:
                        System.out.println("Balance:" + balance);
                        System.out.print("How much money you want to pay?");
                        int pay = input.nextInt();
                        balance += pay;
                        System.out.println("Your money is invested\n Current Balance:" + balance);
                        break;
                    case 2:
                        System.out.println("Balance:" + balance);
                        System.out.print("How much money you want to withdraw?");
                        int withdraw = input.nextInt();
                        if (withdraw > balance) {
                            System.out.println("Insufficient Balance");
                        } else {
                            balance -= withdraw;
                            System.out.println("The withdrawal is successful\n Current Balance:" + balance);
                        }
                        break;
                    case 3:
                        System.out.println("Current Balance:" + balance);
                        break;
                }
                }while (select!=4);
                System.out.println("Good bye");
                break;
            }else{
                right--;
                System.out.println("Wrong username or password.Please try again");
                if(right==0){
                    System.out.println("Your account has been blocked by the bank");
                }else{
                    System.out.println("Remaining:"+right);
                }
            }
        }
    }
}
