package main.java.com.kush.problem.tree.binarytree;

import main.java.com.kush.problem.common.datastructure.tree.Node;
import main.java.com.kush.problem.common.datastructure.tree.treenode.TreeNodeIntegerImpl;

public class BTee {
    Node<Node<Integer,Integer>,Integer> root;

    public BTee(Node<Node<Integer,Integer>,Integer> root) {
        this.root = root;
    }

    public void setValue(Integer value)
    {
        this.root = setRecNode(this.root,value);
    }

    public Node<Node<Integer,Integer>,Integer> setRecNode(Node<Node<Integer,Integer>,Integer> root, Integer value)
    {
        if(root==null)
            return new TreeNodeIntegerImpl(value);
        if (root.getValue() < value)
        {
            root.setRight( setRecNode(root.getRight(),value));
        }
        else
        {
            root.setLeft(setRecNode(root.getLeft(),value));

        }

        return root;
    }
}
