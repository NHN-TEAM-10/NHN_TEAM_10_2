package seong.course2.chapter5;


import java.util.Scanner;

public class BlackjackGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        BlackjackHand bjh = new BlackjackHand();
        boolean again = false;
        Scanner sc = new Scanner(System.in);
        do {
            deck.shuffle();
            int n = (int) (Math.random() * 4) + 2;
            for (int i = 0; i < n; i++) {
                Card card = deck.dealCard();
                bjh.addCard(card);
                System.out.println(card);
            }
            System.out.println(bjh.getBlackjackValue());
            again = sc.nextBoolean();
        } while (again);
    }
}
