import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;

public class EjemploCheckBox extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploCheckBox frame = new EjemploCheckBox();
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
	public EjemploCheckBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		ItemListener listener = e -> {
		    JCheckBox chk = (JCheckBox) e.getItemSelectable();

		    if (e.getStateChange() == ItemEvent.SELECTED) {
		        System.out.println(chk.getText()+ "seleccionado");
		    } else {
		    	System.out.println(chk.getText()+ "desseleccionado");
		}};

		JCheckBox chckbxA = new JCheckBox("OpcionA");
		contentPane.add(chckbxA);
		JCheckBox chckbxB = new JCheckBox("OpcionB");
		contentPane.add(chckbxB);
		JCheckBox chckbxC = new JCheckBox("OpcionC");
		contentPane.add(chckbxC);
		
		//listeners
		chckbxA.addItemListener(listener);
		chckbxB.addItemListener(listener);
		chckbxC.addItemListener(listener);
		
		

		};
	}

		
