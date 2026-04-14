import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EjemploMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private CardLayout cardLayout = new CardLayout();
    private JPanel contenedor = new JPanel(cardLayout);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploMenu frame = new EjemploMenu();
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
	public EjemploMenu() {

        setTitle("App con Menu + CardLayout");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 🧩 PANELES
        JPanel panelInicio = new JPanel();
        panelInicio.add(new JLabel("INICIO"));

        JPanel panelAlumnos = new JPanel();
        panelAlumnos.add(new JLabel("GESTIÓN DE ALUMNOS"));

        JPanel panelCursos = new JPanel();
        panelCursos.add(new JLabel("GESTIÓN DE CURSOS"));

        // ➕ Añadir paneles al CardLayout (CLAVE + VISTA)
        contenedor.add(panelInicio, "inicio");
        contenedor.add(panelAlumnos, "alumnos");
        contenedor.add(panelCursos, "cursos");

        add(contenedor);

        // 🍔 MENÚ
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Navegación");

        JMenuItem mInicio = new JMenuItem("Inicio");
        JMenuItem mAlumnos = new JMenuItem("Alumnos");
        JMenuItem mCursos = new JMenuItem("Cursos");

        // ⚡ CAMBIO DE PANTALLA
        mInicio.addActionListener(e -> cardLayout.show(contenedor, "inicio"));
        mAlumnos.addActionListener(e -> cardLayout.show(contenedor, "alumnos"));
        mCursos.addActionListener(e -> cardLayout.show(contenedor, "cursos"));

        menu.add(mInicio);
        menu.add(mAlumnos);
        menu.add(mCursos);

        menuBar.add(menu);
        setJMenuBar(menuBar);

        // Mostrar inicio por defecto
        cardLayout.show(contenedor, "inicio");
    }
	

}
