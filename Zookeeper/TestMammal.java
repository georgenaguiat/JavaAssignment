package Zookeeper;

public class TestMammal {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        Bat bat = new Bat();

        gorilla.throwSomething();
        gorilla.displayEnergy();
        gorilla.eatBananas();
        gorilla.displayEnergy();
        gorilla.climb();
        gorilla.displayEnergy();

        bat.attackTown();
        bat.displayEnergy();
        bat.eatHumans();
        bat.displayEnergy();
        bat.fly();
        bat.displayEnergy();
    }
}