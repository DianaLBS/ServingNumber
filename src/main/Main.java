package main;


import java.util.Scanner;

import model.LinkedList;
import model.Node;


public class Main {
	
	public static LinkedList list;
	public static Scanner sc;
	
	public static void main(String[] args)  {
		list= new LinkedList();
		sc= new Scanner (System.in);
		
		System.out.println("Welcome to the Serving Number program");
		
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
					//list.print();
					continuee=false;
				break;
				default:
					System.out.println("Incorrect Option");
			}
		}while(continuee==true);
	}

	private static void deleteTurn() {
		if(list.getCurrent()!=null && list.delete(list.getCurrent().getNumber())) {
			if(list.getCurrent()!=null) {
				list.setCurrent(list.getCurrent().getNext());
			}
			System.out.println("Turn successfully eliminated");
		}else {
			System.out.println("There are no turns to eliminate");
		}
	}

	private static void passTurn() {
		if(!list.passTurn()) {
			System.out.println("There are no turns to pass");
		}
		
	}

	private static void showTurn() {
		if(list.isEmpty()) {
			System.out.println("No turns yet");
		}else {
			System.out.println("The current turn is: "+list.getCurrent().getNumber());
		}
		
	}

	private static void giveTurn() {
		int turnNumber=1;
		if(list.getTail()!=null) {
			turnNumber=list.getTail().getNumber()+1;
		}
		list.addLast(new Node(turnNumber));
		System.out.println("The new turn is: "+list.getTail().getNumber());
		//list.print();
		
	}
}
