package com.company.finalproject.service;

import com.company.finalproject.entity.Country;
import com.company.finalproject.entity.ExtUser;
import com.haulmont.chile.core.model.MetaClass;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.View;
import com.haulmont.cuba.security.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Service(DefaultCountryService.NAME)
public class DefaultCountryServiceBean implements DefaultCountryService {

    @Inject
    private Persistence persistence;
    @Inject
    private Metadata metadata;

    @Override
    @Transactional
    public Country getDefaultCountry(User user) {
        EntityManager entityManager = persistence.getEntityManager();

        MetaClass metaClass = metadata.getSession().getClass("finalproject$ExtUser");
        View view = metadata.getViewRepository().getView(metaClass, "extUser-view");
        ExtUser u;
        try {
            u = (ExtUser) user;
        } catch (ClassCastException e) {
            System.out.println("Admin user has no extensions");
            return null;
        }

        u = entityManager.find(ExtUser.class, u.getId(), view);
        return u != null ? u.getDefaultCountry() : null;
    }
}