public class Client {
    public static void main(String[] args) {
        System.out.println("=== Exemple du cours : Abstract Factory (Exemple 2) ===");

        // Famille Essence
        System.out.println("\n--- Famille Essence ---");
        FabriqueVehicule fabriqueEssence = new FabriqueEssence();
        Scooter scooterEssence = fabriqueEssence.creerScooter();
        Automobile autoEssence = fabriqueEssence.creerAutomobile();
        scooterEssence.afficherScooter();
        autoEssence.afficherAutomobile();

        // Famille Electrique
        System.out.println("\n--- Famille Electrique ---");
        FabriqueVehicule fabriqueElectrique = new FabriqueElectrique();
        Scooter scooterElectrique = fabriqueElectrique.creerScooter();
        Automobile autoElectrique = fabriqueElectrique.creerAutomobile();
        scooterElectrique.afficherScooter();
        autoElectrique.afficherAutomobile();
    }
}
