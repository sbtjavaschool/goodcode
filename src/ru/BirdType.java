package ru;

public enum BirdType {
    EUROPEAN {
        @Override
        public double getSpeed() {
            return 10;
        }
    },
    AFRICAN {
        @Override
        public double getSpeed() {
            return 100 / 85 * 17 + System.currentTimeMillis() / 100;
        }
    },
    NORWEGIAN {
        @Override
        public double getSpeed() {
            return 0;
        }
    },
    PINGVIN {
        @Override
        public double getSpeed() {
            return -10;
        }
    };

    public abstract double getSpeed();
}