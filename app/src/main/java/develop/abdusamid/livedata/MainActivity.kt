package develop.abdusamid.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.Observer
import develop.abdusamid.livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var liveData: LiveData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        liveData = LiveData()
        liveData.get().observe(this, Observer {
            binding.tv.text = it
        })
        binding.edtName.addTextChangedListener {
            liveData.set(it.toString().trim())
        }
    }
}