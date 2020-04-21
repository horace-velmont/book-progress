package horace.velmont.io.bookprogress

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookProgressApplication

fun main(args: Array<String>) {
    runApplication<BookProgressApplication>(*args)
}
