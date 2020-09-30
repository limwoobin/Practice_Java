package BlackJackGame;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Player {
    private List<Card> cards;
    private boolean turn;

    private static final int CAN_RECEIVE_POINT = 16;
    private static final String NAME = "딜러";

    public Dealer() {
        this.cards = new ArrayList<>();
    }

    @Override
    public void receiveCard(Card card) {
        if (this.isReceiveCard()) {
            this.cards.add(card);
            this.showCards();
        }
    }

    private boolean isReceiveCard() {
        return getPointSum() <= CAN_RECEIVE_POINT;
    }

    private int getPointSum() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getDenomination().getPoint();
        }

        return sum;
    }

    @Override
    public void showCards(){
        StringBuilder sb = new StringBuilder();
        sb.append("현재 보유 카드 목록 \n");

        for(Card card : cards){
            sb.append(card.toString());
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    @Override
    public List<Card> openCards() {
        return this.cards;
    }

    @Override
    public void turnOff() {
        this.setTurn(false);
    }

    @Override
    public void turnOn() {
        this.setTurn(true);
    }

    @Override
    public boolean isTurn() {
        return this.turn;
    }

    @Override
    public String getName() {
        return NAME;
    }

    private void setTurn(boolean turn) {
        this.turn = turn;
    }
}
