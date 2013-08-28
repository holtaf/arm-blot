package com.holtaf.games.blot.card;

public enum Rank {
	ACE {
		@Override
		public String toString() {
			return "Ace";
		}
	}, SEVEN {
		@Override
		public String toString() {
			return "7";
		}
	}, EIGHT {
		@Override
		public String toString() {
			return "8";
		}
	}, NINE {
		@Override
		public String toString() {
			return "9";
		}
	}, TEN {
		@Override
		public String toString() {
			return "10";
		}
	}, JACK {
		@Override
		public String toString() {
			return "J";
		}
	}, QUEEN {
		@Override
		public String toString() {
			return "Q";
		}
	}, KING {
		@Override
		public String toString() {
			return "K";
		}
	}
}
