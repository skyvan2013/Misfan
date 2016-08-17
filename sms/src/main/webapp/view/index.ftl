<!DOCTYPE html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        var a;
    </script>

</head>
<body>

<form method="get" action="/add">
    类型名称： <input type="text" name="content" value="${(t.content)!}"/></br>
    <input type="hidden"  name="version" value="${(t.version)!}"/>
    <input type="hidden" name="id" value="${(t.id)!}">
    <input type="submit" value="提交"/>
</form>
</body>
</html>