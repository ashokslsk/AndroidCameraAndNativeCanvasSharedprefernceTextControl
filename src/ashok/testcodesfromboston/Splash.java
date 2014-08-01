package ashok.testcodesfromboston;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class Splash extends Activity {
	MediaPlayer ourSong ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ourSong = MediaPlayer.create(Splash.this, R.raw.splash_ashiki);
		
		SharedPreferences getPrefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		boolean music = getPrefs.getBoolean("checkbox", true);
		if(music==true)
		ourSong.start();
		
		Thread splash_timer = new Thread(){
			public void run(){
				try{
					sleep(4000);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}finally{
					Intent intent = new Intent(getApplicationContext(),Menu.class);
					startActivity(intent);
				}
			}
		};splash_timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
		
	}
	

}
