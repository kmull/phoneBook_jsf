package com.muller.myTelephoneBook.repository;

import com.muller.myTelephoneBook.domain.MyUser;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UsersRepository {

    @PersistenceContext(name = "pUnit")
    private EntityManager em;

    public void addUser(MyUser myUser) {
        em.persist(myUser);
    }

    public List<MyUser> getUserTable(){
        return em.createNamedQuery("getUserList").getResultList();
    }
}
