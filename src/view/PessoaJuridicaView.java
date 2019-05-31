package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.PessoaJuridica;

public class PessoaJuridicaView extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	JLabel lblRazaoSocial = new JLabel("Razão Social: ");
	JTextField txtRazaoSocial = new JTextField();
	
	JLabel lblNomeFantasia = new JLabel("Nome Fantasia: ");
	JTextField txtNomeFantasia = new JTextField();
	
	JLabel lblCnpj = new JLabel("CNPJ: ");
	JTextField txtCnpj = new JTextField();
	
	JLabel lblEndereco = new JLabel("Endereço: ");
	JTextField txtEndereco = new JTextField();
	
	JLabel lblBairro = new JLabel("Bairro: ");
	JTextField txtBairro = new JTextField();
	
	JLabel lblTelefone = new JLabel("Telefone: ");
	JTextField txtTelefone = new JTextField();
	
	JButton btnCad = new JButton("Cadastrar");
		
	public PessoaJuridicaView() {
		super("Tela de Cadastro - Pessoa Jurídica");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblRazaoSocial.setBounds(20, 20, 120, 20);
		paine.add(lblRazaoSocial);
		
		txtRazaoSocial.setBounds(120, 20, 200, 20);
		paine.add(txtRazaoSocial);
		
		lblNomeFantasia.setBounds(20, 50, 120, 20);
		paine.add(lblNomeFantasia);
		
		txtNomeFantasia.setBounds(120, 50, 150, 20);
		paine.add(txtNomeFantasia);
		
		lblCnpj.setBounds(20, 80, 120, 20);
		paine.add(lblCnpj);
		
		txtCnpj.setBounds(120, 80, 120, 20);
		paine.add(txtCnpj);
		
		lblEndereco.setBounds(20, 110, 100, 20);
		paine.add(lblEndereco);
		
		txtEndereco.setBounds(120, 110, 200, 20);
		paine.add(txtEndereco);
		
		lblBairro.setBounds(20, 140, 100, 20);
		paine.add(lblBairro);
		
		txtBairro.setBounds(120, 140, 150, 20);
		paine.add(txtBairro);
		
		lblTelefone.setBounds(20, 170, 80, 20);
		paine.add(lblTelefone);
		
		txtTelefone.setBounds(120, 170, 100, 20);
		paine.add(txtTelefone);
		
		btnCad.setBounds(100, 250, 200, 100);
		paine.add(btnCad);
		btnCad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				PessoaJuridica pj = new PessoaJuridica();
				pj.setRazaoSocial(txtRazaoSocial.getText());
				pj.setNomeFantasia(txtNomeFantasia.getText());
				pj.setCnpj(Double.parseDouble(txtCnpj.getText()));
				
				pj.setEndereco(txtEndereco.getText());
				pj.setBairro(txtBairro.getText());
				pj.setTelefone(Integer.parseInt(txtTelefone.getText()));
				
				JOptionPane.showMessageDialog(null, 
						"Razão Social: " + pj.getRazaoSocial() + 
						"\nNome Fantasia: " + pj.getNomeFantasia() +
						"\nCNPJ: " + pj.getCnpj() +
						"\nEndereço: " + pj.getEndereco() +
						"\nBairro: " + pj.getBairro() +
						"\nTelefone: " + pj.getTelefone()
						);
			}
			
		});
		
		this.setSize(400, 400);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
