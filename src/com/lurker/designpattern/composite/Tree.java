package com.lurker.designpattern.composite;

public class Tree {

    TreeNode root = null;

    public Tree(String name) {
        this.root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");
        TreeNode nodeE = new TreeNode("E");

        nodeB.add(nodeD);
        nodeB.add(nodeE);
        tree.root.add(nodeB);
        tree.root.add(nodeC);
        System.out.println("build the tree finished");
    }
}
