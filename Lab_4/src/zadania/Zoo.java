package zadania;

import animals.*;

import java.sql.SQLOutput;
import java.util.Random;

public class Zoo {
    Animal[] animal =  new Animal[100];
    private Random rand = new Random();

    public void setAnimal() {
        for(int i = 0; i < animal.length; i++){
            int liczba = rand.nextInt(3);
            switch (liczba) {
                case 0:
                    animal[i] = new Parrot();
                    break;
                case 1:
                    animal[i] = new Dog() {
                    };
                    break;
                case 2:
                    animal[i] = new Snake() {
                        @Override
                        public String getDescription() {
                            return "";
                        }
                    };
                    break;
            }
        }
     }

    static void main() {
        Zoo zoo = new Zoo();
        System.out.println();
        System.out.println();
    }
}
