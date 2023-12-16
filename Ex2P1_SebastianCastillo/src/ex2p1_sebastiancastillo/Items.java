/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_sebastiancastillo;

/**
 *
 * @author Asus
 */
public class Items {
    private String nombre;
    private int HPpoints;
    private int MPpoints;
    
    public Items(String Nombre,int Hp,int MP){
        this.nombre=Nombre;
        this.HPpoints=Hp;
        this.MPpoints=MP;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHPpoints() {
        return HPpoints;
    }

    public int getMPpoints() {
        return MPpoints;
    }

    @Override
    public String toString() {
        return "Items: " + nombre+  " HPpoints= " + HPpoints + " MPpoints= " + MPpoints ;
    }
    
    
}
