package br.com.wacoo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Ajuda extends Activity {
	
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
	    
setContentView(R.layout.ajuda);
		
		Button btsobre = (Button) findViewById(R.id.BTSobre);
		btsobre.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				Intent i = new Intent(Ajuda.this, Sobre.class);
		         startActivity(i);
			}});
		
	Button btFormulas = (Button) findViewById(R.id.BTFormulas);
	btFormulas.setOnClickListener(new View.OnClickListener() {
		public void onClick(View arg0) {

		final Dialog dialog2 = new Dialog(Ajuda.this);

		dialog2.setContentView(R.layout.formulasdialog);
		dialog2.setTitle("Fórmulas");
		dialog2.setCancelable(true);
		
		Button btFechaF = (Button) dialog2.findViewById(R.id.BTFVoltar);
		btFechaF.setOnClickListener(new OnClickListener() {
			//@Override
			public void onClick(View v) {
            dialog2.dismiss();
		}});
		dialog2.show();
	}});
		
	}
	

	
	    // TODO Auto-generated method stub
	}
