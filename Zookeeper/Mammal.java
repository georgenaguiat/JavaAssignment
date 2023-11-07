package Zookeeper;

public class Mammal {
    protected int energy;

    public Mammal() {
        this.energy = 100;
    }

    public int displayEnergy() {
        System.out.println("Energy Level: " + energy);
        return energy;
    }
}

class Gorilla extends Mammal {
    public void throwSomething() {
        System.out.println("Gorilla throws something!");
        energy -= 5;
    }

    public void eatBananas() {
        System.out.println("Gorilla is satisfied by eating bananas!");
        energy += 10;
    }

    public void climb() {
        System.out.println("Gorilla climbs a tree!");
        energy -= 10;
    }
}

class Bat extends Mammal {
    public Bat() {
        this.energy = 300; // Energy level for a Bat starts at 300
    }

    public void fly() {
        System.out.println("Bat is airborne!");
        energy -= 50;
    }

    public void eatHumans() {
        System.out.println("Bat is satisfied by eating humans!");
        energy += 25;
    }

    public void attackTown() {
        System.out.println("Bat attacks a town!");
        energy -= 100;
    }
}
