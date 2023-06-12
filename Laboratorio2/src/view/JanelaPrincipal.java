package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.*;

public class JanelaPrincipal extends JFrame {
	
	public JPanel painelCadastrar;
	public JPanel painelListar;
	public JPanel painelAtualizar;
	public JPanel painelDeletar;
	private JPanel[] paineis;
	private Alunos alunos;
	
	public JanelaPrincipal(Alunos alunos) {
		this.alunos = alunos;
		paineis = new JPanel[4];
		
		painelCadastrar = new PainelCadastrar(alunos);
		paineis[0] = painelCadastrar;
		
		painelListar = new JPanel();
		painelListar.setBackground(Color.gray);
		paineis[1] = painelListar;
		
		painelAtualizar = new JPanel();
		painelAtualizar.setBackground(Color.cyan);
		paineis[2] = painelAtualizar;
				
		painelDeletar = new JPanel();
		painelDeletar.setBackground(Color.red);
		paineis[3] = painelDeletar;
		
		this.setSize(600, 300);
		this.setBackground(Color.LIGHT_GRAY);
		
        PainelBotoes painelBotoes = new PainelBotoes(this);

		this.add(painelBotoes, BorderLayout.NORTH);

		painelCadastrar.setVisible(false);
		JPanel painelGenerico = new JPanel();
		painelGenerico.add(painelCadastrar);
		painelGenerico.add(painelListar);
		painelGenerico.add(painelAtualizar);
		painelGenerico.add(painelDeletar);
		
		this.add(painelGenerico, BorderLayout.CENTER);
		this.setVisible(true);
		
	} // FIM CONSTRUTOR
	
	
	public void atualizarPaineis(int seletorDePainel) {
		
		for(int i=0; i<paineis.length; i++) {
			if(i==seletorDePainel) {
				paineis[i].setVisible(true);
			} else {
				paineis[i].setVisible(false);
			}
		}
		
	}
	

}
