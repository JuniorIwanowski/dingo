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

public class LampadaSala extends Activity {
	
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

	public static float sala_tlamp;
	public static float sala_qlamp;
	public static float sala_plamp;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.lampadasala);

		Button LAMPSVoltar = (Button) findViewById(R.id.bt_lampada_sala_voltar);
		LAMPSVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText sala_tempolamp = (EditText) findViewById(R.id.EDITLampadaSalaTempo);
				EditText sala_quantlamp = (EditText) findViewById(R.id.EDITLampadaSalaQuant);
				EditText sala_potlamp = (EditText) findViewById(R.id.EDITLampadaSalaPotencia);

				if (sala_tempolamp.getText() == null
						|| sala_tempolamp.getText().length() == 0
						|| sala_tempolamp.getText().equals("0")) {
					sala_tempolamp.setText("0");
				} else {
					//
				}

				if (sala_quantlamp.getText() == null
						|| sala_quantlamp.getText().length() == 0
						|| sala_quantlamp.getText().equals("0")) {
					sala_quantlamp.setText("0");
				} else {
					//
				}

				if (sala_potlamp.getText() == null
						|| sala_potlamp.getText().length() == 0
						|| sala_potlamp.getText().equals("0")) {
					sala_potlamp.setText("0");
				} else {
					//
				}

				sala_tlamp = Float.parseFloat(sala_tempolamp.getText()
						.toString());
				sala_qlamp = Float.parseFloat(sala_quantlamp.getText()
						.toString());
				sala_plamp = Float
						.parseFloat(sala_potlamp.getText().toString());

				finish();
			}
	
	    // TODO Auto-generated method stub
		});
		
		Button LAMPSLimpar = (Button) findViewById(R.id.BTLampadaSalaLimpar);
		LAMPSLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText sala_tempolamp = (EditText) findViewById(R.id.EDITLampadaSalaTempo);
			EditText sala_quantlamp = (EditText) findViewById(R.id.EDITLampadaSalaQuant);
			EditText sala_potlamp = (EditText) findViewById(R.id.EDITLampadaSalaPotencia);

			sala_tempolamp.setText("");
			sala_quantlamp.setText("");
			sala_potlamp.setText("");
			}});
		
		Button LAMPSSug = (Button) findViewById(R.id.BTSugestaoLampadaSala);
		LAMPSSug.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				EditText sala_tempolamp = (EditText) findViewById(R.id.EDITLampadaSalaTempo);
				EditText sala_quantlamp = (EditText) findViewById(R.id.EDITLampadaSalaQuant);
				EditText sala_potlamp = (EditText) findViewById(R.id.EDITLampadaSalaPotencia);

				sala_tempolamp.setText("5");
				sala_quantlamp.setText("1");
				sala_potlamp.setText("9");
			}});
	}
}
