package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Principal1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	Jugador player1=new Jugador();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal1 frame = new Principal1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				Jugador player1=new Jugador();
				player1.setNombre("");
				player1.setApellido1("");
				player1.setApellido2("");
				player1.setEdad(999);
				player1.setId(0);
				System.out.println(player1.toString());
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS JUGADOR\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(162, 11, 110, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(22, 66, 75, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("APELLIDO 1");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellido.setBounds(22, 93, 75, 14);
		contentPane.add(lblApellido);
		
		JLabel lblApellido_1 = new JLabel("APELLIDO 2");
		lblApellido_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellido_1.setBounds(22, 118, 75, 14);
		contentPane.add(lblApellido_1);
		
		JLabel lblEdad = new JLabel("EDAD");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEdad.setBounds(22, 143, 75, 14);
		contentPane.add(lblEdad);
	
		
		//TEXTO NOMBRE
		textField_1 = new JTextField();
		textField_1.setBounds(110, 63, 317, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		//ESPERANDO INTRO
		textField_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				player1.setNombre(textField_1.getText());
			}
		});
		
		
		//APELLIDO 1
		textField_2 = new JTextField();
		textField_2.setBounds(110, 90, 317, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				player1.setApellido1(textField_2.getText());
			}
		});
		
		//APELLIDO 2
		textField_3 = new JTextField();
		textField_3.setBounds(110, 115, 317, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				player1.setApellido2(textField_3.getText());
			}
		});
		
		
		//CAMPO DE TEXTO EDAD
		textField_4 = new JTextField();
		textField_4.setBounds(110, 140, 317, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
				if(player1.isNumeric(textField_4.getText())==true)
				player1.setEdad(Integer.parseInt(textField_4.getText()));
				else
					player1.setEdad(999);
			}
		});
		
		//BOTON JUGAR
		JButton btnAJugar = new JButton("A JUGAR");
		btnAJugar.setBounds(22, 178, 402, 23);
		contentPane.add(btnAJugar);
		
		btnAJugar.addActionListener (new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0){
				if (player1.getEdad()==999)
					textField.setText("Edad no correcta o falta por escribir. Pulse intro");
				else if (player1.sonEspacios(player1.getNombre()))
					textField.setText("Falta el nombre o no ha pulsado intro");
				else if (player1.sonEspacios (player1.getApellido1()))
					textField.setText ("Falta el primer apellido o no se ha pulsado intro");
				else if (player1.sonEspacios(player1.getApellido2()))
					textField.setText ("Falta el segundo apellido o no se ha pulsado intro");
				else
					textField.setText("Nuevo Jugador: "+player1.getNombre()+" "+player1.getApellido1()+" "+player1.getApellido2()+" de "+player1.getEdad()+" años");
					
			}
		});
		

		//TEXTO DATOS
		textField = new JTextField();
		textField.setBounds(22, 209, 402, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
	player1.setNombre(textField_1.getText());
	player1.setApellido1(textField_2.getText());
		
		
	
	}
}
