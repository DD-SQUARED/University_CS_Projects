package Java_Projects.card_game;

import java.util.*;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (String s : suits) {
            for (int v = 1; v <= 13; v++) {
                cards.add(new Card(s, v));
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }
}
