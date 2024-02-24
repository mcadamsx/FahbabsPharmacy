package dashboardLayout;

import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

import loginLayoutView.LoginPage;

@Route("dashboard")

public class DashBoard extends AppLayout {

	public DashBoard() {

		
		
		Image pharmacyLogo = new Image("image/pharmacy-icon.png", "");
		pharmacyLogo.getStyle().setWidth("45px");
		pharmacyLogo.getStyle().setPaddingLeft("40px");
		

		H2 pharmacyName = new H2("FAHBABS   PHARMACY");
		pharmacyName.getStyle().setFontSize("16px");
		pharmacyName.getStyle().setColor("#13698D");

		TextField searchBar = new TextField("", "search..");
		searchBar.getStyle().setWidth("710px");
		searchBar.setPrefixComponent(new Icon("vaadin", "search"));
		searchBar.getStyle().setPaddingLeft("100px");
		searchBar.addClassName("searchBar");

		Image accountLogo = new Image("DashBoard image/user.png", "");
		accountLogo.getStyle().setWidth("35px");
		accountLogo.getStyle().setPaddingLeft("100px");
		
	

		addToNavbar(pharmacyLogo,pharmacyName, searchBar, accountLogo);
		setPrimarySection(Section.DRAWER);
		
		
			


	}

}
