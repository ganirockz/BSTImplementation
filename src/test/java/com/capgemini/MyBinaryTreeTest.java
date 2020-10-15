package com.capgemini;

import org.junit.*;

public class MyBinaryTreeTest {
	@Test
	public void giveThreeNumbersWhenAddedShouldReturnSizeThree() {
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<Integer>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		Assert.assertEquals(3, binaryTree.getSize());
	}

}
