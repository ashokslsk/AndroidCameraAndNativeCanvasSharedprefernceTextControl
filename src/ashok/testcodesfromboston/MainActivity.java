package ashok.testcodesfromboston;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	Button JapCount;
	TextView JapCounter,JapTotCount;
	int counter=0;
	int totcounter=108;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		JapCounter= (TextView) findViewById(R.id.textView2);
		JapTotCount= (TextView) findViewById(R.id.textView1);
		JapCount = (Button) findViewById(R.id.button1);
		JapCount.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				JapCounter.setText("The japa counts are "+counter);
				for(int i=0;i<1000;i++)
				{
					int cnt;
					cnt=i*totcounter;
					if(cnt==counter)
					{   
						counter=0;
						int totalcounter=0;
						totalcounter++;
						JapTotCount.setText("The Total rounds : "+ totalcounter);
					}
				}
			}
		});		

	}
}