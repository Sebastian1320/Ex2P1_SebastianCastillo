/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s10.examen2.sebastiancastillo;

/**
 *
 * @author Asus
 */
public class Cadenas {
    String Cadena;
    
    public Cadenas(String Cadena){
    this.Cadena=Cadena;
}
    public boolean vocales(String Cadena){
        Boolean si=false;
        char vocal;
        char vocal2=' ';
        for(int i=0;i<Cadena.length();i++){
            vocal=Cadena.charAt(i);
            if(i+1<Cadena.length()){
            vocal2=Cadena.charAt(i+1);
            }else{
                vocal2=' '; 
            }
            if((vocal=='a'||vocal=='e'||vocal=='i'||vocal=='o'||vocal=='u') && (vocal2=='a'||vocal2=='e'||vocal2=='i'||vocal2=='o'||vocal2=='u') ){
                si=true;
            }
        }
        return si;
    }
    
}
