<#ftl encoding='UTF-8'>
<!DOCTYPE html>
<html lang="ru">
<head>
    <title>${model.country}</title>
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
    <div class="content">
        <div class="country">
            <h1>${model.country}</h1>
        </div>
        <div class="squad">
            <table class="teamsquad">
                <tr>
                    <th>#</th>
                    <th>Pos</th>
                    <th>Name</th>
                    <th>Surname</th>
                    <th>Age</th>
                    <th>Country</th>
                </tr>
                <#list model.players as player>
                    <form action="/playerinfo" method="get">
                        <tr>
                            <td>${player.number}</td>
                            <td>${player.position}</td>
                            <td><input type="submit" name="playerName" value="${player.name}" style="background-color: rgba(0, 0, 0, 0); border: none; color: white;"></td>
                            <td>${player.lastname}</td>
                            <td>${player.age}</td>
                            <td>${model.country}</td>
                        </tr>
                    </form>
                </#list>
            </table>
        </div>
    </div>
</div>
</body>
</html>