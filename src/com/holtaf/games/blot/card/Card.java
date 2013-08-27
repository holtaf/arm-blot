package com.holtaf.games.blot.card;

public class Card {
	public final Rank rank;
	public final Suit suit;
	
	private Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
}
