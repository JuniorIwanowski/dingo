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

public class DVD extends Activity {
	
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
	
	public static float sala_tdvd;
	public static float sala_qdvd;
	public static float sala_pdvd;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.dvd);

		Button DVDVoltar = (Button) findViewById(R.id.BTDVDVoltar);
		DVDVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText sala_tempodvd = (EditText) findViewById(R.id.EDITDVDTempo);
				EditText sala_quantdvd = (EditText) findViewById(R.id.EDITDVDQuant);
				EditText sala_potdvd = (EditText) findViewById(R.id.EDITDVDPotencia);

				if (sala_tempodvd.getText() == null
						|| sala_tempodvd.getText().length() == 0
						|| sala_tempodvd.getText().equals("0")) {
					sala_tempodvd.setText("0");
				} else {
					//
				}

				if (sala_quantdvd.getText() == null
						|| sala_quantdvd.getText().length() == 0
						|| sala_quantdvd.getText().equals("0")) {
					sala_quantdvd.setText("0");
				} else {
					//
				}

				if (sala_potdvd.getText() == null
						|| sala_potdvd.getText().length() == 0
						|| sala_potdvd.getText().equals("0")) {
					sala_potdvd.setText("0");
				} else {
					//
				}

				sala_tdvd = Float.parseFloat(sala_tempodvd.getText()
						.toString());
				sala_qdvd = Float.parseFloat(sala_quantdvd.getText()
						.toString());
				sala_pdvd = Float
						.parseFloat(sala_potdvd.getText().toString());

				finish();
			}
		});
		
		Button DVDLimpar = (Button) findViewById(R.id.BTDVDLimpar);
		DVDLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText sala_tempodvd = (EditText) findViewById(R.id.EDITDVDTempo);
			EditText sala_quantdvd = (EditText) findViewById(R.id.EDITDVDQuant);
			EditText sala_potdvd = (EditText) findViewById(R.id.EDITDVDPotencia);

			sala_tempodvd.setText("");
			sala_quantdvd.setText("");
			sala_potdvd.setText("");
			}});
		
		Button DVDSug = (Button) findViewById(R.id.BTSugestaoDVD);
		DVDSug.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				EditText sala_tempodvd = (EditText) findViewById(R.id.EDITDVDTempo);
				EditText sala_quantdvd = (EditText) findViewById(R.id.EDITDVDQuant);
				EditText sala_potdvd = (EditText) findViewById(R.id.EDITDVDPotencia);

				sala_tempodvd.setText("2");
				sala_quantdvd.setText("1");
				sala_potdvd.setText("50");
			}});
	
	    // TODO Auto-generated method stub
	}

}
