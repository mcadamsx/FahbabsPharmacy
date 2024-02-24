package loginLayoutView;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

import dashboardLayout.DashBoard;

@Route( "loginview")
public class LoginPage extends Div {

	public LoginPage() {

		
		H2 pharmacyName = new H2("FAHBAS   PHARMACY");
		pharmacyName.getStyle().setFontSize("18px");
		pharmacyName.getStyle().setColor("#13698D");

		Image pharmacyLogo = new Image("image/pharmacy-icon.png", "");
		pharmacyLogo.getStyle().setWidth("100px");

		TextField usernameField = new TextField("", "username");
		usernameField.getStyle().setWidth("320px");
		usernameField.getStyle().setMarginTop("45px");
		usernameField.setPrefixComponent(new Icon("vaadin", "user"));

		PasswordField passwordField = new PasswordField("", "password");
		passwordField.getStyle().set("background-color", "#ffffff");
		passwordField.getStyle().setWidth("320px");
		passwordField.setPrefixComponent(VaadinIcon.LOCK.create());
		passwordField.setRequiredIndicatorVisible(true);

		Button LoginButton = new Button("Login", clickEvent  -> {
			String username = usernameField.getValue();
			String userpassword = passwordField.getValue();
			if ((username.equals("goddid@gmail.com")) && (userpassword.equals("1234"))) {
                 getUI().ifPresent(ui-> ui.navigate(dashboardLayout.DashBoard.class));
				Notification.show("Logged in successfullly");
			} else if ((username.equals("IsEmpty")) && (userpassword.equals("IsEmpty"))) {
				Notification.show(" error");
			} else {
     			Notification.show("enter details");
			}
			
		});
		
		
	
		LoginButton.getStyle().setBackgroundColor("#019DDE");
		LoginButton.getStyle().setWidth("320px");
		LoginButton.getStyle().setColor("white");
		LoginButton.getStyle().setMarginTop("20px");

		VerticalLayout LoginLayout = new VerticalLayout(pharmacyName, pharmacyLogo, usernameField, passwordField,LoginButton);
		LoginLayout.getStyle().setWidth("400px");
		LoginLayout.getStyle().setHeight("460px");
		LoginLayout.getStyle().setBackgroundColor("White");
		LoginLayout.getStyle().setMarginTop("70px");
		LoginLayout.setAlignItems(FlexComponent.Alignment.CENTER);
		LoginLayout.setJustifyContentMode(JustifyContentMode.CENTER);
		LoginLayout.getStyle().setMargin("420px");
		LoginLayout.getStyle().set("box-shadow", " 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19)");

		add(LoginLayout);

		
	}
}
