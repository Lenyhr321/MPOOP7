package poop71;

/**
 *
 * @author Leny
 */
public class Acuatico extends Animal{
    private int numAletas;
    
    public Acuatico(){
    }

    public Acuatico(int numAletas) {
        this.numAletas = numAletas;
    }

    public Acuatico(int numAletas, String nombre, String origen, String color) {
        super(nombre, origen, color);
        this.numAletas = numAletas;
    }

    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

    @Override
    public String toString() {
        return "Acuatico{" + "numAletas=" + numAletas + '}';
    }
    
    
}
