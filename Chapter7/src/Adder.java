/*

Program: Adder.java          Last Date of this Revision: May 18, 2022

Purpose: An application that prompts user random addition questions and keeps track of correct answer or tries with the use of points

Author: Rafat E, 
School: CHHS
Course: Computer Programming 20
 

*/

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.Random;

public class Adder {
		//frame
        private JFrame frame;
        private JTextField tf1;
        private JTextField tf2;
        private JTextField tf3;
        private int score,d1,d2,count;
        private JTextField tf4;


        public static void main(String[] args) { //Application Launch
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        Adder window = new Adder(); //Window creation
                                        window.frame.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
        }

      //Creating GUI
        public Adder() {
                initialize();
        }
        
        private void setExp()
        {
                Random rand=new Random(); //Random number generator 
                d1=rand.nextInt(20);
                d2=rand.nextInt(20);
                tf1.setText(d1+"+"+d2); //Text layout for addition problems
        }

  
        private void initialize() { //Contents of frame
                score=0; //Score initialized 
                count=0; //Count initialized
                
                frame = new JFrame();
                frame.setBounds(100, 100, 510, 319);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X button
                frame.getContentPane().setLayout(null);
                
                JLabel lblCalculateExpression = new JLabel("Calculate Expression:"); //Print out 'Calculate Expression'
                lblCalculateExpression.setFont(new Font("Dialog", Font.BOLD, 16)); //Font, size, and boldness
                lblCalculateExpression.setBounds(55, 70, 207, 15); //Text location
                frame.getContentPane().add(lblCalculateExpression); 
                
                //Frame contents
                tf1 = new JTextField();
                tf1.setEditable(false);
                tf1.setBounds(271, 66, 133, 25);
                frame.getContentPane().add(tf1);
                tf1.setColumns(10);
                
                JLabel lblAnswer = new JLabel("Answer:"); //Print out 'Answer'
                lblAnswer.setFont(new Font("Dialog", Font.BOLD, 16)); //Font, size and boldness
                lblAnswer.setBounds(171, 131, 81, 15); //Text location
                frame.getContentPane().add(lblAnswer);
                
                JLabel lblYourScore = new JLabel("Your Score:"); //Print out and display 'Score'
                lblYourScore.setFont(new Font("Dialog", Font.BOLD, 16)); //Font, size, and boldness
                lblYourScore.setBounds(155, 220, 107, 25);
                frame.getContentPane().add(lblYourScore);
                
                //Frame Contents
                tf3 = new JTextField();
                tf3.setEditable(false);
                tf3.setBounds(271, 221, 114, 25);
                frame.getContentPane().add(tf3);
                tf3.setColumns(10);
                
                tf4 = new JTextField();
                tf4.setEditable(false);
                tf4.setBounds(124, 171, 249, 26);
                frame.getContentPane().add(tf4);
                tf4.setColumns(10);
                
                setExp();
                tf2 = new JTextField();
                tf2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(Integer.parseInt(tf2.getText())!=999) //While statement while answer does not equal 999
                                {
                                        count++; //Count tracker 
                                        if(count!=3) //If else statement for score tracking and wrong and right answer display messages
                                        {
                                                if((d1+d2)==Integer.parseInt(tf2.getText()))
                                                {                                                       
                                                        if(count==1)
                                                                score+=5; //Initializing score based off amount of tries user takes to get answer
                                                        else if(count==2) 
                                                                score+=3; 
                                                        else
                                                                score+=1;
                                                        tf4.setText("Right Answer."); //When user answers correctly 
                                                        setExp();
                                                }
                                                else
                                                {
                                                        tf4.setText("Wrong answer.Enter another Answer."); //When user answers incorrectly 
                                                }
                                        }
                                        else {
                                                count=0;
                                                setExp();
                                        }
                                        tf2.setText("");
                                }
                                else {
                                        tf4.setText("Exiting Game"); //For when while loop ends and program is ending
                                        tf3.setText(String.valueOf(score)); //Displaying score after program ends for how many points player scored
                                        tf2.setEnabled(false);
                                }
                        }
                });
                tf2.setBounds(271, 121, 114, 25);
                frame.getContentPane().add(tf2);
                tf2.setColumns(10);     

        }
}

/* Screen Dump

(Run program to see GUI) 

Calculate expression: 9+7

Answer: 16

Right Answer.

Score:
 
 */