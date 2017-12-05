<#ftl encoding='UTF-8'>
<!doctype html>
<html>
<head>
    <title>News</title>
    <link rel="stylesheet" href="/css/homestyle.css">
    <script src="/js/jquery.js"></script>
    <script src="/js/post_comment.js"></script>
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
                            <img src="/files/${comment.author.photo.storageFileName}" style="width: 128px; height: 128px">
                        </div>
                        <div class="user-name">
                            ${comment.author.name} ${comment.author.lastname}
                            <br>
                            ${comment.date}
                        </div>
                    </div>
                    <div class="commentText">
                        ${comment.content}
                    </div>
                    <#if model.user.role == "ADMIN">
                        <div class="delete-comment">
                            <form method="get" action="/admin/delete?id=">
                                <input type="image" src="/images/delete-32.png" value="${comment.id}">
                            </form>
                        </div>
                    </#if>
                </div>
            </#list>
            <div class="post-comment">
                <#--action="/postcomment" method="post" -->
                <form class="post-comment-form" id="post-comment-form" >
                    <textarea type="text" name="content" id="content" rows="15" placeholder="Write comment here..." style="width: 100%; resize: none; border-radius: 10px" form="post-comment-form"></textarea>
                    <input type="hidden" name="newsId" id="newsId" value="${model.news.id}">
                    <input type="hidden" name="authorId" id="authorId" value="${model.user.id}">
                    <button type="submit" id="btn-comment" value="Send.">Send</button>
                </form>
            </div>
            <div id="feedback"></div>
        </div>
    </div>
</div>
</body>
</html>