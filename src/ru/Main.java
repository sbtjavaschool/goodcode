package ru;

import static ru.BirdType.AFRICAN;
import static ru.BirdType.NORWEGIAN;
import static ru.BirdType.PINGVIN;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird(NORWEGIAN);
        Bird bird1 = new Bird(AFRICAN);
        Bird bird2 = new Bird(PINGVIN);
    }
}
