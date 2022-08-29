import java.util.Scanner;

public class DeckCard {

	public static void main(String[] args) {
		String[] Suits= {"diamonds", "clubs", "hearts"};
		String[] Ranks= {"Ace","2","3","4","5","7","9","10","Queen","King"};
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of players : ");
		int nPlayers = sc.nextInt();
		
		System.out.println("Enter number of cards to be drawn for each player : ");
		int nCards = sc.nextInt();
		
		//initialize deck
		int totalCards = Suits.length*Ranks.length;
		String[] deck = new String[totalCards];
		for(int i=0;i<Ranks.length;i++)
			for(int j=0;j<Suits.length;j++) {
				deck[Suits.length*i+j]=Ranks[i] + " of " + Suits[j];
		}
		
		//shuffle
		for(int i=0;i<totalCards;i++) {
			int randomCard = i + (int)(Math.random()*(totalCards-i));
			String temp = deck[randomCard];
			deck[randomCard] = deck[i];
			deck[i] = temp;
		}
		
		
		//print the shuffled deck
		for(int i=0;i<nPlayers;i++) {
			System.out.println("** Person " + (i + 1) + " **");
			for(int j=0;j<nCards;j++) {
				System.out.println(deck[i + j * nCards] + " (Card " + (i + j * nCards) + ")");
			}
			System.out.println("\n");
		} 
		
		
		
	}

}
