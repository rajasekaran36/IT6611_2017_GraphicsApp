package com.example.graphics;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ShapeView sv = new ShapeView(this);
        setContentView(sv);
    }
    
   
    
    
    private class ShapeView extends View {

		
    	public ShapeView(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}
		
		protected void onDraw(Canvas canvas) {
			
			Paint paint = new Paint();
			paint.setColor(Color.BLUE);
			canvas.drawPaint(paint);
			
			paint.setColor(Color.YELLOW);
			paint.setStyle(Paint.Style.STROKE);
			canvas.drawCircle(50, 50, 30, paint);
			//canvas.drawRect( 5, 5, 100, 100, paint);
			//canvas.drawText("Hello", 100, 100, paint);
			
			
		}
    	
    }
  
}
