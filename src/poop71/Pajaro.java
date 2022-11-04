package poop71;

/**
 *
 * @author Leny
 */
public class Pajaro extends Aereo {
    private String tipoPico;
    
    public Pajaro(){
    }
    
    public Pajaro(String tipoPico, int numAlas, String nombre, String origen, String color){
        super(numAlas,nombre,origen, color);
        this.tipoPico=tipoPico;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
        
}
