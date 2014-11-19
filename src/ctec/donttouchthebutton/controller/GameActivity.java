package ctec.donttouchthebutton.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class GameActivity extends Activity
{
	private Button noButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		
		noButton = (Button) findViewById(R.id.noButton);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		
	}
}
