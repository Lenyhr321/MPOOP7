package poop71;

/**
 *
 * @author Leny
 */
public class Aereo extends Animal{
    private int numAlas;
    
    public Aereo(){
    }

    public Aereo(int numAlas) {
        this.numAlas = numAlas;
    }

    public Aereo(int numAlas, String nombre, String origen, String color) {
        super(nombre, origen, color);
        this.numAlas = numAlas;
    }

    public int getNumAlas() {
        return numAlas;
    }

    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }

    @Override
    public String toString() {
        return "Aereo{" + "numAlas=" + numAlas + '}';
    }
    
    
}
