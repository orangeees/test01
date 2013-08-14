package net.m2kj;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText name;


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        name.setText("takatoshi");
        
        Button bt = (Button) findViewById(R.id.button1);  
        Button bt2 = (Button) findViewById(R.id.button2); 
        Button bt3 = (Button) findViewById(R.id.button3);
        bt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, name.getText().toString(), 5000).show();
				
			}
			
			
			
			
		});
        
        bt3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent  intent = new Intent();
				intent.putExtra(Intent.EXTRA_TEXT, name.getText().toString());
				intent.setType("text/plain");
				intent.setAction(Intent.ACTION_SEND);
				startActivity(intent);
				
			}
			
			
			
			
		});   
        
        
        bt2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent  intent = new Intent(MainActivity.this,BActivity.class);
				startActivity(intent);
				
			}
			
			
			
			
		}); 
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
