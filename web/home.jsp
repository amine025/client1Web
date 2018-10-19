
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
    <head>
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fmt:setLocale value="${language}" />
        <!--pageContext.response.locale-->
        <fmt:setBundle basename="applicationRessources.applicationRessources" />
        <div class="container">
            <a href="CookieLanguageServlet?language=fr_FR&page=home.jsp">FR</a>
            <a href="CookieLanguageServlet?language=en_US&page=home.jsp">EN</a>
            <br>
            <div class="row">
                <div class="col-3">
                </div>
                <div class="col-5">
                    <fieldset class="border p-2">
                        <form name="f_Authentification" action="Authentification" method="POST">
                            <table >
                                <legend>
                                    <h2 id="legengAuthentfication"><fmt:message key="messageAuthentification" /></h2>
                                </legend>
                                <tr>
                                    <td><label id="lPoids" for="poids"><fmt:message key="poidClient" />:</label></td>
                                    <td><input type="text" name="poids" /></td>
                                </tr>
                                <tr>
                                    <td><label id="lPoids" for="poids"><fmt:message key="poidClient" />:</label></td>
                                    <td><input type="text" name="poids" /></td>
                                </tr>
                                <tr>
                                    <td><label id="lPoids" for="poids"><fmt:message key="poidClient" />:</label></td>
                                    <td><input type="text" name="poids" /></td>
                                </tr>
                                <tr colspan="2">
                                    <td><input id="b_valider" class="btn btn-info"  type="submit" name="b_valider" value="<fmt:message key="boutonValider" />"></td>
                                </tr>
                            </table>
                        </form>
                    </fieldset>
                </div>
                <div class="col-4">

                </div>
            </div>
        </div>
    </body>
</html>