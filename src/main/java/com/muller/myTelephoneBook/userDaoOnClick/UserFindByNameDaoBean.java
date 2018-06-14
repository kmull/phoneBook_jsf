package com.muller.myTelephoneBook.userDaoOnClick;

import com.muller.myTelephoneBook.domain.MyUser;
import com.muller.myTelephoneBook.repository.UsersRepository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@ManagedBean
@SessionScoped
public class UserFindByNameDaoBean implements UserFindByNameDao {

    @Inject
    private UsersRepository usersRepository;
    private MyUser findMyUser;
    private String name;
    private String surname;

    public void updateFindResult(ActionEvent e) {
        findMyUser = usersRepository.getFindUser(name, surname);
    }

    @Override
    public MyUser findMyUser() {
        findMyUser = usersRepository.getFindUser(name, surname);
        return findMyUser;
    }

    public void setFindMyUser(MyUser findMyUser) {
        this.findMyUser = findMyUser;
    }
}
