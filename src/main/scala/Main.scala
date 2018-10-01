import java.nio.ByteBuffer

import Hub._

import scala.concurrent.Future

object Main{
    class CollectionHub(path:String) extends Hub.Hub(path,"collectionhub"){
        override def handleUriRequest(action: String, target: String, query: QueryObject, body: Option[Hub.JsonObject], sessionId: String): Future[Hub.JsonObject] = {
            Future.failed(new NotImplementedError())
        }
    }

    def main(args: Array[String]): Unit = {
        val hub=new CollectionHub("ws://127.0.0.1:8080/api/external/register/websocket")
        hub.Connect()

        import scala.io.StdIn._
        readLine()
    }
}