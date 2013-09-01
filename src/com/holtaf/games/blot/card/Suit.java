package com.holtaf.games.blot.card;

public enum Suit {
	SPADES {
		@Override
		public String toString() {
			return "♠";
		}
	}, HEARTS {
		@Override
		public String toString() {
			return "♥";
		}
	}, DIAMONDS {
		@Override
		public String toString() {
			return "♦";
		}

	}, CLUBS {
		@Override
		public String toString() {
			return "♣";
		}
	}
}
