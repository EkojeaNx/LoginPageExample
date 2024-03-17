package com.ekojean.loginpageexample.views.login;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route("loginerror")
public class LoginErrorView extends VerticalLayout {
    public LoginErrorView() {
        LoginOverlay loginOverlay = new LoginOverlay();

        // i18n
        LoginI18n i18n = LoginI18n.createDefault();

        // Header
        LoginI18n.Header i18nHeader = new LoginI18n.Header();
        i18nHeader.setTitle("Giriş Sayfası Örneği");
        i18nHeader.setDescription("Giriş sayfası");

        i18n.setHeader(i18nHeader);

        // Form
        LoginI18n.Form i18nForm = i18n.getForm();
        i18nForm.setTitle("Giriş İşlemi");
        i18nForm.setUsername("Kullanıcı Adı");
        i18nForm.setPassword("Parola");
        i18nForm.setSubmit("Giriş Yap");
        i18nForm.setForgotPassword("Şifremi Unuttum!");

        i18n.setForm(i18nForm);

        // ErrorMessage
        LoginI18n.ErrorMessage i18nErrorMessage = i18n.getErrorMessage();
        i18nErrorMessage.setTitle("Giriş İşlemi Başarısız!");
        i18nErrorMessage.setMessage("Kullanıcı Adı veya Parola yanlış! Tekrar deneyiniz.");
        i18nErrorMessage.setUsername("Kullanıcı Adı boş bırakılamaz!");
        i18nErrorMessage.setPassword("Parola boş bırakılamaz!");

        i18n.setErrorMessage(i18nErrorMessage);

        // Footer
        Paragraph footerTitle = new Paragraph("EkojeaN");
        footerTitle.addClassName(LumoUtility.TextAlignment.CENTER);
        loginOverlay.getFooter().add(footerTitle);
        
        loginOverlay.setError(true);

        loginOverlay.setI18n(i18n);

        loginOverlay.setAction("logintwo");
        loginOverlay.setOpened(true);

        add(
            loginOverlay
        );
    }
}
