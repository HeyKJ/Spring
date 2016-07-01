package sample.bankapp;

import java.util.HashMap;
import java.util.Map;

public class FixedDepositDetails {
	private long id;
	private float depositAmount;
	private int tenure;
	private String email;
	public long getId() {
		return id;
	}
	public float getDepositAmount() {
		return depositAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public String getEmail() {
		return email;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setDepositAmount(float depositAmount) {
		this.depositAmount = depositAmount;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public FixedDepositDetails(long id, float depositAmount, int tenure, String email) {
		super();
		this.id = id;
		this.depositAmount = depositAmount;
		this.tenure = tenure;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return id+depositAmount+tenure+email;
	}
	
}
