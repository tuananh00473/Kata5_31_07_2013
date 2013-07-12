package com.qsoft.bak.persistence.model;

import javax.persistence.Transient;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * User: BinkaA
 * Date: 7/11/13
 * Time: 2:45 PM
 */
public class GenericDataModel
{

    @Transient
    protected final PropertyChangeSupport propertyChange = new PropertyChangeSupport(this);

    //    ----------------------Other Method------------------------------------------------
    public PropertyChangeSupport getChangeSupport() {
        return propertyChange;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChange.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChange.removePropertyChangeListener(listener);
    }
}
