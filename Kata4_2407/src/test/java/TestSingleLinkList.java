import com.qsoft.kata.business.service.impl.SingleLinkList;
import com.qsoft.kata.persistence.entity.Node;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: anhnt
 * Date: 7/24/13
 * Time: 2:20 PM
 */
public class TestSingleLinkList
{
    SingleLinkList mySingleLinkList;
    Object[] objects;

    @Before
    public void setUp()
    {
        mySingleLinkList = new SingleLinkList();
        objects = new String[]{"s1","s2","s3","s4","s5","s6","s7","s8"};
    }

    @Test
    public void testCreateNewEmptySingleLinkList()
    {
        mySingleLinkList.createEmptySingleLinkList();
        Node node = mySingleLinkList.first();
        assertEquals(null, node.getCurrentNode());
        assertEquals(node.getNextNode(), null);
    }

    @Test
    public void testCreateNewEmptySingleLinkListFromArray()
    {
        mySingleLinkList.createSingleLinkListFromArrayObject(objects);
        Node nodeFirst = mySingleLinkList.first();
        assertEquals(null, nodeFirst.getCurrentNode());
        assertEquals(nodeFirst.getNextNode(), "s1");

        Node nodeLast = mySingleLinkList.last();
        assertEquals(nodeLast.getNextNode(), null);
        assertEquals("s8", nodeLast.getCurrentNode());
    }

    @Test
    public void testSize(){
        mySingleLinkList.createSingleLinkListFromArrayObject(objects);
        assertEquals(9, mySingleLinkList.size());
    }
}
