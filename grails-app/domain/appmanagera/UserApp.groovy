package appmanagera

class UserApp {

    String baseDirName
    String appName
    String appTitle
    String appStatus

    static constraints = {
        baseDirName()
        appName()
        appTitle()
        appStatus()
    }

    String toString() {
        return "${appName}/${appStatus}"
    }
}
