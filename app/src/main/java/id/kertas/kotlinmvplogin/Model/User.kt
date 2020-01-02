package id.kertas.kotlinmvplogin.Model

import android.text.TextUtils
import android.util.Patterns

class User(override val email: String, override val password: String) : IUser {
    override fun isDataValid(): Int {
        if (TextUtils.isEmpty(email))
            return 0 // If email Empty
        else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
            return 1 // If email wrong
        else if (password.length <= 7)
            return 2 // If password length not 8 >
        else
            return -1 // If success
    }
}