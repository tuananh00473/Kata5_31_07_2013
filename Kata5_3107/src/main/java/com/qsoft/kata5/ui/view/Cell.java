package com.qsoft.kata5.ui.view;

import com.qsoft.kata5.ui.control.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * User: anhnt
 * Date: 7/31/13
 * Time: 1:49 PM
 */
public class Cell extends JButton implements ActionListener
{
    private boolean canTick;
    private Controller controller;

    public Cell(Controller controller)
    {
        this.controller = controller;
        canTick = true;
        addActionListener(this);
    }

    public boolean isCanTick()
    {
        return canTick;
    }

    public void setCanTick(boolean canTick)
    {
        this.canTick = canTick;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (isCanTick())
        {
            int flag = controller.getFlag();
            if (flag == 0)
            {
                setText("X");
            }
            else
            {
                setText("O");
            }
            setCanTick(false);
            controller.setFlag((flag + 1)%2);
        }
    }
}
