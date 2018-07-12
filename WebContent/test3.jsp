<!DOCTYPE html>
<html>
<head>
    <title>TextArea</title>
    <meta charset="utf-8">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
</head>
<body>
    <textarea id="text">

    </textarea>
    <span id="num">0</span>
    <script type="text/javascript">
        window.onload = function(){
            $("#text").on('input propertychange',function(e){
                $("#num").html(e.target.value.length);
            });
        }
    </script>
</body>
</html>