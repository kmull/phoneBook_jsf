package com.muller.myTelephoneBook.userDao;

import com.muller.myTelephoneBook.domain.MyUser;
import com.muller.myTelephoneBook.repository.UsersRepository;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class UserDaoBean implements UserDao {
    @EJB
    UsersRepository usersRepository;

    private MyUser myUser = new MyUser();
//    private List<MyUser> telephoneUsers = usersRepository.getUserTable();



    public MyUser getMyUser() {
        return myUser;
    }

    public void setMyUser(MyUser myUser) {
        this.myUser = myUser;
    }

    @Override
    public void addUser(MyUser myUser) {
        usersRepository.addUser(myUser);
    }

    @Override
    public List<MyUser> getUsers() {
        return usersRepository.getUserTable();
    }
}
