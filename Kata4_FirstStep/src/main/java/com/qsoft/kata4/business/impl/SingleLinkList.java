package com.qsoft.kata4.business.impl;

import com.qsoft.kata4.business.ISingleLinkList;
import com.qsoft.kata4.persistence.entity.Node;

import java.util.LinkedList;

/**
 * User: anhnt
 * Date: 7/23/13
 * Time: 1:50 PM
 */
public class SingleLinkList implements ISingleLinkList
{
    LinkedList myLinkList;

    @Override
    public void createEmptySingleLinkList()
    {
        myLinkList = new LinkedList();
    }

    @Override
    public void createSingleLinkListFromArrayObject(Object[] objects)
    {
        for(int i = 0; i < objects.length; i++){
            Node node = new Node(i, objects[i], i+1);
            myLinkList.add(node);
        }
        myLinkList.add(new Node());
    }

    @Override
    public int size()
    {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void insertAfter(Node n, Object o)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Node n)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node first()
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node last()
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node before(Node n)
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node after(Node n)
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node find(Object o)
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void append(Object data)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void insertFirst(Object data)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
