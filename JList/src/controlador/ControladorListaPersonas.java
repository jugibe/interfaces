package controlador;

import modelo.ModeloListaPersonas;
import modelo.Persona;
import vista.VistaListaPersonas;

//===== CONTROLADOR =====
public class ControladorListaPersonas {

 // ===== ATRIBUTOS =====
 private VistaListaPersonas vista;
 private ModeloListaPersonas modelo=new ModeloListaPersonas();

 // ===== CONSTRUCTOR =====
 public ControladorListaPersonas(VistaListaPersonas vista) {
     this.vista = vista;
     iniciar();
 }

 // ===== INICIALIZACIÓN =====
 private void iniciar() {

     vista.addAnadirListener(e -> anadir());
     vista.addEliminarListener(e -> eliminar());
     vista.addEditarListener(e -> editar());
     vista.setModelo(modelo.getModelo());
 }

 // ===== LÓGICA =====
 private void anadir() {

     try {
         String nombre = vista.getNombre();
         int edad = Integer.parseInt(vista.getEdad());

         modelo.agregarPersona(new Persona(nombre, edad));
         vista.limpiar();

     } catch (Exception e) {
         vista.mostrarError("Datos incorrectos");
     }
 }

 private void eliminar() {
	 int indice = vista.getIndiceSeleccionado();
	 modelo.eliminarPersona(indice);
     
 }

 private void editar() {

     int indice = vista.getIndiceSeleccionado();

     if (indice != -1) {
         try {
             String nombre = vista.getNombre();
             int edad = Integer.parseInt(vista.getEdad());

             modelo.actualizarPersona(indice, new Persona(nombre,edad));
             vista.limpiar();

         } catch (Exception e) {
             vista.mostrarError("Datos incorrectos");
         }
     } else {
         vista.mostrarError("Selecciona un elemento");
     }
 }
}
