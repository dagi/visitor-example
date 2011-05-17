
package cz.dagblog.visitorexample;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class MarkerTest {

    @Test
    public void testVisitLeaf() {
        Leaf leaf = mock(Leaf.class);
        Marker marker = new Marker();
        marker.visitLeaf(leaf);
        verify(leaf, never()).setColor(anyString());
        marker.visitLeaf(leaf);
        verify(leaf).setColor(eq("yellow"));
    }

}
