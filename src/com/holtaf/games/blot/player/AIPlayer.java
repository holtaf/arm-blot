package com.holtaf.games.blot.player;

import com.holtaf.games.blot.util.Utils;

public class AIPlayer extends Player {
	private static final String[] BOT_NAMES = {"Jacob", "Sophia", "Mason", "William", "Michael", "Anthony", "Andrew"};
	
	public AIPlayer() {
		super(BOT_NAMES[Utils.getRandomNumber(BOT_NAMES.length)]);
	}

	
}
