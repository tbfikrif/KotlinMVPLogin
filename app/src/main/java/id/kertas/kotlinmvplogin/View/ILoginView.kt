package id.kertas.kotlinmvplogin.View

interface ILoginView {
    fun onLoginSuccess(message: String)
    fun onLoginError(message: String)
}