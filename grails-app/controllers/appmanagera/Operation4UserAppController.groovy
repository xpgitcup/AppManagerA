package appmanagera

class Operation4UserAppController {

    def getAppsRunning() {
        def apps = []
        def ua = new UserApp(appName:'测试程序', appStatus: "????", appTitle: "????")
        def ub = new UserApp(appName:'测试程序', appStatus: "????", appTitle: "????")
        apps.add(ua)
        apps.add(ub)
        println(apps)
        def theModel = [apps: apps]
        if (request.xhr) {
            render(template: "showApps", model:theModel)
        } else {
            theModel
        }
    }

    def getAppsInHardDisk() {
        def apps = []
        def ua = new UserApp(appName:'测试程序', appStatus: "????", appTitle: "????")
        def ub = new UserApp(appName:'测试程序', appStatus: "????", appTitle: "????")
        apps.add(ua)
        apps.add(ub)
        def theModel = [apps: apps]
        if (request.xhr) {
            render(template: "showApps", model:theModel)
        } else {
            theModel
        }
    }

    def getAppsInDB() {
        def apps = []
        def ua = new UserApp(appName:'测试程序', appStatus: "????", appTitle: "????")
        def ub = new UserApp(appName:'测试程序', appStatus: "????", appTitle: "????")
        apps.add(ua)
        apps.add(ub)
        def theModel = [apps: apps]
        if (request.xhr) {
            render(template: "showApps", model:theModel)
        } else {
            theModel
        }
    }

    def index() { }
}
