package com.sero583.mousedetector;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView view;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		view = (TextView) findViewById(R.id.pos);
    }
	
	@Override
	public boolean onGenericMotionEvent(MotionEvent event) {
		if(event.getAction()==MotionEvent.ACTION_HOVER_MOVE) {
			float x = event.getX();
			float y = event.getY();
			
			this.view.setText("Mouse position:\nX: " + x + "\nY: " + y);
		}
		return true;
	}
}
