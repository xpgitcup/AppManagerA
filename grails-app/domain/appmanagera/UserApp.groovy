package appmanagera

class UserApp {

    String appName
    String appTitle
    String appStatus

    static constraints = {
    }

    String toString() {
        return "${appName}/${appStatus}"
    }
}
