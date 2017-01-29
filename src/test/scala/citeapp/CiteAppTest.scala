package edu.holycross.shot

import utest._

object CiteApp extends TestSuite {

  import CiteApp._

  def tests = TestSuite {
    'CiteApp {
      assert(square(0) == 0)
      assert(square(4) == 16)
      assert(square(-5) == 25)
    }
  }
}
