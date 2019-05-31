package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;

public class Execucao extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JButton btnCadPF = new JButton("Cadastrar Pessoa Física");
	JButton btnCadPJ = new JButton("Cadastrar Pessoa Jurídica");
	
	
	public Execucao() {
		super("Tela de Cadastro");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		btnCadPF.setBounds(100, 100, 200, 200);
		btnCadPF.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {				
				new PessoaFisicaView();
			}
			
		});
		paine.add(btnCadPF);
		
		btnCadPJ.setBounds(400, 100, 200, 200);
		btnCadPJ.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new PessoaJuridicaView();
			}
			
		});
		paine.add(btnCadPJ);
		
		
		this.setSize(800,600);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new Execucao();
		
	}

}
