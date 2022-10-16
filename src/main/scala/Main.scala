import palindrome.Palindrome
import passwordChecker.PasswordChecker

object Main {
  def main(args: Array[String]): Unit = {
    println(Palindrome.isPalindrome("mad"))
    println(PasswordChecker.isValidPassword("b3stpAssw0rd!"))
  }
}