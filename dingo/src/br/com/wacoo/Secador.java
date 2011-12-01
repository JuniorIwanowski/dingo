package br.com.wacoo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Secador extends Activity {
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    case R.id.inicio:
	    	Intent i = new Intent(this, Inicio.class);
	         startActivity(i);
	        return true;
	    case R.id.comodos:
	    	Intent i2 = new Intent(this, Inicio.class);
	         startActivity(i2);
	        return true;
	    case R.id.configs:
	    	Intent i3 = new Intent(this, Config.class);
	         startActivity(i3);
	        return true;
	    case R.id.ajuda:
	    	Intent i4 = new Intent(this, Ajuda.class);
	         startActivity(i4);
	        return true;
	    case R.id.calculos:
	    	Intent i5 = new Intent(this, Calculos.class);
	         startActivity(i5);
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
	
	public static float banheiro_tsec;
	public static float banheiro_qsec;
	public static float banheiro_psec;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.secador);

		Button SECVoltar = (Button) findViewById(R.id.BTSecadorVoltar);
		SECVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText banheiro_temposec = (EditText) findViewById(R.id.EDITSecadorTempo);
				EditText banheiro_quantsec = (EditText) findViewById(R.id.EDITSecadorQuant);
				EditText banheiro_potsec = (EditText) findViewById(R.id.EDITSecadorPotencia);

				if (banheiro_temposec.getText() == null
						|| banheiro_temposec.getText().length() == 0
						|| banheiro_temposec.getText().equals("0")) {
					banheiro_temposec.setText("0");
				} else {
					//
				}

				if (banheiro_quantsec.getText() == null
						|| banheiro_quantsec.getText().length() == 0
						|| banheiro_quantsec.getText().equals("0")) {
					banheiro_quantsec.setText("0");
				} else {
					//
				}

				if (banheiro_potsec.getText() == null
						|| banheiro_potsec.getText().length() == 0
						|| banheiro_potsec.getText().equals("0")) {
					banheiro_potsec.setText("0");
				} else {
					//
				}

				banheiro_tsec = Float.parseFloat(banheiro_temposec.getText()
						.toString());
				banheiro_qsec = Float.parseFloat(banheiro_quantsec.getText()
						.toString());
				banheiro_psec = Float
						.parseFloat(banheiro_potsec.getText().toString());

				finish();
			}
		});
		
		Button SecLimpar = (Button) findViewById(R.id.BTSecadorLimpar);
		SecLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText banheiro_temposec = (EditText) findViewById(R.id.EDITSecadorTempo);
			EditText banheiro_quantsec = (EditText) findViewById(R.id.EDITSecadorQuant);
			EditText banheiro_potsec = (EditText) findViewById(R.id.EDITSecadorPotencia);

			banheiro_temposec.setText("");
			banheiro_quantsec.setText("");
			banheiro_potsec.setText("");
			}});
		
		Button SecSug = (Button) findViewById(R.id.BTSugestaoSecador);
		SecSug.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				EditText banheiro_temposec = (EditText) findViewById(R.id.EDITSecadorTempo);
				EditText banheiro_quantsec = (EditText) findViewById(R.id.EDITSecadorQuant);
				EditText banheiro_potsec = (EditText) findViewById(R.id.EDITSecadorPotencia);

				banheiro_temposec.setText("0.1");
				banheiro_quantsec.setText("1");
				banheiro_potsec.setText("1400");
			}});
	
	    // TODO Auto-generated method stub
	}

}
