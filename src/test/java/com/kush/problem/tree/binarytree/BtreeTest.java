package test.java.com.kush.problem.tree.binarytree;

import main.java.com.kush.problem.common.datastructure.tree.treenode.TreeNodeIntegerImpl;
import main.java.com.kush.problem.tree.binarytree.BTee;
import org.junit.Assert;
import org.junit.Test;

public class BtreeTest
{
    @Test
    public void testsetvalue()
    {
        BTee bTee = new BTee(new TreeNodeIntegerImpl(7));
        bTee.setValue(8);
        bTee.setValue(6);
        bTee.setValue(9);
        Assert.assertNotNull(bTee);
    }
}
