package com.example.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;

public class NextActivity extends MainActivity{
	 private Preview mPreview;
	    private DrawOnTop mDrawOnTop;
	    private Button b1;
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	        // Hide the window title and set full screen
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);

	        // Create our Preview view and set it as the content of our activity.
	        // Create our DrawOnTop view.
	        mDrawOnTop = new DrawOnTop(this);
	  //      mDrawOnTop.training = true;
	        mPreview = new Preview(this, mDrawOnTop);
	        setContentView(mPreview);
	        addContentView(mDrawOnTop, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	        //addContentView(b1, null);
	}
}
