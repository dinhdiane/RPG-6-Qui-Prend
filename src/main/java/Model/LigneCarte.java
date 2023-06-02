package Model;

import java.util.ArrayList;

public class LigneCarte {

    private int numLigne;
    private int nbCarte;
    private int taille;
    private ArrayList<Carte> LigneCarte;
    private int nbTete=0;

    public int getNbTete() {
        return nbTete;
    }

    public void setNbTete(int nbTete) {
        this.nbTete = nbTete;
    }

    public LigneCarte(int numLigne, int nbCarte, int taille, ArrayList<Carte> ligneCarte) {
        this.numLigne = numLigne;
        this.nbCarte = nbCarte;
        this.taille = taille;
        LigneCarte = ligneCarte;
    }

    public static void main(String[] args) {
        LigneCarte lCarte = new LigneCarte(1,1,1,new ArrayList<Carte>(5));
        System.out.println(lCarte.toString());

    }

    public int getNumLigne() {
        return numLigne;
    }

    public void setNumLigne(int numLigne) {
        this.numLigne = numLigne;
    }

    public int getNbCarte() {
        return nbCarte;
    }

    public void setNbCarte(int nbCarte) {
        this.nbCarte = nbCarte;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public ArrayList<Carte> getLigneCarte() {
        return LigneCarte;
    }

    public void setLigneCarte(ArrayList<Carte> ligneCarte) {
        LigneCarte = ligneCarte;
    }

    @Override
    public String toString() {
        return "LigneCarte [numLigne=" + numLigne + ", nbCarte=" + nbCarte + ", taille=" + taille + ", LigneCarte="
                + LigneCarte + "]";
    }


}
