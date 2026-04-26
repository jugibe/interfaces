package modelo;

//===== CLASE PERSONA =====
public class Persona {

 // ===== ATRIBUTOS =====
 private String nombre;
 private int edad;

 // ===== CONSTRUCTOR =====
 public Persona(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }

 // ===== GETTERS =====
 public String getNombre() {
     return nombre;
 }

 public int getEdad() {
     return edad;
 }

 // ===== TO STRING (CLAVE PARA JLIST) =====
 @Override
 public String toString() {
     return nombre + " (" + edad + ")";
 }
}