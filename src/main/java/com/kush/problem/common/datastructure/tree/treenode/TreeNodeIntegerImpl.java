package main.java.com.kush.problem.common.datastructure.tree.treenode;

import main.java.com.kush.problem.common.datastructure.tree.Node;

public class TreeNodeIntegerImpl implements Node<Node<Integer,Integer>,Integer>
{
    Node<Integer,Integer> leftnode;
    Node<Integer,Integer> rightnode;
    Integer value;

    public TreeNodeIntegerImpl(Integer value) {
        this.value = value;
    }

    public Node getLeft() {
        return leftnode;
    }

    @Override
    public void setLeft(Node<Integer,Integer> left) {

        this.leftnode = left;
    }

    public Node getRight() {
        return rightnode;
    }

    @Override
    public void setRight(Node<Integer,Integer> right) {
        this.rightnode = right;
    }

    public Integer getValue() {
        return value;
    }

}
