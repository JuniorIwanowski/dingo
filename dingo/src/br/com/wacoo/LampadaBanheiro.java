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

public class LampadaBanheiro extends Activity {
	
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
	
	public static float banheiro_tlamp;
	public static float banheiro_qlamp;
	public static float banheiro_plamp;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    setContentView(R.layout.lampadabanheiro);

		Button LAMPBVoltar = (Button) findViewById(R.id.BTLampadaBanheiroVoltar);
		LAMPBVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText banheiro_tempolamp = (EditText) findViewById(R.id.EDITLampadaBanheiroTempo);
				EditText banheiro_quantlamp = (EditText) findViewById(R.id.EDITLampadaBanheiroQuant);
				EditText banheiro_potlamp = (EditText) findViewById(R.id.EDITLampadaBanheiroPotencia);

				if (banheiro_tempolamp.getText() == null
						|| banheiro_tempolamp.getText().length() == 0
						|| banheiro_tempolamp.getText().equals("0")) {
					banheiro_tempolamp.setText("0");
				} else {
					//
				}

				if (banheiro_quantlamp.getText() == null
						|| banheiro_quantlamp.getText().length() == 0
						|| banheiro_quantlamp.getText().equals("0")) {
					banheiro_quantlamp.setText("0");
				} else {
					//
				}

				if (banheiro_potlamp.getText() == null
						|| banheiro_potlamp.getText().length() == 0
						|| banheiro_potlamp.getText().equals("0")) {
					banheiro_potlamp.setText("0");
				} else {
					//
				}

				banheiro_tlamp = Float.parseFloat(banheiro_tempolamp.getText()
						.toString());
				banheiro_qlamp = Float.parseFloat(banheiro_quantlamp.getText()
						.toString());
				banheiro_plamp = Float
						.parseFloat(banheiro_potlamp.getText().toString());

				finish();
			}
		});
		
		Button LAMPBLimpar = (Button) findViewById(R.id.BTLampadaBanheiroLimpar);
		LAMPBLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText banheiro_tempolamp = (EditText) findViewById(R.id.EDITLampadaBanheiroTempo);
			EditText banheiro_quantlamp = (EditText) findViewById(R.id.EDITLampadaBanheiroQuant);
			EditText banheiro_potlamp = (EditText) findViewById(R.id.EDITLampadaBanheiroPotencia);

			banheiro_tempolamp.setText("");
			banheiro_quantlamp.setText("");
			banheiro_potlamp.setText("");
			}});
		
		Button LAMPBSug = (Button) findViewById(R.id.BTSugestaoLampadaBanheiro);
		LAMPBSug.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				EditText banheiro_tempolamp = (EditText) findViewById(R.id.EDITLampadaBanheiroTempo);
				EditText banheiro_quantlamp = (EditText) findViewById(R.id.EDITLampadaBanheiroQuant);
				EditText banheiro_potlamp = (EditText) findViewById(R.id.EDITLampadaBanheiroPotencia);

				banheiro_tempolamp.setText("5");
				banheiro_quantlamp.setText("1");
				banheiro_potlamp.setText("9");
			}});
	
	    // TODO Auto-generated method stub
	}

}
