<!DOCTYPE html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        var a;
    </script>

</head>
<body>

<form method="get" action="/add">
    �������ƣ� <input type="text" name="content" value="${(t.content)!}"/></br>
    <input type="hidden"  name="version" value="${(t.version)!}"/>
    <input type="hidden" name="id" value="${(t.id)!}">
    <input type="submit" value="�ύ"/>
</form>
</body>
</html>