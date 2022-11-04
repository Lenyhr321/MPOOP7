package poop71;

/**
 *
 * @author Leny
 */
public class Perro extends Terrestre {
    private int numManchas;
    
    public Perro(){
    }
    public Perro(int numManchas, int numPatas, String nombre, String origen, String color){
        super(numPatas,nombre,origen,color);
        this.numManchas=numManchas;
    }

    public int getNumManchas() {
        return numManchas;
    }

    public void setNumManchas(int numManchas) {
        this.numManchas = numManchas;
    }

    @Override
    public String toString() {
        return "Perro{" + "numManchas=" + numManchas + '}';
    }
    
}
