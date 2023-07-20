public class VaisseauDeGuerre extends Vaisseau{

    void attaque(Vaisseau vaisseauAttaquer, String arme, int duureeAttaque) {
        System.out.println("Un vaisseau de type "+this.type+" attaque un vaisseau de type "+vaisseauAttaquer.type+" en utilisant l'arme "+arme+" pendant "+duureeAttaque+" minutes.");
        vaisseauAttaquer.resistanceDuBouclier = 0;
        vaisseauAttaquer.blindage /= 2;
    }
}
