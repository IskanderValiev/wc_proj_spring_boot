<#ftl encoding='UTF-8'>
<!doctype html>
<html>
<head>
    <title>News</title>
    <link rel="stylesheet" href="/css/homestyle.css">
</head>
<body>
<div class="main">
    <div id="header">
        <div id="menu">
            <ul class="menu">
                <li><a href="/worldcup/homepage.jsp">Homepage</a></li>
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
    <div class="newsImage">
        <img src="${model.news.image}">
    </div>
    <div class="content">
        <div class="selected-news">

            <div class="newsHeader">
                <span>${model.news.header}</span>
            </div>
            <div class="newsContent">
                <span>${model.news.content}</span>
            </div>
        </div>
        <div class="comments">
            <#list model.comments as comment>
                <div class="comment">
                    <div class="user">
                        <div class="user-photo">
                            <img src="">
                        </div>
                        <div class="user-name">
                            <span>username</span>
                            <span>comment date</span>
                        </div>
                    </div>
                    <div class="commentText">
                        <span>comment text</span>
                    </div>
                </div>
            </#list>
            <div class="post-comment">
                <form action="" method="post">
                    <input type="text" name="text" placeholder="Write comment here...">
                    <input type="text" value="${model.comments.id}" style="height: 0; width: 0;">
                    <input type="submit" value="Send.">
                </form>
            </div>
        </div>
    </div>


</div>
</body>
</html>