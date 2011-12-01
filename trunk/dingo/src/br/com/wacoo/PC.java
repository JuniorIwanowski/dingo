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

public class PC extends Activity {
	
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
	
	public static float quarto_tpc;
	public static float quarto_qpc;
	public static float quarto_ppc;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.pc);

		Button PCVoltar = (Button) findViewById(R.id.BTPCVoltar);
		PCVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText quarto_tempopc = (EditText) findViewById(R.id.EDITPCTempo);
				EditText quarto_quantpc = (EditText) findViewById(R.id.EDITPCQuant);
				EditText quarto_potpc = (EditText) findViewById(R.id.EDITPCPotencia);

				if (quarto_tempopc.getText() == null
						|| quarto_tempopc.getText().length() == 0
						|| quarto_tempopc.getText().equals("0")) {
					quarto_tempopc.setText("0");
				} else {
					//
				}

				if (quarto_quantpc.getText() == null
						|| quarto_quantpc.getText().length() == 0
						|| quarto_quantpc.getText().equals("0")) {
					quarto_quantpc.setText("0");
				} else {
					//
				}

				if (quarto_potpc.getText() == null
						|| quarto_potpc.getText().length() == 0
						|| quarto_potpc.getText().equals("0")) {
					quarto_potpc.setText("0");
				} else {
					//
				}

				quarto_tpc = Float.parseFloat(quarto_tempopc.getText()
						.toString());
				quarto_qpc = Float.parseFloat(quarto_quantpc.getText()
						.toString());
				quarto_ppc = Float
						.parseFloat(quarto_potpc.getText().toString());

				finish();
			}
		});
		
		Button PCLimpar = (Button) findViewById(R.id.BTPCLimpar);
		PCLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText quarto_tempopc = (EditText) findViewById(R.id.EDITPCTempo);
			EditText quarto_quantpc = (EditText) findViewById(R.id.EDITPCQuant);
			EditText quarto_potpc = (EditText) findViewById(R.id.EDITPCPotencia);

			quarto_tempopc.setText("");
			quarto_quantpc.setText("");
			quarto_potpc.setText("");
			}});
		
		Button PCSug = (Button) findViewById(R.id.BTSugestaoPC);
		PCSug.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				EditText quarto_tempopc = (EditText) findViewById(R.id.EDITPCTempo);
				EditText quarto_quantpc = (EditText) findViewById(R.id.EDITPCQuant);
				EditText quarto_potpc = (EditText) findViewById(R.id.EDITPCPotencia);

				quarto_tempopc.setText("5");
				quarto_quantpc.setText("1");
				quarto_potpc.setText("300");
			}});
	
	    // TODO Auto-generated method stub
	}

}
