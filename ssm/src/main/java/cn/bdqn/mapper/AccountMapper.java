package cn.bdqn.mapper;

import cn.bdqn.domin.Account;

import java.util.List;

public interface AccountMapper {

    //查询所有的账号
    public List<Account> selectAll();


    //保存账号
    public void insert(Account account);
}
