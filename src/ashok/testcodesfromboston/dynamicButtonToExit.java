package ashok.testcodesfromboston;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dynamicButtonToExit extends Activity{
	
	Button exit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.buttons);
	exit= (Button) findViewById(R.id.customButton);
	exit.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			finish();
			
		}
	});
}

}
