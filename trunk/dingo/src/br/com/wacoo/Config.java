package br.com.wacoo;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Config extends Activity {
	
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
	
	public static float tarifa;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.configuracoes);
		
		EditText tarifavigente = (EditText) findViewById(R.id.EDITTarifa);
		
		SharedPreferences settings = getPreferences(0);
		tarifa = settings.getFloat("tarifa", tarifa);
		
		if (tarifa == 0) {
			tarifavigente.setText("");
		}else{
		tarifavigente.setText(String.valueOf(tarifa));
		}
		
		
		Button btConfigVoltar = (Button) findViewById(R.id.BTConfiguracoesVoltar);
		btConfigVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				
				EditText tarifavigente = (EditText) findViewById(R.id.EDITTarifa);
				
				if (tarifavigente.getText() == null
						|| tarifavigente.getText().length() == 0
						|| tarifavigente.getText().equals("0")) {
					tarifavigente.setText("0");
				} else {
					//
				}
				
				tarifa = Float.parseFloat(tarifavigente.getText()
						.toString());
				
				
				SharedPreferences settings = getPreferences(0);
				SharedPreferences.Editor editor = settings.edit();
				editor.putFloat("tarifa", tarifa);
				editor.commit();
				finish();
				
			}
		});
	
	    // TODO Auto-generated method stub
	}

}
