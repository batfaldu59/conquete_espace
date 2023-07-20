public class Vaisseau {
    String type;
    int nbPassagers;
    int blindage;
    int resistanceDuBouclier;


    void activerBouclier() {
        System.out.println("Activation d'un vaisseau de type "+type);
    }

    void desactiverBouclier() {
        System.out.println("Désactivation d'un vaisseau de type "+type);
    }
}
