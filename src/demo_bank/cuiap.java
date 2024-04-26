package demo_bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class cuiap {

	static Scanner sc = new Scanner(System.in);
	Map<Integer, bank> list = new HashMap<Integer, bank>();

	public static void main(String[] args) {
		int s = sc.nextInt();
		System.out.println("Create Accout");
		System.out.println("find by id");
		System.out.println("Close Account");

		cuiap obj = new cuiap();

		switch (s) {

		case 1:
			obj.createAccount();
			System.out.println("create Account");
			break;

		case 2:
			obj.findById();
			System.out.println("find acc by id");
			break;

		case 3:
			obj.closeAccount();
			System.out.println("close Account");
			break;

		case 4:
			System.out.println("Continue...???");
			break;

		default:
			System.out.println("slect right choice or exit");
			break;

		}

	}

	private void createAccount() {
		System.out.println("This is the create account method");
		String accountId = sc.next();
		int accountNumber = sc.nextInt();
		int balance = sc.nextInt();
		bank vo = new bank();
		vo.setAccount_id(accountId);
		vo.setAccount_number(accountNumber);
		vo.setBalence(balance);
		list.put(vo.getAccount_number(), vo);
		System.out.println(list);

	}

	private void findById() {

		System.out.println("this is for finding acc by id");
		System.out.println("enter the acc number");
		int accountNumber = sc.nextInt();
		bank b = new bank();
		b = list.get(accountNumber);
		System.out.println(b.getAccount_id());

	}

	private void closeAccount() {

		System.out.println("This for closing Account");
		
	}
}