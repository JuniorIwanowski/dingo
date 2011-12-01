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

public class Chuveiro extends Activity {
	
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
	
	public static float banheiro_tchuv;
	public static float banheiro_qchuv;
	public static float banheiro_pchuv;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.chuveiro);

		Button ChuvVoltar = (Button) findViewById(R.id.BTChuveiroVoltar);
		ChuvVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {


				EditText banheiro_tempochuv = (EditText) findViewById(R.id.EDITChuveiroTempo);
				EditText banheiro_quantchuv = (EditText) findViewById(R.id.EDITChuveiroQuant);
				EditText banheiro_potchuv = (EditText) findViewById(R.id.EDITChuveiroPotencia);

				if (banheiro_tempochuv.getText() == null
						|| banheiro_tempochuv.getText().length() == 0
						|| banheiro_tempochuv.getText().equals("0")) {
					banheiro_tempochuv.setText("0");
				} else {
					//
				}

				if (banheiro_quantchuv.getText() == null
						|| banheiro_quantchuv.getText().length() == 0
						|| banheiro_quantchuv.getText().equals("0")) {
					banheiro_quantchuv.setText("0");
				} else {
					//
				}

				if (banheiro_potchuv.getText() == null
						|| banheiro_potchuv.getText().length() == 0
						|| banheiro_potchuv.getText().equals("0")) {
					banheiro_potchuv.setText("0");
				} else {
					//
				}

				banheiro_tchuv = Float.parseFloat(banheiro_tempochuv.getText()
						.toString());
				banheiro_qchuv = Float.parseFloat(banheiro_quantchuv.getText()
						.toString());
				banheiro_pchuv = Float
						.parseFloat(banheiro_potchuv.getText().toString());

				finish();
			}});
		
		Button ChuvLimpar = (Button) findViewById(R.id.BTChuveiroLimpar);
		ChuvLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText banheiro_tempochuv = (EditText) findViewById(R.id.EDITChuveiroTempo);
			EditText banheiro_quantchuv = (EditText) findViewById(R.id.EDITChuveiroQuant);
			EditText banheiro_potchuv = (EditText) findViewById(R.id.EDITChuveiroPotencia);

			banheiro_tempochuv.setText("");
			banheiro_quantchuv.setText("");
			banheiro_potchuv.setText("");
			}});
		
		Button ChuvSug = (Button) findViewById(R.id.BTSugestaoChuveiro);
		ChuvSug.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				
				EditText banheiro_tempochuv = (EditText) findViewById(R.id.EDITChuveiroTempo);
				EditText banheiro_quantchuv = (EditText) findViewById(R.id.EDITChuveiroQuant);
				EditText banheiro_potchuv = (EditText) findViewById(R.id.EDITChuveiroPotencia);

				banheiro_tempochuv.setText("0.1");
				banheiro_quantchuv.setText("1");
				banheiro_potchuv.setText("3500");
				
			}});
	    
	    
	 
	
	    // TODO Auto-generated method stub
	

	    }
}