
import java.awt.Component;
import java.io.*;
//import java.io.FileOutputStream;
//import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Main {

	//the variables to calculate and store the credits per module in level 4
	public int lvl4TotCred; // total credits obtained in level 4
	public int lvl4Mod1Cred; // credits obtained in level 5 module 1
	public int lvl4Mod2Cred; // credits obtained in level 5 module 2
	public int lvl4Mod3Cred; // credits obtained in level 5 module 3
	public int lvl4Mod4Cred; // credits obtained in level 5 module 4
	public int lvl4Mod5Cred; // credits obtained in level 5 module 5
	public int lvl4Mod6Cred; // credits obtained in level 5 module 6	
	
	private static Scanner sc1;
	private static Scanner sc2;
	


	//this is the main method launched at the beginning of the program
	public static void main(String[] args) throws Exception {
		System.out.println(" ___________ ");
		System.out.println("|           |");
		System.out.println("|1.New Entry|");
		System.out.println("|2.About    |");
		System.out.println("|3.Help     |");
		System.out.println("|___________|");
		
		try {
		sc1 = new Scanner(System.in);
		System.out.print("Refer menu and enter a number to begin: "); 
		int inp = sc1.nextInt();
	
			if (inp == 1) {
				Primary(); 
			} else if (inp == 2){
				System.out.println("About System");
			} else if (inp == 3){
				System.out.println("Help with System");
			} else {
				System.out.println("ERROR LAUNCH PROGRAM AGAIN");
			}
		} catch (java.util.InputMismatchException e1) {
			System.out.println("Invalid Input!");
			
		}
	}


	
	//the logic that processes the basic requirements and conditions common to all modules on all levels
	public static void Primary() {
		
		Student st1 = new Student ();
		
		Scanner scx = new Scanner(System.in);
		
		System.out.println("Enter Student name: ");
		st1.setName(scx.next());
		//String name = scx.nextLine();
		
		System.out.println("Enter Student ID: ");
		st1.setId(scx.next());
		//String id = scx.nextLine();
		
		
		
		//below is the code that focuses on the logic in level 4
		
		System.out.println("Level 4");
		System.out.println("----------------");
		
		sc2 = new Scanner (System.in);
			
		Level lvl4 = new Level();
		
		
		//declared below are the variables for calculations in level 4
		int lvl4TotCred; // total credits obtained in level 4
		int lvl4Mod1Cred; // credits obtained in level 4 module 1
		int lvl4Mod2Cred; // credits obtained in level 4 module 2
		int lvl4Mod3Cred; // credits obtained in level 4 module 3
		int lvl4Mod4Cred; // credits obtained in level 4 module 4
		int lvl4Mod5Cred; // credits obtained in level 4 module 5
		int lvl4Mod6Cred; // credits obtained in level 4 module 6
			
		
		
		
		
		//below code is for level 4 Module 1 marks entering 
		System.out.print("Input marks for Module1 | ICT1: ");
		int tempLvl4Mod1Ict1 = sc2.nextInt();
			
		System.out.print("Input marks for Module1 | ICT2: ");
		int templvl4Mod1Ict2 = sc2.nextInt();
			
		System.out.print("Input marks for Module1 | ICT3: ");
		int templvl4Mod1Ict3 = sc2.nextInt();
				
		Module lvl4Mod1 = new Module(tempLvl4Mod1Ict1, templvl4Mod1Ict2, templvl4Mod1Ict3);
		lvl4Mod1.creditValidate(tempLvl4Mod1Ict1, templvl4Mod1Ict2, templvl4Mod1Ict3);
			
		if (tempLvl4Mod1Ict1 >= 40 && templvl4Mod1Ict2 >= 40 && templvl4Mod1Ict3 >= 40 && tempLvl4Mod1Ict1 <= 100
				&& templvl4Mod1Ict2 <= 100 && templvl4Mod1Ict3 <= 100 && tempLvl4Mod1Ict1 >= 0 && templvl4Mod1Ict2 >= 0
				&&  templvl4Mod1Ict3>= 0) {
			lvl4Mod1Cred = 20;
			System.out.println("MODULE PASSED");
		} else {
			lvl4Mod1Cred = 0;
			System.out.println("MODULE FAILED");	
		}
		
		if ((tempLvl4Mod1Ict1 < 30 || templvl4Mod1Ict2 < 30 || templvl4Mod1Ict3 < 30) && tempLvl4Mod1Ict1 <= 100
				&& templvl4Mod1Ict2 <= 100 && templvl4Mod1Ict3 <= 100 && tempLvl4Mod1Ict1 >= 0 && templvl4Mod1Ict2 >= 0
				&& templvl4Mod1Ict3 >= 0) {
			System.out.println("Retake required");
			st1.retakeIncrease();
		} else {
			System.out.println("Retake NOT required");
		}
		
		if ((tempLvl4Mod1Ict1 >= 30 || templvl4Mod1Ict2 >= 30 || templvl4Mod1Ict3 >= 30) && 
				(tempLvl4Mod1Ict1 < 40 || templvl4Mod1Ict2 < 40  || templvl4Mod1Ict3 < 40 ) && tempLvl4Mod1Ict1 <= 100
				&& templvl4Mod1Ict2 <= 100 && templvl4Mod1Ict3 <= 100 && tempLvl4Mod1Ict1 >= 0 && templvl4Mod1Ict2 >= 0
				&& templvl4Mod1Ict3 >= 0) {
			System.out.println("Resit required");
			st1.resitIncrease();
		}
		
//		System.out.println("RESITS "+st1.getResit());
//		System.out.println("RETAKES "+st1.getRetake());
		
		lvl4.condoneValidate(tempLvl4Mod1Ict1, templvl4Mod1Ict2, templvl4Mod1Ict3, lvl4Mod1Cred);
		
		System.out.println("Modules condoned: "+lvl4.getCondoneAttempt());
		
		
		
		
		//below code is for level 4 Module 2 marks entering 
		System.out.println("_____________________");
		
		System.out.print("Input marks for Module2 | ICT1: ");
		int tempLvl4Mod2Ict1 = sc2.nextInt();
			
		System.out.print("Input marks for Module2 | ICT2: ");
		int templvl4Mod2Ict2 = sc2.nextInt();
			
		System.out.print("Input marks for Module2 | ICT3: ");
		int templvl4Mod2Ict3 = sc2.nextInt();
				
		Module lvl4Mod2 = new Module(tempLvl4Mod2Ict1, templvl4Mod2Ict2, templvl4Mod2Ict3);
		lvl4Mod2.creditValidate(tempLvl4Mod2Ict1, templvl4Mod2Ict2, templvl4Mod2Ict3);
			
		if (tempLvl4Mod2Ict1 >= 40 && templvl4Mod2Ict2 >= 40 && templvl4Mod2Ict3 >= 40 && tempLvl4Mod2Ict1 <= 100
				&& templvl4Mod2Ict2 <= 100 && templvl4Mod2Ict3 <= 100 && tempLvl4Mod2Ict1 >= 0 && templvl4Mod2Ict2 >= 0
				&&  templvl4Mod2Ict3>= 0) {
			lvl4Mod2Cred = 20;
			System.out.println("MODULE PASSED");
		} else {
			lvl4Mod2Cred = 0;
			System.out.println("MODULE FAILED");
		}
		
		if ((tempLvl4Mod2Ict1 < 30 || templvl4Mod2Ict2 < 30 || templvl4Mod2Ict3 < 30) && tempLvl4Mod2Ict1 <= 100
				&& templvl4Mod2Ict2 <= 100 && templvl4Mod2Ict3 <= 100 && tempLvl4Mod2Ict1 >= 0 && templvl4Mod2Ict2 >= 0
				&& templvl4Mod2Ict3 >= 0) {
			System.out.println("Retake required");
			st1.retakeIncrease();
		} else {
			System.out.println("Retake NOT required");
		}
		
		if ((tempLvl4Mod2Ict1 >= 30 || templvl4Mod2Ict2 >= 30 || templvl4Mod2Ict3 >= 30) && 
				(tempLvl4Mod2Ict1 < 40 || templvl4Mod2Ict2 < 40  || templvl4Mod2Ict3 < 40 ) && tempLvl4Mod2Ict1 <= 100
				&& templvl4Mod2Ict2 <= 100 && templvl4Mod2Ict3 <= 100 && tempLvl4Mod2Ict1 >= 0 && templvl4Mod2Ict2 >= 0
				&& templvl4Mod2Ict3 >= 0) {
			System.out.println("Resit required");
			st1.resitIncrease();
		}
		
//		System.out.println("RESITS "+st1.getResit());
//		System.out.println("RETAKES "+st1.getRetake());
		
		lvl4.condoneValidate(tempLvl4Mod2Ict1, templvl4Mod2Ict2, templvl4Mod2Ict3, lvl4Mod2Cred);
		
		System.out.println("Modules condoned: "+lvl4.getCondoneAttempt());
		
		
		
		
		
		//below code is for level 4 Module 3 marks entering 
		System.out.println("_____________________");
				
		System.out.print("Input marks for Module3 | ICT1: ");
		int tempLvl4Mod3Ict1 = sc2.nextInt();
					
		System.out.print("Input marks for Module3 | ICT2: ");
		int templvl4Mod3Ict2 = sc2.nextInt();
					
		System.out.print("Input marks for Module3 | ICT3: ");
		int templvl4Mod3Ict3 = sc2.nextInt();
						
		Module lvl4Mod3 = new Module(tempLvl4Mod3Ict1, templvl4Mod3Ict2, templvl4Mod3Ict3);
		lvl4Mod3.creditValidate(tempLvl4Mod3Ict1, templvl4Mod3Ict2, templvl4Mod3Ict3);
					
		if (tempLvl4Mod3Ict1 >= 40 && templvl4Mod3Ict2 >= 40 && templvl4Mod3Ict3 >= 40 && tempLvl4Mod3Ict1 <= 100
				&& templvl4Mod3Ict2 <= 100 && templvl4Mod3Ict3 <= 100 && tempLvl4Mod3Ict1 >= 0 && templvl4Mod3Ict2 >= 0
				&&  templvl4Mod3Ict3>= 0) {
			lvl4Mod3Cred = 20;
			System.out.println("MODULE PASSED");
		} else {
			lvl4Mod3Cred = 0;
			System.out.println("MODULE FAILED");
		}
				
		if ((tempLvl4Mod3Ict1 < 30 || templvl4Mod3Ict2 < 30 || templvl4Mod3Ict3 < 30) && tempLvl4Mod3Ict1 <= 100
				&& templvl4Mod3Ict2 <= 100 && templvl4Mod3Ict3 <= 100 && tempLvl4Mod3Ict1 >= 0 && templvl4Mod3Ict2 >= 0
				&& templvl4Mod3Ict3 >= 0) {
			System.out.println("Retake required");
			st1.retakeIncrease();
		} else {
			System.out.println("Retake NOT required");
		}
		
		if ((tempLvl4Mod3Ict1 >= 30 || templvl4Mod3Ict2 >= 30 || templvl4Mod3Ict3 >= 30) && 
				(tempLvl4Mod3Ict1 < 40 || templvl4Mod3Ict2 < 40  || templvl4Mod3Ict3 < 40 ) && tempLvl4Mod3Ict1 <= 100
				&& templvl4Mod3Ict2 <= 100 && templvl4Mod3Ict3 <= 100 && tempLvl4Mod3Ict1 >= 0 && templvl4Mod3Ict2 >= 0
				&& templvl4Mod3Ict3 >= 0) {
			System.out.println("Resit required");
			st1.resitIncrease();
		}
		
//		System.out.println("RESITS "+st1.getResit());
//		System.out.println("RETAKES "+st1.getRetake());
	
		lvl4.condoneValidate(tempLvl4Mod3Ict1, templvl4Mod3Ict2, templvl4Mod3Ict3, lvl4Mod3Cred);
		
		System.out.println("Modules condoned: "+lvl4.getCondoneAttempt());
	
	
		
		
		
	//below code is for level 4 Module 4 marks entering 
	System.out.println("_____________________");
	
	System.out.print("Input marks for Module4 | ICT1: ");
	int tempLvl4Mod4Ict1 = sc2.nextInt();
				
	System.out.print("Input marks for Module4 | ICT2: ");
	int templvl4Mod4Ict2 = sc2.nextInt();
				
	System.out.print("Input marks for Module4 | ICT3: ");
	int templvl4Mod4Ict3 = sc2.nextInt();
					
	Module lvl4Mod4 = new Module(tempLvl4Mod4Ict1, templvl4Mod4Ict2, templvl4Mod4Ict3);
	lvl4Mod4.creditValidate(tempLvl4Mod4Ict1, templvl4Mod4Ict2, templvl4Mod4Ict3);
				
	if (tempLvl4Mod4Ict1 >= 40 && templvl4Mod4Ict2 >= 40 && templvl4Mod4Ict3 >= 40 && tempLvl4Mod4Ict1 <= 100
			&& templvl4Mod4Ict2 <= 100 && templvl4Mod4Ict3 <= 100 && tempLvl4Mod4Ict1 >= 0 && templvl4Mod4Ict2 >= 0
			&&  templvl4Mod4Ict3>= 0) {
		lvl4Mod4Cred = 20;
		System.out.println("MODULE PASSED");
	} else {
		lvl4Mod4Cred = 0;
		System.out.println("MODULE FAILED");
	}
			
	if ((tempLvl4Mod4Ict1 < 30 || templvl4Mod4Ict2 < 30 || templvl4Mod4Ict3 < 30) && tempLvl4Mod4Ict1 <= 100
			&& templvl4Mod4Ict2 <= 100 && templvl4Mod4Ict3 <= 100 && tempLvl4Mod4Ict1 >= 0 && templvl4Mod4Ict2 >= 0
			&& templvl4Mod4Ict3 >= 0) {
		System.out.println("Retake required");
		st1.retakeIncrease();
	} else {
		System.out.println("Retake NOT required");
	}
	
	if ((tempLvl4Mod4Ict1 >= 30 || templvl4Mod4Ict2 >= 30 || templvl4Mod4Ict3 >= 30) && 
			(tempLvl4Mod4Ict1 < 40 || templvl4Mod4Ict2 < 40  || templvl4Mod4Ict3 < 40 ) && tempLvl4Mod4Ict1 <= 100
			&& templvl4Mod4Ict2 <= 100 && templvl4Mod4Ict3 <= 100 && tempLvl4Mod4Ict1 >= 0 && templvl4Mod4Ict2 >= 0
			&& templvl4Mod4Ict3 >= 0) {
		System.out.println("Resit required");
		st1.resitIncrease();
	}
	
//	System.out.println("RESITS "+st1.getResit());
//	System.out.println("RETAKES "+st1.getRetake());

	lvl4.condoneValidate(tempLvl4Mod4Ict1, templvl4Mod4Ict2, templvl4Mod4Ict3, lvl4Mod4Cred);
	
	System.out.println("Modules condoned: "+lvl4.getCondoneAttempt());



		
	
	
	
	
		//below code is for level 4 Module 5 marks entering 
		System.out.println("_____________________");
		
		System.out.print("Input marks for Module5 | ICT1: ");
		int tempLvl4Mod5Ict1 = sc2.nextInt();
					
		System.out.print("Input marks for Module5 | ICT2: ");
		int templvl4Mod5Ict2 = sc2.nextInt();
					
		System.out.print("Input marks for Module5 | ICT3: ");
		int templvl4Mod5Ict3 = sc2.nextInt();
						
		Module lvl4Mod5 = new Module(tempLvl4Mod5Ict1, templvl4Mod5Ict2, templvl4Mod5Ict3);
		lvl4Mod5.creditValidate(tempLvl4Mod5Ict1, templvl4Mod5Ict2, templvl4Mod5Ict3);
					
		if (tempLvl4Mod5Ict1 >= 40 && templvl4Mod5Ict2 >= 40 && templvl4Mod5Ict3 >= 40 && tempLvl4Mod5Ict1 <= 100
				&& templvl4Mod5Ict2 <= 100 && templvl4Mod5Ict3 <= 100 && tempLvl4Mod5Ict1 >= 0 && templvl4Mod5Ict2 >= 0
				&&  templvl4Mod5Ict3>= 0) {
			lvl4Mod5Cred = 20;
			System.out.println("MODULE PASSED");
		} else {
			lvl4Mod5Cred = 0;
			System.out.println("MODULE FAILED");
		}
				
		if ((tempLvl4Mod5Ict1 < 30 || templvl4Mod5Ict2 < 30 || templvl4Mod5Ict3 < 30) && tempLvl4Mod5Ict1 <= 100
				&& templvl4Mod5Ict2 <= 100 && templvl4Mod5Ict3 <= 100 && tempLvl4Mod5Ict1 >= 0 && templvl4Mod5Ict2 >= 0
				&& templvl4Mod5Ict3 >= 0) {
			System.out.println("Retake required");
			st1.retakeIncrease();
		} else {
			System.out.println("Retake NOT required");
		}
		
		if ((tempLvl4Mod5Ict1 >= 30 || templvl4Mod5Ict2 >= 30 || templvl4Mod5Ict3 >= 30) && 
				(tempLvl4Mod5Ict1 < 40 || templvl4Mod5Ict2 < 40  || templvl4Mod5Ict3 < 40 ) && tempLvl4Mod5Ict1 <= 100
				&& templvl4Mod5Ict2 <= 100 && templvl4Mod5Ict3 <= 100 && tempLvl4Mod5Ict1 >= 0 && templvl4Mod5Ict2 >= 0
				&& templvl4Mod5Ict3 >= 0) {
			System.out.println("Resit required");
			st1.resitIncrease();
		}
		
//		System.out.println("RESITS "+st1.getResit());
//		System.out.println("RETAKES "+st1.getRetake());
	
		lvl4.condoneValidate(tempLvl4Mod5Ict1, templvl4Mod5Ict2, templvl4Mod5Ict3, lvl4Mod5Cred);
		
		System.out.println("Modules condoned: "+lvl4.getCondoneAttempt());
		
		
		
		
		
		
		//below code is for level 4 Module 6 marks entering 
		System.out.println("_____________________");
				
		System.out.print("Input marks for Module6 | ICT1: ");
		int tempLvl4Mod6Ict1 = sc2.nextInt();
							
		System.out.print("Input marks for Module6 | ICT2: ");
		int templvl4Mod6Ict2 = sc2.nextInt();
							
		System.out.print("Input marks for Module6 | ICT3: ");
		int templvl4Mod6Ict3 = sc2.nextInt();
								
		Module lvl4Mod6 = new Module(tempLvl4Mod6Ict1, templvl4Mod6Ict2, templvl4Mod6Ict3);
		lvl4Mod6.creditValidate(tempLvl4Mod6Ict1, templvl4Mod6Ict2, templvl4Mod6Ict3);
							
		if (tempLvl4Mod6Ict1 >= 40 && templvl4Mod6Ict2 >= 40 && templvl4Mod6Ict3 >= 40 && tempLvl4Mod6Ict1 <= 100
				&& templvl4Mod6Ict2 <= 100 && templvl4Mod6Ict3 <= 100 && tempLvl4Mod6Ict1 >= 0 && templvl4Mod6Ict2 >= 0
				&&  templvl4Mod6Ict3>= 0) {
			lvl4Mod6Cred = 20;
			System.out.println("MODULE PASSED");
		} else {
			lvl4Mod6Cred = 0;
			System.out.println("MODULE FAILED");
		}
						
		if ((tempLvl4Mod6Ict1 < 30 || templvl4Mod6Ict2 < 30 || templvl4Mod6Ict3 < 30) && tempLvl4Mod6Ict1 <= 100
				&& templvl4Mod6Ict2 <= 100 && templvl4Mod6Ict3 <= 100 && tempLvl4Mod6Ict1 >= 0 && templvl4Mod6Ict2 >= 0
				&& templvl4Mod5Ict3 >= 0) {
			System.out.println("Retake required");
			st1.retakeIncrease();
		} else {
			System.out.println("Retake NOT required");
		}
				
		if ((tempLvl4Mod6Ict1 >= 30 || templvl4Mod6Ict2 >= 30 || templvl4Mod6Ict3 >= 30) && 
				(tempLvl4Mod6Ict1 < 40 || templvl4Mod6Ict2 < 40  || templvl4Mod6Ict3 < 40 ) && tempLvl4Mod6Ict1 <= 100
				&& templvl4Mod6Ict2 <= 100 && templvl4Mod6Ict3 <= 100 && tempLvl4Mod6Ict1 >= 0 && templvl4Mod6Ict2 >= 0
				&& templvl4Mod6Ict3 >= 0) {
			System.out.println("Resit required");
			st1.resitIncrease();
		}
				
//		System.out.println("RESITS "+st1.getResit());
//		System.out.println("RETAKES "+st1.getRetake());
	
		lvl4.condoneValidate(tempLvl4Mod6Ict1, templvl4Mod6Ict2, templvl4Mod6Ict3, lvl4Mod6Cred);
		
		System.out.println("Modules condoned: "+lvl4.getCondoneAttempt());
		
		
		int numCondoneAttempt = lvl4.getCondoneAttempt();
		
		//calculates the total credits obtained for level 4
		lvl4TotCred = (lvl4Mod1Cred+lvl4Mod2Cred+lvl4Mod3Cred+lvl4Mod4Cred+lvl4Mod5Cred+lvl4Mod6Cred)+(numCondoneAttempt*20);
		
		System.out.println("Total Credits obtained = "+lvl4TotCred);
		
		//conditions that check qualification upon completion of level 4
		if (lvl4TotCred < 100) {
			System.out.println("Not passed to level 5");
		} else if (lvl4TotCred == 100) {
			System.out.println("Passed to level 5");
		} else if (lvl4TotCred == 120) {
			System.out.println("Qualified with Cert HE & Passed to level 5");
		}
		
		
		
		
		
		//below is the code that focuses on the logic in level 5
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Level 5");
		System.out.println("----------------");
		
			
		//declared below are the variables for calculations in level 5
		int lvl5TotCred; // total credits obtained in level 5
		int lvl5Mod1Cred; // credits obtained in level 5 module 1
		int lvl5Mod2Cred; // credits obtained in level 5 module 2
		int lvl5Mod3Cred; // credits obtained in level 5 module 3
		int lvl5Mod4Cred; // credits obtained in level 5 module 4
		int lvl5Mod5Cred; // credits obtained in level 5 module 5
		int lvl5Mod6Cred; // credits obtained in level 5 module 6
		
		double lvl5Mod1Avg;
		double lvl5Mod2Avg;
		double lvl5Mod3Avg;
		double lvl5Mod4Avg;
		double lvl5Mod5Avg;
		double lvl5Mod6Avg;
		
		
		
		//below code is for level 5 Module 1 marks entering 
		System.out.print("Input marks for Module1 | ICT1: ");
		int tempLvl5Mod1Ict1 = sc2.nextInt();
					
		System.out.print("Input marks for Module1 | ICT2: ");
		int templvl5Mod1Ict2 = sc2.nextInt();
					
		System.out.print("Input marks for Module1 | ICT3: ");
		int templvl5Mod1Ict3 = sc2.nextInt();
						
		Module lvl5Mod1 = new Module(tempLvl5Mod1Ict1, templvl5Mod1Ict2, templvl5Mod1Ict3);
		lvl5Mod1.creditValidate(tempLvl5Mod1Ict1, templvl5Mod1Ict2, templvl5Mod1Ict3);
					
		if (tempLvl5Mod1Ict1 >= 40 && templvl5Mod1Ict2 >= 40 && templvl5Mod1Ict3 >= 40 && tempLvl5Mod1Ict1 <= 100
				&& templvl5Mod1Ict2 <= 100 && templvl5Mod1Ict3 <= 100 && tempLvl5Mod1Ict1 >= 0 && templvl5Mod1Ict2 >= 0
				&&  templvl5Mod1Ict3>= 0) {
			lvl5Mod1Cred = 20;
			System.out.println("MODULE PASSED");
		} else {
			lvl5Mod1Cred = 0;
			System.out.println("MODULE FAILED");	
		}
				
		if ((tempLvl5Mod1Ict1 < 30 || templvl5Mod1Ict2 < 30 || templvl5Mod1Ict3 < 30) && tempLvl5Mod1Ict1 <= 100
				&& templvl5Mod1Ict2 <= 100 && templvl5Mod1Ict3 <= 100 && tempLvl5Mod1Ict1 >= 0 && templvl5Mod1Ict2 >= 0
				&& templvl5Mod1Ict3 >= 0) {
			System.out.println("Retake required");
			st1.retakeIncrease();
		} else {
			System.out.println("Retake NOT required");
		}
				
		if ((tempLvl5Mod1Ict1 >= 30 || templvl5Mod1Ict2 >= 30 || templvl5Mod1Ict3 >= 30) && 
				(tempLvl5Mod1Ict1 < 40 || templvl5Mod1Ict2 < 40  || templvl5Mod1Ict3 < 40 ) && tempLvl5Mod1Ict1 <= 100
				&& templvl5Mod1Ict2 <= 100 && templvl5Mod1Ict3 <= 100 && tempLvl5Mod1Ict1 >= 0 && templvl5Mod1Ict2 >= 0
				&& templvl5Mod1Ict3 >= 0) {
			System.out.println("Resit required");
			st1.resitIncrease();
		}
		
		
		lvl5Mod1Avg = lvl5Mod1.avg(tempLvl5Mod1Ict1, templvl5Mod1Ict2, templvl5Mod1Ict3);
		
		System.out.println("Average marks="+lvl5Mod1Avg);
				
//		System.out.println(st1.getResit());
//		System.out.println(st1.getRetake());
		
		
		
		
		
		
		
		
		
		//below code is for level 5 Module 2 marks entering 
		System.out.println("_____________________");
		
		System.out.print("Input marks for Module2 | ICT1: ");
		int tempLvl5Mod2Ict1 = sc2.nextInt();
							
		System.out.print("Input marks for Module2 | ICT2: ");
		int templvl5Mod2Ict2 = sc2.nextInt();
							
		System.out.print("Input marks for Module2 | ICT3: ");
		int templvl5Mod2Ict3 = sc2.nextInt();
								
		Module lvl5Mod2 = new Module(tempLvl5Mod2Ict1, templvl5Mod2Ict2, templvl5Mod2Ict3);
		lvl5Mod2.creditValidate(tempLvl5Mod2Ict1, templvl5Mod2Ict2, templvl5Mod2Ict3);
							
		if (tempLvl5Mod2Ict1 >= 40 && templvl5Mod2Ict2 >= 40 && templvl5Mod2Ict3 >= 40 && tempLvl5Mod2Ict1 <= 100
				&& templvl5Mod2Ict2 <= 100 && templvl5Mod2Ict3 <= 100 && tempLvl5Mod2Ict1 >= 0 && templvl5Mod2Ict2 >= 0
				&&  templvl5Mod2Ict3>= 0) {
			lvl5Mod2Cred = 20;
			System.out.println("MODULE PASSED");
		} else {
			lvl5Mod2Cred = 0;
			System.out.println("MODULE FAILED");	
		}
						
		if ((tempLvl5Mod2Ict1 < 30 || templvl5Mod2Ict2 < 30 || templvl5Mod2Ict3 < 30) && tempLvl5Mod2Ict1 <= 100
				&& templvl5Mod2Ict2 <= 100 && templvl5Mod2Ict3 <= 100 && tempLvl5Mod2Ict1 >= 0 && templvl5Mod2Ict2 >= 0
				&& templvl5Mod2Ict3 >= 0) {
			System.out.println("Retake required");
			st1.retakeIncrease();
		} else {
			System.out.println("Retake NOT required");
		}
						
		if ((tempLvl5Mod2Ict1 >= 30 || templvl5Mod2Ict2 >= 30 || templvl5Mod2Ict3 >= 30) && 
				(tempLvl5Mod2Ict1 < 40 || templvl5Mod2Ict2 < 40  || templvl5Mod2Ict3 < 40 ) && tempLvl5Mod2Ict1 <= 100
				&& templvl5Mod2Ict2 <= 100 && templvl5Mod2Ict3 <= 100 && tempLvl5Mod2Ict1 >= 0 && templvl5Mod2Ict2 >= 0
				&& templvl5Mod2Ict3 >= 0) {
			System.out.println("Resit required");
			st1.resitIncrease();
		}
			
		lvl5Mod2Avg = lvl5Mod2.avg(tempLvl5Mod2Ict1, templvl5Mod2Ict2, templvl5Mod2Ict3);
		
		System.out.println("Average marks="+lvl5Mod2Avg);
		
		
//		System.out.println(st1.getResit());
//		System.out.println(st1.getRetake());
				
				
		
		
		
		
		
		//below code is for level 5 Module 3 marks entering 
		System.out.println("_____________________");
		
		System.out.print("Input marks for Module3 | ICT1: ");
		int tempLvl5Mod3Ict1 = sc2.nextInt();
									
		System.out.print("Input marks for Module3 | ICT2: ");
		int templvl5Mod3Ict2 = sc2.nextInt();
									
		System.out.print("Input marks for Module3 | ICT3: ");
		int templvl5Mod3Ict3 = sc2.nextInt();
										
		Module lvl5Mod3 = new Module(tempLvl5Mod3Ict1, templvl5Mod3Ict2, templvl5Mod3Ict3);
		lvl5Mod3.creditValidate(tempLvl5Mod3Ict1, templvl5Mod3Ict2, templvl5Mod3Ict3);
									
		if (tempLvl5Mod3Ict1 >= 40 && templvl5Mod3Ict2 >= 40 && templvl5Mod3Ict3 >= 40 && tempLvl5Mod3Ict1 <= 100
				&& templvl5Mod3Ict2 <= 100 && templvl5Mod3Ict3 <= 100 && tempLvl5Mod3Ict1 >= 0 && templvl5Mod3Ict2 >= 0
				&&  templvl5Mod3Ict3>= 0) {
			lvl5Mod3Cred = 20;
			System.out.println("MODULE PASSED");
		} else {
			lvl5Mod3Cred = 0;
			System.out.println("MODULE FAILED");	
		}
								
		if ((tempLvl5Mod3Ict1 < 30 || templvl5Mod3Ict2 < 30 || templvl5Mod3Ict3 < 30) && tempLvl5Mod3Ict1 <= 100
				&& templvl5Mod3Ict2 <= 100 && templvl5Mod3Ict3 <= 100 && tempLvl5Mod3Ict1 >= 0 && templvl5Mod3Ict2 >= 0
				&& templvl5Mod3Ict3 >= 0) {
			System.out.println("Retake required");
			st1.retakeIncrease();
		} else {
			System.out.println("Retake NOT required");
		}
								
		if ((tempLvl5Mod3Ict1 >= 30 || templvl5Mod3Ict2 >= 30 || templvl5Mod3Ict3 >= 30) && 
				(tempLvl5Mod3Ict1 < 40 || templvl5Mod3Ict2 < 40  || templvl5Mod3Ict3 < 40 ) && tempLvl5Mod3Ict1 <= 100
				&& templvl5Mod3Ict2 <= 100 && templvl5Mod3Ict3 <= 100 && tempLvl5Mod3Ict1 >= 0 && templvl5Mod3Ict2 >= 0
				&& templvl5Mod3Ict3 >= 0) {
			System.out.println("Resit required");
			st1.resitIncrease();
		}
								
		lvl5Mod3Avg = lvl5Mod3.avg(tempLvl5Mod3Ict1, templvl5Mod3Ict2, templvl5Mod3Ict3);
		
		System.out.println("Average marks="+lvl5Mod3Avg);
		
//		System.out.println(st1.getResit());
//		System.out.println(st1.getRetake());
		
		
		
		
		
		
		//below code is for level 5 Module 4 marks entering
		System.out.println("_____________________");
		
		System.out.print("Input marks for Module4 | ICT1: ");
		int tempLvl5Mod4Ict1 = sc2.nextInt();
											
		System.out.print("Input marks for Module4 | ICT2: ");
		int templvl5Mod4Ict2 = sc2.nextInt();
											
		System.out.print("Input marks for Module4 | ICT3: ");
		int templvl5Mod4Ict3 = sc2.nextInt();
												
		Module lvl5Mod4 = new Module(tempLvl5Mod4Ict1, templvl5Mod4Ict2, templvl5Mod4Ict3);
		lvl5Mod4.creditValidate(tempLvl5Mod4Ict1, templvl5Mod4Ict2, templvl5Mod4Ict3);
											
		if (tempLvl5Mod4Ict1 >= 40 && templvl5Mod4Ict2 >= 40 && templvl5Mod4Ict3 >= 40 && tempLvl5Mod4Ict1 <= 100
				&& templvl5Mod4Ict2 <= 100 && templvl5Mod4Ict3 <= 100 && tempLvl5Mod4Ict1 >= 0 && templvl5Mod4Ict2 >= 0
				&&  templvl5Mod4Ict3>= 0) {
			lvl5Mod4Cred = 20;
			System.out.println("MODULE PASSED");
		} else {
			lvl5Mod4Cred = 0;
			System.out.println("MODULE FAILED");	
		}
										
		if ((tempLvl5Mod4Ict1 < 30 || templvl5Mod4Ict2 < 30 || templvl5Mod4Ict3 < 30) && tempLvl5Mod4Ict1 <= 100
				&& templvl5Mod4Ict2 <= 100 && templvl5Mod4Ict3 <= 100 && tempLvl5Mod4Ict1 >= 0 && templvl5Mod4Ict2 >= 0
				&& templvl5Mod4Ict3 >= 0) {
			System.out.println("Retake required");
			st1.retakeIncrease();
		} else {
			System.out.println("Retake NOT required");
		}
										
		if ((tempLvl5Mod4Ict1 >= 30 || templvl5Mod4Ict2 >= 30 || templvl5Mod4Ict3 >= 30) && 
				(tempLvl5Mod4Ict1 < 40 || templvl5Mod4Ict2 < 40  || templvl5Mod4Ict3 < 40 ) && tempLvl5Mod4Ict1 <= 100
				&& templvl5Mod4Ict2 <= 100 && templvl5Mod4Ict3 <= 100 && tempLvl5Mod4Ict1 >= 0 && templvl5Mod4Ict2 >= 0
				&& templvl5Mod3Ict3 >= 0) {
			System.out.println("Resit required");
			st1.resitIncrease();
		}
										
		lvl5Mod4Avg = lvl5Mod4.avg(tempLvl5Mod4Ict1, templvl5Mod4Ict2, templvl5Mod4Ict3);
		
		System.out.println("Average marks="+lvl5Mod4Avg);
		
		
//		System.out.println(st1.getResit());
//		System.out.println(st1.getRetake());
		
	
	
		//below code is for level 5 Module 5 marks entering
		System.out.println("_____________________");
		
		System.out.print("Input marks for Module5 | ICT1: ");
		int tempLvl5Mod5Ict1 = sc2.nextInt();
													
		System.out.print("Input marks for Module5 | ICT2: ");
		int templvl5Mod5Ict2 = sc2.nextInt();
													
		System.out.print("Input marks for Module5 | ICT3: ");
		int templvl5Mod5Ict3 = sc2.nextInt();
														
		Module lvl5Mod5 = new Module(tempLvl5Mod5Ict1, templvl5Mod5Ict2, templvl5Mod5Ict3);
		lvl5Mod5.creditValidate(tempLvl5Mod5Ict1, templvl5Mod5Ict2, templvl5Mod5Ict3);
													
		if (tempLvl5Mod5Ict1 >= 40 && templvl5Mod5Ict2 >= 40 && templvl5Mod5Ict3 >= 40 && tempLvl5Mod5Ict1 <= 100
				&& templvl5Mod5Ict2 <= 100 && templvl5Mod5Ict3 <= 100 && tempLvl5Mod5Ict1 >= 0 && templvl5Mod5Ict2 >= 0
				&&  templvl5Mod5Ict3>= 0) {
			lvl5Mod5Cred = 20;
			System.out.println("MODULE PASSED");
		} else {
			lvl5Mod5Cred = 0;
			System.out.println("MODULE FAILED");	
		}
												
		if ((tempLvl5Mod5Ict1 < 30 || templvl5Mod5Ict2 < 30 || templvl5Mod5Ict3 < 30) && tempLvl5Mod5Ict1 <= 100
				&& templvl5Mod5Ict2 <= 100 && templvl5Mod5Ict3 <= 100 && tempLvl5Mod5Ict1 >= 0 && templvl5Mod5Ict2 >= 0
				&& templvl5Mod5Ict3 >= 0) {
			System.out.println("Retake required");
			st1.retakeIncrease();
		} else {
			System.out.println("Retake NOT required");
		}
												
		if ((tempLvl5Mod5Ict1 >= 30 || templvl5Mod5Ict2 >= 30 || templvl5Mod5Ict3 >= 30) && 
				(tempLvl5Mod5Ict1 < 40 || templvl5Mod5Ict2 < 40  || templvl5Mod5Ict3 < 40 ) && tempLvl5Mod5Ict1 <= 100
				&& templvl5Mod5Ict2 <= 100 && templvl5Mod5Ict3 <= 100 && tempLvl5Mod5Ict1 >= 0 && templvl5Mod5Ict2 >= 0
				&& templvl5Mod5Ict3 >= 0) {
			System.out.println("Resit required");
			st1.resitIncrease();
		}
												
		lvl5Mod5Avg = lvl5Mod5.avg(tempLvl5Mod5Ict1, templvl5Mod5Ict2, templvl5Mod5Ict3);
		
		System.out.println("Average marks="+lvl5Mod5Avg);		
		
//		System.out.println(st1.getResit());
//		System.out.println(st1.getRetake());
		
		
		
		
		
		//below code is for level 5 Module 5 marks entering
		System.out.println("_____________________");
		
		System.out.print("Input marks for Module6 | ICT1: ");
		int tempLvl5Mod6Ict1 = sc2.nextInt();
															
		System.out.print("Input marks for Module6 | ICT2: ");
		int templvl5Mod6Ict2 = sc2.nextInt();
															
		System.out.print("Input marks for Module6 | ICT3: ");
		int templvl5Mod6Ict3 = sc2.nextInt();
																
		Module lvl5Mod6 = new Module(tempLvl5Mod6Ict1, templvl5Mod6Ict2, templvl5Mod6Ict3);
		lvl5Mod6.creditValidate(tempLvl5Mod6Ict1, templvl5Mod6Ict2, templvl5Mod6Ict3);
															
		if (tempLvl5Mod6Ict1 >= 40 && templvl5Mod6Ict2 >= 40 && templvl5Mod6Ict3 >= 40 && tempLvl5Mod6Ict1 <= 100
				&& templvl5Mod6Ict2 <= 100 && templvl5Mod6Ict3 <= 100 && tempLvl5Mod6Ict1 >= 0 && templvl5Mod6Ict2 >= 0
				&&  templvl5Mod6Ict3>= 0) {
			lvl5Mod6Cred = 20;
			System.out.println("MODULE PASSED");
		} else {
			lvl5Mod6Cred = 0;
			System.out.println("MODULE FAILED");	
		}
														
		if ((tempLvl5Mod6Ict1 < 30 || templvl5Mod6Ict2 < 30 || templvl5Mod6Ict3 < 30) && tempLvl5Mod6Ict1 <= 100
				&& templvl5Mod6Ict2 <= 100 && templvl5Mod6Ict3 <= 100 && tempLvl5Mod6Ict1 >= 0 && templvl5Mod6Ict2 >= 0
				&& templvl5Mod6Ict3 >= 0) {
			System.out.println("Retake required");
			st1.retakeIncrease();
		} else {
			System.out.println("Retake NOT required");
		}
														
		if ((tempLvl5Mod6Ict1 >= 30 || templvl5Mod6Ict2 >= 30 || templvl5Mod6Ict3 >= 30) && 
				(tempLvl5Mod6Ict1 < 40 || templvl5Mod6Ict2 < 40  || templvl5Mod6Ict3 < 40 ) && tempLvl5Mod6Ict1 <= 100
				&& templvl5Mod6Ict2 <= 100 && templvl5Mod6Ict3 <= 100 && tempLvl5Mod6Ict1 >= 0 && templvl5Mod6Ict2 >= 0
				&& templvl5Mod6Ict3 >= 0) {
			System.out.println("Resit required");
			st1.resitIncrease();
		}
					
		lvl5Mod6Avg = lvl5Mod6.avg(tempLvl5Mod6Ict1, templvl5Mod6Ict2, templvl5Mod6Ict3);
		
		System.out.println("Average marks="+lvl5Mod6Avg);
						
//		System.out.println(st1.getResit());
//		System.out.println(st1.getRetake());
		
		
		
				
		//calculates the total credits obtained for level 5
		lvl5TotCred = lvl5Mod1Cred+lvl5Mod2Cred+lvl5Mod3Cred+lvl5Mod4Cred+lvl5Mod5Cred+lvl5Mod6Cred;
		
		System.out.println("Total Credits obtained = "+lvl5TotCred);

		//conditions that check qualification upon completion of level 4
		if (lvl5TotCred < 100) {
			System.out.println("Not passed to level 6");
		} else if (lvl5TotCred == 100) {
			System.out.println("Passed to level 6");
		} else if (lvl4TotCred==120 && lvl5TotCred == 120) {
			System.out.println("Qualified with Dip HE & Passed to level 6");
		} else if (lvl4TotCred<100 && lvl5TotCred>100) {
			System.out.println("ILLEGAL ENTRANCE TO LEVEL 5");
		} else if (lvl4TotCred==100 && lvl5TotCred == 100) {
			System.out.println("Passed to level 6");
		}
		
		
				
				
				
				//below is the code that focuses on the logic in level 6
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("Level 6");
				System.out.println("----------------");
				
					
				//declared below are the variables for calculations in level 5
				int lvl6TotCred; // total credits obtained in level 6
				int lvl6Mod1Cred; // credits obtained in level 6 module 1
				int lvl6Mod2Cred; // credits obtained in level 6 module 2
				int lvl6Mod3Cred; // credits obtained in level 6 module 3
				int lvl6Mod4Cred; // credits obtained in level 6 module 4
				int lvl6Mod5Cred; // credits obtained in level 6 module 5
				int lvl6Mod6Cred; // credits obtained in level 6 module 6
				
				double lvl6Mod1Avg;
				double lvl6Mod2Avg;
				double lvl6Mod3Avg;
				double lvl6Mod4Avg;
				double lvl6Mod5Avg;
				double lvl6Mod6Avg;
				
				
				//below code is for level 6 Module 1 marks entering 
				System.out.println("_____________________");
				
				System.out.print("Input marks for Module1 | ICT1: ");
				int tempLvl6Mod1Ict1 = sc2.nextInt();
							
				System.out.print("Input marks for Module1 | ICT2: ");
				int templvl6Mod1Ict2 = sc2.nextInt();
							
				System.out.print("Input marks for Module1 | ICT3: ");
				int templvl6Mod1Ict3 = sc2.nextInt();
								
				Module lvl6Mod1 = new Module(tempLvl6Mod1Ict1, templvl6Mod1Ict2, templvl6Mod1Ict3);
				lvl6Mod1.creditValidate(tempLvl6Mod1Ict1, templvl6Mod1Ict2, templvl6Mod1Ict3);
							
				if (tempLvl6Mod1Ict1 >= 40 && templvl6Mod1Ict2 >= 40 && templvl6Mod1Ict3 >= 40 && tempLvl6Mod1Ict1 <= 100
						&& templvl6Mod1Ict2 <= 100 && templvl6Mod1Ict3 <= 100 && tempLvl6Mod1Ict1 >= 0 && templvl6Mod1Ict2 >= 0
						&&  templvl6Mod1Ict3>= 0) {
					lvl6Mod1Cred = 20;
					System.out.println("MODULE PASSED");
				} else {
					lvl6Mod1Cred = 0;
					System.out.println("MODULE FAILED");	
				}
						
				if ((tempLvl6Mod1Ict1 < 30 || templvl6Mod1Ict2 < 30 || templvl6Mod1Ict3 < 30) && tempLvl6Mod1Ict1 <= 100
						&& templvl6Mod1Ict2 <= 100 && templvl6Mod1Ict3 <= 100 && tempLvl6Mod1Ict1 >= 0 && templvl6Mod1Ict2 >= 0
						&& templvl6Mod1Ict3 >= 0) {
					System.out.println("Retake required");
					st1.retakeIncrease();
				} else {
					System.out.println("Retake NOT required");
				}
						
				if ((tempLvl6Mod1Ict1 >= 30 || templvl6Mod1Ict2 >= 30 || templvl6Mod1Ict3 >= 30) && 
						(tempLvl6Mod1Ict1 < 40 || templvl6Mod1Ict2 < 40  || templvl6Mod1Ict3 < 40 ) && tempLvl6Mod1Ict1 <= 100
						&& templvl6Mod1Ict2 <= 100 && templvl6Mod1Ict3 <= 100 && tempLvl6Mod1Ict1 >= 0 && templvl6Mod1Ict2 >= 0
						&& templvl6Mod1Ict3 >= 0) {
					System.out.println("Resit required");
					st1.resitIncrease();
				}
						
				lvl6Mod1Avg = lvl6Mod1.avg(tempLvl6Mod1Ict1, templvl6Mod1Ict2, templvl6Mod1Ict3);
				
				System.out.println("Average marks="+lvl6Mod1Avg);
				
//				System.out.println(st1.getResit());
//				System.out.println(st1.getRetake());
				
				
				
				
				
				
				
				
				
				//below code is for level 6 Module 2 marks entering 
				System.out.println("_____________________");
				
				System.out.print("Input marks for Module2 | ICT1: ");
				int tempLvl6Mod2Ict1 = sc2.nextInt();
									
				System.out.print("Input marks for Module2 | ICT2: ");
				int templvl6Mod2Ict2 = sc2.nextInt();
									
				System.out.print("Input marks for Module2 | ICT3: ");
				int templvl6Mod2Ict3 = sc2.nextInt();
										
				Module lvl6Mod2 = new Module(tempLvl6Mod2Ict1, templvl6Mod2Ict2, templvl6Mod2Ict3);
				lvl6Mod2.creditValidate(tempLvl6Mod2Ict1, templvl6Mod2Ict2, templvl6Mod2Ict3);
									
				if (tempLvl6Mod2Ict1 >= 40 && templvl6Mod2Ict2 >= 40 && templvl6Mod2Ict3 >= 40 && tempLvl6Mod2Ict1 <= 100
						&& templvl6Mod2Ict2 <= 100 && templvl6Mod2Ict3 <= 100 && tempLvl6Mod2Ict1 >= 0 && templvl6Mod2Ict2 >= 0
						&&  templvl6Mod2Ict3>= 0) {
					lvl6Mod2Cred = 20;
					System.out.println("MODULE PASSED");
				} else {
					lvl6Mod2Cred = 0;
					System.out.println("MODULE FAILED");	
				}
								
				if ((tempLvl6Mod2Ict1 < 30 || templvl6Mod2Ict2 < 30 || templvl6Mod2Ict3 < 30) && tempLvl6Mod2Ict1 <= 100
						&& templvl6Mod2Ict2 <= 100 && templvl6Mod2Ict3 <= 100 && tempLvl6Mod2Ict1 >= 0 && templvl6Mod2Ict2 >= 0
						&& templvl6Mod2Ict3 >= 0) {
					System.out.println("Retake required");
					st1.retakeIncrease();
				} else {
					System.out.println("Retake NOT required");
				}
								
				if ((tempLvl6Mod2Ict1 >= 30 || templvl6Mod2Ict2 >= 30 || templvl6Mod2Ict3 >= 30) && 
						(tempLvl6Mod2Ict1 < 40 || templvl6Mod2Ict2 < 40  || templvl6Mod2Ict3 < 40 ) && tempLvl6Mod2Ict1 <= 100
						&& templvl6Mod2Ict2 <= 100 && templvl6Mod2Ict3 <= 100 && tempLvl6Mod2Ict1 >= 0 && templvl6Mod2Ict2 >= 0
						&& templvl6Mod2Ict3 >= 0) {
					System.out.println("Resit required");
					st1.resitIncrease();
				}
								
				lvl6Mod2Avg = lvl6Mod2.avg(tempLvl6Mod2Ict1, templvl6Mod2Ict2, templvl6Mod2Ict3);
				
				System.out.println("Average marks="+lvl6Mod2Avg);
				
//				System.out.println(st1.getResit());
//				System.out.println(st1.getRetake());			
						
				
				
				
				
				
				//below code is for level 6 Module 3 marks entering
				System.out.println("_____________________");
				
				System.out.print("Input marks for Module3 | ICT1: ");
				int tempLvl6Mod3Ict1 = sc2.nextInt();
											
				System.out.print("Input marks for Module3 | ICT2: ");
				int templvl6Mod3Ict2 = sc2.nextInt();
											
				System.out.print("Input marks for Module3 | ICT3: ");
				int templvl6Mod3Ict3 = sc2.nextInt();
												
				Module lvl6Mod3 = new Module(tempLvl6Mod3Ict1, templvl6Mod3Ict2, templvl6Mod3Ict3);
				lvl6Mod3.creditValidate(tempLvl6Mod3Ict1, templvl6Mod3Ict2, templvl6Mod3Ict3);
											
				if (tempLvl6Mod3Ict1 >= 40 && templvl6Mod3Ict2 >= 40 && templvl6Mod3Ict3 >= 40 && tempLvl6Mod3Ict1 <= 100
						&& templvl6Mod3Ict2 <= 100 && templvl6Mod3Ict3 <= 100 && tempLvl6Mod3Ict1 >= 0 && templvl6Mod3Ict2 >= 0
						&&  templvl6Mod3Ict3>= 0) {
					lvl6Mod3Cred = 20;
					System.out.println("MODULE PASSED");
				} else {
					lvl6Mod3Cred = 0;
					System.out.println("MODULE FAILED");	
				}
										
				if ((tempLvl6Mod3Ict1 < 30 || templvl6Mod3Ict2 < 30 || templvl6Mod3Ict3 < 30) && tempLvl6Mod3Ict1 <= 100
						&& templvl6Mod3Ict2 <= 100 && templvl6Mod3Ict3 <= 100 && tempLvl6Mod3Ict1 >= 0 && templvl6Mod3Ict2 >= 0
						&& templvl6Mod3Ict3 >= 0) {
					System.out.println("Retake required");
					st1.retakeIncrease();
				} else {
					System.out.println("Retake NOT required");
				}
										
				if ((tempLvl6Mod3Ict1 >= 30 || templvl6Mod3Ict2 >= 30 || templvl6Mod3Ict3 >= 30) && 
						(tempLvl6Mod3Ict1 < 40 || templvl6Mod3Ict2 < 40  || templvl6Mod3Ict3 < 40 ) && tempLvl6Mod3Ict1 <= 100
						&& templvl6Mod3Ict2 <= 100 && templvl6Mod3Ict3 <= 100 && tempLvl6Mod3Ict1 >= 0 && templvl6Mod3Ict2 >= 0
						&& templvl6Mod3Ict3 >= 0) {
					System.out.println("Resit required");
					st1.resitIncrease();
				}
										
				lvl6Mod3Avg = lvl6Mod3.avg(tempLvl6Mod3Ict1, templvl6Mod3Ict2, templvl6Mod3Ict3);
				
				System.out.println("Average marks="+lvl6Mod3Avg);
				
//				System.out.println(st1.getResit());
//				System.out.println(st1.getRetake());
				
				
				
				
				
				
				//below code is for level 6 Module 4 marks entering
				System.out.println("_____________________");
				
				System.out.print("Input marks for Module4 | ICT1: ");
				int tempLvl6Mod4Ict1 = sc2.nextInt();
													
				System.out.print("Input marks for Module4 | ICT2: ");
				int templvl6Mod4Ict2 = sc2.nextInt();
													
				System.out.print("Input marks for Module4 | ICT3: ");
				int templvl6Mod4Ict3 = sc2.nextInt();
														
				Module lvl6Mod4 = new Module(tempLvl6Mod4Ict1, templvl6Mod4Ict2, templvl6Mod4Ict3);
				lvl6Mod4.creditValidate(tempLvl6Mod4Ict1, templvl6Mod4Ict2, templvl6Mod4Ict3);
													
				if (tempLvl6Mod4Ict1 >= 40 && templvl6Mod4Ict2 >= 40 && templvl6Mod4Ict3 >= 40 && tempLvl6Mod4Ict1 <= 100
						&& templvl6Mod4Ict2 <= 100 && templvl6Mod4Ict3 <= 100 && tempLvl5Mod4Ict1 >= 0 && templvl6Mod4Ict2 >= 0
						&&  templvl6Mod4Ict3>= 0) {
					lvl6Mod4Cred = 20;
					System.out.println("MODULE PASSED");
				} else {
					lvl6Mod4Cred = 0;
					System.out.println("MODULE FAILED");	
				}
												
				if ((tempLvl6Mod4Ict1 < 30 || templvl6Mod4Ict2 < 30 || templvl6Mod4Ict3 < 30) && tempLvl6Mod4Ict1 <= 100
						&& templvl6Mod4Ict2 <= 100 && templvl6Mod4Ict3 <= 100 && tempLvl6Mod4Ict1 >= 0 && templvl6Mod4Ict2 >= 0
						&& templvl6Mod4Ict3 >= 0) {
					System.out.println("Retake required");
					st1.retakeIncrease();
				} else {
					System.out.println("Retake NOT required");
				}
												
				if ((tempLvl6Mod4Ict1 >= 30 || templvl6Mod4Ict2 >= 30 || templvl6Mod4Ict3 >= 30) && 
						(tempLvl6Mod4Ict1 < 40 || templvl6Mod4Ict2 < 40  || templvl6Mod4Ict3 < 40 ) && tempLvl6Mod4Ict1 <= 100
						&& templvl6Mod4Ict2 <= 100 && templvl6Mod4Ict3 <= 100 && tempLvl6Mod4Ict1 >= 0 && templvl6Mod4Ict2 >= 0
						&& templvl6Mod3Ict3 >= 0) {
					System.out.println("Resit required");
					st1.resitIncrease();
				}
												
				lvl6Mod4Avg = lvl6Mod4.avg(tempLvl6Mod4Ict1, templvl6Mod4Ict2, templvl6Mod4Ict3);
				
				System.out.println("Average marks="+lvl6Mod4Avg);
				
			
//				System.out.println(st1.getResit());
//				System.out.println(st1.getRetake());
				
			
			
				//below code is for level 6 Module 5 marks entering 
				System.out.println("_____________________");
				
				System.out.print("Input marks for Module5 | ICT1: ");
				int tempLvl6Mod5Ict1 = sc2.nextInt();
															
				System.out.print("Input marks for Module5 | ICT2: ");
				int templvl6Mod5Ict2 = sc2.nextInt();
															
				System.out.print("Input marks for Module5 | ICT3: ");
				int templvl6Mod5Ict3 = sc2.nextInt();
																
				Module lvl6Mod5 = new Module(tempLvl6Mod5Ict1, templvl6Mod5Ict2, templvl6Mod5Ict3);
				lvl6Mod5.creditValidate(tempLvl6Mod5Ict1, templvl6Mod5Ict2, templvl6Mod5Ict3);
															
				if (tempLvl6Mod5Ict1 >= 40 && templvl6Mod5Ict2 >= 40 && templvl6Mod5Ict3 >= 40 && tempLvl6Mod5Ict1 <= 100
						&& templvl6Mod5Ict2 <= 100 && templvl6Mod5Ict3 <= 100 && tempLvl6Mod5Ict1 >= 0 && templvl6Mod5Ict2 >= 0
						&&  templvl6Mod5Ict3>= 0) {
					lvl6Mod5Cred = 20;
					System.out.println("MODULE PASSED");
				} else {
					lvl6Mod5Cred = 0;
					System.out.println("MODULE FAILED");	
				}
														
				if ((tempLvl6Mod5Ict1 < 30 || templvl6Mod5Ict2 < 30 || templvl6Mod5Ict3 < 30) && tempLvl6Mod5Ict1 <= 100
						&& templvl6Mod5Ict2 <= 100 && templvl6Mod5Ict3 <= 100 && tempLvl6Mod5Ict1 >= 0 && templvl6Mod5Ict2 >= 0
						&& templvl6Mod5Ict3 >= 0) {
					System.out.println("Retake required");
					st1.retakeIncrease();
				} else {
					System.out.println("Retake NOT required");
				}
														
				if ((tempLvl6Mod5Ict1 >= 30 || templvl6Mod5Ict2 >= 30 || templvl6Mod5Ict3 >= 30) && 
						(tempLvl6Mod5Ict1 < 40 || templvl6Mod5Ict2 < 40  || templvl6Mod5Ict3 < 40 ) && tempLvl6Mod5Ict1 <= 100
						&& templvl6Mod5Ict2 <= 100 && templvl6Mod5Ict3 <= 100 && tempLvl6Mod5Ict1 >= 0 && templvl6Mod5Ict2 >= 0
						&& templvl6Mod5Ict3 >= 0) {
					System.out.println("Resit required");
					st1.resitIncrease();
				}
														
				lvl6Mod5Avg = lvl6Mod5.avg(tempLvl6Mod5Ict1, templvl6Mod5Ict2, templvl6Mod5Ict3);
				
				System.out.println("Average marks="+lvl6Mod5Avg);
				
				
//				System.out.println(st1.getResit());
//				System.out.println(st1.getRetake());
				
				
				
				
				
				//below code is for level 6 Module 6 marks entering
				System.out.println("_____________________");
				
				System.out.print("Input marks for Module6 | ICT1: ");
				int tempLvl6Mod6Ict1 = sc2.nextInt();
																	
				System.out.print("Input marks for Module6 | ICT2: ");
				int templvl6Mod6Ict2 = sc2.nextInt();
																	
				System.out.print("Input marks for Module6 | ICT3: ");
				int templvl6Mod6Ict3 = sc2.nextInt();
																		
				Module lvl6Mod6 = new Module(tempLvl6Mod6Ict1, templvl6Mod6Ict2, templvl6Mod6Ict3);
				lvl6Mod6.creditValidate(tempLvl6Mod6Ict1, templvl6Mod6Ict2, templvl6Mod6Ict3);
																	
				if (tempLvl6Mod6Ict1 >= 40 && templvl6Mod6Ict2 >= 40 && templvl6Mod6Ict3 >= 40 && tempLvl6Mod6Ict1 <= 100
						&& templvl6Mod6Ict2 <= 100 && templvl6Mod6Ict3 <= 100 && tempLvl6Mod6Ict1 >= 0 && templvl6Mod6Ict2 >= 0
						&&  templvl6Mod6Ict3>= 0) {
					lvl6Mod6Cred = 20;
					System.out.println("MODULE PASSED");
				} else {
					lvl6Mod6Cred = 0;
					System.out.println("MODULE FAILED");	
				}
																
				if ((tempLvl6Mod6Ict1 < 30 || templvl6Mod6Ict2 < 30 || templvl6Mod6Ict3 < 30) && tempLvl6Mod6Ict1 <= 100
						&& templvl6Mod6Ict2 <= 100 && templvl6Mod6Ict3 <= 100 && tempLvl6Mod6Ict1 >= 0 && templvl6Mod6Ict2 >= 0
						&& templvl6Mod6Ict3 >= 0) {
					System.out.println("Retake required");
					st1.retakeIncrease();
				} else {
					System.out.println("Retake NOT required");
				}
																
				if ((tempLvl6Mod6Ict1 >= 30 || templvl6Mod6Ict2 >= 30 || templvl6Mod6Ict3 >= 30) && 
						(tempLvl6Mod6Ict1 < 40 || templvl6Mod6Ict2 < 40  || templvl6Mod6Ict3 < 40 ) && tempLvl6Mod6Ict1 <= 100
						&& templvl6Mod6Ict2 <= 100 && templvl6Mod6Ict3 <= 100 && tempLvl6Mod6Ict1 >= 0 && templvl6Mod6Ict2 >= 0
						&& templvl6Mod6Ict3 >= 0) {
					System.out.println("Resit required");
					st1.resitIncrease();
				}
																
				lvl6Mod6Avg = lvl6Mod6.avg(tempLvl6Mod6Ict1, templvl6Mod6Ict2, templvl6Mod6Ict3);
				
				System.out.println("Average marks="+lvl6Mod6Avg);				
				
//				System.out.println(st1.getResit());
//				System.out.println(st1.getRetake());
						
			
				//calculates the total credits obtained for level 6
				lvl6TotCred = lvl6Mod1Cred+lvl6Mod2Cred+lvl6Mod3Cred+lvl6Mod4Cred+lvl6Mod5Cred+lvl6Mod6Cred;
				
				System.out.println("Total Credits obtained = "+lvl6TotCred);
				
				System.out.println("Total number of resits = "+st1.getResit());
				System.out.println("Total number of retakes = "+st1.getRetake());
				
				
				//variable to store temporary total value
				double classTotal = lvl5Mod1Avg+lvl5Mod2Avg+lvl5Mod3Avg+lvl5Mod4Avg+lvl5Mod5Avg+lvl5Mod6Avg+
									((lvl6Mod1Avg+lvl6Mod2Avg+lvl6Mod3Avg+lvl6Mod4Avg+lvl6Mod5Avg+lvl6Mod6Avg)*2);
				
				System.out.println(classTotal);
				
				//variable to store final average value
				double classAvg;
				
				//final qualification calculation code for class
				//array with average module marks of level 5
				double lvl5[] = {lvl5Mod1Avg,lvl5Mod2Avg,lvl5Mod3Avg,lvl5Mod4Avg,lvl5Mod5Avg,lvl5Mod6Avg};
				
				double min5=lvl5[0];
				for (double val5:lvl5) {
					if (val5<min5) {
						min5=val5;
					} else {
						min5=lvl5[0];
					}
				}
				
				
				
				//array with average module marks of level 6
				double lvl6[] = {lvl6Mod1Avg,lvl6Mod2Avg,lvl6Mod3Avg,lvl6Mod4Avg,lvl6Mod5Avg,lvl6Mod6Avg};
				
				double min6=lvl6[0];
				for (double val6:lvl6) {
					if (val6<min6) {
						min5=val6;
					} else {
						min6=lvl6[0];
					}
				}
				
				//comparing minimum values of both level 5 & 6
				if (min5<min6) {
					classTotal = classTotal-min5;
					classAvg = classTotal/17;
				} else {
					classTotal = classTotal-((min6)*2);
					classAvg = classTotal/16;
				}
				
				//below code deals with the final qualification of under graduate
				System.out.println("Class average of "+st1.getName()+" is "+classAvg);
				
				if (lvl4TotCred==120 && lvl5TotCred == 120 && lvl6TotCred>60 && lvl6TotCred<120) {
					System.out.println("Qualified with Non Hons degree");
					
				} else if (lvl4TotCred==120 && lvl5TotCred == 120 && lvl6TotCred==120) {
					System.out.println("Qualified with Hons degree");
					
					if (classAvg>=70.0 && classAvg<=100) {
						System.out.println("1st class degree");
					}
				
					if (classAvg>=70.0 && classAvg<=69.9) {
						System.out.println("2nd class upper division degree");
					}
				
					if (classAvg>=50.0 && classAvg<=59.9) {
						System.out.println("2nd class lower division degree");
					}
				
					if (classAvg>=40.0 && classAvg<=49.9) {
						System.out.println("3rd class degree");
					}
	
				} else {
					System.out.println("No applicable qualification");
				}
	
				//below code allows for saving the important data to a file for later use
				File file = new File("Student.txt");
				
			
				
	
		
		try {
			
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(st1);
			oos.flush();
			oos.close();
			fos.close();
			
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
			
			
			try {
				while(true) {
					st1 = (Student)ois.readObject();
					System.out.println(" ");
					System.out.println("PERFORMANCE REVIEW OF STUDENT ID "+st1.getId());
					System.out.println("____________________");
					System.out.println(st1);
				}
			} catch (EOFException ex) {
				System.out.println("Completed");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} catch (IOException e){
			
			System.out.println("File not found");
				
		}
	} 
}
