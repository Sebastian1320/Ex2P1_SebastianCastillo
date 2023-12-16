/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_sebastiancastillo;//fila 2 silla 1

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Asus
 */
public class Ex2P1_SebastianCastillo {

    static Scanner leer = new Scanner(System.in);
    static Random rng = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***** M E N U *****");
        System.out.println("1. Kingdom Hearts Re-Re:Coded!");
        System.out.println("2. Salir");
        int op = leer.nextInt();
        while (op != 2) {
            switch (op) {
                case 1:
                    Personajes sora = new Personajes("Sora", 300, 300, 75, 15);
                    Personajes donald = new Personajes("Donald", 150, 450, 45, 10);
                    Personajes goofy = new Personajes("Goofy", 450, 100, 150, 50);
                    Personajes mickey = new Personajes("Mickey", 100, 500, 150, 35);
                    Personajes roxas = new Personajes("Roxas", 300, 300, 15, 75);
                    Personajes kairi = new Personajes("Kairi", 200, 200, 50, 15);
                    Items pocion = new Items("Pocion", 50, 0);
                    Items ether = new Items("Ether", 0, 50);
                    Items elixir = new Items("Elixir", 100, 100);
                    ArrayList<Personajes> Party = new ArrayList<>();
                    Party.add(sora);
                    Party.add(donald);
                    Party.add(goofy);
                    ArrayList<Personajes> Reserva = new ArrayList<>();
                    Reserva.add(mickey);
                    Reserva.add(roxas);
                    Reserva.add(kairi);
                    ArrayList<Items> Mochila = new ArrayList<>();
                    Mochila.add(pocion);
                    Mochila.add(ether);
                    Mochila.add(elixir);
                    int cuarto = 0;
                    char resp = 'S';
                    boolean turno = false;
                    while (cuarto < 20 && (resp == 's' || resp == 'S')) {
                        int num = rng.nextInt((5 - 1) + 1) + 1;
                        if (num == 1) {
                            int num2 = rng.nextInt((3 - 1) + 1) + 1;
                            int hph = 75;
                            hph = hph * num2;
                            int atkh = 25;
                            System.out.println("Te has encontrado " + num2 + " Heartless");
                            while (hph != 0 || Party.size() != 0) {

                                for (int i = 0; i < Party.size(); i++) {
                                    Party.get(i).toString();
                                    System.out.println(i + " . " + Party.get(i).toString());
                                    System.out.println();
                                }
                                System.out.println("Elige el personaje");
                                int personaje = leer.nextInt();
                                Party.get(personaje);
                                int vivo = Party.get(personaje).getHP();
                                while (vivo <= 0) {
                                    System.out.println("Elige un personaje vivo");
                                    personaje = leer.nextInt();
                                }
                                System.out.println("♣♣♣♣♣ MENU ♣♣♣♣♣");
                                System.out.println("1. Attack");
                                System.out.println("2. Magic");
                                System.out.println("3. Items");
                                System.out.println("4. Party");
                                int ataque = leer.nextInt();
                                switch (ataque) {
                                    case 1:
                                        int Atk = Party.get(personaje).getAttackPoint();
                                        hph = hph - Atk;
                                        int Hp = Party.get(personaje).getHP();
                                        int Def = Party.get(personaje).getDefensePoints();
                                        atkh = atkh * num2;
                                        atkh = atkh - atkh * Def / 100;
                                        Hp = Hp - atkh;
                                        System.out.println("Tu personaje a atacado");
                                        System.out.println("Tu personaje a recibido un golpe");
                                        System.out.println("Los Heartless les queda " + hph);
                                        Party.get(personaje).setHP(Hp);
                                        break;
                                    case 2:
                                        System.out.println("1. Blizard 50MP-50DMG");
                                        System.out.println("2. Firaga 25MP-25DMG");
                                        System.out.println("3. Gravity 75MP-100DMG");
                                        int magia = leer.nextInt();
                                        switch (magia) {
                                            case 1:
                                                int MP = Party.get(personaje).getMP();
                                                if (MP >= 50) {
                                                    MP = MP - 50;
                                                    Party.get(personaje).setMP(MP);
                                                    hph = hph - 50;
                                                    Def = Party.get(personaje).getDefensePoints();
                                                    Hp = Party.get(personaje).getHP();
                                                    atkh = atkh * num2;
                                                    atkh = atkh - atkh * Def / 100;
                                                    Hp = Hp - atkh;
                                                    Party.get(personaje).setHP(Hp);
                                                    System.out.println("Tu personaje uso Blizard");
                                                    System.out.println("Tu personjae recibio el golpe ");
                                                    System.out.println("Los heartless les queda " + hph);
                                                } else {
                                                    System.out.println("No tienes mana para usar el ataque");
                                                }
                                                break;
                                            case 2:
                                                MP = Party.get(personaje).getMP();
                                                if (MP >= 25) {
                                                    MP = MP - 25;
                                                    Party.get(personaje).setMP(MP);
                                                    hph = hph - 25;
                                                    Def = Party.get(personaje).getDefensePoints();
                                                    Hp = Party.get(personaje).getHP();
                                                    atkh = atkh * num2;
                                                    atkh = atkh - atkh * Def / 100;
                                                    Hp = Hp - atkh;
                                                    Party.get(personaje).setHP(Hp);
                                                    System.out.println("Tu personaje uso Firaga");
                                                    System.out.println("Tu personjae recibio el golpe ");
                                                    System.out.println("Los heartless les queda " + hph);
                                                } else {
                                                    System.out.println("No tienes mana para este ataque");
                                                }
                                                break;
                                            case 3:
                                                MP = Party.get(personaje).getMP();
                                                if (MP >= 75) {
                                                    MP = MP - 75;
                                                    Party.get(personaje).setMP(MP);
                                                    hph = hph - 100;
                                                    Def = Party.get(personaje).getDefensePoints();
                                                    Hp = Party.get(personaje).getHP();
                                                    atkh = atkh * num2;
                                                    atkh = atkh - atkh * Def / 100;
                                                    Hp = Hp - atkh;
                                                    Party.get(personaje).setHP(Hp);
                                                    System.out.println("Tu personaje uso Graviy");
                                                    System.out.println("Tu personjae recibio el golpe ");
                                                    System.out.println("Los heartless les queda " + hph);
                                                } else {
                                                    System.out.println("No tienes mana para hacer este ataque");
                                                }
                                                break;
                                        }
                                        break;

                                    case 3:
                                        for (int i = 0; i < Mochila.size(); i++) {
                                            Mochila.get(i).toString();
                                            System.out.println(i + " . " + Mochila.get(i).toString());
                                            System.out.println();
                                        }
                                        if (Mochila.size() != 0) {
                                            System.out.println("Eliga un item");
                                            int item = leer.nextInt();
                                            if (Mochila.get(item) == pocion) {
                                                Mochila.remove(item);
                                                Hp = Party.get(personaje).getHP();
                                                Hp = Hp + 50;
                                                Def = Party.get(personaje).getDefensePoints();
                                                atkh = atkh * num2;
                                                atkh = atkh - atkh * Def / 100;
                                                Hp = Hp - atkh;
                                                Party.get(personaje).setHP(Hp);
                                                System.out.println("Tu personaje uso Pocion");
                                                System.out.println("Tu personaje recibio un golpe");
                                            } else if (Mochila.get(item) == ether) {
                                                Hp = Party.get(personaje).getHP();
                                                Def = Party.get(personaje).getDefensePoints();
                                                atkh = atkh * num2;
                                                atkh = atkh - atkh * Def / 100;
                                                Hp = Hp - atkh;
                                                Party.get(personaje).setHP(Hp);
                                                Mochila.remove(item);
                                                int MP = Party.get(personaje).getMP();
                                                MP = MP + 50;
                                                Party.get(personaje).setMP(MP);
                                                System.out.println("Tu personaje uso Ether");
                                                System.out.println("Tu personaje recibio un golpe");
                                            } else {
                                                Mochila.remove(item);
                                                Hp = Party.get(personaje).getHP();
                                                Hp = Hp + 100;
                                                Def = Party.get(personaje).getDefensePoints();
                                                atkh = atkh * num2;
                                                atkh = atkh - atkh * Def / 100;
                                                Hp = Hp - atkh;
                                                Party.get(personaje).setHP(Hp);
                                                int MP = Party.get(personaje).getMP();
                                                MP = MP + 100;
                                                Party.get(personaje).setMP(MP);
                                                System.out.println("Tu personaje uso Elixir ");
                                                System.out.println("Tu personaje recibio un golpe");
                                            }
                                        } else {
                                            System.out.println("No tiene objetos");
                                        }
                                        break;
                                    case 4:
                                        for (int i = 0; i < Reserva.size(); i++) {
                                            Reserva.get(i).toString();
                                            System.out.println(i + " . " + Reserva.get(i).toString());
                                            System.out.println();
                                        }
                                        System.out.println("Ingresa por quien lo quieres cambiar");
                                        int cambio = leer.nextInt();
                                        if (Party.get(personaje) == sora) {
                                            Party.remove(sora);
                                            Party.add(Reserva.get(cambio));
                                            Reserva.remove(cambio);
                                            Reserva.add(sora);
                                            System.out.println("Tu personaje ha cambiado antes del ataque");
                                        } else if (Party.get(personaje) == donald) {
                                            Party.remove(donald);
                                            Party.add(Reserva.get(cambio));
                                            Reserva.remove(cambio);
                                            Reserva.add(donald);
                                            System.out.println("Tu personaje ha cambiado antes del ataque");
                                        } else if (Party.get(personaje) == goofy) {
                                            Party.remove(goofy);
                                            Party.add(Reserva.get(cambio));
                                            Reserva.remove(cambio);
                                            Reserva.add(goofy);
                                            System.out.println("Tu personaje ha cambiado antes del ataque");
                                        } else if (Party.get(personaje) == mickey) {
                                            Party.remove(mickey);
                                            Party.add(Reserva.get(cambio));
                                            Reserva.remove(cambio);
                                            Reserva.add(mickey);
                                            System.out.println("Tu personaje ha cambiado antes del ataque");
                                        } else if (Party.get(personaje) == roxas) {
                                            Party.remove(roxas);
                                            Party.add(Reserva.get(cambio));
                                            Reserva.remove(cambio);
                                            Reserva.add(roxas);
                                            System.out.println("Tu personaje ha cambiado antes del ataque");
                                        } else if (Party.get(personaje) == kairi) {
                                            Party.remove(kairi);
                                            Party.add(Reserva.get(cambio));
                                            Reserva.remove(cambio);
                                            Reserva.add(kairi);
                                            System.out.println("Tu personaje ha cambiado antes del ataque");
                                        }

                                        break;
                                }
                            }

                        } else if (num == 2) {
                            System.out.println("Tu equipo a encontrado una pocion");
                            Mochila.add(pocion);
                        } else if (num == 3) {
                            System.out.println("Tu equipo a encontrado un ether");
                            Mochila.add(ether);
                        } else if (num == 4) {
                            System.out.println("Tu equipo a encontrado un Elixir");
                            Mochila.add(elixir);
                        } else {
                            if (Mochila.size() == 0) {
                                System.out.println("Tu equipo a encontrado uno amigos pero no tiene los objetos para ayudarlos");
                            } else {
                                System.out.println("Tu equipo a encontrado uno amigos y decidieron ayudarlos con unos objetos");
                                int num3 = rng.nextInt(Mochila.size());
                                Mochila.remove(num3);
                                for (int i = 0; i < Mochila.size(); i++) {
                                    Mochila.get(i).toString();
                                    System.out.println(i + " . " + Mochila.get(i).toString());
                                    System.out.println();
                                }
                            }
                        }
                        cuarto++;
                        System.out.println("Estas en el cuarto: " + cuarto);
                        System.out.println("Listo para la siguiente habitacion[S]");
                        resp = leer.next().charAt(0);
                        while (resp != 'S' && resp != 's') {
                            System.out.println("Cuando estes listo ingresa [S]");
                            resp = leer.next().charAt(0);
                        }
                    }
                    break;
                default:
                    System.out.println("Eliga una opcion valida");
            }
        }
    }
}
