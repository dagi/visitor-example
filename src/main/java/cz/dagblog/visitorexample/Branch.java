

package cz.dagblog.visitorexample;

import java.util.ArrayList;
import java.util.List;

public class Branch implements Visitable{

    private List<Leaf> leafs = new ArrayList<Leaf>();

    public List<Leaf> getLeafs() {
        return leafs;
    }

    public void setLeafs(final List<Leaf> leafs) {
        this.leafs = leafs;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visitBranch(this);
        for(int i = 0; i < leafs.size(); i++) {
            leafs.get(i).accept(visitor);
        }
    }
}
