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

public class TVSala extends Activity {
	
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
	
	public static float sala_ttv;
	public static float sala_qtv;
	public static float sala_ptv;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.tvsala);

		Button TVSVoltar = (Button) findViewById(R.id.BTTVSalaVoltar);
		TVSVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText sala_tempotv = (EditText) findViewById(R.id.EDITTVSalaTempo);
				EditText sala_quanttv = (EditText) findViewById(R.id.EDITTVSalaQuant);
				EditText sala_pottv = (EditText) findViewById(R.id.EDITTVSalaPotencia);

				if (sala_tempotv.getText() == null
						|| sala_tempotv.getText().length() == 0
						|| sala_tempotv.getText().equals("0")) {
					sala_tempotv.setText("0");
				} else {
					//
				}

				if (sala_quanttv.getText() == null
						|| sala_quanttv.getText().length() == 0
						|| sala_quanttv.getText().equals("0")) {
					sala_quanttv.setText("0");
				} else {
					//
				}

				if (sala_pottv.getText() == null
						|| sala_pottv.getText().length() == 0
						|| sala_pottv.getText().equals("0")) {
					sala_pottv.setText("0");
				} else {
					//
				}

				sala_ttv = Float.parseFloat(sala_tempotv.getText()
						.toString());
				sala_qtv = Float.parseFloat(sala_quanttv.getText()
						.toString());
				sala_ptv = Float
						.parseFloat(sala_pottv.getText().toString());

				finish();
			}
		});
		
		Button TVSLimpar = (Button) findViewById(R.id.BTTVSalaLimpar);
		TVSLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText sala_tempotv = (EditText) findViewById(R.id.EDITTVSalaTempo);
			EditText sala_quanttv = (EditText) findViewById(R.id.EDITTVSalaQuant);
			EditText sala_pottv = (EditText) findViewById(R.id.EDITTVSalaPotencia);

			sala_tempotv.setText("");
			sala_quanttv.setText("");
			sala_pottv.setText("");
			}});
		
		Button TVSSug = (Button) findViewById(R.id.BTSugestaoTVSala);
		TVSSug.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				EditText sala_tempotv = (EditText) findViewById(R.id.EDITTVSalaTempo);
				EditText sala_quanttv = (EditText) findViewById(R.id.EDITTVSalaQuant);
				EditText sala_pottv = (EditText) findViewById(R.id.EDITTVSalaPotencia);

				sala_tempotv.setText("1.5");
				sala_quanttv.setText("1");
				sala_pottv.setText("100");
			}});
	
	    // TODO Auto-generated method stub
	}

}
