package bu.ac.kr.booksearchapp.data.db

import androidx.paging.PagingSource
import androidx.room.*
import bu.ac.kr.booksearchapp.data.model.Book
import kotlinx.coroutines.flow.Flow

@Dao
interface BookSearchDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBook(book: Book)

    @Delete
    suspend fun deleteBook(book: Book)   //insert , delete 둘다 시간이 오래걸리는 작업이기 때문에 비동기처리를 위해 suspend 기입


    @Query("SELECT * FROM books")
    fun getFavoriteBooks(): Flow<List<Book>>

    @Query("SELECT * FROM books")
    fun getFavoritePAgingBooks(): PagingSource<Int, Book>
}