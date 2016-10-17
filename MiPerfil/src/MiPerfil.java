import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiPerfil extends JFrame {

	private JPanel contentPane;
	private JTextField CajaNombre;
	private JTextField CajaApellidos;
	private JTextField CajaEdad;
	private JTextField CajaEmail;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPerfil frame = new MiPerfil();
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
	public MiPerfil() {
		setTitle("PERFIL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//STRING CREADOS 
		
		String name = new String ( "Antonio" );
		String surname = new String ( "Romero García" );
		String age = new String ( "21");
		String Email = new String ( "Tonir6610@Gmail.com");
		
		
		//ETIQUETA NOMBRE
		
		JLabel etiquetaNombre = new JLabel("Nombre");
		etiquetaNombre.setBounds(10, 10, 49, 14);
		contentPane.add(etiquetaNombre);
		
		
		//CAJA NOMBRE
		
		CajaNombre = new JTextField(name);
		CajaNombre.setBounds(10, 50, 184, 20);
		contentPane.add(CajaNombre);
		CajaNombre.setColumns(10);
		
		
		//ETIQUETA APELLIDOS
		
		JLabel etiquetaapellidos = new JLabel("Apellidos");
		etiquetaapellidos.setBounds(10, 90, 82, 14);
		contentPane.add(etiquetaapellidos);
		
		
		//CAJA APELLIDOS
		
		CajaApellidos = new JTextField(surname);
		CajaApellidos.setBounds(10, 130, 184, 20);
		contentPane.add(CajaApellidos);
		CajaApellidos.setColumns(10);
		
		
		//ETIQUETA EDAD
		
		JLabel etiquetaedad = new JLabel("Edad");
		etiquetaedad.setBounds(10, 170, 184, 24);
		contentPane.add(etiquetaedad);
		
		
		//CAJA EDAD
	
		CajaEdad = new JTextField(age);
		CajaEdad.setBounds(10, 210, 184, 20);
		contentPane.add(CajaEdad);
		CajaEdad.setColumns(10);
		
		//ETIQUETA EMAIL
		
		JLabel etiquetaemail = new JLabel("Email");
		etiquetaemail.setBounds(10, 250, 184, 24);
		contentPane.add(etiquetaemail);
		
		
		//CAJA EMAIL
		
		
		CajaEmail = new JTextField(Email);
		CajaEmail.setBounds(10, 290, 184, 20);
		contentPane.add(CajaEmail);
		CajaEmail.setColumns(10);
		
		
		

		
	}
}
