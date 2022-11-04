package poop7;

/**
 *
 * @author poo01alu18
 */
public class Gerente extends Empleado{
    private int presupuesto;

    public Gerente() {
    }

    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        if(presupuesto < 0)
            presupuesto =0;
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Gerente{" + super.toString() + "presupuesto=" + presupuesto + '}';
    }
    
 }
