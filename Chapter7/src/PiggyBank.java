//Header in MySaving.java

import java.util.Scanner;
class PiggyBank{
private double total=0.0;

void AddPenny(int num){
total = total + num*0.01; //Penny tracking formula from user input
}
void AddNickel(int num){
total = total + num*0.05; //Nickel tracking formula from user input
}
void AddDime(int num){
total = total + num*0.10; //Dime tracking formula from user input
}
void AddQuarter(int num){
total = total + num*0.25; //Quarter tracking formula from user input

}
void ShowTotal(){
System.out.println("Your balance IS $ "+total); //Prints out total balance based on how many user inputs for coins
}
void Withdraw(double mul){
if(mul<=total)
total = total-mul; //If else statement and formula for calculating if user has enough balance to withdraw chosen balance
else
System.out.println("Not enough balance to withdraw."); //Prints out when user does not have enough balance to withdraw
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



