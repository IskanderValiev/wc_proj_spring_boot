<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Profile</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div id="container">
    <div id="header">
        <div id="menu">
            <ul class="menu">
                <li><a href="/user/homepage">Homepage</a></li>
                <li><a href="/worldcup/matches.jsp">Matches</a>
                    <ul>
                        <li><a href="#">Group A</a></li>
                        <li><a href="#">Group B</a></li>
                        <li><a href="#">Group C</a></li>
                        <li><a href="#">Group D</a></li>
                        <li><a href="#">Group E</a></li>
                        <li><a href="#">Group F</a></li>
                        <li><a href="#">Group G</a></li>
                        <li><a href="#">Group H</a></li>
                    </ul>
                </li>
                <li><a href="/worldcup/cities.jsp">Cities</a>
                    <ul>
                        <li><a href="#">Kazan</a></li>
                        <li><a href="#">Moscow</a></li>
                        <li><a href="#">St. Petersburg</a></li>
                        <li><a href="#">Sochi</a></li>
                        <li><a href="#">Kaliningrad</a></li>
                        <li><a href="#">Saransk</a></li>
                        <li><a href="#">Nizhniy Novgorod</a></li>
                        <li><a href="#">Rostov-On-Don</a></li>
                        <li><a href="#">Volgograd</a></li>
                        <li><a href="#">Ekaterinburg</a></li>
                        <li><a href="#">Samara</a></li>
                    </ul>
                </li>
                <li><a href="#">Stadiums</a></li>
                <li><a href="/teams">Teams</a></li>
                <li><a href="/worldcup/galary.jsp">Galary</a></li>
                <li><a href="/worldcup/contact.jsp">Contacts</a></li>
            </ul>
        </div>
        <div id="profile-menu">
            <ul class="profile-menu">
                <li><a href="/profile">Profile</a></li>
                <li><a href="/exit">Exit</a></li>
            </ul>
        </div>
    </div>
    <hr>
    <div id="content">
        <div class="image">
            <img src="/images/null.jpg" width="200" height="200" style="background-color: white;">
            <a href=""></a>
        </div>

        <div class="information">
            <table class="info">
                <tr>
                    <td><label style="font-size: 40px;">${model.user.name} ${model.user.lastname}</label></td>
                </tr>
                <tr style="height: 5px">
                    <td style="height: 2px"><hr></td>
                    <td><div class="edit">
                        <a href="/editprofile" style="margin-bottom: 0">edit</a>
                    </div></td>
                </tr>
                <tr>
                    <td><label>Bday: ${model.user.bday}</label></td>
                </tr>
                <tr>
                    <td><label>City: ${model.user.city}</label></td>
                </tr>
                <tr>
                    <#if model.user.gender?c == "true">
                        <td><label>Gender: Male</label></td>
                    <#else>
                        <td><label>Gender: Female</label></td>
                    </#if>
                </tr>
                <tr>
                    <td><label>E-mail: ${model.user.email}</label></td>
                </tr>
                <tr>
                    <td><label>Instagram:</label></td>
                </tr>
            </table>
        </div>
    </div>

    <div id="footer">
        <img src="/images/sponsors.png" usemap="#mymap">
    </div>

    <map name="mymap">
        <area shape="rect" coords="1.06,4.00,5.82,5.80" href="http://adidas.com/">
    </map>
</div>
</body>
</html>