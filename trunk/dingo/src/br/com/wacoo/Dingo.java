package br.com.wacoo;

import java.text.DecimalFormat;
import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class Dingo extends Activity {
	
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
	        CarregaTelaPrincipal();
	        return true;
	    case R.id.comodos:
	        CarregaTelaInicio();
	        return true;
	    case R.id.configs:
	        CarregaTelaConfig();
	        return true;
	    case R.id.ajuda:
	        CarregaTelaAjuda();
	        return true;
	    case R.id.calculos:
	        CarregaTelaCalculo();
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}

	public float tarifa = 0.37554F;

	public ListView lista;

	// variaveis do QUARTO:

	public float quarto_tlamp;
	public float quarto_qlamp;
	public float quarto_plamp;

	public float quarto_ttv;
	public float quarto_qtv;
	public float quarto_ptv;

	public float quarto_tpc;
	public float quarto_qpc;
	public float quarto_ppc;

	public float quarto_tvent;
	public float quarto_qvent;
	public float quarto_pvent;

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

	// variaves da SALA

	public float sala_tlamp;
	public float sala_qlamp;
	public float sala_plamp;
	
	public float sala_ttv;
	public float sala_qtv;
	public float sala_ptv;
	
	public float sala_tsom;
	public float sala_qsom;
	public float sala_psom;
	
	public float sala_tdvd;
	public float sala_qdvd;
	public float sala_pdvd;

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

	// variaves da COZINHA

	public float cozinha_tgela;
	public float cozinha_qgela;
	public float cozinha_pgela;
	
	public float cozinha_tbate;
	public float cozinha_qbate;
	public float cozinha_pbate;
	
	public float cozinha_tmicro;
	public float cozinha_qmicro;
	public float cozinha_pmicro;

	public float cozinha_tlamp;
	public float cozinha_qlamp;
	public float cozinha_plamp;
	
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

	// variaves do banheiro

	public float banheiro_tchuv;
	public float banheiro_qchuv;
	public float banheiro_pchuv;
	
	public float banheiro_tbarb;
	public float banheiro_qbarb;
	public float banheiro_pbarb;
	
	public float banheiro_tsec;
	public float banheiro_qsec;
	public float banheiro_psec;
	
	public float banheiro_tlamp;
	public float banheiro_qlamp;
	public float banheiro_plamp;

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
	
	////////////

	public void CarregaTelaPrincipal() {

		setContentView(R.layout.main);

		Button btajuda = (Button) findViewById(R.id.btAjuda);
		btajuda.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaAjuda();
			}
		});

		Button btinicio = (Button) findViewById(R.id.btInicio);
		btinicio.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaInicio();
			}
		});
		
		Button btconfig = (Button) findViewById(R.id.btConfig);
		btconfig.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaConfig();
			}
		});
	}

	public void CarregaTelaInicio() {
		setContentView(R.layout.inicio);
		
		Button BTChamaSala = (Button) findViewById(R.id.BTChamaSala);
		BTChamaSala.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaSala();

			}
		});
		
		Button BTChamaQuarto = (Button) findViewById(R.id.BTChamaQuarto);
		BTChamaQuarto.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaQuarto();

			}
		});
		
		Button BTChamaCozinha = (Button) findViewById(R.id.BTChamaCozinha);
		BTChamaCozinha.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaCozinha();

			}
		});
		
		Button BTChamaBanheiro = (Button) findViewById(R.id.BTChamaBanheiro);
		BTChamaBanheiro.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaBanheiro();

			}
		});

		Button btVoltar = (Button) findViewById(R.id.BTVoltar);
		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaPrincipal();
			}
		});
	

		Button btcalcular = (Button) findViewById(R.id.BTCalcular);
		btcalcular.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				
				CarregaTelaCalculo();

			}
		});

	}

	
	
	// Chama a tela do Quarto

	public void CarregaTelaQuarto() {

		setContentView(R.layout.lista_quarto);

		Button btmainQ = (Button) findViewById(R.id.BTQuartoVoltar);
		btmainQ.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaInicio();
			}
		});

		Button chamaTVQ = (Button) findViewById(R.id.BTChamaTVQuarto);
		chamaTVQ.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaTVQuarto();
			}
		});

		Button chamaPC = (Button) findViewById(R.id.BTChamaPC);
		chamaPC.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaPC();
			}
		});

		Button chamaVENT = (Button) findViewById(R.id.BTChamaVentilador);
		chamaVENT.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaVentilador();
			}
		});

		Button chamaLAMPQ = (Button) findViewById(R.id.BTChamaLampQuarto);
		chamaLAMPQ.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaLampQuarto();
			}
		});

	}

	// Apps do quarto

	public void CarregaTelaTVQuarto() {
		
		setContentView(R.layout.tv);

		Button TVQVoltar = (Button) findViewById(R.id.BTTVQuartoVoltar);
		TVQVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText quarto_tempotv = (EditText) findViewById(R.id.EDITTVQuartoTempo);
				EditText quarto_quanttv = (EditText) findViewById(R.id.EDITTVQuartoQuant);
				EditText quarto_pottv = (EditText) findViewById(R.id.EDITTVQuartoPotencia);

				if (quarto_tempotv.getText() == null
						|| quarto_tempotv.getText().length() == 0
						|| quarto_tempotv.getText().equals("0")) {
					quarto_tempotv.setText("0");
				} else {
					//
				}

				if (quarto_quanttv.getText() == null
						|| quarto_quanttv.getText().length() == 0
						|| quarto_quanttv.getText().equals("0")) {
					quarto_quanttv.setText("0");
				} else {
					//
				}

				if (quarto_pottv.getText() == null
						|| quarto_pottv.getText().length() == 0
						|| quarto_pottv.getText().equals("0")) {
					quarto_pottv.setText("0");
				} else {
					//
				}

				quarto_ttv = Float.parseFloat(quarto_tempotv.getText()
						.toString());
				quarto_qtv = Float.parseFloat(quarto_quanttv.getText()
						.toString());
				quarto_ptv = Float
						.parseFloat(quarto_pottv.getText().toString());

				CarregaTelaQuarto();
			}
		});
		
		Button TVQLimpar = (Button) findViewById(R.id.BTTVQuartoLimpar);
		TVQLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		EditText quarto_tempotv = (EditText) findViewById(R.id.EDITTVQuartoTempo);
		EditText quarto_quanttv = (EditText) findViewById(R.id.EDITTVQuartoQuant);
		EditText quarto_pottv = (EditText) findViewById(R.id.EDITTVQuartoPotencia);
		
		quarto_tempotv.setText("");
		quarto_quanttv.setText("");
		quarto_pottv.setText("");
			}});
	}

	
	public void CarregaTelaLampQuarto() {
		setContentView(R.layout.lampada);

		Button LAMPQVoltar = (Button) findViewById(R.id.BTLampadaQuartoVoltar);
		LAMPQVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText quarto_tempolamp = (EditText) findViewById(R.id.EDITLampadaQuartoTempo);
				EditText quarto_quantlamp = (EditText) findViewById(R.id.EDITLampadaQuartoQuant);
				EditText quarto_potlamp = (EditText) findViewById(R.id.EDITLampadaQuartoPotencia);

				if (quarto_tempolamp.getText() == null
						|| quarto_tempolamp.getText().length() == 0
						|| quarto_tempolamp.getText().equals("0")) {
					quarto_tempolamp.setText("0");
				} else {
					//
				}

				if (quarto_quantlamp.getText() == null
						|| quarto_quantlamp.getText().length() == 0
						|| quarto_quantlamp.getText().equals("0")) {
					quarto_quantlamp.setText("0");
				} else {
					//
				}

				if (quarto_potlamp.getText() == null
						|| quarto_potlamp.getText().length() == 0
						|| quarto_potlamp.getText().equals("0")) {
					quarto_potlamp.setText("0");
				} else {
					//
				}

				quarto_tlamp = Float.parseFloat(quarto_tempolamp.getText()
						.toString());
				quarto_qlamp = Float.parseFloat(quarto_quantlamp.getText()
						.toString());
				quarto_plamp = Float
						.parseFloat(quarto_potlamp.getText().toString());

				CarregaTelaQuarto();
			}
		});
		
		Button LAMPQLimpar = (Button) findViewById(R.id.BTLampadaQuartoLimpar);
		LAMPQLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText quarto_tempolamp = (EditText) findViewById(R.id.EDITLampadaQuartoTempo);
			EditText quarto_quantlamp = (EditText) findViewById(R.id.EDITLampadaQuartoQuant);
			EditText quarto_potlamp = (EditText) findViewById(R.id.EDITLampadaQuartoPotencia);

			quarto_tempolamp.setText("");
			quarto_quantlamp.setText("");
			quarto_potlamp.setText("");
			}});

	}
	
	public void CarregaTelaPC() {
		setContentView(R.layout.pc);

		Button PCVoltar = (Button) findViewById(R.id.BTPCVoltar);
		PCVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText quarto_tempopc = (EditText) findViewById(R.id.EDITPCTempo);
				EditText quarto_quantpc = (EditText) findViewById(R.id.EDITPCQuant);
				EditText quarto_potpc = (EditText) findViewById(R.id.EDITPCPotencia);

				if (quarto_tempopc.getText() == null
						|| quarto_tempopc.getText().length() == 0
						|| quarto_tempopc.getText().equals("0")) {
					quarto_tempopc.setText("0");
				} else {
					//
				}

				if (quarto_quantpc.getText() == null
						|| quarto_quantpc.getText().length() == 0
						|| quarto_quantpc.getText().equals("0")) {
					quarto_quantpc.setText("0");
				} else {
					//
				}

				if (quarto_potpc.getText() == null
						|| quarto_potpc.getText().length() == 0
						|| quarto_potpc.getText().equals("0")) {
					quarto_potpc.setText("0");
				} else {
					//
				}

				quarto_tpc = Float.parseFloat(quarto_tempopc.getText()
						.toString());
				quarto_qpc = Float.parseFloat(quarto_quantpc.getText()
						.toString());
				quarto_ppc = Float
						.parseFloat(quarto_potpc.getText().toString());

				CarregaTelaQuarto();
			}
		});
		
		Button PCLimpar = (Button) findViewById(R.id.BTPCLimpar);
		PCLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText quarto_tempopc = (EditText) findViewById(R.id.EDITPCTempo);
			EditText quarto_quantpc = (EditText) findViewById(R.id.EDITPCQuant);
			EditText quarto_potpc = (EditText) findViewById(R.id.EDITPCPotencia);

			quarto_tempopc.setText("");
			quarto_quantpc.setText("");
			quarto_potpc.setText("");
			}});

	}
	
	public void CarregaTelaVentilador() {
		setContentView(R.layout.ventilador);

		Button VENTVoltar = (Button) findViewById(R.id.BTVentiladorVoltar);
		VENTVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText quarto_tempovent = (EditText) findViewById(R.id.EDITVentiladorTempo);
				EditText quarto_quantvent = (EditText) findViewById(R.id.EDITVentiladorQuant);
				EditText quarto_potvent = (EditText) findViewById(R.id.EDITVentiladorPotencia);

				if (quarto_tempovent.getText() == null
						|| quarto_tempovent.getText().length() == 0
						|| quarto_tempovent.getText().equals("0")) {
					quarto_tempovent.setText("0");
				} else {
					//
				}

				if (quarto_quantvent.getText() == null
						|| quarto_quantvent.getText().length() == 0
						|| quarto_quantvent.getText().equals("0")) {
					quarto_quantvent.setText("0");
				} else {
					//
				}

				if (quarto_potvent.getText() == null
						|| quarto_potvent.getText().length() == 0
						|| quarto_potvent.getText().equals("0")) {
					quarto_potvent.setText("0");
				} else {
					//
				}

				quarto_tvent = Float.parseFloat(quarto_tempovent.getText()
						.toString());
				quarto_qvent = Float.parseFloat(quarto_quantvent.getText()
						.toString());
				quarto_pvent = Float
						.parseFloat(quarto_potvent.getText().toString());

				CarregaTelaQuarto();
			}
		});
		
		Button VentLimpar = (Button) findViewById(R.id.BTVentiladorLimpar);
		VentLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText quarto_tempovent = (EditText) findViewById(R.id.EDITVentiladorTempo);
			EditText quarto_quantvent = (EditText) findViewById(R.id.EDITVentiladorQuant);
			EditText quarto_potvent = (EditText) findViewById(R.id.EDITVentiladorPotencia);

			quarto_tempovent.setText("");
			quarto_quantvent.setText("");
			quarto_potvent.setText("");
			}});

	}
	
	

	
	
	//Chama a tela da Cozinha

	public void CarregaTelaCozinha() {

		setContentView(R.layout.lista_cozinha);

		Button btmainC = (Button) findViewById(R.id.BTCozinhaVoltar);
		btmainC.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				CarregaTelaInicio();
			}
		});

		Button chamaLAMPC = (Button) findViewById(R.id.BTChamaLampCozinha);
		chamaLAMPC.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaLampCozinha();
			}
		});

		Button chamaMICRO = (Button) findViewById(R.id.BTChamaMicroondas);
		chamaMICRO.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaMicroondas();
			}
		});

		Button chamaBAT = (Button) findViewById(R.id.BTChamaBatedeira);
		chamaBAT.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaBatedeira();
			}
		});

		Button chamaGELA = (Button) findViewById(R.id.BTChamaGeladeira);
		chamaGELA.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaGeladeira();
			}
		});

	}
	
	//Apps da cozinha
	
	public void CarregaTelaLampCozinha() {
		
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

				CarregaTelaCozinha();
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

	}

	public void CarregaTelaGeladeira() {
		
		setContentView(R.layout.geladeira);

		Button GELAVoltar = (Button) findViewById(R.id.BTGeladeiraVoltar);
		GELAVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText cozinha_tempogela = (EditText) findViewById(R.id.EDITGeladeiraTempo);
				EditText cozinha_quantgela = (EditText) findViewById(R.id.EDITGeladeiraQuant);
				EditText cozinha_potgela = (EditText) findViewById(R.id.EDITGeladeiraPotencia);

				if (cozinha_tempogela.getText() == null
						|| cozinha_tempogela.getText().length() == 0
						|| cozinha_tempogela.getText().equals("0")) {
					cozinha_tempogela.setText("0");
				} else {
					//
				}

				if (cozinha_quantgela.getText() == null
						|| cozinha_quantgela.getText().length() == 0
						|| cozinha_quantgela.getText().equals("0")) {
					cozinha_quantgela.setText("0");
				} else {
					//
				}

				if (cozinha_potgela.getText() == null
						|| cozinha_potgela.getText().length() == 0
						|| cozinha_potgela.getText().equals("0")) {
					cozinha_potgela.setText("0");
				} else {
					//
				}

				cozinha_tgela = Float.parseFloat(cozinha_tempogela.getText()
						.toString());
				cozinha_qgela = Float.parseFloat(cozinha_quantgela.getText()
						.toString());
				cozinha_pgela = Float
						.parseFloat(cozinha_potgela.getText().toString());

				CarregaTelaCozinha();
			}
		});
		
		Button GelaLimpar = (Button) findViewById(R.id.BTGeladeiraLimpar);
		GelaLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText cozinha_tempogela = (EditText) findViewById(R.id.EDITGeladeiraTempo);
			EditText cozinha_quantgela = (EditText) findViewById(R.id.EDITGeladeiraQuant);
			EditText cozinha_potgela = (EditText) findViewById(R.id.EDITGeladeiraPotencia);

			cozinha_tempogela.setText("");
			cozinha_quantgela.setText("");
			cozinha_potgela.setText("");
			}});

	}
	
	public void CarregaTelaMicroondas() {
		
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

				CarregaTelaCozinha();
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

	}
	
	public void CarregaTelaBatedeira() {
		
		setContentView(R.layout.batedeira);

		Button BATVoltar = (Button) findViewById(R.id.BTBatedeiraVoltar);
		BATVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText cozinha_tempobate = (EditText) findViewById(R.id.EDITBatedeiraTempo);
				EditText cozinha_quantbate = (EditText) findViewById(R.id.EDITBatedeiraQuant);
				EditText cozinha_potbate = (EditText) findViewById(R.id.EDITBatedeiraPotencia);

				if (cozinha_tempobate.getText() == null
						|| cozinha_tempobate.getText().length() == 0
						|| cozinha_tempobate.getText().equals("0")) {
					cozinha_tempobate.setText("0");
				} else {
					//
				}

				if (cozinha_quantbate.getText() == null
						|| cozinha_quantbate.getText().length() == 0
						|| cozinha_quantbate.getText().equals("0")) {
					cozinha_quantbate.setText("0");
				} else {
					//
				}

				if (cozinha_potbate.getText() == null
						|| cozinha_potbate.getText().length() == 0
						|| cozinha_potbate.getText().equals("0")) {
					cozinha_potbate.setText("0");
				} else {
					//
				}

				cozinha_tbate = Float.parseFloat(cozinha_tempobate.getText()
						.toString());
				cozinha_qbate = Float.parseFloat(cozinha_quantbate.getText()
						.toString());
				cozinha_pbate = Float
						.parseFloat(cozinha_potbate.getText().toString());

				CarregaTelaCozinha();
			}
		});
		
		Button BateLimpar = (Button) findViewById(R.id.BTBatedeiraLimpar);
		BateLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText cozinha_tempobate = (EditText) findViewById(R.id.EDITBatedeiraTempo);
			EditText cozinha_quantbate = (EditText) findViewById(R.id.EDITBatedeiraQuant);
			EditText cozinha_potbate = (EditText) findViewById(R.id.EDITBatedeiraPotencia);

			cozinha_tempobate.setText("");
			cozinha_quantbate.setText("");
			cozinha_potbate.setText("");
			}});

	}
	
	
	
	//Chama a tela do banheiro
	
	public void CarregaTelaBanheiro() {

		setContentView(R.layout.lista_banheiro);

		Button btmainB = (Button) findViewById(R.id.BTBanheiroVoltar);
		btmainB.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaInicio();
			}
		});

		Button chamaLAMPB = (Button) findViewById(R.id.BTChamaLampBanheiro);
		chamaLAMPB.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaLampBanheiro();
			}
		});

		Button chamaCHUV = (Button) findViewById(R.id.BTChamaChuveiro);
		chamaCHUV.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaChuveiro();
			}
		});

		Button chamaSEC = (Button) findViewById(R.id.BTChamaSecador);
		chamaSEC.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaSecador();
			}
		});

		Button chamaBARB = (Button) findViewById(R.id.BTChamaBarbeador);
		chamaBARB.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaBarbeador();
			}
		});

	}
	
	public void CarregaTelaLampBanheiro() {
		
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

				CarregaTelaBanheiro();
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

	}
	
	public void CarregaTelaChuveiro() {
		
		setContentView(R.layout.chuveiro);

		Button CHUVoltar = (Button) findViewById(R.id.BTChuveiroVoltar);
		CHUVoltar.setOnClickListener(new View.OnClickListener() {

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

				CarregaTelaBanheiro();
			}
		});
		
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

	}

	public void CarregaTelaSecador() {
		
		setContentView(R.layout.secador);

		Button SECVoltar = (Button) findViewById(R.id.BTSecadorVoltar);
		SECVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText banheiro_temposec = (EditText) findViewById(R.id.EDITSecadorTempo);
				EditText banheiro_quantsec = (EditText) findViewById(R.id.EDITSecadorQuant);
				EditText banheiro_potsec = (EditText) findViewById(R.id.EDITSecadorPotencia);

				if (banheiro_temposec.getText() == null
						|| banheiro_temposec.getText().length() == 0
						|| banheiro_temposec.getText().equals("0")) {
					banheiro_temposec.setText("0");
				} else {
					//
				}

				if (banheiro_quantsec.getText() == null
						|| banheiro_quantsec.getText().length() == 0
						|| banheiro_quantsec.getText().equals("0")) {
					banheiro_quantsec.setText("0");
				} else {
					//
				}

				if (banheiro_potsec.getText() == null
						|| banheiro_potsec.getText().length() == 0
						|| banheiro_potsec.getText().equals("0")) {
					banheiro_potsec.setText("0");
				} else {
					//
				}

				banheiro_tsec = Float.parseFloat(banheiro_temposec.getText()
						.toString());
				banheiro_qsec = Float.parseFloat(banheiro_quantsec.getText()
						.toString());
				banheiro_psec = Float
						.parseFloat(banheiro_potsec.getText().toString());

				CarregaTelaBanheiro();
			}
		});
		
		Button ChuvLimpar = (Button) findViewById(R.id.BTChuveiroLimpar);
		ChuvLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText banheiro_temposec = (EditText) findViewById(R.id.EDITSecadorTempo);
			EditText banheiro_quantsec = (EditText) findViewById(R.id.EDITSecadorQuant);
			EditText banheiro_potsec = (EditText) findViewById(R.id.EDITSecadorPotencia);

			banheiro_temposec.setText("");
			banheiro_quantsec.setText("");
			banheiro_potsec.setText("");
			}});

	}
	
	public void CarregaTelaBarbeador() {
		
		setContentView(R.layout.barbeador);

		Button BARBVoltar = (Button) findViewById(R.id.BTBarbeadorVoltar);
		BARBVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText banheiro_tempobarb = (EditText) findViewById(R.id.EDITBarbeadorTempo);
				EditText banheiro_quantbarb = (EditText) findViewById(R.id.EDITBarbeadorQuant);
				EditText banheiro_potbarb = (EditText) findViewById(R.id.EDITBarbeadorPotencia);

				if (banheiro_tempobarb.getText() == null
						|| banheiro_tempobarb.getText().length() == 0
						|| banheiro_tempobarb.getText().equals("0")) {
					banheiro_tempobarb.setText("0");
				} else {
					//
				}

				if (banheiro_quantbarb.getText() == null
						|| banheiro_quantbarb.getText().length() == 0
						|| banheiro_quantbarb.getText().equals("0")) {
					banheiro_quantbarb.setText("0");
				} else {
					//
				}

				if (banheiro_potbarb.getText() == null
						|| banheiro_potbarb.getText().length() == 0
						|| banheiro_potbarb.getText().equals("0")) {
					banheiro_potbarb.setText("0");
				} else {
					//
				}

				banheiro_tbarb = Float.parseFloat(banheiro_tempobarb.getText()
						.toString());
				banheiro_qbarb = Float.parseFloat(banheiro_quantbarb.getText()
						.toString());
				banheiro_pbarb = Float
						.parseFloat(banheiro_potbarb.getText().toString());

				CarregaTelaBanheiro();
			}
		});
		
		Button BarbLimpar = (Button) findViewById(R.id.BTBarbeadorLimpar);
		BarbLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText banheiro_tempobarb = (EditText) findViewById(R.id.EDITBarbeadorTempo);
			EditText banheiro_quantbarb = (EditText) findViewById(R.id.EDITBarbeadorQuant);
			EditText banheiro_potbarb = (EditText) findViewById(R.id.EDITBarbeadorPotencia);

			banheiro_tempobarb.setText("");
			banheiro_quantbarb.setText("");
			banheiro_potbarb.setText("");
			}});

	}
	
	
	
	
	
	
	
	
	
	
	public void CarregaTelaSala() {
		setContentView(R.layout.lista_sala);

		Button btmainS = (Button) findViewById(R.id.BTSalaVoltar);
		btmainS.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaInicio();
			}
		});

		Button chamaLAMPSALA = (Button) findViewById(R.id.BTChamaLampSala);
		chamaLAMPSALA.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaLampSala();
			}
		});

		Button chamaTVS = (Button) findViewById(R.id.BTChamaTVSala);
		chamaTVS.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaTVSala();
			}
		});

		Button chamaDVD = (Button) findViewById(R.id.BTChamaDVD);
		chamaDVD.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaDVD();
			}
		});

		Button chamaSOM = (Button) findViewById(R.id.BTChamaSom);
		chamaSOM.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				CarregaTelaSom();
			}
		});

	}

	
	public void CarregaTelaLampSala() {
		
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

				CarregaTelaSala();
			}
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

	}
	
	public void CarregaTelaTVSala() {
		
		setContentView(R.layout.tvsala);

		Button TVSVoltar = (Button) findViewById(R.id.BTTVSalaVoltar);
		TVSVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText sala_tempotv = (EditText) findViewById(R.id.EDITTVSalaTempo);
				EditText sala_quanttv = (EditText) findViewById(R.id.EDITTVSalaQuant);
				EditText sala_pottv = (EditText) findViewById(R.id.EDITTVSalaPotencia);

				if (sala_tempotv.getText() == null
						|| sala_tempotv.getText().length() == 0
						|| sala_tempotv.getText().equals("0")) {
					sala_tempotv.setText("0");
				} else {
					//
				}

				if (sala_quanttv.getText() == null
						|| sala_quanttv.getText().length() == 0
						|| sala_quanttv.getText().equals("0")) {
					sala_quanttv.setText("0");
				} else {
					//
				}

				if (sala_pottv.getText() == null
						|| sala_pottv.getText().length() == 0
						|| sala_pottv.getText().equals("0")) {
					sala_pottv.setText("0");
				} else {
					//
				}

				sala_ttv = Float.parseFloat(sala_tempotv.getText()
						.toString());
				sala_qtv = Float.parseFloat(sala_quanttv.getText()
						.toString());
				sala_ptv = Float
						.parseFloat(sala_pottv.getText().toString());

				CarregaTelaSala();
			}
		});
		
		Button TVSLimpar = (Button) findViewById(R.id.BTTVSalaLimpar);
		TVSLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText sala_tempotv = (EditText) findViewById(R.id.EDITTVSalaTempo);
			EditText sala_quanttv = (EditText) findViewById(R.id.EDITTVSalaQuant);
			EditText sala_pottv = (EditText) findViewById(R.id.EDITTVSalaPotencia);

			sala_tempotv.setText("");
			sala_quanttv.setText("");
			sala_pottv.setText("");
			}});

	}
	
	public void CarregaTelaDVD() {
		
		setContentView(R.layout.dvd);

		Button DVDVoltar = (Button) findViewById(R.id.BTDVDVoltar);
		DVDVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText sala_tempodvd = (EditText) findViewById(R.id.EDITDVDTempo);
				EditText sala_quantdvd = (EditText) findViewById(R.id.EDITDVDQuant);
				EditText sala_potdvd = (EditText) findViewById(R.id.EDITDVDPotencia);

				if (sala_tempodvd.getText() == null
						|| sala_tempodvd.getText().length() == 0
						|| sala_tempodvd.getText().equals("0")) {
					sala_tempodvd.setText("0");
				} else {
					//
				}

				if (sala_quantdvd.getText() == null
						|| sala_quantdvd.getText().length() == 0
						|| sala_quantdvd.getText().equals("0")) {
					sala_quantdvd.setText("0");
				} else {
					//
				}

				if (sala_potdvd.getText() == null
						|| sala_potdvd.getText().length() == 0
						|| sala_potdvd.getText().equals("0")) {
					sala_potdvd.setText("0");
				} else {
					//
				}

				sala_tdvd = Float.parseFloat(sala_tempodvd.getText()
						.toString());
				sala_qdvd = Float.parseFloat(sala_quantdvd.getText()
						.toString());
				sala_pdvd = Float
						.parseFloat(sala_potdvd.getText().toString());

				CarregaTelaSala();
			}
		});
		
		Button DVDLimpar = (Button) findViewById(R.id.BTDVDLimpar);
		DVDLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText sala_tempodvd = (EditText) findViewById(R.id.EDITDVDTempo);
			EditText sala_quantdvd = (EditText) findViewById(R.id.EDITDVDQuant);
			EditText sala_potdvd = (EditText) findViewById(R.id.EDITDVDPotencia);

			sala_tempodvd.setText("");
			sala_quantdvd.setText("");
			sala_potdvd.setText("");
			}});

	}
	
	public void CarregaTelaSom() {
		
		setContentView(R.layout.som);

		Button SOMVoltar = (Button) findViewById(R.id.BTSomVoltar);
		SOMVoltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {

				EditText sala_temposom = (EditText) findViewById(R.id.EDITSomTempo);
				EditText sala_quantsom = (EditText) findViewById(R.id.EDITSomQuant);
				EditText sala_potsom = (EditText) findViewById(R.id.EDITSomPotencia);

				if (sala_temposom.getText() == null
						|| sala_temposom.getText().length() == 0
						|| sala_temposom.getText().equals("0")) {
					sala_temposom.setText("0");
				} else {
					//
				}

				if (sala_quantsom.getText() == null
						|| sala_quantsom.getText().length() == 0
						|| sala_quantsom.getText().equals("0")) {
					sala_quantsom.setText("0");
				} else {
					//
				}

				if (sala_potsom.getText() == null
						|| sala_potsom.getText().length() == 0
						|| sala_potsom.getText().equals("0")) {
					sala_potsom.setText("0");
				} else {
					//
				}

				sala_tsom = Float.parseFloat(sala_temposom.getText()
						.toString());
				sala_qsom = Float.parseFloat(sala_quantsom.getText()
						.toString());
				sala_psom = Float
						.parseFloat(sala_potsom.getText().toString());

				CarregaTelaSala();
			}
		});
		
		Button SomLimpar = (Button) findViewById(R.id.BTSomLimpar);
		SomLimpar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
		
			EditText sala_temposom = (EditText) findViewById(R.id.EDITSomTempo);
			EditText sala_quantsom = (EditText) findViewById(R.id.EDITSomQuant);
			EditText sala_potsom = (EditText) findViewById(R.id.EDITSomPotencia);

			sala_temposom.setText("");
			sala_quantsom.setText("");
			sala_potsom.setText("");
			}});

	}
	
	
	
	
	
	//////////////////////////////////////////
	
	public void CarregaTelaAjuda() {
		setContentView(R.layout.ajuda);
		
		Button btsobre = (Button) findViewById(R.id.BTSobre);
		btsobre.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaSobre();
			}
		});

		Button btmainA = (Button) findViewById(R.id.BTAjudaVoltar);
		btmainA.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaPrincipal();
			}
		});
	}
	
	public void CarregaTelaSobre() {
		setContentView(R.layout.sobre);
		
		Button btSobreVoltar = (Button) findViewById(R.id.BTSobreVoltar);
		btSobreVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaAjuda();
			}
		});
	}
	
	public void CarregaTelaConfig() {
		setContentView(R.layout.configuracoes);
		
		Button btConfigVoltar = (Button) findViewById(R.id.BTConfiguracoesVoltar);
		btConfigVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaPrincipal();
			}
		});
	}

	public void CarregaTelaCalculo() {
		setContentView(R.layout.calculo_absolut);
		
		//calculos do quarto:
		
		quarto_kwh_tv = (quarto_ttv*30)*quarto_ptv/1000;
		quarto_kwh_lamp = (quarto_tlamp*30)*quarto_plamp/1000;
		quarto_kwh_pc = (quarto_tpc*30)*quarto_ppc/1000;
		quarto_kwh_vent = (quarto_tvent*30)*quarto_pvent/1000;
		
		quarto_gasto_tv = (quarto_kwh_tv*tarifa)*quarto_qtv;
		quarto_gasto_lamp = (quarto_kwh_lamp*tarifa)*quarto_qlamp;
		quarto_gasto_pc = (quarto_kwh_pc*tarifa)*quarto_qpc;
		quarto_gasto_vent = (quarto_kwh_vent*tarifa)*quarto_qvent;
		
		total_quarto_kwh = quarto_kwh_tv + quarto_kwh_lamp + quarto_kwh_pc + quarto_kwh_vent;
		total_gasto_quarto = quarto_gasto_tv + quarto_gasto_lamp + quarto_gasto_pc + quarto_gasto_vent;
		
		EditText GastoQuarto = (EditText) findViewById(R.id.EDITCalcQuarto);
		
		if (total_gasto_quarto == 0 && total_quarto_kwh == 0) {
			GastoQuarto.setText("");
		}else{
			GastoQuarto.setText(Dingo.getValorFormatado(total_gasto_quarto));
		}
		
		//calculos da sala
		
		sala_kwh_tv = (sala_ttv*30)*sala_ptv/1000;
		sala_kwh_lamp = (sala_tlamp*30)*sala_plamp/1000;
		sala_kwh_som = (sala_tsom*30)*sala_psom/1000;
		sala_kwh_dvd = (sala_tdvd*30)*sala_pdvd/1000;
		
		sala_gasto_tv = (sala_kwh_tv*tarifa)*sala_qtv;
		sala_gasto_lamp = (sala_kwh_lamp*tarifa)*sala_qlamp;
		sala_gasto_som = (sala_kwh_som*tarifa)*sala_qsom;
		sala_gasto_dvd = (sala_kwh_dvd*tarifa)*sala_qdvd;
		
		total_sala_kwh = sala_kwh_tv + sala_kwh_lamp + sala_kwh_som + sala_kwh_dvd;
		total_gasto_sala = sala_gasto_tv + sala_gasto_lamp + sala_gasto_som + sala_gasto_dvd;
		
		EditText GastoSala = (EditText) findViewById(R.id.EDITCalcSala);
		
		if (total_gasto_sala == 0) {
			GastoSala.setText("");
		}else{
			GastoSala.setText(Dingo.getValorFormatado(total_gasto_sala));
		}
		
		
		//calculos da cozinha
		
		cozinha_kwh_gela = (cozinha_tgela*30)*cozinha_pgela/1000;
		cozinha_kwh_bate = (cozinha_tbate*30)*cozinha_pbate/1000;
		cozinha_kwh_micro = (cozinha_tmicro*30)*cozinha_pmicro/1000;
		cozinha_kwh_lamp = (cozinha_tlamp*30)*cozinha_plamp/1000;
		
		cozinha_gasto_gela = (cozinha_kwh_gela*tarifa)*cozinha_qgela;
		cozinha_gasto_bate = (cozinha_kwh_bate*tarifa)*cozinha_qbate;
		cozinha_gasto_micro = (cozinha_kwh_micro*tarifa)*cozinha_qmicro;
		cozinha_gasto_lamp = (cozinha_kwh_lamp*tarifa)*cozinha_qlamp;
		
		total_cozinha_kwh = cozinha_kwh_gela + cozinha_kwh_bate + cozinha_kwh_micro + cozinha_kwh_lamp;
		total_gasto_cozinha = cozinha_gasto_gela + cozinha_gasto_bate + cozinha_gasto_micro + cozinha_gasto_lamp;
		
		EditText GastoCozinha = (EditText) findViewById(R.id.EDITCalcCozinha);
		
		if (total_gasto_cozinha == 0) {
			GastoCozinha.setText("");
		}else{
			GastoCozinha.setText(Dingo.getValorFormatado(total_gasto_cozinha));
		}
		
		
		//calculos do banheiro
		
		banheiro_kwh_chuv = (banheiro_tchuv*30)*banheiro_pchuv/1000;
		banheiro_kwh_barb = (banheiro_tbarb*30)*banheiro_pbarb/1000;
		banheiro_kwh_sec = (banheiro_tsec*30)*banheiro_psec/1000;
		banheiro_kwh_lamp = (banheiro_tlamp*30)*banheiro_plamp/1000;
		
		banheiro_gasto_chuv = (banheiro_kwh_chuv*tarifa)*banheiro_qchuv;
		banheiro_gasto_barb = (banheiro_kwh_barb*tarifa)*banheiro_qbarb;
		banheiro_gasto_sec = (banheiro_kwh_sec*tarifa)*banheiro_qbarb;
		banheiro_gasto_lamp = (banheiro_kwh_lamp*tarifa)*banheiro_qlamp;
		
		total_banheiro_kwh = banheiro_kwh_chuv + banheiro_kwh_barb + banheiro_kwh_sec + banheiro_kwh_lamp;
		total_gasto_banheiro = banheiro_gasto_chuv + banheiro_gasto_barb + banheiro_gasto_sec + banheiro_gasto_lamp;
		
		EditText GastoBanheiro = (EditText) findViewById(R.id.EDITCalcBanheiro);
		
		if (total_gasto_banheiro == 0) {
			GastoBanheiro.setText("");
		}else{
			GastoBanheiro.setText(Dingo.getValorFormatado(total_gasto_banheiro));
		}
		
		//calculo geral
		
		total_casa_kwh = total_banheiro_kwh + total_cozinha_kwh + total_sala_kwh + total_quarto_kwh;
		total_gasto_casa = total_gasto_quarto + total_gasto_sala + total_gasto_cozinha + total_gasto_banheiro;
		
		EditText GastoTotal = (EditText) findViewById(R.id.EDITCalcGeral);
		
		if (total_gasto_casa == 0) {
			GastoTotal.setText("");
		}else{
			GastoTotal.setText(Dingo.getValorFormatado(total_gasto_casa));
		}
		
		
		TextView alerta = (TextView) findViewById(R.id.txtAlerta);
		TextView dica1 = (TextView) findViewById(R.id.viewDica1);
		TextView dica2 = (TextView) findViewById(R.id.viewDica2);
		TextView dica3 = (TextView) findViewById(R.id.viewDica3);
		
		//seta as textviews dos alertas
		
		if (total_gasto_quarto == 0 && total_gasto_sala == 0 && total_gasto_cozinha == 0 && total_gasto_banheiro == 0) {
			alerta.setText("");
			dica1.setText("");
			dica2.setText("");
			dica3.setText("");
		}else 
			if (total_gasto_quarto > total_gasto_sala && total_gasto_quarto > total_gasto_cozinha && total_gasto_quarto > total_gasto_banheiro) {
				dica1.setText("- O quarto está consumindo muita energia!");
				dica2.setText("- Evite deixar fios espalhados pelo chão!");
				dica3.setText("- Mantenha as luzes apagadas enquanto sair do quarto!");	
			}else if (total_gasto_sala > total_gasto_quarto && total_gasto_sala > total_gasto_cozinha && total_gasto_sala > total_gasto_banheiro) {
				dica1.setText("- A sala está consumindo muita energia!");
				dica2.setText("- Dica Sala 2");
				dica3.setText("- Dica Sala 3");
			}else if (total_gasto_cozinha > total_gasto_sala && total_gasto_cozinha > total_gasto_quarto && total_gasto_cozinha > total_gasto_banheiro) {
				dica1.setText("- A cozinha está consumindo muita energia!");
				dica2.setText("- Dica Cozinha 2");
				dica3.setText("- Dica Cozinha 3");
			}else if (total_gasto_banheiro > total_gasto_sala && total_gasto_banheiro > total_gasto_cozinha && total_gasto_banheiro > total_gasto_quarto) {
				dica1.setText("- O banheiro está consumindo muita energia!");
				dica2.setText("- Dica Banheiro 2");
				dica3.setText("- Dica Banheiro 3");
			}
		
		Button mudar = (Button) findViewById(R.id.btMudar);
		mudar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {

				

				Button mudar = (Button) findViewById(R.id.btMudar);
				if (total_gasto_casa == 0) {
					
				}else if (total_gasto_casa != 0){
				if (mudar.getText() == "Valor") {
					mudar.setText("kW/h");
					
					EditText GastoQuarto = (EditText) findViewById(R.id.EDITCalcQuarto);
					GastoQuarto.setText(Dingo.getValorFormatado(total_gasto_quarto));
					
					EditText GastoSala = (EditText) findViewById(R.id.EDITCalcSala);
					GastoSala.setText(Dingo.getValorFormatado(total_gasto_sala));
					
					EditText GastoCozinha = (EditText) findViewById(R.id.EDITCalcCozinha);
					GastoCozinha.setText(Dingo.getValorFormatado(total_gasto_cozinha));
					
					EditText GastoBanheiro = (EditText) findViewById(R.id.EDITCalcBanheiro);
					GastoBanheiro.setText(Dingo.getValorFormatado(total_gasto_banheiro));
					
					EditText GastoTotal = (EditText) findViewById(R.id.EDITCalcGeral);
					GastoTotal.setText(Dingo.getValorFormatado(total_gasto_casa));
					
				}else{
					mudar.setText("Valor");
					
					EditText GastoQuarto = (EditText) findViewById(R.id.EDITCalcQuarto);
					GastoQuarto.setText(Dingo.getKWFormatado(total_quarto_kwh));
					
					EditText GastoSala = (EditText) findViewById(R.id.EDITCalcSala);
					GastoSala.setText(Dingo.getKWFormatado(total_sala_kwh));
					
					EditText GastoCozinha = (EditText) findViewById(R.id.EDITCalcCozinha);
					GastoCozinha.setText(Dingo.getKWFormatado(total_cozinha_kwh));
					
					EditText GastoBanheiro = (EditText) findViewById(R.id.EDITCalcBanheiro);
					GastoBanheiro.setText(Dingo.getKWFormatado(total_banheiro_kwh));
					
					EditText GastoTotal = (EditText) findViewById(R.id.EDITCalcGeral);
					GastoTotal.setText(Dingo.getKWFormatado(total_casa_kwh));
					
					
				}
				}
		}});
		


		Button btvoltarC = (Button) findViewById(R.id.BTCalcVoltar);
		btvoltarC.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaInicio();
			}
		});
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		CarregaTelaPrincipal();
	}
	
	private static String getKWFormatado(Float f) {
		if (f != 0) {
		DecimalFormat df = new DecimalFormat("00 kW/h");
		return df.format(f);
		} else {
			return null;
		}
	}
	

	private static String getValorFormatado(Float f) {
		if (f != 0) {
		Locale.setDefault(new Locale("pt", "BR"));
		DecimalFormat df = new DecimalFormat("R$ 00.00");
		return df.format(f);
		} else {
			return null;
		}
	}

}