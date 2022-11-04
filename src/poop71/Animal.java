package poop71;

/**
 *
 * @author Leny
 */
public class Animal {
    private String nombre, origen, color;
    
    public Animal(){
    }

    public Animal(String nombre, String origen, String color) {
        this.nombre = nombre;
        this.origen = origen;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", origen=" + origen + ", color=" + color + '}';
    }
    
    
}
