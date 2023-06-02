package Model;

public class Machine extends Joueur {

    /**
     * @param args
     * joueur de type machine (IA)
     */
    private static int nbAI=1;
    /**
     * @param position
     */
    public Machine(int position){
        super("AI_"+nbAI, position, "ai", 10);
        nbAI++;
    }
    @Override
    public String toString() {
        return super.toString()+"Machine []";
    }




}
