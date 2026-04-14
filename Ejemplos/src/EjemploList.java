import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

public class EjemploList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploList frame = new EjemploList();
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
	public EjemploList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// Datos de la lista
        String[] cursos = {"A", "B", "C"};

        // Crear JList
        JList<String> lista = new JList<>(cursos);

        // Meter en scroll (IMPORTANTE)
        JScrollPane scroll = new JScrollPane(lista);

        add(scroll);
        //SELECCION MULTIPLE
        lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        lista.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
            	System.out.println(lista.getSelectedValuesList());
            }
        });

	}

}
