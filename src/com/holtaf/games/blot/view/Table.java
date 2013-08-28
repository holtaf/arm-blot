package com.holtaf.games.blot.view;

import java.util.HashMap;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.util.AttributeSet;
import android.view.View;

import com.holtaf.games.blot.R;
import com.holtaf.games.blot.card.Card;
import com.holtaf.games.blot.game.GameController;
import com.holtaf.games.blot.util.Utils;
import com.larvalabs.svgandroid.SVGParser;

public class Table extends View {
	private GameController gameController;
	
	private Picture backSide;
	private HashMap<Card, Picture> cardTextures = new HashMap<Card, Picture>(32);
	
	
	public Table(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		loadResources();
	}
	
	public void setGameController(GameController controller) {
		gameController = controller;
	}

	public void loadResources() {
		backSide = SVGParser.getSVGFromResource(getResources(), R.raw.card_backside).getPicture();
//		for (Card card : Card.getDeck()) {
//			cardTextures.put(card, SVGParser.getSVGFromResource(getResources(), Utils.getResourceForCard(card)).getPicture());
//		}
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		canvas.drawPicture(backSide);
	}
}
