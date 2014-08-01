package ashok.testcodesfromboston;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.view.View;

public class AshokGraphics extends View	{
	
	Bitmap Aball;
	float changingY;
	float changingX = 0;

	public AshokGraphics(Context context) {
		super(context);
		Aball = BitmapFactory.decodeResource(getResources(), R.drawable.gball); 
		changingY=0;
	}

	@SuppressLint("DrawAllocation")
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		canvas.drawColor(Color.WHITE);
		
		Paint text_OnGraphics = new Paint();
		text_OnGraphics.setColor(Color.BLACK);
		text_OnGraphics.setTextAlign(Align.CENTER);
		text_OnGraphics.setTextSize(50);
		canvas.drawText("Ashok", canvas.getWidth()/2,  200, text_OnGraphics);
		
		
		canvas.drawBitmap(Aball, (canvas.getHeight()/4), changingY, null);
		if (changingY<canvas.getHeight()) {
			changingY += 10;
		}else{
			changingY=0;
		}
		
		Rect middleRect = new Rect();
		middleRect.set(0, 500, canvas.getWidth(), 400);
		
		
		Paint ourBlue = new Paint();
		ourBlue.setColor(Color.CYAN);
		
		canvas.drawRect(middleRect, ourBlue);
		invalidate();
	}
}
