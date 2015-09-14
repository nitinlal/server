package chapter.one;

public class Apple {

	enum Color {
		GREEN("green"), RED("red");

		private String value;

		Color(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return value;
		}
	}

	private String color;

	public String getColor() {
		return color;
	}

	public Apple setColor(String color) {
		this.color = color;
		return this;
	}

	public Float getWeight() {
		return weight;
	}

	public Apple setWeight(Float weight) {
		this.weight = weight;
		return this;
	}

	private Float weight;

}
