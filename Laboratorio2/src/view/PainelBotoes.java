package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class PainelBotoes extends JPanel {

	JanelaPrincipal janela;
	
	public PainelBotoes(JanelaPrincipal janela) {
		this.janela = janela;
		criarBotoes();
		this.setBackground(Color.ORANGE);
	}

	private void criarBotoes() {
		Botao cadastrar = new Botao("Cadastrar", Color.black);
		cadastrar.addActionListener(new acaoBotao(0));
	
		Botao listar = new Botao("Listar", Color.gray);
		listar.addActionListener(new acaoBotao(1));
		
		Botao atualizar = new Botao("Atualizar", Color.cyan);
		atualizar.addActionListener(new acaoBotao(2));
		
		Botao deletar = new Botao("Deletar", Color.red);
		deletar.addActionListener(new acaoBotao(3));
		
		this.add(cadastrar);
		this.add(listar);
		this.add(atualizar);
		this.add(deletar);
		
	}
	
	private class acaoBotao implements ActionListener {
		
		private int seletorDePainel;
		
		public acaoBotao(int seletorDePainel) {
			this.seletorDePainel = seletorDePainel;
		}
		
		public void actionPerformed(ActionEvent e) {
			janela.atualizarPaineis(seletorDePainel);
		}
		
	}
}
