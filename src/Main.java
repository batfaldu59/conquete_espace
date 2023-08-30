import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;
        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;
        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;
        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        Atmosphere atmosphereUranus=new Atmosphere();
        atmosphereUranus.tauxHydrogene = new Float(83);
        atmosphereUranus.tauxHelium = new Float(15);
        atmosphereUranus.tauxMethane=new Float(2.5);
        atmosphereUranus.tauxAzote = new Float(0);
        uranus.atmosphere=atmosphereUranus;
        System.out.println("Le taux d'azote d'uranus est de "+uranus.atmosphere.tauxAzote+"%");
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
        Vaisseau fregate = new VaisseauDeGuerre("FREGATE");
        fregate.nbPassagers = 24;
        Vaisseau croiseur = new VaisseauDeGuerre("CROISEUR");
        Vaisseau cargo = new VaisseauCivil("CARGO");
        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");

//        System.out.println("Quel vaisseau voulez-vous manipuler ?");
//        String vaisseauChoisie = sc.nextLine();
//        System.out.println("Sur quelle planete téllurite voulez-vous vous poser ? (Mercure, Venus, Terre, Mars)");
//        String planete = sc.nextLine();
//        System.out.println("Quelle tonage voulez-vous embarquer ?");
//        int tonnage = sc.nextInt();
//
//        Vaisseau vaisseau = null;
//        switch (vaisseauChoisie) {
//            case "CHASSEUR":
//                vaisseau = chasseur;
//                break;
//            case "FREGATE":
//                vaisseau = fregate;
//                break;
//            case "CROISEUR":
//                vaisseau = croiseur;
//                break;
//            case "CARGO":
//                vaisseau = cargo;
//                break;
//            case "VAISSEAU-MONDE":
//                vaisseau = vaisseauMonde;
//                break;
//        }
//
//        PlaneteTellurique planeteSelectionner = null;
//        switch (planete) {
//            case "Mercure":
//                planeteSelectionner = mercure;
//                break;
//            case "Terre":
//                planeteSelectionner = terre;
//                break;
//            case "Venus":
//                planeteSelectionner = venus;
//                break;
//            case "Mars":
//                planeteSelectionner = mars;
//                break;
//        }
//
//        planeteSelectionner.accueillirVaisseau(vaisseau);
//        int rejet = vaisseau.emporterCargaison(tonnage);
//        System.out.println("Tonnage rejeté est de "+rejet);




    }
}