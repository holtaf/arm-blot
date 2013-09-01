package com.holtaf.games.blot.util;

import android.util.Pair;

import com.holtaf.games.blot.card.Card;
import com.holtaf.games.blot.card.Rank;
import com.holtaf.games.blot.card.Suit;
import com.holtaf.games.blot.game.Bid;
import com.holtaf.games.blot.player.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by holtaf on 9/2/13.
 */
public class AIUtils {
    private AIUtils() {
    }

    public static Bid getBestBid(List<Card> playerCards, List<Pair<Player, Bid>> bidHistory) {
        // first get aces

        ArrayList<Card> aces = new ArrayList<Card>(4);
        for (Card card : playerCards)
            if (card.rank == Rank.ACE)
                aces.add(card);

        // calculating the number of hands that will be taken for suit

        List<Card> clubCards = Utils.getCardsForSuit(playerCards, Suit.CLUBS);

        return null;

    }

    public static int getApproximatePointsForSuit(Suit suit, List<Card> cards) {
        List<Card> suitCards = Utils.getCardsForSuit(cards, suit);

        final boolean haveJack = Utils.searchForCard(suitCards, suit, Rank.JACK);
        final boolean haveNine = Utils.searchForCard(suitCards, suit, Rank.NINE);
        final boolean haveBelote = Utils.searchForCard(suitCards, suit, Rank.KING) &&
                Utils.searchForCard(suitCards, suit, Rank.QUEEN);

        for (Card c : suitCards) {
            switch (c.rank) {
                case ACE:

            }
            if (c.rank == Rank.JACK || c.rank == Rank.NINE) {
            }
        }

        return 0;
    }

    /**
     * Returns the chance for card to win hand as integer from 0 to 100 (TODO or pass to friend)
     * */
    private static int getChanceForWinningHand(Card card, List<Card> playerCards, Suit trumpSuit) {
        if (card.suit == trumpSuit) { // trump
            final boolean haveJack = Utils.searchForCard(playerCards, trumpSuit, Rank.JACK);
            final boolean haveNine = Utils.searchForCard(playerCards, trumpSuit, Rank.NINE);

            switch (card.rank) {
                case ACE:
                    if (haveJack && haveNine)
                        return 100;
                    else if (haveJack || haveNine)
                        return 50;
                    else return 25;
            }
        }

        return 0;
    }
}
