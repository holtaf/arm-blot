package com.holtaf.games.blot.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.holtaf.games.blot.R;
import com.holtaf.games.blot.card.Card;
import com.holtaf.games.blot.game.GameController;
import com.holtaf.games.blot.util.Utils;

import java.util.HashMap;

public class Table extends View {
    private GameController gameController;
    private HashMap<Card, CardDrawable> cardTextures = new HashMap<Card, CardDrawable>(32);


    public Table(Context context, AttributeSet attrs) {
        super(context, attrs);

        loadResources();
    }

    public void setGameController(GameController controller) {
        gameController = controller;
    }

    public void loadResources() {
        Bitmap backSide = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
        for (Card card : Card.getDeck()) {
            Bitmap cardTexture = BitmapFactory.decodeResource(getResources(), Utils.getResourceForCard(card));

            CardDrawable drawable = new CardDrawable(cardTexture, backSide);
            drawable.setBounds(new RectF());

            //cardTextures.put(card, );
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        for (Card card : gameController.getPlayerByIndex(0).getCards()) {

        }
    }
}
