package System;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import Model.Carte;
import Model.Joueur;
public class Partie {

    ArrayList<ArrayList<Carte>>  listeLigneCarte;
    int nbJoueur;
    ArrayList<Carte> cartePlacerJoueur=null;
    ArrayList<Carte> paquet;
    ArrayList<Joueur> joueurs;
    int ligneChoisie;
    int manche=0;
    String gagnant ="";
    public String getGagnant() {
        return gagnant;
    }


    public void setGagnant(String gagnant) {
        this.gagnant = gagnant;
    }
    String partieDemarrer ="false";
    HashMap<String, ArrayList<Carte>> joueurListeCarte;

    /**
     * @param nbJoueur
     * méthode de création d'une partie avec le nombre de joueur passé en paramètres
     */
    public Partie(int nbJoueur) {
        this.listeLigneCarte = new ArrayList<ArrayList<Carte>>();
        this.nbJoueur = nbJoueur;
        this.joueurs = new ArrayList<Joueur>();
        this.cartePlacerJoueur = new ArrayList<Carte>() ;
        this.paquet = creerPaquetCartes();
        this.joueurListeCarte = new HashMap<String, ArrayList<Carte>>();
    }


    /**
     * @return
     * méthode de création du paquet de 104 cartes
     */

    public ArrayList<Carte> creerPaquetCartes(){
        ArrayList<Carte> listCarte = new ArrayList<Carte>();

        for (int i = 0; i < 104; i++) {
            Carte carte = new Carte(i+1);
            listCarte.add(carte);
        }
        System.out.println("Le paquet de cartes a été créé");
        return listCarte;
    }


    /**
     * @param joueur
     * méthode pour ajouter un joueur dans la liste des joueur de partie en cours
     */

    public void ajouterListeJoueurs(Joueur joueur){
        this.joueurs.add(joueur);
        System.out.println("Joueur créé !");
    }


    /**
     * methode qui permet de mélanger un paquet de cartes
     */
    public void melangerPaquet(){
        ArrayList<Carte> listCarteInitial = this.paquet;
        for (int k = 0; k < 555; k++){
            int i = 0 + (int)(Math.random() * (((listCarteInitial.size()-1) - 0) + 1));
            int j = 0 + (int)(Math.random() * (((listCarteInitial.size()-1) - 0) + 1));
            Carte temp;
            temp = listCarteInitial.get(i);
            listCarteInitial.set(i, listCarteInitial.get(j)) ;
            listCarteInitial.set(j,temp);
        }
        this.paquet=listCarteInitial;
        System.out.println("Mélanger les cartes");
    }


    /**
     * méthode permettant de distribuer les cartes aux différents joueurs de la partie, joueur par joueur
     */

    public void distribuerCarte(){
        int tour=0;
        for(int j=0; j<this.nbJoueur; j++){
            for(int i=0; i<10; i++){
                if (tour==1) {
                    this.joueurs.get(tour).getListeCarte().add(this.paquet.remove(paquet.size()-1));
                    tour=0;
                }else{
                    this.joueurs.get(tour).getListeCarte().add(this.paquet.remove(paquet.size()-1));
                    tour=1;
                }
            }

        }
        System.out.println("Cartes distribuées");
    }


    /**
     * méthode pour créer les quatre lignes de cartes.
     */
    public void creerListeLigneCarte(){
        for(int j=0; j<4; j++){
            this.listeLigneCarte.add(new ArrayList<Carte>());
        }
        System.out.println("Ligne de cartes créée");
    }

    /**
     * @param i indice de la carte à retirer sur les 10 cartes dans la main du joueur
     * @param j indice du joueur en question
     * méthode pour mettre une carte face cachée
     */
    public void joueurCarteLigne(int i,int j){

        Carte carte = new Carte();

        ArrayList<Carte> nouvTabCartes = new ArrayList<Carte>();

        nouvTabCartes.addAll(this.joueurs.get(j).getListeCarte());

        nouvTabCartes.set(i, carte);

        Carte carteRetirer = this.joueurs.get(j).getListeCarte().remove(i);

        this.cartePlacerJoueur.add(carteRetirer);

        this.joueurs.get(j).getListeCarte().clear();
        this.joueurs.get(j).getListeCarte().addAll(nouvTabCartes);


    }

