package controleur;

import java.io.IOException;
import java.util.Locale;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LanguageServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean trouve = false;
        String language =null;
        String langue = null;
        HttpSession session = request.getSession();
        Locale locale = request.getLocale();

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie c = cookies[i];
                if (c.getName().equals("language")) {
                    trouve = true;
                    langue = c.getValue();
                    session.setAttribute("language", langue);
                    break;
                }
            }
        }

        if (trouve == false) {
            language = locale.getLanguage();
            switch (language) {
                case "fr":
                    langue = "fr_FR";
                    break;
                case "en":
                    langue = "en_US";
                    break;
                case "ar":
                    break;
            }
            session.setAttribute("language", langue);
        }

        RequestDispatcher disp = request.getRequestDispatcher("/home.jsp");
        disp.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
