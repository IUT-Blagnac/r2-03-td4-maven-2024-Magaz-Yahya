/**
 * Ce programme permet de saisir un numéro de mois et une année, puis affiche le nombre de jours dans ce mois pour l'année donnée.
 * Il comprend également une méthode pour vérifier si une année est bissextile et une méthode pour contrôler la saisie d'un nombre entier entre 1 et 10.
 * 
 * Pour lancer le programme, exécutez la méthode main.
 * 
 * Auteur: [votre nom]
 * Date: [date]
 */
import java.util.Scanner;

public class FinDAnnee {

    /**
     * Point d'entrée du programme.
     * Demande à l'utilisateur de saisir un numéro de mois et une année,
     * puis affiche le nombre de jours dans ce mois pour l'année donnée.
     * 
     * @param args Les arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {
        String date = "";
        int mois;
        int annee;
        System.out.println("Saisir un numéro de mois?");
        Scanner clavier = new Scanner(System.in);
        mois = clavier.nextInt();
        while (mois <= 0 || mois > 12) {
            System.out.println("Cette date n'est pas valide");
            mois = clavier.nextInt();
        }
        System.out.println("Saisir une année?");
        Scanner clavier2 = new Scanner(System.in);
        annee = clavier2.nextInt();
        while (annee < 1582) {
            System.out.println("Cette date n'est pas valide");
            annee = clavier2.nextInt();
        }
        int moisdif;
        switch (mois) {
            case 1:
                moisdif = 1;
                date = date + "Janvier";
                date = date + " " + annee + "," + nbJours(moisdif, annee) + "jours" + ("\n");
                break;
            case 2:
                moisdif = 2;
                date = date + "Février";
                date = date + " " + annee + "," + nbJours(moisdif, annee) + "jours" + ("\n");
                break;
            case 3:
                moisdif = 3;
                date = date + "Mars";
                date = date + " " + annee + "," + nbJours(moisdif, annee) + "jours" + ("\n");
                break;
            case 4:
                moisdif = 4;
                date = date + "Avril";
                date = date + " " + annee + "," + nbJours(moisdif, annee) + "jours" + ("\n");
                break;
            case 5:
                moisdif = 5;
                date = date + "Mai";
                date = date + " " + annee + "," + nbJours(moisdif, annee) + "jours" + ("\n");
                break;
            case 6:
                moisdif = 6;
                date = date + "Juin";
                date = date + " " + annee + "," + nbJours(moisdif, annee) + "jours" + ("\n");
                break;
            case 7:
                moisdif = 7;
                date = date + "Juillet";
                date = date + " " + annee + "," + nbJours(moisdif, annee) + "jours" + ("\n");
                break;
            case 8:
                moisdif = 8;
                date = date + "Août";
                date = date + " " + annee + "," + nbJours(moisdif, annee) + "jours" + ("\n");
                break;
            case 9:
                moisdif = 9;
                date = date + "Septembre";
                date = date + " " + annee + "," + nbJours(moisdif, annee) + "jours" + ("\n");
                break;
            case 10:
                moisdif = 10;
                date = date + "Octobre";
                date = date + " " + annee + "," + nbJours(moisdif, annee) + "jours" + ("\n");
                break;
            case 11:
                moisdif = 11;
                date = date + "Novembre";
                date = date + " " + annee + "," + nbJours(moisdif, annee) + "jours" + ("\n");
                break;
            case 12:
                moisdif = 12;
                date = date + "Décembre";
                date = date + " " + annee + "," + nbJours(moisdif, annee) + "jours" + ("\n");
                break;
        }

        System.out.println(date);
    }

    /**
     * Renvoie le nombre de jours dans un mois donné pour une année donnée.
     * 
     * @param mois Le numéro du mois (de 1 à 12).
     * @param annee L'année.
     * @return Le nombre de jours dans le mois spécifié.
     */
    public static int nbJours(int mois, int annee) {
        int nbj;
        if (estBissextile(annee) && mois == 2) {
            nbj = 29;
        } else {
            nbj = 28;
        }

        if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
            nbj = 31;
        } else {
            if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                nbj = 30;
            }
        }

        return nbj;
    }

    /**
     * Vérifie si une année est bissextile.
     * 
     * @param annee L'année à vérifier.
     * @return true si l'année est bissextile, sinon false.
     */
    public static boolean estBissextile(int annee) {
        if (annee % 400 == 0 || (annee % 4 == 0 && annee % 100 != 0)) {
            return true;
        }
        return false;
    }

    /**
     * Contrôle la saisie d'un nombre entier entre 1 et 10.
     */
    public static void SaisieControlee() {
        int ch;
        System.out.println("Entrer un nombre entier compris entre 1 et 10 :");
        Scanner clavier3 = new Scanner(System.in);
        ch = clavier3.nextInt();
        while (ch < 1 || ch > 10) {
            System.out.println("Entrer un nombre entier compris entre 1 et 10 :");
            ch = clavier3.nextInt();
        }
        System.out.println("Vous avez correctement saisi:"+""+ch);
    }
}