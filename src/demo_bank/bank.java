package demo_bank;

import java.util.Objects;

public class bank {
	private String account_id;
	private int account_number;
	private int Balence;
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public int getBalence() {
		return Balence;
	}
	public void setBalence(int balence) {
		Balence = balence;
	}
	@Override
	public String toString() {
		return "bank [account_id=" + account_id + ", account_number=" + account_number + ", Balence=" + Balence + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(account_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		bank other = (bank) obj;
		return Objects.equals(account_id, other.account_id);
	}

}
