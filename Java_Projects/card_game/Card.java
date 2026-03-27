package Java_Projects.card_game;

public class Card 
{
    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() { return value; }
    public String getSuit() { return suit; }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
