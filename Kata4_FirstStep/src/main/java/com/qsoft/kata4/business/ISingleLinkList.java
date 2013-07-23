package com.qsoft.kata4.business;

import com.qsoft.kata4.persistence.entity.Node;

import java.util.LinkedList;

/**
 * User: anhnt
 * Date: 7/23/13
 * Time: 1:50 PM
 */
public interface ISingleLinkList
{
    public void createEmptySingleLinkList();
    public void createSingleLinkListFromArrayObject(Object[] objects);
    public int size();
    public void insertAfter(Node n, Object o);
    public void delete(Node n);
    public Node first();
    public Node last();
    public Node before(Node n);
    public Node after(Node n);
    public Node find(Object o);
    public void append(Object data);
    public void insertFirst(Object data);
}
