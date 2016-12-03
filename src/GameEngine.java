import java.util.*;
	
public class GameEngine {
	
	private Random random;
	private Scanner scan;
	

	public GameEngine(){
		random = new Random();
		scan = new Scanner(System.in);
	}
	
	public void mainMenu(){
		String menuDisplay = "Welcome to Mad Chess"
				+ "\n1.Play the game"
				+ "\n2.See the Instructions"
				+ "\n3.See Credits"
				+ "\n4 Quit.\n";
		
		String instructions = "\tSince Mad Chess is a turn based chess game each player will make their moves one by one\n"+
								"\tThere are six different pieces that player can play with. \n" + 
								"\tThese are and their moving styles and their levels are:\n\n"+
								"\tSlave:(Level 1) can move 2 squares straight if the path is empty\n"+
								"\tand can move 1 square diagonally in order to beat opponents piece\n\n"+        
								"\tGuard:(Level 2) can move 3 squares straight in both directions if the path is empty\n"+          
								"\tCavalier:(Level 3) can move 3 squares up or down and 2 squares right or left if the path is empty\n"+          
								"\tEagle:(Level 4) can move 3 squares diagonally, path does not have to be empty\n"+          
								"\tDragon:(Level 5) can move 4 squares straight in both directions or can move 4 squares diagonally, path does not have to be empty\n"+          
								"\tWarlord:(Level 6) can move 1 squares straight in both directions or can move 2 squares diagonally, if the path empty\n "+         
								"\tWhen a piece moves on to a chest on the board chests special effect becomes activated.\n"+
								"\tThere are five different chests either with good or bad effects these are:\n\n "+         
								"\tLevel Up: Levels up the piece by one (can level up maximum to Warlord).\n"+
								"\tLevel Down: Levels down the piece by one (can level down minimum to slave.\n"+
								"\tCreate Random Piece: Creates a random colored and leveled piece to empty square.\n"+
								"\tDestroy Random Piece: Destroys a random colored and leveled piece from empty square.\n"+
								"\tMove to Random Square: The piece that opens this chest teleported to a random square in the board.\n\n"+
								"\tIf your opponent is run out of Warlords you win!\n";
		
		String credits = 	"\t\t MAD CHESS: a Bilkent University CS 453 Project\n\n" +
							"\tWritten By:  Caner Bozkurt, Baris Celik, Cagribey Guvendik, Javid Karimbayli, Halil Emre Akbas\n";
		
		String input = "";
		do {
			
			System.out.println(menuDisplay);
			System.out.print("Enter a number: ");
			input = scan.nextLine();
			System.out.println("\n");
			
			if(input.equals("1")){
				//attemptMove();
			}
			else if(input.equals("2")){
				System.out.println(instructions);
			}
			else if(input.equals("3")){
				System.out.println(credits);
			}
			else if (input.equals("4")){
				System.out.println("Thank you for playing.")	;
			}
			else{
				System.out.println("Try a number between 1 and 4");	
			}
		} while (!( input.equals("4") ));
		
	}
}
