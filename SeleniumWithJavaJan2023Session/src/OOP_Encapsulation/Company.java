//Feb 13-2023-P1
package OOP_Encapsulation;

public class Company {

	private String name;
	private String totalEmployee;
	private int sharePrice;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTotalEmployee() {
		return totalEmployee;
	}
	public void setTotalEmployee(String totalEmployee) {
		this.totalEmployee = totalEmployee;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	
	private void getPrivacyPolicy() {
		System.out.println("get privacy policy");
	}
	
	public void getpolicyInfo() {
		getPrivacyPolicy();
	}
	
}
