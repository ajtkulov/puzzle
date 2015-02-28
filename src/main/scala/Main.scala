import org.bytedeco.javacpp.opencv_core._
import org.bytedeco.javacpp.opencv_objdetect.CascadeClassifier
import org.bytedeco.javacpp.{opencv_highgui, opencv_imgproc}

object Main extends Application {
  override def main(args : Array[String]) : Unit = {
    val file = opencv_highgui.imread("a.jpg")
    println(file)
  }
}