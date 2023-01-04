package unit18.UseInterface;

import java.util.ArrayList;
import java.util.List;

/*
Вилларибо и Виллабаджо.
*/

public class Sol {
        static List<MusicalInstrument> orchestra = new ArrayList<>();

        public static void main(String[] args) {
            createKeyboardOrchestra();
            createStringedOrchestra();
            playOrchestra();
        }

        public static void createKeyboardOrchestra() {
            orchestra.add(new Piano());
            orchestra.add(new Piano());
            orchestra.add(new Piano());
            orchestra.add(new Organ());
        }

        public static void createStringedOrchestra() {
            orchestra.add(new Guitar());
            orchestra.add(new Violin());
            orchestra.add(new Violin());
        }

        public static void playOrchestra() {
            for(MusicalInstrument obj:orchestra){
                if (obj != null){
                    obj.play();
                }
            }
        }
    }

