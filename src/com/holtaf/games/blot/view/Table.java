package com.holtaf.games.blot.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.holtaf.games.blot.GlobalConstants;
import com.holtaf.games.blot.player.Player;

public class Table extends View {

	private Player[] players = new Player[GlobalConstants.PLAYER_COUNT];
	
	public Table(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

}
