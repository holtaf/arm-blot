package com.holtaf.games.blot.player;

import java.util.ArrayList;
import java.util.List;

import com.holtaf.games.blot.card.Card;

public class Player {
	private final List<Card> cardList = new ArrayList<Card>();
	
	public Player() {
		
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
}
