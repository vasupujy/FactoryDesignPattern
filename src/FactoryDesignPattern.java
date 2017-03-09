public class FactoryDesignPattern {
	public static void main(String[] args) {

		// get Confugration based on type
		// and print saperate configuration of pc and server
		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB",
				"2.4 GHz");
		// set configuration of server
		Computer server = ComputerFactory.getComputer("server", "16 GB",
				"1 TB", "2.9 GHz");
		// print confugiration of pc
		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}
}
