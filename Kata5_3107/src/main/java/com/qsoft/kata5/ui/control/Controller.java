package com.qsoft.kata5.ui.control;

import com.qsoft.kata5.ui.view.MainGui;

/**
 * User: anhnt
 * Date: 7/31/13
 * Time: 2:20 PM
 */
public class Controller
{
    private MainGui mainGui;
    private int flag;

    public Controller()
    {
        mainGui = new MainGui(this);
    }

    public int getFlag()
    {
        return flag;
    }

    public void setFlag(int flag)
    {
        this.flag = flag;
    }
}
