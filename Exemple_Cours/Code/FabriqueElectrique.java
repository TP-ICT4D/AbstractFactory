public class FabriqueElectrique implements FabriqueVehicule {
    @Override
    public Scooter creerScooter() {
        return new ScooterElectrique();
    }

    @Override
    public Automobile creerAutomobile() {
        return new AutomobileElectrique();
    }
}
