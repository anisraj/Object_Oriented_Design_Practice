package dougs_dog_doors;

public class DogDoorSimulator {
    public static void main() {
        DogDoor dogDoor = new DogDoor();
        Remote remote = new Remote(dogDoor);

        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("\nFido has gone outside...");

        System.out.println("\nFido is all done...");

        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) { }

        System.out.println("but he is stuck outside...");

        System.out.println("\nFido starts barking...");

        System.out.println("...so Gine grabs the remote control.");

        remote.pressButton();

        System.out.println("\nFido is back inside...");

    }
}
