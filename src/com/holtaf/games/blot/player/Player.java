package com.holtaf.games.blot.player;

import java.util.ArrayList;
import java.util.List;

import com.holtaf.games.blot.card.Card;

public class Player {
	private final List<Card> cardList = new ArrayList<Card>();
	private final String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void setCards(List<Card> cards) {
		cardList.clear();
		cardList.addAll(cards);
	}
	
	public Card playCard(int cardIndex) {
		if (cardIndex >= cardList.size()) {
			return null;
		} else {
			return cardList.get(cardIndex);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getCardsAsString() {
		StringBuilder builder = new StringBuilder();
		for (Card card : cardList) {
			builder.append(card.toString() + " ");
		}
		
		return builder.toString();
	}
}
