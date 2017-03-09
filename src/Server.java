public class Server extends Computer {
	private String ram;
	private String hdd;
	private String cpu;

	public Server(String ram, String hdd, String cpu) {
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;

	}

	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}
