package subtask1
import java.text.*
import java.util.*

class DateFormatter {
    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        var input = "${day}${month}${year}"
        var monthint = month.toInt()
        val format = "ddMMyyyy"
        if ((monthint < 10 && monthint != 0) ) {
            input = "${day}0${month}${year}"
        } else if(monthint > 12){
            return "Такого дня не существует"
        }
        ;
        val df = SimpleDateFormat(format)
        df.setLenient(false)
        var week: Int = 0

        try {
            val date = df.parse(input)
            val cal = Calendar.getInstance()
            cal.time = date
            week = cal[Calendar.DAY_OF_WEEK]

        } catch (e: ParseException) {
            return "Такого дня не существует"
        }
        var dayweek = ""
        var monthstr = ""
        when (week) {
            1 -> dayweek ="воскресенье"
            2 -> dayweek ="понедельник"
            3 -> dayweek ="вторник"
            4 -> dayweek ="среда"
            5 -> dayweek ="четверг"
            6 -> dayweek ="пятница"
            7 -> dayweek ="суббота"
            else -> { // Note the block
                return("Такого дня не существует")
            }
        }
        when (monthint) {
            1 -> monthstr ="января"
            2 -> monthstr ="февраля"
            3 -> monthstr ="марта"
            4 -> monthstr ="апреля"
            5 -> monthstr ="мая"
            6 -> monthstr ="июня"
            7 -> monthstr ="июля"
            8 -> monthstr ="августа"
            9 -> monthstr ="сеньтября"
            10 -> monthstr ="октября"
            11 -> monthstr ="ноября"
            12 -> monthstr ="декабря"
            else -> { // Note the block
                return ("Такого дня не существует")
            }
        }
        return "${day} ${monthstr}, ${dayweek}"
    }
}
