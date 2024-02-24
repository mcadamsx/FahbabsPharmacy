package sidenav;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

import dashboardLayout.DashBoard;
import loginLayoutView.LoginPage;




@Route("sidenav")
public class asideNav  extends Div{
	
	public asideNav() {

		SideNav nav = new SideNav();

        SideNavItem dashboardLink = new SideNavItem("Dashboard", DashBoard.class, VaadinIcon.DASHBOARD.create());
        SideNavItem inboxLink = new SideNavItem("Inbox",  loginLayoutView.LoginPage.class, VaadinIcon.ENVELOPE.create());
//        SideNavItem calendarLink = new SideNavItem("Calendar",  DashBoard.class, VaadinIcon.CALENDAR.create());
//        SideNavItem settingsLink = new SideNavItem("Settings",  DashBoard.class, VaadinIcon.COG.create());
//        SideNavItem vaadinLink = new SideNavItem("Vaadin website", "https://vaadin.com", VaadinIcon.VAADIN_H.create());
//        
        nav.addItem(dashboardLink, inboxLink);

        Div navWrapper = new Div(nav);
        nav.setWidthFull();
        add(navWrapper);


        this.addClassName("side-nav-sample");

        
//        menu.add(new RouterLink("Home", LoginPage.class));	
	}

}
