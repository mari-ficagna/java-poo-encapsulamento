/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooaula06encapsulamento;

/**
 *
 * @author Mari (48) 99618-5728
 */
public class PooAula06Encapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto c = new ControleRemoto();
        //c.setLigado(true);
        c.play();
        c.maisVolume();
        c.ligarMudo();
        c.desligarMudo();
        c.abrirMenu();


        
    }
    
}
