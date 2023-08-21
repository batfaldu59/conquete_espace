public class VaisseauDeGuerre extends Vaisseau{

    boolean armesDesactivees;

    VaisseauDeGuerre(String type) {
        this.type = type;
        if (type.equals("CHASSEUR")) {
            tonnageMax = 0;
        } else if (type.equals("FREGATE")){
            tonnageMax = 50;
        } else if (type.equals("CROISEUR")) {
            tonnageMax = 100;
        }
    }

    void attaque(Vaisseau vaisseauAttaquer, String arme, int duureeAttaque) {

        System.out.println("Un vaisseau de type "+this.type+" attaque un vaisseau de type "+vaisseauAttaquer.type+" en utilisant l'arme "+arme+" pendant "+duureeAttaque+" minutes.");
        vaisseauAttaquer.resistanceDuBouclier = 0;
        vaisseauAttaquer.blindage /= 2;

    }

    void desactiverArmes() {
        armesDesactivees = true;
        System.out.println("Désactivation des armes d'un vaisseau de type "+type);
    }

    @Override
    void activerBouclier() {
        this.desactiverArmes();
        super.activerBouclier();
    }

    @Override
    int emporterCargaison(int cargaison) {

        if (type.equals("CHASSEUR")) {
            return cargaison;
        } else {
            if (nbPassagers < 12) {
                return cargaison;
            } else {
                int tonnagePassagers = 2 * nbPassagers;
                int tonnageRestant = tonnageMax - tonnageActuel;
                int tonnageAConsiderer = (tonnagePassagers < tonnageRestant ? tonnagePassagers : tonnageRestant);
                if (cargaison > tonnageAConsiderer) {
                    tonnageActuel = tonnageMax;
                    return cargaison - tonnageAConsiderer;
                } else {
                    tonnageActuel += cargaison;
                    return 0;
                }
            }
        }
    }
}
