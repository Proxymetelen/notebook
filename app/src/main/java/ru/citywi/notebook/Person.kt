/*Клас для работы с персоналом*/
package Person
import java.util.*

val array_month_rus:Array<String> = arrayOf("Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь")
val array_month_eng:Array<String> = arrayOf("January","February","March","April","May","June","July","August","September","October","November","December")
val array_year:Array<Int> = arrayOf(1991,1992,1993,1994,1995)

class Person(
         var fio:String? = null,
         var day:Int? = null,
         var month:Int? = null,
         var year:Int? = null
        )
    {

        private  val isFio: String?
            get() {
                var r:String?=null
                if (fio!=null) {r = fio }
                return r
            }


        private val toDatePr:String
                get() {
                        return "$day:$month:$year"
                }

        val isAge:Int
                    get() {
                        var a = Calendar.YEAR
                        return a  - year!!
                    }

                val isMrus:String
                    get(){
                        return  array_month_rus[month!!]
                    }

                val isMeng:String
                    get() {
                        return  array_month_eng[month!!]
                    }
                    val toSQL: String?
                        get() {
                            var r:String?=null
                            if (isFio!=null) {r =  "INSERT INTO user(`fio`,`date_of_birth`) VALUES(`$fio`,`$toDatePr` )" }
                            return r
                        }
                    val toJSON:String?
                        get() {
                            var r:String?=null
                            if (isFio!=null) {r  =  "{\"fio\":\"$fio\",\"date\":\"$toDatePr\"}" }
                            return r
                        }

    }