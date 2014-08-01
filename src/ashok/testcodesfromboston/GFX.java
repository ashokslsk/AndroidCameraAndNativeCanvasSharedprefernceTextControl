package ashok.testcodesfromboston;

import android.app.Activity;
import android.os.Bundle;

public class GFX extends Activity{

	AshokGraphics ashView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ashView = new AshokGraphics(this);
		setContentView(ashView);
		
	}
}
