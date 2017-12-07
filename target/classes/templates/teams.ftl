<#ftl encoding='UTF-8'>
<!DOCTYPE html>
<html lang="ru">
<head>
    <title>Teams</title>
    <meta charset="UTF-8">
    <meta name="description" content="Описание">
    <meta name="author" content="Iskander Valiev">
    <link rel="stylesheet" href="/css/homestyle.css">
</head>
<body>
<div class="main">
    <div id="header">
        <div id="menu">
            <ul class="menu">
                <li class="menu-href"><a href="/user/homepage">Homepage</a></li>
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
                <li><a href="/user/teams">Teams</a></li>
                <li><a href="/worldcup/galary.jsp">Galary</a></li>
                <li><a href="/user/contacts">Contacts</a></li>
            </ul>
        </div>
        <div id="profile-menu">
            <ul class="profile-menu">
                <li><a href="/">Profile</a></li>
                <li><a href="/exit">Exit</a></li>
            </ul>
        </div>
    </div>
    <hr>
    <div class="teams">
        <#list model.countries as country>
            <form action="/user/team/${country.id}/players" method="get">
                <div class="team">
                    <input type="image" src="${country.flag}" alt="${country.name}" value="${country.name}" name="countryName">
                    <div class="team_name">
                        <font size="30px">${country.name}</font>
                    </div>
                </div>
            </form>
        </#list>
    </div>
        <#if model.user.role == "ADMIN">
            <div class="add" style="margin: 20px 20px 20px 20px ">
                <a href="/admin/add/team">Add team</a>
            </div>
        </#if>
</div>
</body>
</html>