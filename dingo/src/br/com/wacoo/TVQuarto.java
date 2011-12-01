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

public class TVQuarto extends Activity {
	
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
	
	public static float quarto_ttv;
	public static float quarto_qtv;
	public static float quarto_ptv;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.tv);

		Button TVQVoltar = (Button) findViewById(R.id.BTTVQuartoVoltar);
		TVQVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText quarto_tempotv = (EditText) findViewById(R.id.EDITTVQuartoTempo);
				EditText quarto_quanttv = (EditText) findViewById(R.id.EDITTVQuartoQuant);
				EditText quarto_pottv = (EditText) findViewById(R.id.EDITTVQuartoPotencia);

				if (quarto_tempotv.getText() == null
						|| quarto_tempotv.getText().length() == 0
						|| quarto_tempotv.getText().equals("0")) {
					quarto_tempotv.setText("0");
				} else {
					//
				}

				if (quarto_quanttv.getText() == null
						|| quarto_quanttv.getText().length() == 0
						|| quarto_quanttv.getText().equals("0")) {
					quarto_quanttv.setText("0");
				} else {
					//
				}

				if (quarto_pottv.getText() == null
						|| quarto_pottv.getText().length() == 0
						|| quarto_pottv.getText().equals("0")) {
					quarto_pottv.setText("0");
				} else {
					//
				}

				quarto_ttv = Float.parseFloat(quarto_tempotv.getText()
						.toString());
				quarto_qtv = Float.parseFloat(quarto_quanttv.getText()
						.toString());
				quarto_ptv = Float
						.parseFloat(quarto_pottv.getText().toString());

				finish();
			}
		});
		
		Button TVQLimpar = (Button) findViewById(R.id.BTTVQuartoLimpar);
		TVQLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		EditText quarto_tempotv = (EditText) findViewById(R.id.EDITTVQuartoTempo);
		EditText quarto_quanttv = (EditText) findViewById(R.id.EDITTVQuartoQuant);
		EditText quarto_pottv = (EditText) findViewById(R.id.EDITTVQuartoPotencia);
		
		quarto_tempotv.setText("");
		quarto_quanttv.setText("");
		quarto_pottv.setText("");
			}});
		
		Button TVQSug = (Button) findViewById(R.id.BTSugestaoTVQuarto);
		TVQSug.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				EditText quarto_tempotv = (EditText) findViewById(R.id.EDITTVQuartoTempo);
				EditText quarto_quanttv = (EditText) findViewById(R.id.EDITTVQuartoQuant);
				EditText quarto_pottv = (EditText) findViewById(R.id.EDITTVQuartoPotencia);
				
				quarto_tempotv.setText("100");
				quarto_quanttv.setText("1");
				quarto_pottv.setText("1.5");	
			}});
	
	    // TODO Auto-generated method stub
	}

}
