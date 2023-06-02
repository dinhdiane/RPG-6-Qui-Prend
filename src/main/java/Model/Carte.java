package Model;

import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class    Carte {

    /**
     * @param args
     * numCarte est le nombre sur la carte.
     */
    private int numCarte;
    private int nbTete;
    private ImageIcon image;

    public Carte(int numCarte) {
        this.numCarte = numCarte;
        // attribution du nombre de tête selon le numéro sur la carte
        if(numCarte==55){
            this.nbTete=7;
        } else if(numCarte%10==5){
            this.nbTete=2;
        } else if(numCarte%10==0){
            this.nbTete=3;
        } else if(numCarte%11==0){
            this.nbTete=5;
        } else {
            this.nbTete=1;
        }
        URL url_tmp = getClass().getResource("/images/cards/"+numCarte+".png"); // Choisit l'image suivant le numéro de la carte
        if(url_tmp!=null) this.image = new ImageIcon(url_tmp);
    }
    /**
     * création de carte vide
     */
    public Carte() {
        this.numCarte = 999;
        this.nbTete=0;

        URL url_tmp = getClass().getResource("/images/cards/carteVide.png"); // Choisis l'image suivant le numero de la carte
        if(url_tmp!=null) this.image = new ImageIcon(url_tmp);
    }

    // }
    public int getNumCarte() {
        return numCarte;
    }
    public void setNumCarte(int numCarte) {
        this.numCarte = numCarte;
    }
    public int getNbTete() {
        return nbTete;
    }
    public void setNbTete(int nbTete) {
        this.nbTete = nbTete;
    }
    public ImageIcon getImage() {
        return image;
    }
    public void setImage(ImageIcon image) {
        this.image = image;
    }


    @Override
    public String toString() {
        return "Carte [numCarte=" + numCarte + ", nbTete=" + nbTete + ", image=" + image + "]";
    }

    /**
     * @param c
     * @return TRUE si une carte est plus grande que la carte en paramètre
     *
     */
    public boolean plusGrand(Model.Carte c) {
        if(this.getNumCarte()>c.getNumCarte()){
            return true;
        } else{
            return false;
        }
    }


}
