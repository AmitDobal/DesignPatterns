package design.prototype;

public class NetworkConnection implements Cloneable {
	private String ip;
	private String data;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "NetworkConnection [Ip=" + ip + ", data=" + data + "]";
	}
	
	public String loadData(){
		System.out.println("Loading data.......");
		try {
			Thread.sleep(3000);
			this.data = "Network Data";
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Data loaded.......");
		return "Network Data";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("This is finalised");
		super.finalize();
	}

}
