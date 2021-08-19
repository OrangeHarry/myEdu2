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

		// HashMap�� ��ü���� �������� ��� ����
		Set set = map.keySet(); // set : ��������� �������� �ʴ� �÷���(����). ���⿡ HashMap�� Ű�� ������ �ִ´�.
		Iterator iterator = set.iterator();// �ݺ��ڿ� set�ݺ��� �ֱ�
		while (iterator.hasNext()) {// �ݺ��ڰ� ������ ������ ����(�ڵ����� hashNext�� ���� ���ϰ� true,false)
			String str = (String) iterator.next();// �ݺ��ڸ� ���ؼ� Ű�� �ϳ��� ��� �� Ű������ value�� ��´�.
			Integer value = (Integer) map.get(str);// Ű�� �־� ���� Integer������ ĳ�����Ѵ�.
			System.out.println("Key value is [" + str + "] " + "real value is [" + value + "]");
		}
		iterator = set.iterator();// ����� �ʱ�ȭ
		System.out.println("=====================================");

		map.remove("jane");
		System.out.println("02 map size is [" + map.size() + "]");
	}
}
