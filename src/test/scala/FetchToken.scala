import sttp.client._
import spray.json._

object FetchToken {
  val feeder = () => Iterator.continually(Map("accessToken" -> getAccessToken()))

  def getAccessToken(): String = {
    implicit val backend = HttpURLConnectionBackend()

    val respone = basicRequest
      .post(uri"https://www.baidu.com")
      .body(Map(
        "account" -> "123456",
        "password" -> "123456"))
      .response(asStringAlways.map(_.parseJson))
      .send()

    respone.body
      .asJsObject()
      .fields("accessToken")
      .asInstanceOf[JsString]
      .value
  }
}
