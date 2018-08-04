package appmanagera

class Operation4UserAppController {

    def getAppsRunning() {
        def apps = []
        def theModel = [apps: apps]
        if (request.xhr) {
            render(template: "showApps", model:theModel)
        } else {
            theModel
        }
    }

    def getAppsInHardDisk() {
        def apps = []
        def theModel = [apps: apps]
        if (request.xhr) {
            render(template: "showApps", model:theModel)
        } else {
            theModel
        }
    }

    def getAppsInDB() {
        def apps = []
        def theModel = [apps: apps]
        if (request.xhr) {
            render(template: "showApps", model:theModel)
        } else {
            theModel
        }
    }

    def index() { }
}
