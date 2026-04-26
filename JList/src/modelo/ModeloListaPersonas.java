package modelo;

import javax.swing.DefaultListModel;

public class ModeloListaPersonas {

    private DefaultListModel<Persona> modelo;

    public ModeloListaPersonas() {
        modelo = new DefaultListModel<>();
    }

    public DefaultListModel<Persona> getModelo() {
        return modelo;
    }

    public void agregarPersona(Persona p) {
        modelo.addElement(p);
    }

    public void eliminarPersona(int indice) {
        if (indice >= 0 && indice < modelo.size()) {
            modelo.remove(indice);
        }
    }

    public void actualizarPersona(int indice, Persona p) {
        if (indice >= 0 && indice < modelo.size()) {
            modelo.set(indice, p);
        }
    }
}