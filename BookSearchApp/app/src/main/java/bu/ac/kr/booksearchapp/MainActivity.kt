package bu.ac.kr.booksearchapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import bu.ac.kr.booksearchapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}