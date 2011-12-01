package br.com.wacoo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Sala extends Activity {
	
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
	
	public float sala_ttv;
	public float sala_qtv;
	public float sala_ptv;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.lista_sala);

		Button chamaLAMPSALA = (Button) findViewById(R.id.BTChamaLampSala);
		chamaLAMPSALA.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent L = new Intent(Sala.this, LampadaSala.class);
		        startActivity(L);
			}
		});

		Button chamaTVS = (Button) findViewById(R.id.BTChamaTVSala);
		chamaTVS.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				Intent T = new Intent(Sala.this, TVSala.class);
		        startActivity(T);
			}
		});

		Button chamaDVD = (Button) findViewById(R.id.BTChamaDVD);
		chamaDVD.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				Intent D = new Intent(Sala.this, DVD.class);
		        startActivity(D);
			}
		});

		Button chamaSOM = (Button) findViewById(R.id.BTChamaSom);
		chamaSOM.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				Intent S = new Intent(Sala.this, Som.class);
		        startActivity(S);
			}
		});
	
	    // TODO Auto-generated method stub
	}

}
