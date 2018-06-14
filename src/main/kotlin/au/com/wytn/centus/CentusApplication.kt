package au.com.wytn.centus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CentusApplication

fun main(args: Array<String>) {
    runApplication<CentusApplication>(*args)
}
