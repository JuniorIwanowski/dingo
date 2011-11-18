package br.com.wacoo;

import java.text.DecimalFormat;
import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;

public class Dingo extends Activity {

	public float tarifa = 0.37554F;

	public ListView lista;

	// EditTexts e variaveis do QUARTO:

	public EditText quarto_tempolamp;
	public EditText quarto_quantlamp;
	public EditText quarto_potlamp;

	public EditText quarto_tempotv;
	public EditText quarto_quanttv;
	public EditText quarto_pottv;

	public EditText quarto_tempopc;
	public EditText quarto_quantpc;
	public EditText quarto_potpc;

	public EditText quarto_tempovent;
	public EditText quarto_quantvent;
	public EditText quarto_potvent;

	// ///////

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
	public float quarto_gasto_lamp;
	public float quarto_gasto_pc;
	public float quarto_gasto_vent;
	public float total_gasto_quarto;

	public EditText GastoQuarto;

	// EditTexts e variaves da SALA

	public EditText sala_tempolamp;
	public EditText sala_quantlamp;
	public EditText sala_potlamp;
	
	public EditText sala_tempotv;
	public EditText sala_quanttv;
	public EditText sala_pottv;
	
	public EditText sala_temposom;
	public EditText sala_quantsom;
	public EditText sala_potsom;
	
	public EditText sala_tempodvd;
	public EditText sala_quantdvd;
	public EditText sala_potdvd;

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
	public float sala_gasto_lamp;
	public float sala_gasto_som;
	public float sala_gasto_dvd;
	public float total_gasto_sala;

	public EditText GastoSala;

	// EditTexts e variaves da COZINHA

	public EditText cozinha_tempogela;
	public EditText cozinha_quantgela;
	public EditText cozinha_pottgela;
	
	public EditText cozinha_tempobate;
	public EditText cozinha_quantbate;
	public EditText cozinha_potbate;
	
	public EditText cozinha_tempomicro;
	public EditText cozinha_quantmicro;
	public EditText cozinha_potmicro;

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
	public float cozinha_gasto_bate;
	public float cozinha_gasto_micro;
	public float cozinha_gasto_lamp;
	public float total_gasto_cozinha;

	public EditText GastoCozinha;

	// variaves e EditTexts do banheiro

	public EditText banheiro_tempochuv;
	public EditText banheiro_quantchuv;
	public EditText banheiro_potchuv;
	
	public EditText banheiro_tempobarb;
	public EditText banheiro_quantbarb;
	public EditText banheiro_potbarb;
	
	public EditText banheiro_temposec;
	public EditText banheiro_quantsec;
	public EditText banheiro_potsec;
	
	public EditText banheiro_tempolamp;
	public EditText banheiro_quantlamp;
	public EditText banheiro_potlamp;

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
	public float banheiro_gasto_barb;
	public float banheiro_gasto_sec;
	public float banheiro_gasto_lamp;
	public float total_gasto_banheiro;

	public EditText GastoBanheiro;

	////////////

	public TextView dica1;
	public TextView dica2;
	public TextView dica3;

	////////////

