package Java_Projects.card_game;

public class Player {
    private String name;
    private Card card;

    public Player(String name) {
        this.name = name;
    }

    public void drawCard(Deck d) {
        card = d.draw();
    }

    public Card getCard() {
        return card;
    }

    public String getName() {
        return name;
    }
}
