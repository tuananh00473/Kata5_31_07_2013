package com.qsoft.bak.persistence.dao;

import com.qsoft.bak.persistence.model.BankAccountDTO;
import com.qsoft.bak.persistence.model.GenericDataModel;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/11/13
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
public interface GenericDAO
{
    public GenericDataModel find(long id);
    public GenericDataModel find(String accountNumber);
    public void create(GenericDataModel dataModel);
    public void update(GenericDataModel dataModel);
    public void delete(Class clazz, GenericDataModel dataModel);
    public List<GenericDataModel> getAll();
}
