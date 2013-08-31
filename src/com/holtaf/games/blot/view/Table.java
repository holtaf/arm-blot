package com.holtaf.games.blot.view;

import android.content.Context;
import android.content.res.Resources;
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
import java.util.List;

public class Table extends View {
    private final float tableMarginLeft;
    private final float tableMarginRight;
    private final float tableMarginTop;
    private final float tableMarginBottom;
    private final float maxCardWidth;
    private final float maxCardHeight;
    private final float cardMargin;
    private final float cardAspectRatio;
    private final float cardVisibleArea = 0.6f;
    private final RectF origCardRect = new RectF();
    private final RectF tmpCardRect = new RectF();
    private GameController gameController;
    private HashMap<Card, CardDrawable> cardTextures = new HashMap<Card, CardDrawable>(32);

    public Table(Context context, AttributeSet attrs) {
        super(context, attrs);

        Resources res = context.getResources();

        tableMarginLeft = res.getDimension(R.dimen.tableMarginLeft);
        tableMarginRight = res.getDimension(R.dimen.tableMarginRight);
        tableMarginTop = res.getDimension(R.dimen.tableMarginTop);
        tableMarginBottom = res.getDimension(R.dimen.tableMarginRight);

        maxCardWidth = res.getDimension(R.dimen.maxCardWidth);
        maxCardHeight = res.getDimension(R.dimen.maxCardHeight);

        cardMargin = res.getDimension(R.dimen.cardMargin);

        cardAspectRatio = 0.68f;//res.getDimension(R.dimen.cardAspectRatio);
    }

    public void setGameController(GameController controller) {
        gameController = controller;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        float cardWidth = (w - tableMarginLeft - tableMarginRight) / (7 * cardVisibleArea + 1);

        /**
         * x * 0.6 * 7 + x + margins = width
         * */

        float cardHeight;

        if (cardWidth > maxCardWidth) {
            cardWidth = maxCardWidth;
            cardHeight = maxCardHeight;
        } else {
            cardHeight = cardWidth / cardAspectRatio;
        }

        origCardRect.set(0, 0, cardWidth, cardHeight);
    }

    public void loadResources(List<Card> cardList) {
        Bitmap backSide = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
        for (Card card : cardList) {
            Bitmap cardTexture = BitmapFactory.decodeResource(getResources(), Utils.getResourceForCard(card));
            CardDrawable drawable = new CardDrawable(cardTexture, backSide);
            cardTextures.put(card, drawable);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        // player 0 (south)
        int index = 0;
        tmpCardRect.set(origCardRect);
        tmpCardRect.offsetTo(tableMarginLeft, getHeight() - origCardRect.height() - tableMarginBottom);

        for (Card card : gameController.getPlayerByIndex(0).getCards()) {
            CardDrawable drawable = cardTextures.get(card);
            drawable.setBounds(tmpCardRect);
//            canvas.save();
//            canvas.rotate((index - 4) * 5f, getWidth() / 2, getHeight() + origCardRect.height());
            drawable.drawOnCanvas(canvas);
            canvas.restore();

            tmpCardRect.offset(origCardRect.width() * cardVisibleArea, 0);
            index++;
        }
    }
}
