package ashok.testcodesfromboston;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		
		Button checkCOmmand = (Button)findViewById(R.id.CmmandButton);
		final ToggleButton PasTag = (ToggleButton)findViewById(R.id.Tbpassword);
		final EditText input = (EditText)findViewById(R.id.etcommands);
		final TextView display = (TextView) findViewById(R.id.TextView_pass);
		
		
		PasTag.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(PasTag.isChecked()){
					input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
				}else
				{
					input.setInputType(InputType.TYPE_CLASS_TEXT);
				}
				
			}
		});
		
		checkCOmmand.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String check = input.getText().toString();
				display.setText(check);
				if(check.equalsIgnoreCase("Ashok")){
					display.setText("You are Developer of SumeruThanthra");
				}else if(check.equalsIgnoreCase("Pavan")){
					display.setText("You are Tester of SumeruThanthra");
				}else if(check.equalsIgnoreCase("Keerthi")){
					display.setText("You are Producer SumeruThanthra");
				}else if(check.equalsIgnoreCase("TPT")){
					display.setText("You are Product Manager and Executive Incharge officer SumeruThanthra");
				}else if(check.equalsIgnoreCase("blue")){
					display.setTextColor(Color.BLUE);
				}else if(check.equalsIgnoreCase("WTF")){
					Random crazy = new Random();
					display.setText("What The Frak");
					display.setTextSize(crazy.nextInt(265));
					display.setTextColor(Color.rgb(crazy.nextInt(265), crazy.nextInt(265), crazy.nextInt(265)));
				}else{
				
					display.setText("You are no one in SumeruThanthra");
				}
			}
		});
	}
	
	

}
