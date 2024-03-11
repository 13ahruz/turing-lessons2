package az.edu.turing.module1.lesson4.familyBar;

public class Dog extends Pet{
    public Dog(Species species, String nickname) {
        super(species, nickname);
    }

    public Dog(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void eat(){
        System.out.println("Dog eats bone ...");
    }
}
