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

public class Ventilador extends Activity {
	
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
	
	public static float quarto_tvent;
	public static float quarto_qvent;
	public static float quarto_pvent;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.ventilador);

		Button VENTVoltar = (Button) findViewById(R.id.BTVentiladorVoltar);
		VENTVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText quarto_tempovent = (EditText) findViewById(R.id.EDITVentiladorTempo);
				EditText quarto_quantvent = (EditText) findViewById(R.id.EDITVentiladorQuant);
				EditText quarto_potvent = (EditText) findViewById(R.id.EDITVentiladorPotencia);

				if (quarto_tempovent.getText() == null
						|| quarto_tempovent.getText().length() == 0
						|| quarto_tempovent.getText().equals("0")) {
					quarto_tempovent.setText("0");
				} else {
					//
				}

				if (quarto_quantvent.getText() == null
						|| quarto_quantvent.getText().length() == 0
						|| quarto_quantvent.getText().equals("0")) {
					quarto_quantvent.setText("0");
				} else {
					//
				}

				if (quarto_potvent.getText() == null
						|| quarto_potvent.getText().length() == 0
						|| quarto_potvent.getText().equals("0")) {
					quarto_potvent.setText("0");
				} else {
					//
				}

				quarto_tvent = Float.parseFloat(quarto_tempovent.getText()
						.toString());
				quarto_qvent = Float.parseFloat(quarto_quantvent.getText()
						.toString());
				quarto_pvent = Float
						.parseFloat(quarto_potvent.getText().toString());

				finish();
			}
		});
		
		Button VentLimpar = (Button) findViewById(R.id.BTVentiladorLimpar);
		VentLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText quarto_tempovent = (EditText) findViewById(R.id.EDITVentiladorTempo);
			EditText quarto_quantvent = (EditText) findViewById(R.id.EDITVentiladorQuant);
			EditText quarto_potvent = (EditText) findViewById(R.id.EDITVentiladorPotencia);

			quarto_tempovent.setText("");
			quarto_quantvent.setText("");
			quarto_potvent.setText("");
			}});
		
		Button VentSug = (Button) findViewById(R.id.BTSugestaoVentilador);
		VentSug.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				EditText quarto_tempopc = (EditText) findViewById(R.id.EDITPCTempo);
				EditText quarto_quantpc = (EditText) findViewById(R.id.EDITPCQuant);
				EditText quarto_potpc = (EditText) findViewById(R.id.EDITPCPotencia);

				quarto_tempopc.setText("8");
				quarto_quantpc.setText("1");
				quarto_potpc.setText("120");
			}});
	
	    // TODO Auto-generated method stub
	}

}
