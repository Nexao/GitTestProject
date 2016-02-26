<%-- 
    Document   : Index
    Created on : Feb 25, 2016, 9:33:24 AM
    Author     : Emil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sucker on ma tits</h1>
        <form action="Servlet" method="POST">
            Name:
            <input type="text" name="pname" value="" /> <br>
            Team:
            <select name="team" size="1">
                <option>Aab</option>
                <option>AGF</option>
                <option>Broendby</option>
                <option>Esbjerg fB</option>
                <option>FC Koebenhavn</option>
                <option>FC Midtjylland</option>
                <option>FC Nordsjaelland</option>
                <option>Hobro IK</option>
                <option>OB</option>
                <option>Randers FC</option>
                <option>Soenderjyske</option>
                <option>Viborg</option>
            </select> <br>
            <input type="text" name="pnumber" value="" /> <br>
            
            Position --- GK: <input type="radio" id="r1" name="position" value="GK" />
            DEF: <input type="radio" id="r2" name="position" value="DEF" />
            MF: <input type="radio" id="r3" name="position" value="MF" />
            ATT: <input type="radio" id="r4" name="position" value="ATT" /><br>            
            <input type="submit" value="Submit" />             
        </form>
    </body>
</html>
