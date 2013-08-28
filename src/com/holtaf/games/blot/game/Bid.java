package com.holtaf.games.blot.game;

import com.holtaf.games.blot.card.Suit;

public final class Bid {
	public enum Type {
		PASS, NORMAL, ALL_TRUMPS, NO_TRUMPS
	}
	
	public final Type type;
	public final int value;
	public final Suit suit;
	
	private Bid(Type type, int value, Suit suit) {
		this.type = type;
		this.value = value;
		this.suit = suit;
	}
	
	public static Bid newBid(Suit suit, int value) {
		return new Bid(Type.NORMAL, value, suit);
	}
	
	public static Bid newAllTrumpsBid(int value) {
		return new Bid(Type.ALL_TRUMPS, value, null);
	}
	
	public static Bid newNoTrumpsBid(int value) {
		return new Bid(Type.NO_TRUMPS, value, null);
	}
	
	public static Bid newPassBid() {
		return new Bid(Type.PASS, 0, null);
	}
}
