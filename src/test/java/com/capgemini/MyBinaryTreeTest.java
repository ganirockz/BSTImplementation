package com.capgemini;

import org.junit.*;
import java.io.*;
public class MyBinaryTreeTest {
	@Test
	public void giveThreeNumbersWhenSearchShouldReturnRequiredNode() {
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<Integer>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(11);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		MyBinaryNode<Integer> myNode = binaryTree.search(63);
		Assert.assertEquals((Integer)63, myNode.key);
	}

}
