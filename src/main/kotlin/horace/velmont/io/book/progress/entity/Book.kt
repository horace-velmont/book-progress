package horace.velmont.io.book.progress.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Book(var name: String) {
    @Id
    @GeneratedValue
    var id: Long? = null
}
