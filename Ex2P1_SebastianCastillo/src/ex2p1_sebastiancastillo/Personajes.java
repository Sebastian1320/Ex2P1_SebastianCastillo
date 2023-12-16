/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_sebastiancastillo;

/**
 *
 * @author Asus
 */
public class Personajes {
    private String nombre;
    private int HP;
    private int MP;
    private int AttackPoint;
    private int DefensePoints;

    public Personajes(String Nombre,int Hp, int Mp, int Atk, int dfs){
        this.nombre=Nombre;
        this.HP=Hp;
        this.MP=Mp;
        this.AttackPoint=Atk;
        this.DefensePoints=dfs;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public int getAttackPoint() {
        return AttackPoint;
    }

    public int getDefensePoints() {
        return DefensePoints;
    }
      public void setHP(int nuevoHP) {
        this.HP = nuevoHP;
        if(HP<0){
            this.HP=0;
        }
    }
    public void setMP(int nuevoMP) {
        this.MP = nuevoMP;
        if(MP<0){
            this.MP=0;
        }
    }

    @Override
    public String toString() {
        return  nombre+ "\nHP= " + HP + "\nMP= " + MP + "\nAttackPoint= " + AttackPoint + "\nDefensePoints= " + DefensePoints + '}';
    }
    
    
}
