import scala.io.Source
import scala.util.Try

object ParseurCSV {
  def parseCSV(filePath: String): List[Tigre] = {
    val lines = Source.fromFile(filePath).getLines().drop(1) // Skip header
    lines.map { line =>
      val fields = line.split(",").map(_.trim)
      Tigre(
        nom = fields.lift(0),
        age = fields.lift(1).flatMap(s => Try(s.toInt).toOption),
        habitat = fields.lift(2)
      )
    }.toList
  }
}
