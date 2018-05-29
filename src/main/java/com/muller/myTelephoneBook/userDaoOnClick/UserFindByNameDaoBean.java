package com.muller.myTelephoneBook.userDaoOnClick;

import com.muller.myTelephoneBook.domain.MyUser;
import com.muller.myTelephoneBook.repository.UsersRepository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

@ManagedBean
@SessionScoped
public class UserFindByNameDaoBean {

    @Inject
    UsersRepository usersRepository;


}
