package horace.velmont.io.book.progress.repository

import horace.velmont.io.book.progress.entity.Book
import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<Book, Int>
