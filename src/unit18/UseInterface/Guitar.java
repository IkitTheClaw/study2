package unit18.UseInterface;

public class Guitar implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет гитара.");
    }
}
