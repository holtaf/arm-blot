package com.holtaf.games.blot.util;

import com.holtaf.games.blot.R;
import com.holtaf.games.blot.card.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Utils {
    private static Random random = new Random(System.currentTimeMillis());

    private Utils() {
    }

    public static List<List<Card>> getShuffledCards() {
        List<Card> deck = Card.getDeck();
        Collections.shuffle(deck, new Random(System.currentTimeMillis()));

        ArrayList<List<Card>> result = new ArrayList<List<Card>>();

        for (int i = 0; i < 4; ++i) {
            result.add(deck.subList(i * 8, (i + 1) * 8));
        }

        return result;
    }

    public static List<Integer> getRandomSequence(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i <= n; ++i) {
            result.add(i);
        }

        Collections.shuffle(result, new Random(System.currentTimeMillis()));

        return result;
    }

    public static int getResourceForCard(Card card) {
        switch (card.suit) {
            case CLUB:
                switch (card.rank) {
                    case ACE:
                        return R.drawable.ace_of_clubs;
                    case KING:
                        return R.drawable.king_of_clubs;
                    case QUEEN:
                        return R.drawable.queen_of_clubs;
                    case JACK:
                        return R.drawable.jack_of_clubs;
                    case TEN:
                        return R.drawable.ten_of_clubs;
                    case NINE:
                        return R.drawable.nine_of_clubs;
                    case EIGHT:
                        return R.drawable.eight_of_clubs;
                    case SEVEN:
                        return R.drawable.seven_of_clubs;
                }

            case DIAMOND:
                switch (card.rank) {
                    case ACE:
                        return R.drawable.ace_of_diamonds;
                    case KING:
                        return R.drawable.king_of_diamonds;
                    case QUEEN:
                        return R.drawable.queen_of_diamonds;
                    case JACK:
                        return R.drawable.jack_of_diamonds;
                    case TEN:
                        return R.drawable.ten_of_diamonds;
                    case NINE:
                        return R.drawable.nine_of_diamonds;
                    case EIGHT:
                        return R.drawable.eight_of_diamonds;
                    case SEVEN:
                        return R.drawable.seven_of_diamonds;
                }

            case HEART:
                switch (card.rank) {
                    case ACE:
                        return R.drawable.ace_of_hearts;
                    case KING:
                        return R.drawable.king_of_hearts;
                    case QUEEN:
                        return R.drawable.queen_of_hearts;
                    case JACK:
                        return R.drawable.jack_of_hearts;
                    case TEN:
                        return R.drawable.ten_of_hearts;
                    case NINE:
                        return R.drawable.nine_of_hearts;
                    case EIGHT:
                        return R.drawable.eight_of_hearts;
                    case SEVEN:
                        return R.drawable.seven_of_hearts;
                }

            case SPADE:
                switch (card.rank) {
                    case ACE:
                        return R.drawable.ace_of_spades;
                    case KING:
                        return R.drawable.king_of_spades;
                    case QUEEN:
                        return R.drawable.queen_of_spades;
                    case JACK:
                        return R.drawable.jack_of_spades;
                    case TEN:
                        return R.drawable.ten_of_spades;
                    case NINE:
                        return R.drawable.nine_of_spades;
                    case EIGHT:
                        return R.drawable.eight_of_spades;
                    case SEVEN:
                        return R.drawable.seven_of_spades;
                }
        }

        return 0;
    }

    /**
     * Returns pseudo-random number in range [0, n)
     */
    public static int getRandomNumber(int n) {
        return random.nextInt(n);
    }
}
