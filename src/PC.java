public class PC extends Computer {
	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
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
