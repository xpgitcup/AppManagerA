<!DOCTYPE html>
<html>
<head>
    <title>TODO supply a title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
<div>${apps}</div>
<table>
    <thead>
    <th>应用名</th>
    <th>id</th>
    <th>说明</th>
    <th>状态</th>
    <th>操作</th>
    </thead>
    <tbody>
    <g:each in="${apps}" var="item" status="i">
        <tr  class="${(i % 2) == 0 ? 'even' : 'odd'}">
            <td>${item.appName}</td>
            <td>${item.appName}</td>
            <td>${item.appTitle}</td>
            <td>${item.appStatus}</td>
            <td></td>
        </tr>
    </g:each>
    </tbody>
</table>
</body>
</html>
