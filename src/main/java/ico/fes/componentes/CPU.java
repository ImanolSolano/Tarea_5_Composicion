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
public class CPU {
    private String marca;
    private String modelo;
    private int velProce;

    public CPU() {
    }

    public CPU(String marca, String modelo, int velProce) {
        this.marca = marca;
        this.modelo = modelo;
        this.velProce = velProce;
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

    public int getVelProce() {
        return velProce;
    }

    public void setVelProce(int velProce) {
        this.velProce = velProce;
    }

    @Override
    public String toString() {
        return "CPU{" + "marca=" + marca + "\n modelo=" + modelo + "\n velProce=" + velProce + '}';
    }
    
    
}
