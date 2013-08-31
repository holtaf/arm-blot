package com.holtaf.games.blot.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import junit.framework.Assert;

/**
 * Created by holtaf on 8/31/13.
 */
public class CardDrawable {
    private Bitmap frontTexture;
    private Bitmap backTexture;

    private RectF bounds = new RectF();

    private final Paint bitmapPaint = new Paint();

    private boolean isTurned;

    public CardDrawable(Bitmap frontTexture, Bitmap backTexture) {
        Assert.assertNotNull(frontTexture);
        Assert.assertNotNull(backTexture);

        Assert.assertFalse(frontTexture.isRecycled());
        Assert.assertFalse(backTexture.isRecycled());

        this.backTexture = backTexture;
        this.frontTexture = frontTexture;

        bitmapPaint.setAntiAlias(true);
        bitmapPaint.setFilterBitmap(true);
    }

    public void setBounds(RectF bounds) {
        this.bounds.set(bounds);
    }

    public void setTurned(boolean isTurned) {
        this.isTurned = isTurned;
    }

    public void drawOnCanvas(Canvas canvas) {
        if (isTurned) {
            canvas.drawBitmap(backTexture, null, bounds, bitmapPaint);
        } else {
            canvas.drawBitmap(frontTexture, null, bounds, bitmapPaint);
        }
    }
}
