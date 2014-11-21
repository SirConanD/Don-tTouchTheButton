package ctec.donttouchthebutton.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class GameActivity extends Activity
{
	private Button noButton;
	private int numberClicks;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		
		noButton = (Button) findViewById(R.id.noButton);
		numberClicks = 0;
		
		setupListeners();
	}
	
	private void checkButtonPress()
	{
		numberClicks++;
		
		if (numberClicks < 5)
		{
			if (numberClicks == 0)
			{
				
			}
			else if (numberClicks == 1)
			{
				
			}
			
		}
	}
	
	private void setupListeners()
	{
		noButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				Intent elseScreenIntent = new Intent(currentView.getContext(), ElseActivity.class);
				startActivityForResult(elseScreenIntent, 0);
				
			}
		});
	}
}
