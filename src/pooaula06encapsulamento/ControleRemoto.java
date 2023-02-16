/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaula06encapsulamento;

/**
 *
 * @author Mari (48) 99618-5728
 */
public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
   
    //Metodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;   
    }

    public int getVolume() {
        return volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Metodos abstratos

    @Override
    public void ligar() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.getLigado();
    }

    @Override
    public void desligar() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (this.getLigado()){
            System.out.println("-------MENU-------");
            System.out.println("Está ligada? "+this.getLigado());
            System.out.println("Está tocando? "+this.getTocando());
            System.out.println("Volume: "+this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10){
                System.out.print("| ");
            }
            System.out.println("     ");
        } else {
            System.out.println("Impossível abrir Menu com o aparelho desligado.");
        }
    }

    @Override
    public void fecharMenu() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (this.getLigado()){
            this.setVolume(this.getVolume()+5);
        } else {
            System.out.println("Impossível aumentar volume com o aparelho desligado.");
        }
    }

    @Override
    public void menosVolume() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (this.getLigado()){
            this.setVolume(this.getVolume()-5);
        } else {
            System.out.println("Impossível reduzir volume com o aparelho desligado.");
        }
    }

    @Override
    public void ligarMudo() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (this.getLigado() && this.getVolume()==0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (this.getLigado() && this.getTocando()==false){
        //if (this.getLigado() && !(this.getTocando()){
            this.setTocando(true);
        } else {
            System.out.println("Impossível dar play com o aparelho desligado.");
        }
    }

    @Override
    public void pause() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Impossível pausar com o aparelho desligado.");
        }
    }
    
    
    
}
