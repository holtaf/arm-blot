package com.holtaf.games.blot.card;

public enum Rank {
    ACE {
        @Override
        public String toString() {
            return "Ace";
        }

        @Override
        public int getValueForNonTrump() {
            return 11;
        }

        @Override
        public int getValueForTrump() {
            return 11;
        }

        @Override
        public int getValueFroNoTrump() {
            return 19;
        }

        @Override
        public int getValueForAllTrump() {
            return 6;
        }
    }, SEVEN {
        @Override
        public String toString() {
            return "7";
        }

        @Override
        public int getValueForNonTrump() {
            return 0;
        }

        @Override
        public int getValueForTrump() {
            return 0;
        }

        @Override
        public int getValueFroNoTrump() {
            return 0;
        }

        @Override
        public int getValueForAllTrump() {
            return 0;
        }
    }, EIGHT {
        @Override
        public String toString() {
            return "8";
        }

        @Override
        public int getValueForNonTrump() {
            return 0;
        }

        @Override
        public int getValueForTrump() {
            return 0;
        }

        @Override
        public int getValueFroNoTrump() {
            return 0;
        }

        @Override
        public int getValueForAllTrump() {
            return 0;
        }
    }, NINE {
        @Override
        public String toString() {
            return "9";
        }

        @Override
        public int getValueForNonTrump() {
            return 0;
        }

        @Override
        public int getValueForTrump() {
            return 14;
        }

        @Override
        public int getValueFroNoTrump() {
            return 0;
        }

        @Override
        public int getValueForAllTrump() {
            return 9;
        }
    }, TEN {
        @Override
        public String toString() {
            return "10";
        }

        @Override
        public int getValueForNonTrump() {
            return 10;
        }

        @Override
        public int getValueForTrump() {
            return 10;
        }

        @Override
        public int getValueFroNoTrump() {
            return 10;
        }

        @Override
        public int getValueForAllTrump() {
            return 5;
        }
    }, JACK {
        @Override
        public String toString() {
            return "J";
        }

        @Override
        public int getValueForNonTrump() {
            return 2;
        }

        @Override
        public int getValueForTrump() {
            return 20;
        }

        @Override
        public int getValueFroNoTrump() {
            return 2;
        }

        @Override
        public int getValueForAllTrump() {
            return 14;
        }
    }, QUEEN {
        @Override
        public String toString() {
            return "Q";
        }

        @Override
        public int getValueForNonTrump() {
            return 3;
        }

        @Override
        public int getValueForTrump() {
            return 3;
        }

        @Override
        public int getValueFroNoTrump() {
            return 3;
        }

        @Override
        public int getValueForAllTrump() {
            return 1;
        }
    }, KING {
        @Override
        public String toString() {
            return "K";
        }

        @Override
        public int getValueForNonTrump() {
            return 4;
        }

        @Override
        public int getValueForTrump() {
            return 4;
        }

        @Override
        public int getValueFroNoTrump() {
            return 4;
        }

        @Override
        public int getValueForAllTrump() {
            return 3;
        }
    };

    public abstract int getValueForNonTrump();

    public abstract int getValueForTrump();

    public abstract int getValueFroNoTrump();

    public abstract int getValueForAllTrump();
}
