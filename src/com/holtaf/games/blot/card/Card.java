package com.holtaf.games.blot.card;

import java.util.ArrayList;
import java.util.List;

public class Card {
	public final Rank rank;
	public final Suit suit;
	
	private Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	@Override
	public String toString() {
		return suit.toString() + rank.toString();
	}
	
	public static List<Card> getDeck() {
		ArrayList<Card> result = new ArrayList<Card>();
		
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				result.add(new Card(rank, suit));
			}
		}
		
		return result;
	}
}
