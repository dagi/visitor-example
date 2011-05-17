/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.dagblog.visitorexample;

public class Marker implements Visitor{

    @Override
    public void visitBranch(final Branch branch) {
    }

    @Override
    public void visitTree(final Tree tree) {
    }

    private int leafCounter = 1;
    @Override
    public void visitLeaf(final Leaf leaf) {
        if(leafCounter % 2 == 0) {
            leaf.setColor("yellow");
        }
        leafCounter++;
    }
}
