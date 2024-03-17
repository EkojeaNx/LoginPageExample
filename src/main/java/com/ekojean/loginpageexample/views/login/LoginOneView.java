package com.ekojean.loginpageexample.views.login;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("loginone")
public class LoginOneView extends VerticalLayout {
    public LoginOneView() {

        LoginForm loginForm = new LoginForm();

        /* 
        this.getElement().getStyle().set("background-image", "url('images/anasayfa.jpg')");
        this.getElement().getStyle().set("background-repeat", "no-repeat");
        this.getElement().getStyle().set("background-size", "cover");
        this.getElement().getStyle().set("background-position", "center");
        */

        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        LoginI18n i18n = LoginI18n.createDefault();

        // Header
        LoginI18n.Form i18nForm = i18n.getForm();
        i18nForm.setTitle("Giriş");
        i18nForm.setUsername("Kullanıcı Adı");
        i18nForm.setPassword("Parola");
        i18nForm.setSubmit("Giriş Yap");
        i18nForm.setForgotPassword("Şifremi Unuttum!");

        i18n.setForm(i18nForm);

        // ErrorMessage
        LoginI18n.ErrorMessage i18nErrorMessage = i18n.getErrorMessage();
        i18nErrorMessage.setUsername("Kullanıcı Adı boş bırakılamaz!");
        i18nErrorMessage.setPassword("Parola boş bırakılamaz!");

        i18n.setErrorMessage(i18nErrorMessage);        

        loginForm.setI18n(i18n);

        loginForm.setAction("loginone");

        add(
            new H1("Giriş Sayfası Örneği"),
            loginForm
        );
    }
}
