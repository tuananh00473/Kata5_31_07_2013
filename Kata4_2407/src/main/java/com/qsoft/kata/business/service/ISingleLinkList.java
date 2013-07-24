package com.qsoft.kata.business.service;

import com.qsoft.kata.persistence.entity.Node;

/**
 * User: anhnt
 * Date: 7/24/13
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
