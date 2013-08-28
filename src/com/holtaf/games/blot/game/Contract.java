package com.holtaf.games.blot.game;

import java.util.LinkedList;
import java.util.List;

import android.util.Pair;

import com.holtaf.games.blot.game.Bid.Type;
import com.holtaf.games.blot.player.Player;
import com.holtaf.games.blot.util.ValueListener;

public final class Contract {
	private List<Pair<Player, Bid>> bidHistory = new LinkedList<Pair<Player,Bid>>();
	private GameController gameController;
	private ValueListener<Bid> lastBidListener;
	
	public Contract(GameController gameController, ValueListener<Bid> lastBidListener) {
		this.gameController = gameController;
		this.lastBidListener = lastBidListener;
	}
	
	public void startContract(int dealer) {
		Player bidder = gameController.getPlayerList().get((dealer + 1) % 4);
	}
	
	private boolean isContractEnded() {
		int passCount = 0;
		for (int size = bidHistory.size(), i = size - 1; i >= 0; i--) {
			Bid bid = bidHistory.get(i).second;
			if (bid.type == Type.PASS) {
				passCount++;
				
				if (passCount > 4) {
					return true;
				}
			} else {
				return false;
			}
		}
		
		return false;
	}
	
	private Bid getLastNonPassBid() {
		return null;
	}
}
