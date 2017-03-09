public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd,
			String cpu) {
		// pass dynamic in main method to call if pc then print config
		if ("PC".equalsIgnoreCase(type))
			return new PC(ram, hdd, cpu);
		else if ("Server".equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);
		return null;

	}
}
