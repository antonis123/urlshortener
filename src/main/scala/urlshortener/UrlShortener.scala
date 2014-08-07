package main.scala.urlshortener

object UrlShortener {
  
  val ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
  val BASE = ALPHABET.length()
  
  def encode(num:Int) = {
    var _num = num;
    var sb = new StringBuilder
    
    while (_num > 0) {
      sb.append(ALPHABET.charAt(_num % BASE))
      _num /= BASE
    }
    
    sb.reverse.toString
  }
  
  def decode(str:String) = {
    var num = 0
    
    for (i <- 0 until str.length()) {
      num = num * BASE + ALPHABET.indexOf(str.charAt(i))
    }
    
    num
  }

}