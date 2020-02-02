//credits: https://www.journaldev.com/1425/builder-design-pattern-in-java

/*Objective - to build the object in steps and method that will return the final Object*/

/*class whose final object is to be created*/
class Computer {

	private final String RAM;
	private final String CPU;

	private int power;
	private boolean isGPU;

	/* Takes in Builder class object to set values on Compute class object */
	public Computer(ComputerBuilder builder) {
		this.RAM = builder.RAM;
		this.CPU = builder.CPU;
		this.power = builder.power;
		this.isGPU = builder.isGPU;
	}

	@Override
	public String toString() {
		return "Computer Config [" + RAM + ", " + CPU + ", " + power + ", " + isGPU + "]";
	}

	/* Builder class */
	static class ComputerBuilder {
		/* required */
		private final String RAM;
		private final String CPU;

		/* optional */
		private int power;
		private boolean isGPU;

		public ComputerBuilder(String RAM, String CPU) {
			this.RAM = RAM;
			this.CPU = CPU;
		}

		public ComputerBuilder setPower(int power) {
			this.power = power;
			return this;
		}

		public ComputerBuilder setGPU(boolean isGPU) {
			this.isGPU = isGPU;
			return this;
		}

		/*
		 * a method finally to return the constructed object (returns the Computer
		 * Object)
		 */
		public Computer build() {
			return new Computer(this);
		}

	}

}

/* Test */
class BuilderPattern {

	public static void main(String[] args) {
		Computer obj = new Computer.ComputerBuilder("16 GB Patriot", "Intel I9").setPower(1200).setGPU(true).build();
		System.out.println(obj);

		Computer obj2 = new Computer.ComputerBuilder("16 GB Patriot", "AMD Ryen 7").setPower(1200).build();
		System.out.println(obj2);

	}
}