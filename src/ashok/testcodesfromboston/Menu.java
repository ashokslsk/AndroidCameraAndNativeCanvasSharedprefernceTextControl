package ashok.testcodesfromboston;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Menu extends ListActivity {

	String classes[]={"MainActivity","TextPlay","Email","Camera","dynamicButtonToExit",
			"GFX","Example6","Example7","Example8","Example9","Example10","Example11"};
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		// Ever Cool feature for me FULL SCREEN
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);		
		String burger = classes[position];
		try {
			Class ourClass;
			ourClass = Class.forName("ashok.testcodesfromboston."+ burger);
			Intent ourintent = new Intent(Menu.this, ourClass);
			startActivity(ourintent);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Toast.makeText(this, "This Classes and programming need to be programmed", Toast.LENGTH_LONG).show();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
	 
	  super.onCreateOptionsMenu(menu);
	  MenuInflater blowup = getMenuInflater();
	  blowup.inflate(R.menu.cool_menu, menu);
	  return true;
	
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case R.id.aboutme:			
			startActivity(new Intent(getApplicationContext(),AboutMe.class));
			
			break;
			
		case R.id.preferences:
			startActivity(new Intent(getApplicationContext(),Prefs.class));
			break;
		case R.id.exit:
			finish();
			break;
		}
		return false;
	}
}
