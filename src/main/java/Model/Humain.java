package Model;

public class Humain extends Joueur{
    public Humain(String nom, int position){
        super(nom, position, "humain", Integer.MAX_VALUE);
    }
    public static void main(String[] args) {
        Humain hum1 = new Humain("boss",2);
        System.out.println(hum1.toString());
    }
    @Override
    public String toString() {
        return super.toString()+"Humain []";
    }


}
