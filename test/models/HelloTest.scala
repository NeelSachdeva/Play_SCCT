package models

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloTest extends FunSuite {
  test("Hello test") {
    val result = Hello.sayHello("John")
    assert(result === "Hello John")
  }

}