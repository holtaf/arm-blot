package com.holtaf.games.blot;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.holtaf.games.blot.game.GameController;
import com.holtaf.games.blot.player.Player;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		GameController controller = new GameController();
		controller.dealCards();
		
//		StringBuilder builder = new StringBuilder();
//		
//		for (Player player : controller.getPlayerList()) {
//			builder.append(player.getName() + " " + player.getCardsAsString() + "\n");
//		}
		
//		((TextView) findViewById(R.id.text)).setText(builder);
	}
}
