package com.coding.basic;

import junit.framework.Assert;

import org.junit.Test;

public class LinkedListTest extends LinkedList {

	@Test
	public void test() {
		List list = new LinkedList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(3, 33);
		list.add(0, 100);
		list.add(8,800);
		Assert.assertEquals(9, list.size());
		Assert.assertEquals(100, list.get(0));
		Assert.assertEquals(0, list.get(1));
		Assert.assertEquals(1, list.get(2));
		Assert.assertEquals(2, list.get(3));
		Assert.assertEquals(33, list.get(4));
		Assert.assertEquals(3, list.get(5));
		Assert.assertEquals(4, list.get(6));
		Assert.assertEquals(800, list.get(8));
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
