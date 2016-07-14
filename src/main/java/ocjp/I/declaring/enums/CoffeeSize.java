package ocjp.I.declaring.enums;

public enum CoffeeSize {
	BIG(8),
	HUGE(10),
	OVERWHELMING(12) {
		@Override
		public String getLidCode() {
			return "A";
		}
	};

	private int ounces;

	CoffeeSize(int ounces) {
		this.ounces = ounces;
	}

	public String getLidCode() {
		return "B";
	}

	public int getOunces() {
		return ounces;
	}
}
