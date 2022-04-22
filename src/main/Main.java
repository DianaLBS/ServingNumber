package main;

import java.util.Scanner;


public class Main {
	//public static BillBoardData data;
	public static Scanner sc;
	
	
	public static void main(String[] args)  {
		
		sc= new Scanner (System.in);
		//data =new BillBoardData();
		
		System.out.println("Welcome to the Serving NUmber program");
		showMenu();
		
	}
	
	public static void showMenu()  {
		
		boolean continuee=true;
		do {
			System.out.println("[MAIN MENU:]");
			System.out.println("Choose a option:"
					+ "\n1: Give Turn"
					+ "\n2: Show Turn"
					+ "\n3: Pass turn "
					+ "\n4: Delete current turn"
					+ "\n0: exit");
			
			int option=sc.nextInt();
			switch(option) {
				case 1:
					giveTurn();
				break;
				case 2: 
					showTurn();
				break;
				case 3:
					passTurn();
				break;
				case 4:
					deleteTurn();
				break;
				case 0:
					continuee=false;
				break;
				default:
					System.out.println("Incorrect Option");
			}
		}while(continuee==true);
	}

	private static void deleteTurn() {
		// TODO Auto-generated method stub
		
	}

	private static void passTurn() {
		// TODO Auto-generated method stub
		
	}

	private static void showTurn() {
		// TODO Auto-generated method stub
		
	}

	private static void giveTurn() {
		// TODO Auto-generated method stub
		
	}


}
