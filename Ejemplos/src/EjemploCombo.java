import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EjemploCombo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploCombo frame = new EjemploCombo();
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
	public EjemploCombo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		String[] cursos = {"DAM", "DAW", "ASIR"};
		JComboBox<String> combo = new JComboBox<>(cursos);

		// 📌 Mostrar selección actual
		JLabel lbl = new JLabel("Seleccionado: DAM");

		// ⚡ Listener para detectar cambios
		combo.addActionListener(e -> {
			String seleccionado = (String) combo.getSelectedItem();
			lbl.setText("Seleccionado: " + seleccionado);
			System.out.println("Curso elegido: " + seleccionado);
		});

		// Añadir componentes
		add(combo);
		add(lbl);

	}

}
