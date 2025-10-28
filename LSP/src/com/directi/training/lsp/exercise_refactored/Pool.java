package com.directi.training.lsp.exercise_refactored;

public class Pool {
    public void run() {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();

        electricDuck.turnOn();

        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Quacking... ducks) {
        for (Quacking duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Swimming... ducks) {
        for (Swimming duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}