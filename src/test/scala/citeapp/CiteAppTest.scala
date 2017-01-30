package  edu.holycross.shot.demo

import utest._

import edu.holycross.shot.cite._


object CiteAppTest extends TestSuite {

  import CiteApp._

  def tests = TestSuite {
    val u1 = CtsUrn("urn:cts:greekLit:tlg0012.tlg001:1.7")
    val u2 = CtsUrn("urn:cts:greekLit:tlg0012.tlg001.msA:1")
    assert (u1 urnMatch u2)
  }
}
