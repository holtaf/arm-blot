package com.holtaf.games.blot.game;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import android.util.Log;
import android.util.Pair;

import com.holtaf.games.blot.card.Card;
import com.holtaf.games.blot.player.Player;
import com.holtaf.games.blot.util.Utils;
import com.holtaf.games.blot.util.ValueListener;

public class GameController {
	private List<Player> playerList = new ArrayList<Player>();
	private int dealer;
	
	private Contract currentContract; 
	
	public GameController() {
		dealer = 0;
		
		playerList.add(new Player("A"));
		playerList.add(new Player("B"));
		playerList.add(new Player("C"));
		playerList.add(new Player("D"));
	}
	
	public void dealCards() {
		List<List<Card>> shuffledCards = Utils.getShuffledCards();

		int playerIndex = 0;
		for (Player player : playerList) {
			player.setCards(shuffledCards.get(playerIndex++));
            Utils.sortCardsBySuit(player.getCards());
		}
	}

    public List<Card> getCardList() {
        List<Card> result = new LinkedList<Card>();
        for (Player player : playerList) {
            result.addAll(player.getCards());
        }

        return result;
    }
	
	public void startContract() {
		currentContract = new Contract(this, new ValueListener<Bid>() {
			
			@Override
			public void onValueCahnged(Bid t) {
				
			}
		});
		currentContract.startContract(dealer);
	}
	
	public Player getPlayerByIndex(int playerIndex) {
		return playerList.get(playerIndex);
	}
	
	public List<Player> getPlayerList() {
		return playerList;
	}
	
	public void printPlayerCards() {
		for (Player player : playerList) {
			Log.d("card", player.getName() + " " + player.getCardsAsString());
		}
	}
	
	private Player getNextPlayer(Player player) {
		return playerList.get((playerList.indexOf(player) + 1) % 4);
	}
}
