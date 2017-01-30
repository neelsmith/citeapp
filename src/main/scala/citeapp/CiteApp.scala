package edu.holycross.shot.demo

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom

import edu.holycross.shot.cite._

@js.native
trait EventName extends js.Object {
  type EventType <: dom.Event
}

object EventName {
  def apply[T <: dom.Event](name: String): EventName { type EventType = T } =
    name.asInstanceOf[EventName { type EventType = T }]

  val onmousedown = apply[dom.MouseEvent]("onmousedown")
}

@js.native
trait ElementExt extends js.Object {
  def addEventListener(name: EventName)(
      f: js.Function1[name.EventType, _]): Unit
}



object CiteApp extends js.JSApp {
  def main(): Unit = {
    val paragraph = dom.document.createElement("p")

    val u1 = CtsUrn("urn:cts:greekLit:tlg0012.tlg001:1.7")
    val u2 = CtsUrn("urn:cts:greekLit:tlg0012.tlg001.msA:1")
    val twiddle = u1 ~~ u2

    val msg = "Comparing " + u1 + " and " + u2 + " - do they match? <strong>" + twiddle + "</strong>."

    paragraph.innerHTML = "<p>" + msg + "</p>"



    dom.document.getElementById("playground").appendChild(paragraph)
    val p = paragraph.asInstanceOf[ElementExt]
  }

}
