/*

Program: MySaving.java          Last Date of this Revision: May 18, 2022

Purpose: An application that displays a menu of options and is used as a piggy bank to add quarters, dimes, nickels, and pennies while also allowing users to see their balance and withdraw amounts from the piggy bank

Author: Rafat E, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.util.Scanner;

class MySaving{
public static void main(String arg[]){
int choice1=0,mul=0;
double mul2=0.0;
  Scanner in = new Scanner(System.in);
PiggyBank pb = new PiggyBank();
do{

System.out.println("");
		//Recording input
      System.out.println(" 1. Show total in bank "); //Menu option to show total in bank
      System.out.println(" 2. Add a Penny"); //Menu option to add penny
      System.out.println(" 3. Add a Nickel"); //Menu option to add nickel
      System.out.println(" 4. Add a Dime"); //Menu option to add dime
      System.out.println(" 5. Add a Quarter"); //Menu option to add quarter
      System.out.println(" 6. Take money out of the bank"); //Menu option to take money out of bank 
      System.out.print(" Enter your choice: "); //Recording input to proceed in program

      choice1=in.nextInt();
      switch(choice1){
       
      //Switch statement for each bank option based off of user input
case 1:
                System.out.println("");
                pb.ShowTotal();
                                break;

case 2:
                System.out.println("");
                System.out.print("Enter how many pennies you would like to add : "); //Recording how many pennies user wants to add
                mul=in.nextInt();
                      pb.AddPenny(mul);
                                break;

case 3:
                System.out.println("");
                System.out.print("Enter how many nickels you would like to add :"); //Recording how many nickels user wants to add
                mul=in.nextInt();
                      pb.AddNickel(mul);
                                break;

case 4:
                System.out.println("");
                System.out.print("Enter how many dimes you would like to add :"); //Recording how many dimes user wants to add
                mul=in.nextInt();
                      pb.AddDime(mul);
                                break;
                        case 5:
                System.out.println("");
                System.out.print("Enter how many quarters you would like to add :"); //Recording how many quarters user wants to add
                mul=in.nextInt();
                      pb.AddQuarter(mul);
                                break;

                        case 6:
                System.out.println("");
                System.out.print("Enter amount you want to withdraw : "); //Prompt user for amount to withdraw if user has enough balance
                mul2=in.nextDouble();
                      pb.Withdraw(mul);
                                break;
                         case 0:
                System.out.println("");
                System.out.print("End Program"); //Program end
                  
                 
                                break;
            default:
                      System.out.println("Wronge Choice,try again !"); //Displays if user input something apart from menu options
            }
    }

while(choice1!=0); //Loop runs while input does not equal 0

   }
}




/* Screen Dump

 1. Show total in bank 
 2. Add a Penny
 3. Add a Nickel
 4. Add a Dime
 5. Add a Quarter
 6. Take money out of the bank
 Enter your choice: 5

Enter how many quarters you would like to add :1000

 1. Show total in bank 
 2. Add a Penny
 3. Add a Nickel
 4. Add a Dime
 5. Add a Quarter
 6. Take money out of the bank
 Enter your choice: 1

Your balance IS $ 250.0

 1. Show total in bank 
 2. Add a Penny
 3. Add a Nickel
 4. Add a Dime
 5. Add a Quarter
 6. Take money out of the bank
 Enter your choice: 

*/