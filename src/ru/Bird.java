package ru;

public class Bird {
    private final BirdType birdType;

    public Bird(BirdType birdType) {
        this.birdType = birdType;
    }

    public double getSpeed() {
        return birdType.getSpeed();
    }
}
