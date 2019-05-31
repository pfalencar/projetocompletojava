package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.PessoaFisica;

public class PessoaFisicaView extends JFrame{
	
	private static final long serialVersionUID = 1758257028774088425L;
	
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	
	JLabel lblCpf = new JLabel("CPF: ");
	JTextField txtCpf = new JTextField();
	
	JLabel lblDataNasc = new JLabel("Data de Nascimento: ");
	JTextField txtDataNasc = new JTextField();
	
	JLabel lblEndereco = new JLabel("Endereço: ");
	JTextField txtEndereco = new JTextField();
	
	JLabel lblBairro = new JLabel("Bairro: ");
	JTextField txtBairro = new JTextField();
	
	JLabel lblTelefone = new JLabel("Telefone: ");
	JTextField txtTelefone = new JTextField();
	
	JButton btnCad = new JButton("Cadastrar");
	
	public PessoaFisicaView() {
		super("Tela de Cadastro - Pessoa Física");
		
		Container paine =  this.getContentPane();
		paine.setLayout(null);
		
		lblNome.setBounds(20, 20, 80, 20);
		paine.add(lblNome);
		
		txtNome.setBounds(150, 20, 200, 20);
		paine.add(txtNome);
		
		lblCpf.setBounds(20, 50, 80, 20);
		paine.add(lblCpf);
		
		txtCpf.setBounds(150, 50, 150, 20);
		paine.add(txtCpf);
		
		lblDataNasc.setBounds(20, 80, 150, 20);
		paine.add(lblDataNasc);
		
		txtDataNasc.setBounds(150, 80, 100, 20);
		paine.add(txtDataNasc);
		
		lblEndereco.setBounds(20, 110, 100, 20);
		paine.add(lblEndereco);
		
		txtEndereco.setBounds(150, 110, 200, 20);
		paine.add(txtEndereco);
		
		lblBairro.setBounds(20, 140, 100, 20);
		paine.add(lblBairro);
		
		txtBairro.setBounds(150, 140, 150, 20);
		paine.add(txtBairro);
		
		lblTelefone.setBounds(20, 170, 80, 20);
		paine.add(lblTelefone);
		
		txtTelefone.setBounds(150, 170, 100, 20);
		paine.add(txtTelefone);
		
		
		
		btnCad.setBounds(100, 250, 200, 100);
		paine.add(btnCad);
		btnCad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				PessoaFisica pf = new PessoaFisica();				
				pf.setNome(txtNome.getText());				
				pf.setCpf(Double.parseDouble(txtCpf.getText()));
				
				try {
					pf.setDataNasc(StringToDate(txtDataNasc.getText()));
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("ERRO DE CONVERSÃO!");
				}
				
				pf.setEndereco(txtEndereco.getText());
				pf.setBairro(txtBairro.getText());
				pf.setTelefone(Integer.parseInt(txtTelefone.getText()));
			
				JOptionPane.showMessageDialog(null, 
						"Nome: " + pf.getNome() + 
						"\nCpf: " + pf.getCpf() +
						"\nData de Nascimento: " + pf.getDataNasc() +
						"\nEndereço: " + pf.getEndereco() +
						"\nBairro: " + pf.getBairro() +
						"\nTelefone: " + pf.getTelefone()						
						);
			}
			
		});
		
		this.setSize(400, 400);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public Date StringToDate(String dataTexto) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.parse(dataTexto);
		
	}
	
}
