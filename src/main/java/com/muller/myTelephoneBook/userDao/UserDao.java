package com.muller.myTelephoneBook.userDao;

import com.muller.myTelephoneBook.domain.MyUser;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UserDao {

    public void addUser(MyUser myUser);

    public List<MyUser> getUsers();

    public MyUser findMyUser(String name, String surname);
}
