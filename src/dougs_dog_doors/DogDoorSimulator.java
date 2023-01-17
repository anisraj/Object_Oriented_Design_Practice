package dougs_dog_doors;

public class DogDoorSimulator {
    public static void main() {
        DogDoor dogDoor = new DogDoor();
        dogDoor.setAllowedBark(new Bark("woof"));
        BarkRecognizer barkRecognizer = new BarkRecognizer(dogDoor);
        Remote remote = new Remote(dogDoor);

        System.out.println("Fido starts barking...");
        barkRecognizer.recognize(new Bark("woof"));

        System.out.println("\nFido has gone outside...");

        System.out.println("\nFido is all done...");

        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) { }

        System.out.println("but he is stuck outside...");

        System.out.println("\nFido starts barking...");

        barkRecognizer.recognize(new Bark("woof"));

        System.out.println("\nFido is back inside...");

    }
}
