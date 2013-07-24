package com.qsoft.kata.business.service.impl;

import com.qsoft.kata.business.service.ISingleLinkList;
import com.qsoft.kata.persistence.entity.Node;

import java.util.LinkedList;

/**
 * User: anhnt
 * Date: 7/24/13
 * Time: 1:50 PM
 */
public class SingleLinkList implements ISingleLinkList
{
    public static final Object START_OBJECT = null;
    public static final Object END_OBJECT = null;

    LinkedList<Node> myLinkList = new LinkedList<Node>();

    @Override
    public void createEmptySingleLinkList()
    {
        myLinkList.add(new Node(START_OBJECT, END_OBJECT));
    }

    @Override
    public void createSingleLinkListFromArrayObject(Object[] objects)
    {
        myLinkList.add(new Node(START_OBJECT, objects[0]));
        for(int i = 0; i < objects.length-1; i++){
            Node node = new Node(objects[i], objects[i+1]);
            myLinkList.add(node);
        }
        myLinkList.add(new Node(objects[objects.length-1], END_OBJECT));
    }

    @Override
    public int size()
    {
        return myLinkList.size();
    }

    @Override
    public void insertAfter(Node n, Object o)
    {
        Node node = new Node(o, after(n).getCurrentNode());
        myLinkList.add(node);
        before(n).setNextNode(node.getCurrentNode());
    }

    @Override
    public void delete(Node n)
    {
        before(n).setNextNode(after(n).getCurrentNode());
        myLinkList.remove(n);
    }

    @Override
    public Node first()
    {
        for (Node node : myLinkList){
            if(node.getCurrentNode() == null){
                return node;
            }
        }
        return null;
    }

    @Override
    public Node last()
    {
        for (Node node : myLinkList){
            if(node.getNextNode() == null){
                return node;
            }
        }
        return null;
    }

    @Override
    public Node before(Node n)
    {
        for (Node node : myLinkList){
            if(n.getCurrentNode() == node.getCurrentNode()){
                return node;
            }
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node after(Node n)
    {
        for (Node node : myLinkList){
            if(n.getCurrentNode() == node.getNextNode()){
                return node;
            }
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node find(Object o)
    {
        Node node = first();
        while(node != last()){
            if(node.getCurrentNode().equals(o)){
                return node;
            }
            else{
                node = after(node);
            }
        }
        return null;
    }

    @Override
    public void append(Object data)
    {
        Node nodeLast = last();
        Node node = new Node(data, END_OBJECT);
        myLinkList.add(node);
        nodeLast.setNextNode(node.getCurrentNode());
    }

    @Override
    public void insertFirst(Object data)
    {
        Node nodeFirst = first();
        Node node = new Node(START_OBJECT, data);
        myLinkList.add(node);
        nodeFirst.setCurrentNode(node.getNextNode());
    }
}
