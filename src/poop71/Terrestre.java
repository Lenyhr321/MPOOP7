/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop71;

/**
 *
 * @author Leroy Heru
 */
public class Terrestre extends Animal {
    private int numPatas;
    
    public Terrestre(){
    }
    public Terrestre(int numPatas, String nombre, String origen, String color){
        super(nombre,origen,color);
        this.numPatas=numPatas;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    @Override
    public String toString() {
        return "Terrestre{" + "numPatas=" + numPatas + '}';
    }
    
    
}
