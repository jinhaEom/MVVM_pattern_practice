package bu.ac.kr.booksearchapp.data.model.repository

import androidx.paging.PagingData
import bu.ac.kr.booksearchapp.data.model.Book
import bu.ac.kr.booksearchapp.data.model.SearchResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface BookSearchRepository {
    suspend fun searchBooks(
        query: String,
        sort: String,
        page: Int,
        size: Int,
    ): Response<SearchResponse>

    //room
    suspend fun insertBooks(book: Book)

    suspend fun deleteBooks(book: Book)

    fun getFavoriteBooks(): Flow<List<Book>>

    //datastore
    suspend fun saveSortMode(mode: String)

    suspend fun getSortMode(): Flow<String>

    //paging
    fun getFavoritePagingBooks(): Flow<PagingData<Book>>
}