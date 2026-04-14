import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjemploJtable extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploJtable frame = new EjemploJtable();
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
	public EjemploJtable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		  DefaultTableModel modelo = new DefaultTableModel();

	        // Columnas
	        modelo.addColumn("Nombre");
	        modelo.addColumn("Edad");

	        // Filas
	        modelo.addRow(new Object[]{"Carlos", 28});
	        modelo.addRow(new Object[]{"Laura", 35});
	        contentPane.setLayout(null);

	        JTable tabla = new JTable(modelo);

	        JScrollPane scrollPane = new JScrollPane(tabla);
	        scrollPane.setBounds(102, 10, 334, 160);
	        contentPane.add(scrollPane);
	        
	        JButton btnNewButton_1 = new JButton("New button");
	       
	        btnNewButton_1.setBounds(8, 26, 84, 20);
	        contentPane.add(btnNewButton_1);
	        
	        JButton btnNewButton = new JButton("New button");
	        
	        

	}
}
