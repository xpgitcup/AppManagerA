package appmanagera

import grails.converters.JSON

class Operation4UserAppController {

    def countAppsRunning() {
        def apps = getAppsRunning()
        def result = [count: apps?.size()]
        if (request.xhr) {
            render result as JSON
        } else {
            result
        }
    }

    def getAppsRunning() {
        def apps
        def os = System.getProperty("os.name")
        println("当前操作系统是：${os}")
        switch (os) {
            case "Windows 10":
                apps = getAppRunningFromWindowsNT()
                break;
            case "Linux":
                apps = getAppRunningFromLinux()
                break;
        }
        //--------------------------------------------------------------------------------------------------------------
        println(apps)
        def theModel = [apps: apps]
        if (request.xhr) {
            render(template: "showRunningApps", model: theModel)
        } else {
            theModel
        }
    }

    def getAppRunningFromLinux() {
        //             0       1       2        3        4         5      6       7        8      9
        //def head = ["PID", "TTY", "STAT", "TIME", "MAJFL", "TRS", "DRS", "RSS", "%MEM", "COMMAND"]
        //String cmd = "ps -ev";

        def head = ["PID", "TTY", "STAT", "TIME", "COMMAND"]
        String cmd = "ps a"

        def lines = []
        def appList = []
        Process p;
        //执行命令
        p = Runtime.getRuntime().exec(cmd);
        //取得命令结果的输出流
        InputStream fis = p.getInputStream();
        //用一个读输出流类去读
        //用缓冲器读行
        //BufferedReader br = new BufferedReader(new InputStreamReader(fis, "utf-8"));
        BufferedReader br = new BufferedReader(new InputStreamReader(fis, "gbk"));
        String line = null;
        lines.add(head)
        //直到读完为止
        while ((line = br.readLine()) != null) {
            if (line.contains('jar')) {
                def item = line.split()
                lines.add(item)
                //------------------------------------------------------------------------------------------------------
                //def command =
            }
        }
        lines.each { e->
            println("${e}")
        }
        return lines
    }

    def getAppRunningFromWindowsNT() {
        def head = ["映像名称", "PID", "会话名", "会话#", "内存使用", "状态", "用户名", "CPU", "时间", "窗口标题"]
        def lines = []
        Process p;
        String cmd = "tasklist /v";
        //执行命令
        p = Runtime.getRuntime().exec(cmd);
        //取得命令结果的输出流
        InputStream fis = p.getInputStream();
        //用一个读输出流类去读
        //用缓冲器读行
        //BufferedReader br = new BufferedReader(new InputStreamReader(fis, "utf-8"));
        BufferedReader br = new BufferedReader(new InputStreamReader(fis, "gbk"));
        String line = null;
        lines.add(head)
        //直到读完为止
        while ((line = br.readLine()) != null) {
            if (line.contains('jar')) {
                def item = line.split()
                lines.add(item)
            }
        }
        lines.each { e->
            println("${e}")
        }
        return lines
    }

    def getAppsInHardDisk() {
        def apps = []
        def ua = new UserApp(appName: '测试程序', appStatus: "????", appTitle: "????")
        def ub = new UserApp(appName: '测试程序', appStatus: "????", appTitle: "????")
        apps.add(ua)
        apps.add(ub)
        def theModel = [apps: apps]
        if (request.xhr) {
            render(template: "showApps", model: theModel)
        } else {
            theModel
        }
    }

    def getAppsInDB() {
        def apps = []
        def ua = new UserApp(appName: '测试程序', appStatus: "????", appTitle: "????")
        def ub = new UserApp(appName: '测试程序', appStatus: "????", appTitle: "????")
        apps.add(ua)
        apps.add(ub)
        def theModel = [apps: apps]
        if (request.xhr) {
            render(template: "showApps", model: theModel)
        } else {
            theModel
        }
    }

    def index() {}
}
