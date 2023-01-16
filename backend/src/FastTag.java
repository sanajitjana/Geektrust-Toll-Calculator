
public class FastTag {

	private String vehicleNumber;
	private Integer balance;

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public FastTag() {
		// TODO Auto-generated constructor stub
	}

	public FastTag(String vehicleNumber, Integer balance) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.balance = balance;
	}

}
