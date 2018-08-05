<!doctype html>
<html>
<head>
    <meta name="layout" content="mainCup"/>
    <title>Welcome to Grails</title>
    <asset:javascript src="user/home.js"/>
</head>
<body>
<div id="appTabsDiv" class="easyui-tabs">
    <div title="运行中..." id="appsRunningDiv">
        <div id="listAppsRunningDiv"></div>
        <div id="paginationListAppsRunningDiv" class="easyui-pagination"></div>
    </div>
    <div title="硬盘中..." id="appsInHardDiskDiv">
        <div id="listAppsInHardDiskDiv"></div>
        <div id="paginationListAppsInHardDiskDiv" class="easyui-pagination"></div>
    </div>
    <div title="数据库..." id="appsInDBDiv">
        <div id="listAppsInDBDiv"></div>
        <div id="paginationListAppsInDBDiv" class="easyui-pagination"></div>
    </div>
</div>

</body>
</html>
