
package cz.dagblog.visitorexample;

import java.util.ArrayList;
import java.util.List;

public class Tree implements Visitable{

    private List<Branch> branches = new ArrayList<Branch>();

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(final List<Branch> branches) {
        this.branches = branches;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visitTree(this);
        for(int i = 0; i < branches.size(); i++) {
            branches.get(i).accept(visitor);
        }
    }
}
