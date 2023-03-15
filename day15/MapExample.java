package day15;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map1 = new HashMap<>();
		List<String> list1 = new ArrayList<>();
		map1.put(1, "one");
		System.out.println(map1.get(1));		
		map1.remove(1);
		System.out.println(map1.get(1));
	}

}
