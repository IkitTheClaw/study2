package unit18.UseInterface;

public class Piano implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет пианино.");
    }
}
