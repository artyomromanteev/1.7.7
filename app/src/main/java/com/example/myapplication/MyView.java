package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        for(int y = 0; y < canvas.getHeight(); y += 40){
            canvas.drawLine(0, y, this.getWidth(), y, paint);
        }
        for(int x = 0; x < canvas.getWidth(); x += 40){
            canvas.drawLine(x, 0, x, this.getHeight(), paint);
        }
    }
}
