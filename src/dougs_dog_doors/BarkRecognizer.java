package dougs_dog_doors;

public class BarkRecognizer {
    private DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void recognize(Bark bark) {
        System.out.println("BarkRecognizer: Heard a "+bark.getSound());
        if (dogDoor.getAllowedBark().equals(bark)) {
            dogDoor.open();
        } else {
            System.out.println("This dog is not allowed");
        }
    }
}
