public final class Actions {
	private final String action; 

	public Actions(String action) {
		this.action = action;
	}

	public String getAction() {
		return action;
	}

	@Override
	public String toString() {
		return String.format("%s", action);
	}
}