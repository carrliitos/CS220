public abstract class Monotreme extends Mammal implements EggLayer {
	public Monotreme(String name) {
		super(name);
	}

	@Override
	public final void layEgg(){
		System.out.printf("%s laid an egg%n", name);
	}
}