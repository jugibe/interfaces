import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class EjemploRadioButton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploRadioButton frame = new EjemploRadioButton();
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
	public EjemploRadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ActionListener listener= e->{
			JRadioButton seleccionado = (JRadioButton) e.getSource();// botón seleccionado
			JOptionPane.showMessageDialog(this, seleccionado.getText());
		};
		
		JRadioButton rdbtnA = new JRadioButton("OpcionA");
		buttonGroup.add(rdbtnA);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB= new JRadioButton("OpcionB");
		buttonGroup.add(rdbtnB);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("OpcionC");
		buttonGroup.add(rdbtnC);
		contentPane.add(rdbtnC);
		
		//Añando los listener
		rdbtnA.addActionListener(listener);
		rdbtnB.addActionListener(listener);
		rdbtnC.addActionListener(listener);
		

	}

}
