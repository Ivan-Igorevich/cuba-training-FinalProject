package com.company.finalproject.web.autoproducer;

import com.company.finalproject.service.DefaultCountryService;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.finalproject.entity.AutoProducer;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.global.UserSession;

import javax.inject.Inject;

public class AutoProducerEdit extends AbstractEditor<AutoProducer> {
    @Inject
    private DefaultCountryService defaultCountryService;

    @Inject
    private UserSession userSession;

    @Override
    protected void initNewItem(AutoProducer item) {
        super.initNewItem(item);
        User user = userSession.getUser();
        item.setCountry(defaultCountryService.getDefaultCountry(user));
    }
}