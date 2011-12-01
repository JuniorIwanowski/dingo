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

public class LampadaQuarto extends Activity {
	
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
	
	public static float quarto_tlamp;
	public static float quarto_qlamp;
	public static float quarto_plamp;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.lampada);

		Button LAMPQVoltar = (Button) findViewById(R.id.BTLampadaQuartoVoltar);
		LAMPQVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText quarto_tempolamp = (EditText) findViewById(R.id.EDITLampadaQuartoTempo);
				EditText quarto_quantlamp = (EditText) findViewById(R.id.EDITLampadaQuartoQuant);
				EditText quarto_potlamp = (EditText) findViewById(R.id.EDITLampadaQuartoPotencia);

				if (quarto_tempolamp.getText() == null
						|| quarto_tempolamp.getText().length() == 0
						|| quarto_tempolamp.getText().equals("0")) {
					quarto_tempolamp.setText("0");
				} else {
					//
				}

				if (quarto_quantlamp.getText() == null
						|| quarto_quantlamp.getText().length() == 0
						|| quarto_quantlamp.getText().equals("0")) {
					quarto_quantlamp.setText("0");
				} else {
					//
				}

				if (quarto_potlamp.getText() == null
						|| quarto_potlamp.getText().length() == 0
						|| quarto_potlamp.getText().equals("0")) {
					quarto_potlamp.setText("0");
				} else {
					//
				}

				quarto_tlamp = Float.parseFloat(quarto_tempolamp.getText()
						.toString());
				quarto_qlamp = Float.parseFloat(quarto_quantlamp.getText()
						.toString());
				quarto_plamp = Float
						.parseFloat(quarto_potlamp.getText().toString());

				finish();
			}
		});
		
		Button LAMPQLimpar = (Button) findViewById(R.id.BTLampadaQuartoLimpar);
		LAMPQLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText quarto_tempolamp = (EditText) findViewById(R.id.EDITLampadaQuartoTempo);
			EditText quarto_quantlamp = (EditText) findViewById(R.id.EDITLampadaQuartoQuant);
			EditText quarto_potlamp = (EditText) findViewById(R.id.EDITLampadaQuartoPotencia);

			quarto_tempolamp.setText("");
			quarto_quantlamp.setText("");
			quarto_potlamp.setText("");
			}});
		
		Button LAMPQSug = (Button) findViewById(R.id.BTSugestaoLampadaQuarto);
		LAMPQSug.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				EditText quarto_tempolamp = (EditText) findViewById(R.id.EDITLampadaQuartoTempo);
				EditText quarto_quantlamp = (EditText) findViewById(R.id.EDITLampadaQuartoQuant);
				EditText quarto_potlamp = (EditText) findViewById(R.id.EDITLampadaQuartoPotencia);

				quarto_tempolamp.setText("5");
				quarto_quantlamp.setText("1");
				quarto_potlamp.setText("9");	
			}});
	
	    // TODO Auto-generated method stub
	}

}
