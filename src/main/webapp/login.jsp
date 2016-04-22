<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="TestMG login">
    <meta name="author" content="nu1silva">

    <title>TestMG</title>

    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="plugins/bootstrap/css/bootstrap.min.css"/>

    <!-- MetisMenu CSS -->
    <link rel="stylesheet" href="plugins/metisMenu/metisMenu.min.css">

    <!-- exTracker CSS -->
    <link rel="stylesheet" href="resources/css/extracker.css"/>

    <!-- Custom Fonts CSS -->
    <link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css"/>
</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title" style="text-align: center">TestMG 0.0.1</h3>
                </div>
                <div class="panel-body">
                    <form role="form">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="E-mail" name="email" type="email" autofocus>
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Password" name="password" type="password"
                                       value="">
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                </label>
                            </div>
                            <!-- Change this to a button or input when using this as a form -->
                            <a href="index.jsp" class="btn btn-lg btn-success btn-block">Login</a>
                        </fieldset>
                    </form>
                </div>
            </div>
            <div class="extracker_copyrights">Licenced under <a
                    href="https://github.com/nu1silva/TestMG/blob/master/LICENSE">Apache 2.0</a></div>
        </div>
    </div>
</div>


<!-- jQuery -->
<script src="plugins/jquery/jquery.min.js"></script>

<!-- Bootstrap JavaScript -->
<script src="plugins/bootstrap/js/bootstrap.min.js"></script>

<!-- MetisMenu JavaScript -->
<script src="plugins/metisMenu/metisMenu.min.js"></script>

<!-- exTracker JavaScript -->
<script src="resources/js/extracker.js"></script>

</body>
</html>