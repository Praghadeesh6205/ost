import scala.io.StdIn._

class Student {
  var stdnt_name: String = ""
  var faculty: String = ""
  var roll_no: Int = 0

  def read_data(): Unit = {
    println("Enter student name:")
    stdnt_name = readLine()
    println("Enter faculty name:")
    faculty = readLine()
    println("Enter roll number:")
    roll_no = readInt()
  }

  def display_data(): Unit = {
    println(s"Student Name: $stdnt_name")
    println(s"Faculty: $faculty")
    println(s"Roll No: $roll_no")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val student1 = new Student
    student1.read_data()
    student1.display_data()

    val student2 = new Student
    student2.read_data()
    student2.display_data()
  }
}
