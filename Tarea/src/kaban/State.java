package kaban;

enum State {
	DO_TO("Por hacer"), IN_PROCESS("En proceso"), DONE("Hecha"), BACKLOG(
			"Pendiente");
	private String description;

	State(String description) {
		this.description = description;
	}

	public String toString() {
		return description;
	}
}