package com.gadget.android.recyclerviewbinding.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gadget.android.recyclerviewbinding.model.User
import com.gadget.android.recyclerviewbinding.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel : ViewModel() {
    private var userRepository = UserRepository()
    var userMutableLiveData: MutableLiveData<List<User>> = MutableLiveData()

    fun getUserData() {
        viewModelScope.launch {
            var result: List<User>? = null

            /** Main thread **/
            withContext(Dispatchers.Main) {
                result = userRepository.getUserData()
            }

            /** Background thread **/
            withContext(Dispatchers.IO) {
                result = userRepository.getUserData()
            }
            userMutableLiveData.value = result!!
        }

    }
}