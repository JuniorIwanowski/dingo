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

public class LampadaCozinha extends Activity {
	
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
	
	public static float cozinha_tlamp;
	public static float cozinha_qlamp;
	public static float cozinha_plamp;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.lampadacozinha);

		Button LAMPCVoltar = (Button) findViewById(R.id.BTLampadaCozinhaVoltar);
		LAMPCVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText cozinha_tempolamp = (EditText) findViewById(R.id.EDITLampadaCozinhaTempo);
				EditText cozinha_quantlamp = (EditText) findViewById(R.id.EDITLampadaCozinhaQuant);
				EditText cozinha_potlamp = (EditText) findViewById(R.id.EDITLampadaCozinhaPotencia);

				if (cozinha_tempolamp.getText() == null
						|| cozinha_tempolamp.getText().length() == 0
						|| cozinha_tempolamp.getText().equals("0")) {
					cozinha_tempolamp.setText("0");
				} else {
					//
				}

				if (cozinha_quantlamp.getText() == null
						|| cozinha_quantlamp.getText().length() == 0
						|| cozinha_quantlamp.getText().equals("0")) {
					cozinha_quantlamp.setText("0");
				} else {
					//
				}

				if (cozinha_potlamp.getText() == null
						|| cozinha_potlamp.getText().length() == 0
						|| cozinha_potlamp.getText().equals("0")) {
					cozinha_potlamp.setText("0");
				} else {
					//
				}

				cozinha_tlamp = Float.parseFloat(cozinha_tempolamp.getText()
						.toString());
				cozinha_qlamp = Float.parseFloat(cozinha_quantlamp.getText()
						.toString());
				cozinha_plamp = Float
						.parseFloat(cozinha_potlamp.getText().toString());

				finish();
			}
		});
		
		Button LAMPCLimpar = (Button) findViewById(R.id.BTLampadaCozinhaLimpar);
		LAMPCLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText cozinha_tempolamp = (EditText) findViewById(R.id.EDITLampadaCozinhaTempo);
			EditText cozinha_quantlamp = (EditText) findViewById(R.id.EDITLampadaCozinhaQuant);
			EditText cozinha_potlamp = (EditText) findViewById(R.id.EDITLampadaCozinhaPotencia);

			cozinha_tempolamp.setText("");
			cozinha_quantlamp.setText("");
			cozinha_potlamp.setText("");
			}});
		
		Button LAMPCSug = (Button) findViewById(R.id.BTSugestaoLampadaCozinha);
		LAMPCSug.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				EditText cozinha_tempolamp = (EditText) findViewById(R.id.EDITLampadaCozinhaTempo);
				EditText cozinha_quantlamp = (EditText) findViewById(R.id.EDITLampadaCozinhaQuant);
				EditText cozinha_potlamp = (EditText) findViewById(R.id.EDITLampadaCozinhaPotencia);

				cozinha_tempolamp.setText("5");
				cozinha_quantlamp.setText("1");
				cozinha_potlamp.setText("9");
			}});
	
	    // TODO Auto-generated method stub
	}

}
