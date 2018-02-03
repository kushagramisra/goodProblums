package main.java.com.kush.problem.common.datastructure.tree;

public interface Node<T,U> {

    public U getValue();
    public void setRight(T input);
    public void setLeft(T input);
    public Node getLeft();
    public Node getRight();
}
