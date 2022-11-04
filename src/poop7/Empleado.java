package poop7;

/**
 *
 * @author poo01alu18
 */
public class Empleado extends Object{
    private String nombre;
    private int numEmpleado,sueldo;

    public Empleado() {
        this.sueldo = 10_000;
    }

    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que modifica el valor del nombre
     * @param nombre El nombre de un empleado
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return Regresa el numero del empleado 
     */
    
    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    /**
     * 
     * @return Regresa el sueldo 
     */
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int porcentaje) {
        this.sueldo += (int)(this.sueldo*porcentaje/100);
    }

    @Override
    public String toString() {
        return "Empleado{" +super.toString() + ", nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
}
    
    
