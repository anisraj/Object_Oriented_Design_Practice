package dougs_dog_doors;

public class DogDoorSimulator {
    public static void main() {
        DogDoor dogDoor = new DogDoor();
        Remote remote = new Remote(dogDoor);
        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("\nFido has gone outside...");
        remote.pressButton();
        System.out.println("\nFido is all done...");
        remote.pressButton();
        System.out.println("\nFido is back inside...");
        remote.pressButton();
    }
}
