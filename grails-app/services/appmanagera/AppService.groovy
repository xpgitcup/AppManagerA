package appmanagera

import grails.gorm.transactions.Transactional

@Transactional
class AppService {

    @Transactional(readOnly = false)
    def checkDirectory(dir, baseDirName) {
        if (dir.isDirectory()) {
            def fileList = dir.listFiles()
            fileList.each { e ->
                if (e.isDirectory()) {
                    checkDirectory(e, baseDirName)
                } else {
                    if (e.name.endsWith(".war")) {
                        def path = e.path
                        def name = e.name
                        def pName = path.minus(baseDirName)
                        def ppName = pName.minus(name)
                        if (!UserApp.findAllByAppNameAndAppTitle(name, ppName)) {
                            println("path: ${path}")
                            println("parent: ${ppName}")
                            println("name: ${name}")
                            def newApp = new UserApp(
                                    baseDirName: baseDirName,
                                    appTitle: ppName,
                                    appName: name,
                                    appStatus: 'D'
                            )
                            newApp.save(true)
                        }
                    }
                }
            }
        }
    }
}
