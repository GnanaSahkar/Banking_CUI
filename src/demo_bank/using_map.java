package demo_bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class using_map {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,bank> list = new HashMap<Integer,bank>();
		bank vo = new bank();
		list.entrySet();
		vo.setAccount_id("Sahkar");
		vo.setAccount_number(123);
		vo.setBalence(5000);
		
		bank vo1 =new bank();
		list.entrySet();
		vo1.setAccount_id("mani");
		vo1.setAccount_number(1234);
		vo1.setBalence(100000);
		
		bank vo2 = new bank();
		list.entrySet();
		vo2.setAccount_id("Sahkar");
		vo2.setAccount_number(123);
		vo2.setBalence(5000);
		
		
		list.put(vo.getAccount_number(), vo);
		list.put(vo1.getAccount_number(),vo1);
		list.put(vo2.getAccount_number(),vo2);
		
		Set<Integer> key =list.keySet();
	
		bank bankVOObj = new bank();
		
		
		for(Integer obj: key ) {
			System.out.println("Key is " +obj);
			
			bankVOObj = list.get(obj);
			System.out.println("Value is "+bankVOObj.getAccount_number());
		}
	}

}
