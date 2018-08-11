package appmanagera

class BootStrap {

    def appService

    def init = { servletContext ->
        def dirName = System.getProperty("user.dir")
        println("开始搜索${dirName}")
        def dir = new File(dirName)
        appService.checkDirectory(dir, dirName)
    }

    def destroy = {
    }

}
