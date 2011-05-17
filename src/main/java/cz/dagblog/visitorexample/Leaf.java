

package cz.dagblog.visitorexample;

public class Leaf implements Visitable{

    private String color = "green";

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visitLeaf(this);
    }
}
