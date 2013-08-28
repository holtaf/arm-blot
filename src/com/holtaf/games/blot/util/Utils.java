package com.holtaf.games.blot.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.holtaf.games.blot.R;
import com.holtaf.games.blot.card.Card;

public class Utils {
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
				return R.raw.clubs_ace;
			case KING:
				return R.raw.clubs_king;
			case QUEEN:
				return R.raw.clubs_queen;
			case JACK:
				return R.raw.clubs_jack;
			case TEN:
				return R.raw.clubs_10;
			case NINE:
				return R.raw.clubs_9;
			case EIGHT:
				return R.raw.clubs_8;
			case SEVEN:
				return R.raw.clubs_7;
			}
			
		case DIAMOND:
			switch (card.rank) {
			case ACE:
				return R.raw.diamonds_ace;
			case KING:
				return R.raw.diamonds_king;
			case QUEEN:
				return R.raw.diamonds_queen;
			case JACK:
				return R.raw.diamonds_jack;
			case TEN:
				return R.raw.diamonds_10;
			case NINE:
				return R.raw.diamonds_9;
			case EIGHT:
				return R.raw.diamonds_8;
			case SEVEN:
				return R.raw.diamonds_7;
			}
			
		case HEART:
			switch (card.rank) {
			case ACE:
				return R.raw.hearts_ace;
			case KING:
				return R.raw.hearts_king;
			case QUEEN:
				return R.raw.hearts_queen;
			case JACK:
				return R.raw.hearts_jack;
			case TEN:
				return R.raw.hearts_10;
			case NINE:
				return R.raw.hearts_9;
			case EIGHT:
				return R.raw.hearts_8;
			case SEVEN:
				return R.raw.hearts_7;
			}
			
		case SPADE:
			switch (card.rank) {
			case ACE:
				return R.raw.spades_ace;
			case KING:
				return R.raw.spades_king;
			case QUEEN:
				return R.raw.spades_queen;
			case JACK:
				return R.raw.spades_jack;
			case TEN:
				return R.raw.spades_10;
			case NINE:
				return R.raw.spades_9;
			case EIGHT:
				return R.raw.spades_8;
			case SEVEN:
				return R.raw.spades_7;
			}
		}
		
		return 0;
	}

	private static Random random = new Random(System.currentTimeMillis());
	
	/**
	 * Returns pseudo-random number in range [0, n)
	 * */
	public static int getRandomNumber(int n) {
		return random.nextInt(n);
	}
}
