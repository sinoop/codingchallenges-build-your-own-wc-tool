import java.nio.file.{Files, Path}
import scala.io.Source.fromFile
import scala.util.Try

object Main {
  def main(args: Array[String]): Unit = {
    args.toList match {
      case s"-$cmd" :: filePath :: Nil =>
        fromFile(filePath)(cmd, loadInputFromFile(filePath))
    }
  }

  private def loadInputFromFile(filepath: String): Try[String] =
    Try(Files readString Path.of(filepath))
}


class ParseCommandAndCountWords {

}