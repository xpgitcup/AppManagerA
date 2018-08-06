package appmanagera

class BootStrap {

    def init = { servletContext ->
        def dirName = System.getProperty("user.dir")
        println("开始搜索${dirName}")
        def dir = new File(dirName)
        if (dir.isDirectory()) {
            def fileList = dir.listFiles()
            fileList.each { e->
                println("${e}")
                println("${e.path}")
                println("${e.name}")
                def newApp = new UserApp()
            }
        }
    }
    def destroy = {
    }
}
