<!doctype html>
<html>
<head>
    <meta name="layout" content="mainCup"/>
    <title>Welcome to Grails</title>
    <asset:javascript src="user/home.js"/>
</head>
<body>
<div id="list-userApp" class="content scaffold-list" role="main">
    <div id="appTabs" class="easyui-tabs" style="width:100%">
        <g:each in="${apps}" status="i" var="app">
            <div title="${app.key}" style="padding:20px">
                <div id="appView${app.key}"></div>

                <div class="easyui-panel">
                    <div id="appViewPagination${i}"
                         class="easyui-pagination"
                         data-options="total:${app.value},
                         pageSize:10,
                         onSelectPage: function (pageNumber, pageSize) {
                         console.info(pageNumber);
                         console.info(pageSize);
                         $(this).pagination('loading');
                         //alert('pageNumber:' + pageNumber + ',pageSize:' + pageSize);
                         loadData(pageNumber, pageSize);
                         $(this).pagination('loaded');
                         }">
                    </div>
                </div>
            </div>
        </g:each>
    </div>
</div>

</body>
</html>
