package br.com.wacoo;

import java.text.DecimalFormat;
import java.util.Locale;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculos extends Activity {
	
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
	
	public String getKWFormatado(Float f) {
		if (f != 0) {
		DecimalFormat df = new DecimalFormat("00 kW/h");
		return df.format(f);
		} else {
			return null;
		}
	}
	
	public String getValorFormatado(Float f) {
		if (f != 0) {
		Locale.setDefault(new Locale("pt", "BR"));
		DecimalFormat df = new DecimalFormat("R$ 00.00");
		return df.format(f);
		} else {
			return null;
		}
	}
	
	public float quarto_gasto_tv;
	public float quarto_kwh_tv;
	public float quarto_gasto_lamp;
	public float quarto_kwh_lamp;
	public float quarto_gasto_pc;
	public float quarto_kwh_pc;
	public float quarto_gasto_vent;
	public float quarto_kwh_vent;
	
	public float total_quarto_kwh;
	public float total_gasto_quarto;

	public float sala_gasto_tv;
	public float sala_kwh_tv;
	public float sala_gasto_lamp;
	public float sala_kwh_lamp;
	public float sala_gasto_som;
	public float sala_kwh_som;
	public float sala_gasto_dvd;
	public float sala_kwh_dvd;
	
	public float total_sala_kwh;
	public float total_gasto_sala;

	public float cozinha_gasto_gela;
	public float cozinha_kwh_gela;
	public float cozinha_gasto_bate;
	public float cozinha_kwh_bate;
	public float cozinha_gasto_micro;
	public float cozinha_kwh_micro;
	public float cozinha_gasto_lamp;
	public float cozinha_kwh_lamp;
	
	public float total_cozinha_kwh;
	public float total_gasto_cozinha;

	public float banheiro_gasto_chuv;
	public float banheiro_kwh_chuv;
	public float banheiro_gasto_barb;
	public float banheiro_kwh_barb;
	public float banheiro_gasto_sec;
	public float banheiro_kwh_sec;
	public float banheiro_gasto_lamp;
	public float banheiro_kwh_lamp;
	
	public float total_banheiro_kwh;
	public float total_gasto_banheiro;

	public float total_gasto_casa;
	public float total_casa_kwh;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
setContentView(R.layout.calculo_absolut);
		
		//calculos do quarto:
		
		quarto_kwh_tv = (TVQuarto.quarto_ttv*30)*TVQuarto.quarto_ptv/1000;
		quarto_kwh_lamp = (LampadaQuarto.quarto_tlamp*30)*LampadaQuarto.quarto_plamp/1000;
		quarto_kwh_pc = (PC.quarto_tpc*30)*PC.quarto_ppc/1000;
		quarto_kwh_vent = (Ventilador.quarto_tvent*30)*Ventilador.quarto_pvent/1000;
		
		quarto_gasto_tv = (quarto_kwh_tv*Config.tarifa)*TVQuarto.quarto_qtv;
		quarto_gasto_lamp = (quarto_kwh_lamp*Config.tarifa)*LampadaQuarto.quarto_qlamp;
		quarto_gasto_pc = (quarto_kwh_pc*Config.tarifa)*PC.quarto_qpc;
		quarto_gasto_vent = (quarto_kwh_vent*Config.tarifa)*Ventilador.quarto_qvent;
		
		total_quarto_kwh = quarto_kwh_tv + quarto_kwh_lamp + quarto_kwh_pc + quarto_kwh_vent;
		total_gasto_quarto = quarto_gasto_tv + quarto_gasto_lamp + quarto_gasto_pc + quarto_gasto_vent;
		
		EditText GastoQuarto = (EditText) findViewById(R.id.EDITCalcQuarto);
		
		if (total_gasto_quarto == 0 && total_quarto_kwh == 0) {
			GastoQuarto.setText("");
		}else{
			GastoQuarto.setText(getValorFormatado(total_gasto_quarto));
		}
		
		//calculos da sala
		
	    sala_kwh_tv = (TVSala.sala_ttv*30)*TVSala.sala_ptv/1000;
		sala_kwh_lamp = (LampadaSala.sala_tlamp*30)*LampadaSala.sala_plamp/1000;
		sala_kwh_som = (Som.sala_tsom*30)*Som.sala_psom/1000;
		sala_kwh_dvd = (DVD.sala_tdvd*30)*DVD.sala_pdvd/1000;
		
		sala_gasto_tv = (sala_kwh_tv*Config.tarifa)*TVSala.sala_qtv;
		sala_gasto_lamp = (sala_kwh_lamp*Config.tarifa)*LampadaSala.sala_qlamp;
		sala_gasto_som = (sala_kwh_som*Config.tarifa)*Som.sala_qsom;
		sala_gasto_dvd = (sala_kwh_dvd*Config.tarifa)*DVD.sala_qdvd;
		
		total_sala_kwh = sala_kwh_tv + sala_kwh_lamp + sala_kwh_som + sala_kwh_dvd;
		total_gasto_sala = sala_gasto_tv + sala_gasto_lamp + sala_gasto_som + sala_gasto_dvd;
		
		EditText GastoSala = (EditText) findViewById(R.id.EDITCalcSala);
		
		if (total_gasto_sala == 0) {
			GastoSala.setText("");
		}else{
			GastoSala.setText(getValorFormatado(total_gasto_sala));
		}
		
		
		//calculos da cozinha
		
		cozinha_kwh_gela = (Geladeira.cozinha_tgela*30)*Geladeira.cozinha_pgela/1000;
		cozinha_kwh_bate = (Batedeira.cozinha_tbate*30)*Batedeira.cozinha_pbate/1000;
		cozinha_kwh_micro = (Microondas.cozinha_tmicro*30)*Microondas.cozinha_pmicro/1000;
		cozinha_kwh_lamp = (LampadaCozinha.cozinha_tlamp*30)*LampadaCozinha.cozinha_plamp/1000;
		
		cozinha_gasto_gela = (cozinha_kwh_gela*Config.tarifa)*Geladeira.cozinha_qgela;
		cozinha_gasto_bate = (cozinha_kwh_bate*Config.tarifa)*Batedeira.cozinha_qbate;
		cozinha_gasto_micro = (cozinha_kwh_micro*Config.tarifa)*Microondas.cozinha_qmicro;
		cozinha_gasto_lamp = (cozinha_kwh_lamp*Config.tarifa)*LampadaCozinha.cozinha_qlamp;
		
		total_cozinha_kwh = cozinha_kwh_gela + cozinha_kwh_bate + cozinha_kwh_micro + cozinha_kwh_lamp;
		total_gasto_cozinha = cozinha_gasto_gela + cozinha_gasto_bate + cozinha_gasto_micro + cozinha_gasto_lamp;
		
		EditText GastoCozinha = (EditText) findViewById(R.id.EDITCalcCozinha);
		
		if (total_gasto_cozinha == 0) {
			GastoCozinha.setText("");
		}else{
			GastoCozinha.setText(getValorFormatado(total_gasto_cozinha));
		}
		
		
		//calculos do banheiro
		
		banheiro_kwh_chuv = (Chuveiro.banheiro_tchuv*30)*Chuveiro.banheiro_pchuv/1000;
		banheiro_kwh_barb = (Barbeador.banheiro_tbarb*30)*Barbeador.banheiro_pbarb/1000;
		banheiro_kwh_sec = (Secador.banheiro_tsec*30)*Secador.banheiro_psec/1000;
		banheiro_kwh_lamp = (LampadaBanheiro.banheiro_tlamp*30)*LampadaBanheiro.banheiro_plamp/1000;
		
		banheiro_gasto_chuv = (banheiro_kwh_chuv*Config.tarifa)*Chuveiro.banheiro_qchuv;
		banheiro_gasto_barb = (banheiro_kwh_barb*Config.tarifa)*Barbeador.banheiro_qbarb;
		banheiro_gasto_sec = (banheiro_kwh_sec*Config.tarifa)*Secador.banheiro_qsec;
		banheiro_gasto_lamp = (banheiro_kwh_lamp*Config.tarifa)*LampadaBanheiro.banheiro_qlamp;
		
		total_banheiro_kwh = banheiro_kwh_chuv + banheiro_kwh_barb + banheiro_kwh_sec + banheiro_kwh_lamp;
		total_gasto_banheiro = banheiro_gasto_chuv + banheiro_gasto_barb + banheiro_gasto_sec + banheiro_gasto_lamp;
		
		EditText GastoBanheiro = (EditText) findViewById(R.id.EDITCalcBanheiro);
		
		if (total_gasto_banheiro == 0) {
			GastoBanheiro.setText("");
		}else{
			GastoBanheiro.setText(getValorFormatado(total_gasto_banheiro));
		}
		
		//calculo geral
		
		total_casa_kwh = total_banheiro_kwh + total_cozinha_kwh + total_sala_kwh + total_quarto_kwh;
		total_gasto_casa = total_gasto_quarto + total_gasto_sala + total_gasto_cozinha + total_gasto_banheiro;
		
		EditText GastoTotal = (EditText) findViewById(R.id.EDITCalcGeral);
		
		if (total_gasto_casa == 0) {
			GastoTotal.setText("");
		}else{
			GastoTotal.setText(getValorFormatado(total_gasto_casa));
		}
		
		
		
		Button btAlerta = (Button) findViewById(R.id.btAlertas);
		btAlerta.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

		final Dialog dialog = new Dialog(Calculos.this);

		dialog.setContentView(R.layout.alertadialog);
		dialog.setTitle("Alertas");
		dialog.setCancelable(true);
		
		TextView dica1 = (TextView) dialog.findViewById(R.id.dica1);
		TextView dica2 = (TextView) dialog.findViewById(R.id.dica2);
		TextView dica3 = (TextView) dialog.findViewById(R.id.dica3);

		if (total_gasto_quarto == 0 && total_gasto_sala == 0 && total_gasto_cozinha == 0 && total_gasto_banheiro == 0) {	
			dica1.setText("- Nunca toque em um aparelho elétrico se você estiver próximo à água.");
			dica2.setText("- Ao sinal de tempestade, desligue equipamentos elétricos da tomada.");
			dica3.setText("- Se a casa ficar desocupada por um período prolongado, desligue a chave elétrica principal.");
		}else 
			if (total_gasto_quarto > total_gasto_sala && total_gasto_quarto > total_gasto_cozinha && total_gasto_quarto > total_gasto_banheiro) {
				dica1.setText("- Nas pausas mais curtas, desligue o monitor. Ele é responsável por 70% do consumo de energia do computador.");
				dica2.setText("- Evite deixar fios espalhados pelo chão.");
				dica3.setText("- Evite dormir com a televisão ligada. Uma opção é programar o aparelho para desligar sozinho (timer).");	
			}else if (total_gasto_sala > total_gasto_quarto && total_gasto_sala > total_gasto_cozinha && total_gasto_sala > total_gasto_banheiro) {
				dica1.setText("- Dê preferência às lâmpadas fluorescentes compactas (LFC) ou circulares.");
				dica2.setText("- Nunca desligue a TV através somente do controle remoto. Desligue-a da tomada.");
				dica3.setText("- O consumo de aparelhos em stand-by pode representar 12% do consumo doméstico de energia.");
			}else if (total_gasto_cozinha > total_gasto_sala && total_gasto_cozinha > total_gasto_quarto && total_gasto_cozinha > total_gasto_banheiro) {
				dica1.setText("- Geladeiras e freezers não devem ficar perto do fogão nem de outras fontes de calor.");
				dica2.setText("- Pinte o teto e as paredes internas com cores claras, que refletem melhor a luz, diminuindo a necessidade de iluminação artificial.");
				dica3.setText("- Não guarde alimentos ou líquidos quentes na geladeira.");
			}else if (total_gasto_banheiro > total_gasto_sala && total_gasto_banheiro > total_gasto_cozinha && total_gasto_banheiro > total_gasto_quarto) {
				dica1.setText("- Colocar o chuveiro na posição verão gera uma economia de 30%.");
				dica2.setText("- O uso excessivo do secador pode ser prejudicial à saúde.");
				dica3.setText("- Barbeadores apresentam vários riscos como cortes e choques elétricos.");
			}
		
			Button btFechaAlerta = (Button) dialog.findViewById(R.id.BTFAlerta);
			btFechaAlerta.setOnClickListener(new View.OnClickListener() {
				//@Override
				public void onClick(View v) {
                dialog.dismiss();
				
			}});
			
			dialog.show();
		}});
		
		Button mudar = (Button) findViewById(R.id.btMudar);
		mudar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				

				Button mudar = (Button) findViewById(R.id.btMudar);
				if (total_gasto_casa == 0) {
					
				}else if (total_gasto_casa != 0){
				if (mudar.getText() == "Valor") {
					mudar.setText("kW/h");
					
					EditText GastoQuarto = (EditText) findViewById(R.id.EDITCalcQuarto);
					GastoQuarto.setText(getValorFormatado(total_gasto_quarto));
					
					EditText GastoSala = (EditText) findViewById(R.id.EDITCalcSala);
					GastoSala.setText(getValorFormatado(total_gasto_sala));
					
					EditText GastoCozinha = (EditText) findViewById(R.id.EDITCalcCozinha);
					GastoCozinha.setText(getValorFormatado(total_gasto_cozinha));
					
					EditText GastoBanheiro = (EditText) findViewById(R.id.EDITCalcBanheiro);
					GastoBanheiro.setText(getValorFormatado(total_gasto_banheiro));
					
					EditText GastoTotal = (EditText) findViewById(R.id.EDITCalcGeral);
					GastoTotal.setText(getValorFormatado(total_gasto_casa));
					
				}else{
					mudar.setText("Valor");
					
					EditText GastoQuarto = (EditText) findViewById(R.id.EDITCalcQuarto);
					GastoQuarto.setText(getKWFormatado(total_quarto_kwh));
					
					EditText GastoSala = (EditText) findViewById(R.id.EDITCalcSala);
					GastoSala.setText(getKWFormatado(total_sala_kwh));
					
					EditText GastoCozinha = (EditText) findViewById(R.id.EDITCalcCozinha);
					GastoCozinha.setText(getKWFormatado(total_cozinha_kwh));
					
					EditText GastoBanheiro = (EditText) findViewById(R.id.EDITCalcBanheiro);
					GastoBanheiro.setText(getKWFormatado(total_banheiro_kwh));
					
					EditText GastoTotal = (EditText) findViewById(R.id.EDITCalcGeral);
					GastoTotal.setText(getKWFormatado(total_casa_kwh));
					
					
				}
				}
		}});
	
	    // TODO Auto-generated method stub
	}

}
