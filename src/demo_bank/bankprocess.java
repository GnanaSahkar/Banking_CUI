package demo_bank;

import java.util.HashSet;
import java.util.Set;

public class bankprocess {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<bank> list = new HashSet<bank>();
		bank vo = new bank();
		vo.setAccount_id("Sahkar");
		vo.setAccount_number(123);
		vo.setBalence(5000);
		
		bank vo1 =new bank();
		vo1.setAccount_id("mani");
		vo1.setAccount_number(1234);
		vo1.setBalence(100000);
		
		bank vo2 = new bank();
		vo2.setAccount_id("Sahkar");
		vo2.setAccount_number(123);
		vo2.setBalence(5000);
		
		
		list.add(vo);
		list.add(vo1);
		list.add(vo2);
		
		for(bank obj:list) {
			System.out.println(obj);
		}
	}
}
	


