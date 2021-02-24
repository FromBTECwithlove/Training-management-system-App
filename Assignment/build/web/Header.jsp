<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ"
              crossorigin="anonymous">
        <title>TRAINING MANAGEMENT SYSTEM</title>
    </head>
    <script>
        function confirmDel() {
            var x = confirm("Are you sure to delete this item?");
            if (x) {
                return true;
            }
            else
                return false;
        }
    </script>
    <style>
        body{
            height: 100%;
            margin: 0;
            padding: 0;
            background-color: white;
            background-size: contain;
            background-position: center;
            font-family: sans-serif;
            overflow-x: hidden;
            overflow-y: scroll;
            color: white;
            /*background-image: url('http://getwallpapers.com/wallpaper/full/a/5/d/544750.jpg');*/
        }
        ::-webkit-scrollbar { 
            display: none; 
        }
        header, footer {
            padding: 1em;
            color: white;
            background-color: black;
            clear: left;
            text-align: center;
        }
        ul#menu, ul#menu ul#sub{
            padding: 0;
            margin: 0;
        }

        ul#menu li{
            list-style-type: none;
            float: left;
            margin-right: 10px;
        }

        ul#menu li a{
            text-decoration: none;
            background-color: transparent;
            padding: 5px;
            color: white;
        }

        ul#menu li a:hover{
            background-color: transparent;
            color: aqua;
            font-size: 15px;
        }

        ul#menu li ul#sub li a:hover{
            background-color: transparent;
            color: aqua;
        }

        .logo{
            margin: 0;
            padding: 0;
            background-position: center;
            font-family: sans-serif;
        }

        ul#prof, ul#prof ul#subP{
            padding: 17px 0 0 0;
            margin: 0;
        }

        ul#prof li{
            list-style-type: none;
            float: right;
            margin-right: 10px;
        }

        ul#prof li a{
            text-decoration: none;
            background-color: transparent;
            padding: 5px;
            color: white;
        }

        ul#prof li a:hover{
            background-color: transparent;
            color: aquamarine;
        }

        ul#prof li{
            position: relative;
        }

        ul#prof li ul#subP{
            display: none;
            position: absolute;
            width: 150px;
        }

        ul#prof li ul#subP li{
            margin-top: 10px;
            margin-bottom: 5px;            
        }

        ul#prof li:hover ul#subP{
            display: block;
        }

        ul#prof li ul#subP li a:hover {
            background-color: gray;            
        }

        ul#prof li ul#subP li{
            float: left;
        }
        ul#prof li ul#subP a{
            color: black;
        }

        .Cdetails{
            width: 60%; 
            height: auto; 
            margin: auto;
            padding:15px;
            color: black;
            border: solid black 1px;
            border-radius: 10px;
        }

        .Cdetails .courDetails{
            text-align: left;
            color: black;
        }
        .Cdetails .courDetails tr td{
            padding: 5px;
        }
        #btnAdd{
            width: 70px;
            float: right;
            height: 40px;
            border-radius: 5px;
            color: black;
            background-color: greenyellow;
            padding: 5px;
            border: 0;
            margin: 5px;
        }
        #btnUpdate{
            width: 70px;
            float: right;
            height: 40px;
            border-radius: 5px;
            color: black;
            background-color: #ffc107;
            padding: 5px;
            border: 0;
            margin: 5px;
        }
        #btnDel{
            width: 70px;
            float: right;
            height: 40px;
            border-radius: 5px;
            color: black;
            background-color: #ff3366;
            padding: 5px;
            border: 0;
            margin: 5px;
        }
        #btnAssign{
            width: 70px;
            float: right;
            height: 40px;
            border-radius: 5px;
            color: black;
            background-color: #3366ff;
            padding: 5px;
            border: 0;
            margin: 5px;
        }
        table{
            width: 65%;
            margin: auto;
            color: black;
            /*background-color: teal;*/
            /*opacity: 0.7;*/
            text-align: center;
        }
        table .search_input, input[type="submit"]{
            float: right;
        }

        .addCourse{
            padding-left: 20px;
            padding-right: 15px;
            width: 100%;
            height: auto;
            margin: auto;
            color: black;
            text-align: left;
        }
        .addCourse select{
            width: 99.5%;
        }
        .addCourse input[type=text], select, textarea, input[type=date]{
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 1px solid #e9d8f4;
            -webkit-transition: 0.5s;
            transition: 0.5s;
            outline: none;
            border-radius: 5px;
        }

        .addCourse input[type=text]:focus {
            border: 1px solid #58257b;
        }
        h1{
            color: black;
            font-family: Aria;
        }
        .search_input{
            width: 30%;
            padding: 10px; 
            margin: 5px
        }
        button{
            float: right; margin: 5px; padding: 10px; margin-right: -5.5px;
        }
    </style>   
    <style>
        #add{
            color: blue;
            font-size: 20px;
            width: auto;
            height: auto;
            margin: 5px;
        }
        #delete{
            color: #ff3366;
            font-size: 20px;
            width: auto;
            height: auto;
            margin: 5px;
        }
        #edit{
            color: #fd7522;
            font-size: 20px;
            width: auto;
            height: auto;
            margin: 5px;
        }
        #view{
            color: #ff00ff;
            font-size: 20px;
            width: auto;
            height: auto;
            margin: 5px;
        }
    </style>
    <style>
        .content a i{
            font-size: 20px;
        }
        .content a i:hover{
            color: aqua;
            font-size: 19px;
        }
        .content{
            float: right;
            width: 30%;
            height: 50%;
            padding: 0;
            margin: 0;
        }
        .content ul{
            list-style: none;
        }
        .content ul li{
            float: left;
            margin-right: 20px;
        }
    </style>
    <body>    
        <div style="width: 100%; height: 50px; background-color: #fd7522" class="bar-head">
            <div class="content">
                <ul>
                    <li><a href="#" style="color: white"><i class="far fa-comments"> Chat</i></a></li>
                    <li><a href="mailto:%20btec.hn@fpt.edu.vn" style="color: white"><i class="far fa-envelope"> Email:</i>&nbsp;btec.hn@fpt.edu.vn</a></li>
                </ul>
            </div>
        </div>
        <div style="width: 100%; height: 120px; background-color: white;" class="logo">
            <div style="width: 50%; height: 50px; float: left; padding-left: 100px"><img src="btec.png" style="width: 200px;"/></div>
        </div>
        <div style="width: 100%; height: 50px; background-color: #fd7522">
            <div class="left-menu" style="width: 40%; float: left; background-color:transparent; padding-left: 100px">
                <ul id="menu" style="color: black">
                    <li><p><a href="IndexCourse.jsp">Course</a>|</p></li>
                    <li><p><a href="IndexTopic.jsp">Topic</a>|</p></li>
                    <li><p><a href="IndexCate.jsp">Category</a>|</p></li>
                    <li><p><a href="IndexAccount.jsp">Account</a>|</p></li>                    
                    <li><p><a href="IndexTrainer.jsp">Trainer</a>|</p></li>                    
                    <li><p><a href="IndexTrainee.jsp">Trainee</a></p></li>
                </ul>
            </div>
            <div class="right-menu" style="width: 30%; height: 100%; float: right; padding-right: 50px">
                <ul id="prof">
                    <li><a href="">Hello, Admin<s:property value="%{session.Admin}"/></a>
                        <ul id="subP" style="width: auto">
                            <li><a href="">Profile</a></li>
                            <li><a href="Index.jsp">Sign out</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
        <div style="width: 100%; height: auto">
