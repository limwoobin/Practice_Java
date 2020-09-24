package BlackJackGame;

import java.util.LinkedList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;

    public Card getCard() {
        return null;
    }

    private static final String[] PATTERNS = {"spade" , "heart" , "diamond" , "club"};
    private static final int CARD_COUNT = 13;

    public CardDeck() {
        cards = this.generateCards();
    }

    private List<Card> generateCards() {
        List<Card> cards = new LinkedList<>();

        for (String pattern : PATTERNS) {
            for (int i=1; i<CARD_COUNT; i++) {
                Card card = new Card(pattern , i);
                cards.add(card);
            }
        }

        return cards;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    public Card draw() {
        Card selectCard = this.getRandomCard();
        cards.remove(selectCard);
        return selectCard;
    }

    private Card getRandomCard() {
        int size = cards.size();
        int select = (int) (Math.random() * size);
        return cards.get(select);
    }
}
