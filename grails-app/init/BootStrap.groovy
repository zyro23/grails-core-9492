import example.Dummy

class BootStrap {

    def init = { servletContext ->
		println new Dummy(name: "dummy")
    }
    def destroy = {
    }
}
