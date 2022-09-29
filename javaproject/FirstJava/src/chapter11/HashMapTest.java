package chapter11;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String, SmartPhone> hashMap = new HashMap<>();

		hashMap.put("Spring", new SmartPhone("Spring", "010-1111-1111"));
		hashMap.put("king", new SmartPhone("King", "010-9999-3333"));
		System.out.println(hashMap.get("king"));

		// 똑같은 Key 값이 들어오면 Value 값이 후자로 덮어씌워짐
		hashMap.put("king", new SmartPhone("king", "010-7777-7777"));
		hashMap.put("Son", new SmartPhone("Son", "010-9911-3223"));

		System.out.println(hashMap.get("Son"));
		System.out.println(hashMap.get("son"));
		System.out.println(hashMap.get("king"));

		System.out.println("=======================");
		
		// 키 값들을 Set 객체로 받는다. 
		Set<String> keySet = hashMap.keySet();
		
		for(String key : keySet) {
			// System.out.println(key);
			System.out.println(key + "=" + hashMap.get(key));
		}
		
		
	}

}
