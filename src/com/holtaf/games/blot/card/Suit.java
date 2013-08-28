package com.holtaf.games.blot.card;

public enum Suit {
	SPADE {
		@Override
		public String toString() {
			return "♠";
		}
	}, HEART {
		@Override
		public String toString() {
			return "♥";
		}
	}, DIAMOND {
		@Override
		public String toString() {
			return "♦";
		}

	}, CLUB {
		@Override
		public String toString() {
			return "♣";
		}
	}
}
