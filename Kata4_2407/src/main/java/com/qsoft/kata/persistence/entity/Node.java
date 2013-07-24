package com.qsoft.kata.persistence.entity;

/**
 * User: anhnt
 * Date: 7/24/13
 * Time: 1:36 PM
 */
public class Node
{
    private Object currentNode;
    private Object nextNode;

    public Node()
    {
    }

    public Node(Object currentNode, Object nextNode)
    {
        this.currentNode = currentNode;
        this.nextNode = nextNode;
    }

    public Object getCurrentNode()
    {
        return currentNode;
    }

    public void setCurrentNode(Object currentNode)
    {
        this.currentNode = currentNode;
    }

    public Object getNextNode()
    {
        return nextNode;
    }

    public void setNextNode(Object nextNode)
    {
        this.nextNode = nextNode;
    }
}
