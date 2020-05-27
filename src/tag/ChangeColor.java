package tag;

import entity.AdList;
import entity.User;

import javax.servlet.jsp.JspException;

import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class ChangeColor extends SimpleTagSupport {
    public void doTag() throws JspException, IOException {

        AdList adList = (AdList) getJspContext().getAttribute("ads", PageContext.APPLICATION_SCOPE);
        User currentUser = (User) getJspContext().getAttribute("authUser", PageContext.SESSION_SCOPE);
        if (currentUser.isColor()) {
            currentUser.setColor(false);
        }
        else currentUser.setColor(true);
    }
}
