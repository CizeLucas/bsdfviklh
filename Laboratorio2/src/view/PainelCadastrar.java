package view;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Alunos;

public class PainelCadastrar extends JPanel {

	private JTextField caixaNome;
	private Alunos alunos;
	
	public PainelCadastrar(Alunos alunos) {
		this.alunos = alunos;
	  criarFormularioCadastro();
	  this.setBackground(Color.LIGHT_GRAY);
	}

	private void criarFormularioCadastro() {
		
		JLabel label  = new JLabel("Nome");
		caixaNome = new JTextField(6);
		
		JLabel cpf  = new JLabel("CPF");
		JTextField caixaCPF= new JTextField(6);
		
		JLabel matricula  = new JLabel("Matricula");
		JTextField caixamatricula = new JTextField(6);
		
		JLabel vertente  = new JLabel("Vertente");
		JTextField caixaVertente= new JTextField(6);
		
		Botao b= new Botao("Cadastrar", Color.GREEN);
		b.addActionListener(new botaoCadastrar());
		
		this.setLayout(new GridLayout(5,2));
		
		this.add(label);
		this.add(caixaNome);
		this.add(cpf);
		this.add(caixaCPF);
		this.add(matricula);
		this.add(caixamatricula);
		this.add(vertente);
		this.add(caixaVertente);
		this.add(b);
	}
	
	private class botaoCadastrar implements ActionListener {

	
		public void actionPerformed(ActionEvent e) {
			System.out.println("Aluno: "+caixaNome.getText());
			//new Alunos(caixaNome.getText(), );
		}
		
		
		
	}
	
}
