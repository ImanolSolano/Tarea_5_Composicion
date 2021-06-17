/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author Imanol Solano
 */
public class Teclado {
    private String marca;
    private String modelo;
    private int numDeDtec;
    private int multi;

    public Teclado() {
    }

    public Teclado(String marca, String modelo, int numDeDtec, int multi) {
        this.marca = marca;
        this.modelo = modelo;
        this.numDeDtec = numDeDtec;
        this.multi = multi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumDeDtec() {
        return numDeDtec;
    }

    public void setNumDeDtec(int numDeDtec) {
        this.numDeDtec = numDeDtec;
    }

    public int getMulti() {
        return multi;
    }

    public void setMulti(int multi) {
        this.multi = multi;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + "\n modelo=" + modelo + "\n numDeDtec=" + numDeDtec + "\n multi=" + multi + '}';
    }
    
    
}
