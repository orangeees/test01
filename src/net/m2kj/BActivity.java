package net.m2kj;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BActivity extends Activity {

    private EditText name;


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b);
//        name = (EditText) findViewById(R.id.name);
//        name.setText("takatoshi");
//        
//        Button bt = (Button) findViewById(R.id.button1);  
//        
//        bt.setOnClickListener(new View.OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				Toast.makeText(BActivity.this, name.getText().toString(), 5000).show();
//				
//			}
//			
//			
//			
//			
//		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
