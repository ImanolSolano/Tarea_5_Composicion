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
public class Computadora {
    private Monitor monitor;
    private CPU cpu;
    private Mouse mouse;
    private Teclado teclado;

    public Computadora() {
    }

    public Computadora(Monitor monitor, CPU cpu, Mouse mouse, Teclado teclado) {
        this.monitor = monitor;
        this.cpu = cpu;
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "monitor=" + monitor + "\n cpu=" + cpu + "\n mouse=" + mouse + "\n teclado=" + teclado + '}';
    }
    
    
}
