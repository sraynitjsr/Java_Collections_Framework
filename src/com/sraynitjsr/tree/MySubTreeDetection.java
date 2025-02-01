package com.sraynitjsr.tree;

class TreeNode {
	int val;
	TreeNode left, right;

	TreeNode(int val) {
		this.val = val;
		left = right = null;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class Solution {
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if (subRoot == null) {
			return true;
		}
		if (root == null) {
			return false;
		}

		if (isIdentical(root, subRoot)) {
			return true;
		}

		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}

	private boolean isIdentical(TreeNode root, TreeNode subRoot) {
		if (root == null && subRoot == null) {
			return true;
		}
		if (root == null || subRoot == null) {
			return false;
		}
		return (root.val == subRoot.val) && isIdentical(root.left, subRoot.left)
				&& isIdentical(root.right, subRoot.right);
	}
}

class MySubTreeDetection {
	public static void start() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(4);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(0);

		TreeNode subRoot = new TreeNode(4);
		subRoot.left = new TreeNode(1);
		subRoot.right = new TreeNode(2);
		subRoot.right.left = new TreeNode(0);

		Solution solution = new Solution();
		boolean result = solution.isSubtree(root, subRoot);

		System.out.println("Subtree of Root => " + result);
	}
}
