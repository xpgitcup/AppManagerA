$(function () {
    console.info("第一个程序...");

    var tabNameList = ["appsRunning", "appsInHardDisk", "appsInDB"];
    tabPagesManager("appTabs", tabNameList);
    tabDisplaySettings("appRunning")
})


function listAppsRunning() {
    console.info("正在运行的程序...");
    ajaxRun("operation4UserApp/getAppsRunning", 0, "appsRunningDiv");
}

function listAppsInHardDisk() {
    console.info("硬盘中的程序...");
    ajaxRun("operation4UserApp/getAppsInHardDisk", 0, "appsInHardDiskDiv");
}

function listAppsInDB() {
    console.info("数据库中的程序...");
    ajaxRun("operation4UserApp/getAppsInDB", 0, "appsInDBDiv");
}