<!DOCTYPE html>
<html>
<head>
    <title>TODO supply a title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
<table>
    <thead>
    <g:each in="${apps[0]}" var="item" status="i">
        <th>${item}</th>
    </g:each>
    </thead>
    <tbody>
    <g:each in="${apps}" var="items" status="i">
        <g:if test="${i>0}">
            <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                <g:each in="${items}" var="item" status="j">
                    <td>${item}</td>
                </g:each>
            </tr>
        </g:if>
    </g:each>
    </tbody>
</table>
</body>
</html>
