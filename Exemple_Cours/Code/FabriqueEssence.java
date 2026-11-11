public class FabriqueEssence implements FabriqueVehicule {
    @Override
    public Scooter creerScooter() {
        return new ScooterEssence();
    }

    @Override
    public Automobile creerAutomobile() {
        return new AutomobileEssence();
    }
}