    /**
     * methode qui permet de poser les quatres premieres cartes sur les différentes lignes
     */
    public void poserCarteLigne(){
        int i=0;
        for(int j=0; j<4; j++){
            listeLigneCarte.get(j).add(i, this.paquet.remove(paquet.size()-1));
        }
        System.out.println("Les cartes ont été posées !");
    }
    public void poserCarteUneLigne(int i,int j,int k){
        listeLigneCarte.get(j).add(this.cartePlacerJoueur.get(i));
    }
    /**
     * @return
     * méthode qui détermine l'ordre des joueurs
     */
    public ArrayList<Joueur> classerJoueur(){
        ArrayList<Joueur> joueursClasser = this.joueurs;

        if(cartePlacerJoueur.get(0).getNumCarte()<cartePlacerJoueur.get(1).getNumCarte()){
            return joueursClasser;
        }else{
            Joueur j1 = this.joueurs.get(0);
            Joueur j2 = this.joueurs.get(1);
            joueursClasser.clear();
            joueursClasser.add(j2);
            joueursClasser.add(j1);
            return joueursClasser;
        }
    }

    /**
     * @param i
     * @return
     * methode qui calcule le nombre de tête de chaque ligne sur le tableau
     */
    public int calculerNbTeteLigne(int i){
        int nbTete=0;
        for(int j =0; j<this.getListeLigneCarte().get(i).size();j++){
            nbTete=this.getListeLigneCarte().get(i).get(j).getNbTete() + nbTete;
        }
        return nbTete;
    }


    /**
     * @param carte est la carte à placer sur une ligne des cartes
     * @return
     * méthode qui choisit la ligne dans laquelle une carte doit etre posée selon la règle
     */
    public int choixDeLigne(Carte carte){
        ArrayList<Carte> listeLigneCartes = new ArrayList<Carte>();
        int pos=-1;
        for(int j=0; j<4; j++){
            listeLigneCartes.add(this.listeLigneCarte.get(j).get(listeLigneCarte.get(j).size() - 1));
            System.out.println("for");
        }
        listeLigneCartes.add(carte);
        listeLigneCartes.sort(Comparator.comparing(Carte::getNumCarte));
        System.out.println("sort");
        int diff=0;
        ArrayList<Integer> tabDiff = new ArrayList<Integer>();
        if (listeLigneCartes.get(0)==carte) {
            // L'utilisateur peur récupérer une carte de la ligne de son choix
            System.out.println("if");
            pos= -1;
        } else {
            for(int j=0; j<4; j++){
                System.out.println("for2");
                Carte cartes = listeLigneCarte.get(j).get(listeLigneCarte.get(j).size()-1);
                if(cartes.getNumCarte()>carte.getNumCarte()){
                    tabDiff.add(-3);
                }else{
                    diff= carte.getNumCarte()+cartes.getNumCarte();
                    tabDiff.add(diff);
                }

            }
            int min = Integer.MIN_VALUE;

            for(int j=0; j<4; j++){
                if(tabDiff.get(j)>min){
                    min=tabDiff.get(j);
                    pos=j;
                }
            }
            listeLigneCarte.get(pos).add(carte);
        }
        return pos;
    }
    /**
     * @param i
     * @param j
     * methode poser une carte sur tableau
     */
    public void poserUneCarteSurTableau(int i,int j){
        listeLigneCarte.get(i).add(this.cartePlacerJoueur.get(j));
        System.out.println("La carte a été posée.");
    }
    /**
     * @param partie
     * initialiser la partie
     */
    public void initializerPartie(Partie partie){
        partie.creerListeLigneCarte();
        partie.melangerPaquet();
        partie.distribuerCarte();
        partie.poserCarteLigne();
    }
    /**
     * @return
     * verifier si la partie est finie
     */
    public boolean partieTerminer(){
        if (this.getManche()==11) {
            return true;
        }else
            return false;
    }
    /**
     * changer le numéro des manches
     */
    public void ajouterManche(){
        this.manche = this.getManche()+1;
        System.out.println(this.manche);
    }
    /**
     * methode qui actualise le gagnant de la manche
     */
    public void setJoueurGagnant(){
        String gagnant="";
        int plusPetitNbTete=joueurs.get(0).getNbTete();
        for(Joueur joueur : this.joueurs){
            int nbTete=joueur.getNbTete();
            if(nbTete<plusPetitNbTete){
                gagnant=joueur.getNom();
            }
        }
        //   partie avec resultat égalité
        if (gagnant=="") {
            for(Joueur joueur : this.joueurs){
                joueur.setStatus("Egalité");
            }
        }
        // partie avec un vainquer
        if (gagnant!="") {
            for(Joueur joueur : this.joueurs){
                if (joueur.getNom()==gagnant) {
                    joueur.setStatus("Gagné !");
                }else{
                    joueur.setStatus("Perdu :(");
                }
            }
        }
        this.gagnant = gagnant;
    }
    // public static void main(String args[]){
    //     Humain hum1 = new Humain("boss",2);
    //     System.out.println(hum1.toString());
    //     Machine mac1 = new Machine(2);
    //     System.out.println(mac1.toString());

