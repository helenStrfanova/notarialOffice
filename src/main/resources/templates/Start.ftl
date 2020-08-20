<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>THE MAIN PAGE EVER!</title>
    <style>
        body{
            background: url(https://i.imgflip.com/19gb40.jpg) no-repeat;
            background-size:5%;
            background-position: top;
            background-position-y: top;
        }
        footer{

            margin-left: 0%;
            margin-right: 0%;
            background-size: cover;
            padding: 45px;
            margin-bottom: 0.1%;
            text-align: center;
            color: cornsilk;
            width: 1190px;
        }
    </style>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
    <a class="nav-link" href="web/discount/get/list">Discount Web Controller </a>
    <a class="nav-link" href="/api/discount/get/list">Discount Rest Controller </a> <br>
    <a class="nav-link" href="web/notarialService/get/list">Notarial Service Web Controller </a>
    <a class="nav-link" href="api/notarialService/get/list">Notarial Service Rest Controller </a>
    <a class="nav-link" href="web/client/get/list">Client Web Controller </a>
    <a class="nav-link" href="/api/client/get/list">Client Rest Controller </a> <br>
    <a class="nav-link" href="web/document/get/list">Document Web Controller </a>
    <a class="nav-link" href="/api/document/get/list">Document Rest Controller </a> <br>
    <a class="nav-link" href="web/agreement/get/list">Agreement Web Controller </a>
    <a class="nav-link" href="/api/agreement/get/list">Agreement Rest Controller </a> <br>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
            </li>

            <li class="nav-item">
                <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
            </li>
        </ul>
    </div>
</nav>
<h1  style="color: cadetblue" > Notarial office </h1>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
<footer class="footer">
    <p> e-mail: http.pug@gmail.com</p>
    <p>Copyright© <time datetime="2018">2020</time>GitHub</p>
    <script type="text/javascript" src="javascript.js"></script>
</footer>
</html>