package passwordChecker

object PasswordChecker {

  def hasPunctuation(string: String): Boolean = {
    val punctuations = Seq('.', ',', ';', ':', '?', '!', '"', '_', '(', ')')

    punctuations.foldLeft(false) { (_, character) =>
      if (string.exists(_ == character)) {
        true
      } else false
    }
  }

  def isValidPassword(password: String): Boolean = {
    if (password.length >= 8 &&
      password.exists(_.isUpper) &&
      password.exists(_.isLower) &&
      (password.exists(_.isDigit) || hasPunctuation(password))) {
      true
    } else false
  }

}
