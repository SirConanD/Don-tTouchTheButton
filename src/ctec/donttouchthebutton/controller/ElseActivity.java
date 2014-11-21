package ctec.donttouchthebutton.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ElseActivity extends Activity
{
	private Button quitButton;
	private Button returnButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_else);
		
		returnButton = (Button) findViewById(R.id.returnButton);

		
		setupListeners();
	}

	private void setupListeners()
	{
		returnButton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
			    Intent elseScreenIntent = new Intent();
			    setResult(RESULT_OK,elseScreenIntent);
			    finish();
				
			}
		});
	}
}