    //     Partie partie = new Partie(2);

    //     partie.ajouterListeJoueurs(mac1);
    //     partie.ajouterListeJoueurs(hum1);


    //     partie.melangerPaquet();
    //     partie.distribuerCarte();

    //     partie.creerListeLigneCarte();

    //     partie.poserCarteLigne();

    //     System.out.println(partie.toString());


    // }

    public int getNbJoueur() {
        return nbJoueur;
    }
    public void setNbJoueur(int nbJoueur) {
        this.nbJoueur = nbJoueur;
    }
    public ArrayList<Carte> getCartePlacerJoueur() {
        return cartePlacerJoueur;
    }
    public void setCartePlacerJoueur(ArrayList<Carte> cartePlacerJoueur) {
        this.cartePlacerJoueur = cartePlacerJoueur;
    }
    public ArrayList<Carte> getPaquet() {
        return paquet;
    }
    public void setPaquet(ArrayList<Carte> paquet) {
        this.paquet = paquet;
    }
    public HashMap<String, ArrayList<Carte>> getJoueurListeCarte() {
        return joueurListeCarte;
    }
    public void setJoueurListeCarte(HashMap<String, ArrayList<Carte>> joueurListeCarte) {
        this.joueurListeCarte = joueurListeCarte;
    }
    public String getPartieDemarrer() {
        return partieDemarrer;
    }
    public void setPartieDemarrer(String partieDemarrer) {
        this.partieDemarrer = partieDemarrer;
    }
    public int getManche() {
        return manche;
    }
    public void setManche(int manche) {
        this.manche = manche;
    }
    public int getLigneChoisie() {
        return ligneChoisie;
    }
    public void setLigneChoisie(int ligneChoisie) {
        this.ligneChoisie = ligneChoisie;
    }
    public ArrayList<Joueur> getJoueurs() {
        return joueurs;
    }
    public void setJoueurs(ArrayList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }
    public ArrayList<ArrayList<Carte>> getListeLigneCarte() {
        return listeLigneCarte;
    }
    public void setListeLigneCarte(ArrayList<ArrayList<Carte>> listeLigneCarte) {
        this.listeLigneCarte = listeLigneCarte;
    }
    @Override
    public String toString() {
        return "Partie [listeLigneCarte=" + listeLigneCarte + ", nbJoueur=" + nbJoueur + ", cartePlacerJoueur="
                + cartePlacerJoueur + ", paquet=" + paquet + ", joueurs=" + joueurs + ", joueurListeCarte="
                + joueurListeCarte + "]";
    }





}
