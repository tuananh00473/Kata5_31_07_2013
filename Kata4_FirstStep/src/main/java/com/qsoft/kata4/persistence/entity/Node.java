package com.qsoft.kata4.persistence.entity;

/**
 * User: anhnt
 * Date: 7/23/13
 * Time: 1:48 PM
 */
public class Node
{
    private int currentPosition;
    private Object value;
    private int nextPosition;

    public Node()
    {
    }

    public Node(int currentPosition, Object value, int nextPosition)
    {
        this.currentPosition = currentPosition;
        this.value = value;
        this.nextPosition = nextPosition;
    }

    public int getCurrentPosition()
    {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition)
    {
        this.currentPosition = currentPosition;
    }

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object value)
    {
        this.value = value;
    }

    public int getNextPosition()
    {
        return nextPosition;
    }

    public void setNextPosition(int nextPosition)
    {
        this.nextPosition = nextPosition;
    }
}
