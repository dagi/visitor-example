
package cz.dagblog.visitorexample;

public interface Visitor {

    public void visitTree(Tree tree);
    public void visitBranch(Branch branch);
    public void visitLeaf(Leaf leaf);
}
