import com.example.plugins.configureRouting
import io.ktor.server.application.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module(){
    configureRouting()
    configureSerialization()
}