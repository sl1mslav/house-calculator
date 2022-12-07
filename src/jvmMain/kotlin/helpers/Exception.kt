package helpers


sealed class MyExceptions : Exception() {
    class TextFieldException(override val message: String) : MyExceptions()
}
