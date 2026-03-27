package Java_Projects.card_game;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deck deck = new Deck();
        ArrayList<Player> players = new ArrayList<>();

        System.out.print("How many players? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter player name: ");
            players.add(new Player(sc.nextLine()));
        }

        Player winner = null;

        for (Player p : players) {
            p.drawCard(deck);
            System.out.println(p.getName() + " drew: " + p.getCard());
            if (winner == null || p.getCard().getValue() > winner.getCard().getValue()) {
                winner = p;
            }
        }

        System.out.println("\nWinner: " + winner.getName() +
                " with " + winner.getCard());
    }
}

