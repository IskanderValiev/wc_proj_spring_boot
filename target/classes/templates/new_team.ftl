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
<#include "tags/header.ftl">
    <div class="content">
        <div class="add-team-form">
            <form action="/admin/add/team" method="post">
                <input type="text" name="countryName">
                <input type="text" name="flag">
                <input type="submit" value="Add team">
            </form>
        </div>
    </div>
</div>
</body>
</html>