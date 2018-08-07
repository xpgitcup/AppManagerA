package appmanagera

class BootStrap {

    def init = { servletContext ->
        def dirName = System.getProperty("user.dir")
        println("开始搜索${dirName}")
        def dir = new File(dirName)
        checkDirectory(dir)
    }

    def destroy = {
    }

    def checkDirectory(dir) {
        if (dir.isDirectory()) {
            def fileList = dir.listFiles()
            fileList.each { e->
                if (e.isDirectory()) {
                    checkDirectory(e)
                } else {
                    def path = e.path
                    def name = e.name
                    def pp = e.parent
                    println("path: ${path}")
                    println("parent: ${pp}")
                    println("name: ${name}")
                    def newApp = new UserApp(
                    )
                }
            }
        }
    }
}
