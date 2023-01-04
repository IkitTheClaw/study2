package unit18.UseInterface;

public class Organ implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет орган.");
    }
}
