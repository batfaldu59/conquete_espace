public abstract class Vaisseau {
    String type;
    int nbPassagers;
    int blindage;
    int resistanceDuBouclier;
    int tonnageMax;
    int tonnageActuel;




    void activerBouclier() {
        System.out.println("Activation d'un vaisseau de type "+type);
    }

    void desactiverBouclier() {
        System.out.println("Désactivation d'un vaisseau de type "+type);
    }

    abstract int emporterCargaison(int cargaison);
}
