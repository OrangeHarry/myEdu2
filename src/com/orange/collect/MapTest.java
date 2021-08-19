package com.orange.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("jane", 100);
		map.put("suji", 90);
		map.put("minsu", 80);

		System.out.println("map size is [" + map.size() + "]");
		System.out.println("map.get(key) value is [" + map.get("suji") + "]");
		System.out.println("=====================================");

		// HashMap의 전체값을 가져오는 방법 시작
		Set set = map.keySet(); // set : 저장순서가 유지되지 않는 컬렉션(집합). 여기에 HashMap의 키를 모조리 넣는다.
		Iterator iterator = set.iterator();// 반복자에 set반복자 넣기
		while (iterator.hasNext()) {// 반복자가 다음이 있을때 까지(자동으로 hashNext가 연산 리턴값 true,false)
			String str = (String) iterator.next();// 반복자를 통해서 키를 하나씩 얻고 그 키값으로 value를 얻는다.
			Integer value = (Integer) map.get(str);// 키를 넣어 값을 Integer형으로 캐스팅한다.
			System.out.println("Key value is [" + str + "] " + "real value is [" + value + "]");
		}
		iterator = set.iterator();// 사용후 초기화
		System.out.println("=====================================");

		map.remove("jane");
		System.out.println("02 map size is [" + map.size() + "]");
	}
}
