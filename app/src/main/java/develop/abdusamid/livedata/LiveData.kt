package develop.abdusamid.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class LiveData {
    private val liveDouble = MutableLiveData<String>()
    fun set(value: String) {
        liveDouble.value = value
    }

    fun get(): LiveData<String> {
        return liveDouble
    }
}