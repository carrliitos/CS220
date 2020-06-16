public final class Platypus extends Monotreme implements Aquatic {
	public Platypus(String name) {
		super(name);

		layEgg();
	}

	@Override
	public void swim(){
		System.out.printf("%s is swimming %n", name);
	}
}