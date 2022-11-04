package poop71;

/**
 *
 * @author Leny
 */
public class Ballena extends Acuatico {
    private int largo;
    
    public Ballena(){
    }

    public Ballena(int largo, int numAletas, String nombre, String origen, String color ){
        super(numAletas, nombre, origen, color);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + '}';
    }
    }
    
