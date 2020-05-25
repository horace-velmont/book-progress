package horace.velmont.io.book.progress.entity

import javax.persistence.ElementCollection
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Book(
        @Id
        @GeneratedValue
        var id: Long? = null,
        var name: String = "",
        @ElementCollection
        var author: Set<String> = setOf()) {
}
