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

public class Microondas extends Activity {
	
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
	
	public static float cozinha_tmicro;
	public static float cozinha_qmicro;
	public static float cozinha_pmicro;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.microondas);

		Button MICROVoltar = (Button) findViewById(R.id.BTMICROVoltar);
		MICROVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText cozinha_tempomicro =(EditText) findViewById(R.id.EDITMICROTempo);
				EditText cozinha_quantmicro = (EditText) findViewById(R.id.EDITMICROQuant);
				EditText cozinha_potmicro = (EditText) findViewById(R.id.EDITMICROPotencia);

				if (cozinha_tempomicro.getText() == null
						|| cozinha_tempomicro.getText().length() == 0
						|| cozinha_tempomicro.getText().equals("0")) {
					cozinha_tempomicro.setText("0");
				} else {
					//
				}

				if (cozinha_quantmicro.getText() == null
						|| cozinha_quantmicro.getText().length() == 0
						|| cozinha_quantmicro.getText().equals("0")) {
					cozinha_quantmicro.setText("0");
				} else {
					//
				}

				if (cozinha_potmicro.getText() == null
						|| cozinha_potmicro.getText().length() == 0
						|| cozinha_potmicro.getText().equals("0")) {
					cozinha_potmicro.setText("0");
				} else {
					//
				}

				cozinha_tmicro = Float.parseFloat(cozinha_tempomicro.getText()
						.toString());
				cozinha_qmicro = Float.parseFloat(cozinha_quantmicro.getText()
						.toString());
				cozinha_pmicro = Float
						.parseFloat(cozinha_potmicro.getText().toString());

				finish();
			}});
		
		Button MicroLimpar = (Button) findViewById(R.id.BTMicroondasLimpar);
		MicroLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText cozinha_tempomicro =(EditText) findViewById(R.id.EDITMICROTempo);
			EditText cozinha_quantmicro = (EditText) findViewById(R.id.EDITMICROQuant);
			EditText cozinha_potmicro = (EditText) findViewById(R.id.EDITMICROPotencia);

			cozinha_tempomicro.setText("");
			cozinha_quantmicro.setText("");
			cozinha_potmicro.setText("");
			}});
		
		Button MicroSug = (Button) findViewById(R.id.BTSugestaoMicroondas);
		MicroSug.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				EditText cozinha_tempomicro =(EditText) findViewById(R.id.EDITMICROTempo);
				EditText cozinha_quantmicro = (EditText) findViewById(R.id.EDITMICROQuant);
				EditText cozinha_potmicro = (EditText) findViewById(R.id.EDITMICROPotencia);

				cozinha_tempomicro.setText("0.2");
				cozinha_quantmicro.setText("1");
				cozinha_potmicro.setText("1200");
			}});
	
	    // TODO Auto-generated method stub
	}

}