	public EditText GastoTotal;
	public float total_gasto_casa;
	
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
	}

	public void CarregaTelaInicio() {
		setContentView(R.layout.inicio);

		Button btVoltar = (Button) findViewById(R.id.btVoltar);
		btVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaPrincipal();
			}
		});

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, comodos);
		lista = (ListView) findViewById(R.id.listComodos);
		lista.setAdapter(adapter);

		lista.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				if (position == 0) {
					CarregaTelaSala();
				} else if (position == 1) {
					CarregaTelaQuarto();
				} else if (position == 2) {
					CarregaTelaCozinha();
				} else if (position == 3) {
					CarregaTelaBanheiro();
				}
			}
		});

		Button btcalcular = (Button) findViewById(R.id.btCalcular);
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

	}
	
	
	
	
	
	//////////////////////////////////////////
	
	public void CarregaTelaAjuda() {
		setContentView(R.layout.ajuda);

		Button btmainA = (Button) findViewById(R.id.BTAjudaVoltar);
		btmainA.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				CarregaTelaPrincipal();
			}
		});
	}

	public void CarregaTelaCalculo() {
		setContentView(R.layout.calculo_absolut);
		
		//calculos do quarto:
		
		quarto_gasto_tv = (((quarto_ttv*30)*quarto_ptv/1000)*tarifa)*quarto_qtv;
		quarto_gasto_lamp = (((quarto_tlamp*30)*quarto_plamp/1000)*tarifa)*quarto_qlamp;
		quarto_gasto_pc = (((quarto_tpc*30)*quarto_ppc/1000)*tarifa)*quarto_qpc;
		quarto_gasto_vent = (((quarto_tvent*30)*quarto_pvent/1000)*tarifa)*quarto_qvent;
		
		total_gasto_quarto = quarto_gasto_tv + quarto_gasto_lamp + quarto_gasto_pc + quarto_gasto_vent;
		
		EditText GastoQuarto = (EditText) findViewById(R.id.EDITCalcQuarto);
		GastoQuarto.setText(Dingo.getValorFormatado(total_gasto_quarto));
		
		//calculos da sala
		
		sala_gasto_tv = (((sala_ttv*30)*sala_ptv/1000)*tarifa)*sala_qtv;
		sala_gasto_lamp = (((sala_tlamp*30)*sala_plamp/1000)*tarifa)*sala_qlamp;
		sala_gasto_som = (((sala_tsom*30)*sala_psom/1000)*tarifa)*sala_qsom;
		sala_gasto_dvd = (((sala_tdvd*30)*sala_pdvd/1000)*tarifa)*sala_qdvd;
		
		total_gasto_sala = sala_gasto_tv + sala_gasto_lamp + sala_gasto_som + sala_gasto_dvd;
		
		EditText GastoSala = (EditText) findViewById(R.id.EDITCalcSala);
		GastoSala.setText(Dingo.getValorFormatado(total_gasto_sala));
		
		//calculos da cozinha
		
		cozinha_gasto_gela = (((cozinha_tgela*30)*cozinha_pgela/1000)*tarifa)*cozinha_qgela;
		cozinha_gasto_bate = (((cozinha_tbate*30)*cozinha_pbate/1000)*tarifa)*cozinha_qbate;
		cozinha_gasto_micro = (((cozinha_tmicro*30)*cozinha_pmicro/1000)*tarifa)*cozinha_qmicro;
		cozinha_gasto_lamp = (((cozinha_tlamp*30)*cozinha_plamp/1000)*tarifa)*cozinha_qlamp;
		
		total_gasto_cozinha = cozinha_gasto_gela + cozinha_gasto_bate + cozinha_gasto_micro + cozinha_gasto_lamp;
		
		EditText GastoCozinha = (EditText) findViewById(R.id.EDITCalcCozinha);
		GastoCozinha.setText(Dingo.getValorFormatado(total_gasto_cozinha));
		
		//calculos do banheiro
		
		banheiro_gasto_chuv = (((banheiro_tchuv*30)*banheiro_pchuv/1000)*tarifa)*banheiro_qchuv;
		banheiro_gasto_barb = (((banheiro_tbarb*30)*banheiro_pbarb/1000)*tarifa)*banheiro_qbarb;
		banheiro_gasto_sec = (((banheiro_tsec*30)*banheiro_psec/1000)*tarifa)*banheiro_qbarb;
		banheiro_gasto_lamp = (((banheiro_tlamp*30)*banheiro_plamp/1000)*tarifa)*banheiro_qlamp;
		
		total_gasto_banheiro = banheiro_gasto_chuv + banheiro_gasto_barb + banheiro_gasto_sec + banheiro_gasto_lamp;
		
		EditText GastoBanheiro = (EditText) findViewById(R.id.EDITCalcBanheiro);
		GastoBanheiro.setText(Dingo.getValorFormatado(total_gasto_banheiro));
		
		//calculo geral
		
		total_gasto_casa = total_gasto_quarto + total_gasto_sala + total_gasto_cozinha + total_gasto_banheiro;
		
		EditText GastoTotal = (EditText) findViewById(R.id.EDITCalcGeral);
		GastoTotal.setText(Dingo.getValorFormatado(total_gasto_casa));
		
		TextView dica1 = (TextView) findViewById(R.id.viewDica1);
		TextView dica2 = (TextView) findViewById(R.id.viewDica2);
		TextView dica3 = (TextView) findViewById(R.id.viewDica3);
		
		//seta as textviews dos alertas
		
			if (total_gasto_quarto > total_gasto_sala && total_gasto_quarto > total_gasto_cozinha && total_gasto_quarto > total_gasto_banheiro) {
				dica1.setText("- O quarto está consumindo muita energia. Cuidado!");
				dica2.setText("- Evite deixar fios espalhados pelo chão. Isso pode causar acidentes!");
				dica3.setText("- Mantenha as luzes apagadas enquanto sair do quarto!");	
			}else if (total_gasto_sala > total_gasto_quarto && total_gasto_sala > total_gasto_cozinha && total_gasto_sala > total_gasto_banheiro) {
				dica1.setText("- A sala está consumindo muita energia. Cuidado!");
				dica2.setText("- Dica Sala 2");
				dica3.setText("- Dica Sala 3");
			}else if (total_gasto_cozinha > total_gasto_sala && total_gasto_cozinha > total_gasto_quarto && total_gasto_cozinha > total_gasto_banheiro) {
				dica1.setText("- A cozinha está consumindo muita energia. Cuidado!");
				dica2.setText("- Dica Cozinha 2");
				dica3.setText("- Dica Cozinha 3");
			}else if (total_gasto_banheiro > total_gasto_sala && total_gasto_banheiro > total_gasto_cozinha && total_gasto_banheiro > total_gasto_quarto) {
				dica1.setText("- O banheiro está consumindo muita energia. Cuidado!");
				dica2.setText("- Dica Banheiro 2");
				dica3.setText("- Dica Banheiro 3");
			}
		

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

	static final String[] comodos = new String[] { "Sala", "Quarto", "Cozinha",
			"Banheiro" };

	private static String getValorFormatado(Float f) {
		Locale.setDefault(new Locale("pt", "BR"));
		DecimalFormat df = new DecimalFormat("R$ 00.00");
		return df.format(f);
	}

}