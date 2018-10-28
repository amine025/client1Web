
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--        <link href="style/style.css" rel="stylesheet" type="text/css"/>-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
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
                <div class="col-6">
                    <fieldset class="border p-2">
                        <table >
                            <legend>
                                <h4 id="legendBienvenue"><fmt:message key="messageBienvenue" /></h4>
                            </legend>
                            <tr>
                                <td><label  for="poids"><fmt:message key="ddnClient" />:</label></td>
                                <td><input id="iBirthDay" type="number" name="birthDay" /></td>
                            </tr>
                            <tr colspan="2">
                                <td><input id="bEnvoyer" class="btn btn-info" type="submit" onclick="getData()" name="bEnvoyer" value="<fmt:message key="boutonEnvoyer" />"></td>
                            </tr>
                        </table>
                    </fieldset>
                    <h5 id="message"></h5>
                </div>
                <div class="col-3">
                </div>
            </div>
        </div>
        <script>
            var hMessage = document.getElementById('message');
            function getData() {

                var request = new XMLHttpRequest();
                var url = "TraitementServlet?birthDay=" + document.getElementById("iBirthDay").value;
                request.responseType = "text";
                request.open("GET", url, true);
                request.send();
                request.onreadystatechange = processData;
            }

            function processData() {
                if (this.readyState === 4 && this.status === 200) {
                    hMessage.innerHTML = '<br>' + this.responseText;
                }
            }
        </script>
    </body>
</html>
