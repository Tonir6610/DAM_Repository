import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BailandoTexto extends JFrame {

	private JPanel contentPane;
	private JTextField Cajaizk;
	private JTextField CajaDer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BailandoTexto frame = new BailandoTexto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BailandoTexto() {
		setTitle("BAILANDO TEXTO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//CONTENDIO IZQUIERDA
		Cajaizk = new JTextField();
		Cajaizk.setBounds(82, 49, 89, 23);
		contentPane.add(Cajaizk);
		Cajaizk.setColumns(10);
		
		//CONTENIDO DERECHA
		CajaDer = new JTextField();
		CajaDer.setBounds(258, 49, 89, 23);
		contentPane.add(CajaDer);
		CajaDer.setColumns(10);
		
		//BOTON DERECHA
		JButton BotonDer = new JButton("-->");
		BotonDer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CajaDer.setText(Cajaizk.getText());
				Cajaizk.setText("");
			}
		});
		BotonDer.setBounds(171, 24, 89, 23);
		contentPane.add(BotonDer);
		
		//BOTON IZQUIERDA
		JButton Botonizk = new JButton("<--");
		Botonizk.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Cajaizk.setText(CajaDer.getText());
				CajaDer.setText("");
			}
		});
	
		Botonizk.setBounds(171, 74, 89, 23);
		contentPane.add(Botonizk);
	}
}
