/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.prueba;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author Imanol Solano
 */
public class Prueba {
    public static void main(String[] args) {
        Monitor m1 = new Monitor();
        m1.setMarca("LG");
        m1.setModelo("ASD 1980");
        m1.setPulgadas(28);
        
        CPU cpu1 = new CPU();
        cpu1.setMarca("Direct");
        cpu1.setModelo("WERF 1234");
        cpu1.setVelProce(1000);
        
        Mouse mo1 = new Mouse();
        mo1.setMarca("Gamecraft");
        mo1.setModelo("ZXCV 123");
        mo1.setTipo("Gamer");
        
        Teclado t1 = new Teclado();
        t1.setMarca("QWERTY");
        t1.setModelo("Godwar 6788");
        t1.setNumDeDtec(104);
        t1.setMulti(5);
        
        Computadora comp1 = new Computadora();
        comp1.setMonitor(m1);
        comp1.setCpu(cpu1);
        comp1.setMouse(mo1);
        comp1.setTeclado(t1);
        System.out.println(comp1);
        
        comp1.getCpu().setMarca("BROOK");
        comp1.getTeclado().setNumDeDtec(80);
        comp1.getMonitor().setPulgadas(20);
        comp1.getMouse().setTipo("Empresarial");
        System.out.println(comp1);
    }
    
    
}
