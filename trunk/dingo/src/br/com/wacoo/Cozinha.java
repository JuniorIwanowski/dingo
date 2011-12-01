package br.com.wacoo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Cozinha extends Activity {
	
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

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.lista_cozinha);

		Button chamaLAMPC = (Button) findViewById(R.id.BTChamaLampCozinha);
		chamaLAMPC.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				Intent i = new Intent(Cozinha.this, LampadaCozinha.class);
		         startActivity(i);
			}
		});

		Button chamaMICRO = (Button) findViewById(R.id.BTChamaMicroondas);
		chamaMICRO.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				Intent i = new Intent(Cozinha.this, Microondas.class);
		         startActivity(i);
			}
		});

		Button chamaBAT = (Button) findViewById(R.id.BTChamaBatedeira);
		chamaBAT.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				Intent i = new Intent(Cozinha.this, Batedeira.class);
		         startActivity(i);
			}
		});

		Button chamaGELA = (Button) findViewById(R.id.BTChamaGeladeira);
		chamaGELA.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				Intent i = new Intent(Cozinha.this, Geladeira.class);
		         startActivity(i);
			}
		});
	
	    // TODO Auto-generated method stub
	}

}
