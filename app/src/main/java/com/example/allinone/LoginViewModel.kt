package com.example.allinone

import androidx.lifecycle.ViewModel
import javax.inject.Inject

// @Inject tells Dagger how to create instances of LoginViewModel
class LoginViewModel @Inject constructor(
    private val userRepository: UserRepository
) {

}