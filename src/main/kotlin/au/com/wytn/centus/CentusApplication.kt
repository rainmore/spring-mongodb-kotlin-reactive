package au.com.wytn.centus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@EnableReactiveMongoRepositories(basePackages = arrayOf("au.com.wytn.centus"))
@SpringBootApplication
class CentusApplication


fun main(args: Array<String>) {
    runApplication<CentusApplication>(*args)
}
