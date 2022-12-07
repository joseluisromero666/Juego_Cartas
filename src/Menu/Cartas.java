package Menu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author JOSE
 */
public class Cartas {
    
    private int Aciertos = 0;
    private int VidasRestantes = 6;
    private String[][] tablero = new String[3][4];
    private ArrayList<Integer> Aleatorio1 = new ArrayList();
    private ArrayList<Integer> Aleatorio2 = new ArrayList();
    private ArrayList<String> Vectordoce = new ArrayList();
    private String[] pares = {"AS", "AH", "AD", "AC",
        "2S", "2H", "2D", "2C", "3S", "3H", "3D", "3C", "4S", "4H", "4D", "4C", "5S", "5H", "5D", "5C",
        "6S", "6H", "6D", "6C", "7S", "7H", "7D", "7C", "8S", "8H", "8D", "8C", "9S", "9H", "9D", "9C",
        "10S", "10H", "10D", "10C", "JS", "JH", "JD", "JC", "QS", "QH", "QD", "QC", "KS", "KH", "KD", "KC"};

    public String[][] aleatorio() {
        int u = 0;
        Aleatorio1.clear();
        Vectordoce.clear();
        Aleatorio2.clear();
        Aciertos = 0;
        VidasRestantes = 6;
        
        for (int i = 0; i < 6; i++) {
            Aleatorio1.add(gen(Aleatorio1));
            Vectordoce.add(pares[Aleatorio1.get(i)]);
            Vectordoce.add(pares[Aleatorio1.get(i)]);
        }
        for (int i = 0; i < 12; i++) {
            Aleatorio2.add(genera(Aleatorio2));
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                tablero[i][j] = Vectordoce.get(Aleatorio2.get(u));
                u++;
            }
        }
        return tablero;

    }


    public static String etiq(String carta) {
        String etiq = null;

        switch (carta) {
            case "S":
                etiq = "Picas.";
                return etiq;
            case "H":
                etiq = "Corazones.";
                return etiq;
            case "D":
                etiq = "Diamantes.";
                return etiq;
            case "C":
                etiq = "Tréboles.";
                return etiq;
            default:
                break;
        }
        return etiq;
    }


    public static int gen(ArrayList<Integer> a) {
        Random ra = new Random();
        int numero = ra.nextInt(52);
        if (!a.contains(numero)) {
            return numero;
        } else {
            return gen(a);
        }
    }

    public static int genera(ArrayList<Integer> Aleatorio2) {
        Random ra = new Random();
        int numero = ra.nextInt(12);
        if (!Aleatorio2.contains(numero)) {
            return numero;
        } else {
            return genera(Aleatorio2);
        }
    }

    public int getAciertos() {
        return Aciertos;
    }

    public void setAciertos(int Aciertos) {
        this.Aciertos = Aciertos;
    }

    public int getVidasRestantes() {
        return VidasRestantes;
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setVidasRestantes(int VidasRestantes) {
        this.VidasRestantes = VidasRestantes;
    }
//ULTIMA MOD
}
