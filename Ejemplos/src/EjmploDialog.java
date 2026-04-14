import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjmploDialog extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjmploDialog frame = new EjmploDialog();
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
	public EjmploDialog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//messagedialog, usado para mostrar mensajes
		
		JButton btnmensaje = new JButton("BotonMensaje");
		
		JButton btnDialogo = new JButton("BotonDialogo");
		contentPane.add(btnDialogo);
		contentPane.add(btnmensaje);
		JButton btnInput = new JButton("InputDialog");
		contentPane.add(btnInput);
		JButton btnInputPanel = new JButton("InputPanel");
		contentPane.add(btnInputPanel);
		
		
		btnmensaje.addActionListener(e-> JOptionPane.showMessageDialog(
				null,
				"mensaje",
				"titulo",
				JOptionPane.INFORMATION_MESSAGE));//tipo de icono, información alerta,....
		

		//boton dialogo
		String[] opciones = {"Guardar", "Cargar", "Salir"};
		btnDialogo.addActionListener(e->{
			int seleccion = JOptionPane.showOptionDialog(
			        null,
			        "¿Qué deseas hacer?",
			        "Menú principal",
			        JOptionPane.DEFAULT_OPTION,//Que botones se le pasan, per como le pasamos uno personalizado....
			        JOptionPane.QUESTION_MESSAGE,//tipo icono
			        null,//icono opcion personalizada
			        opciones,
			        opciones[0]);
			System.out.println("opción elegida " +opciones[seleccion]);
			
		});
		
		//inputdialog
		//Se usa para introducir valores
		
	
		
		btnInput.addActionListener(e->{
			String valor = JOptionPane.showInputDialog(
			        null,
			        "Introduce tu nombre:",
			        "Entrada de datos",
			        JOptionPane.QUESTION_MESSAGE
			);
			System.out.println(valor);
			
		});
		
		//Se pueden pedir varios datos usando un panel en el cuadro de dialogo
		
		btnInputPanel.addActionListener(e->{
			PanelDatos panel=new PanelDatos();
			 int resultado = JOptionPane.showConfirmDialog(
		                null,
		                panel,
		                "Introduce tus datos",
		                JOptionPane.OK_CANCEL_OPTION,
		                JOptionPane.PLAIN_MESSAGE
		        );
			 
			  if (resultado == JOptionPane.OK_OPTION) {
				  panel.escribirResultados();
			  }
			  
		});
		
		
	}
	
	class PanelDatos extends JPanel{
		JTextField campoNombre = new JTextField();
		JTextField campoEdad = new JTextField();
		JTextField campoCiudad = new JTextField();
		public PanelDatos() {
			setLayout(new GridLayout(0, 1));
			add(new JLabel("Nombre:"));
			add(campoNombre);
			add(new JLabel("Edad:"));
			add(campoEdad);
			add(new JLabel("Ciudad:"));
			add(campoCiudad);
		}
		public void escribirResultados() {
			System.out.println(campoNombre.getText());
			System.out.println(campoCiudad.getText());
			System.out.println(campoEdad.getText());
		}
	}
	

}
