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

public class Som extends Activity {
	
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
	
	public static float sala_tsom;
	public static float sala_qsom;
	public static float sala_psom;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.som);

		Button SOMVoltar = (Button) findViewById(R.id.BTSomVoltar);
		SOMVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText sala_temposom = (EditText) findViewById(R.id.EDITSomTempo);
				EditText sala_quantsom = (EditText) findViewById(R.id.EDITSomQuant);
				EditText sala_potsom = (EditText) findViewById(R.id.EDITSomPotencia);

				if (sala_temposom.getText() == null
						|| sala_temposom.getText().length() == 0
						|| sala_temposom.getText().equals("0")) {
					sala_temposom.setText("0");
				} else {
					//
				}

				if (sala_quantsom.getText() == null
						|| sala_quantsom.getText().length() == 0
						|| sala_quantsom.getText().equals("0")) {
					sala_quantsom.setText("0");
				} else {
					//
				}

				if (sala_potsom.getText() == null
						|| sala_potsom.getText().length() == 0
						|| sala_potsom.getText().equals("0")) {
					sala_potsom.setText("0");
				} else {
					//
				}

				sala_tsom = Float.parseFloat(sala_temposom.getText()
						.toString());
				sala_qsom = Float.parseFloat(sala_quantsom.getText()
						.toString());
				sala_psom = Float
						.parseFloat(sala_potsom.getText().toString());

				finish();
			}
		});
		
		Button SomLimpar = (Button) findViewById(R.id.BTSomLimpar);
		SomLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText sala_temposom = (EditText) findViewById(R.id.EDITSomTempo);
			EditText sala_quantsom = (EditText) findViewById(R.id.EDITSomQuant);
			EditText sala_potsom = (EditText) findViewById(R.id.EDITSomPotencia);

			sala_temposom.setText("");
			sala_quantsom.setText("");
			sala_potsom.setText("");
			}});
		
		Button SomSug = (Button) findViewById(R.id.BTSugestaoSom);
		SomSug.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				EditText sala_temposom = (EditText) findViewById(R.id.EDITSomTempo);
				EditText sala_quantsom = (EditText) findViewById(R.id.EDITSomQuant);
				EditText sala_potsom = (EditText) findViewById(R.id.EDITSomPotencia);

				sala_temposom.setText("3");
				sala_quantsom.setText("1");
				sala_potsom.setText("80");
			}});
	
	    // TODO Auto-generated method stub
	}

}
