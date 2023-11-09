package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int place = 20;
        int nbLancer = 5;
        int emplacement = 0;
        int resteCase = 20;

        for(int i= 1; i <= nbLancer; i++){
            scanner.nextLine();
            Random generateur = new Random();
            int lancer = generateur.nextInt(6) + 1;
            emplacement = emplacement + lancer;
            resteCase = resteCase - lancer;

            System.out.println("Lancer" + i + " : vous avez fait " + lancer + " vous êtes sur la case "+ emplacement+ "(encore " + resteCase + " case)");
        }
    if (emplacement == place ) {
        System.out.println("Vous avez gagner !");
    }
    else{
        System.out.println("Vous avez perdu !");
    }
}
}