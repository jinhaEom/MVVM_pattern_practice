package bu.ac.kr.booksearchapp.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import bu.ac.kr.booksearchapp.data.model.Book
import bu.ac.kr.booksearchapp.databinding.ItemBookPreviewBinding
import coil.load

class BookSearchViewHolder(
    private val binding: ItemBookPreviewBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(book: Book) {
        val author = book.authors.toString().removeSurrounding("[", "]")
        val publisher = book.publisher
        val date = if (book.datetime.isNotEmpty()) book.datetime.substring(0, 10) else ""

        itemView.apply {
            binding.ivArticleImage.load(book.thumbnail)
            binding.tvTitle.text = book.title
            binding.tvAuthor.text = "$author | $publisher"
            binding.tvDatetime.text = date
        }
    }
}