package subtask3
import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {
    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        var stringval = ""
        var intval = 0
        var dateval = LocalDate.parse("-999999999-01-01")
        blockA.forEach { x ->
            if (x != null) {
                if (x::class == blockB && blockB == String()::class) {
                    stringval += x
                }
                if (x::class == blockB && blockB == Int::class) {
                    intval += x as Int
                }
                if (x::class == blockB && blockB == LocalDate::class) {
                    val comp = x as LocalDate
                    if (dateval < comp) {
                        dateval = comp
                    }
                }
            }
        }
        when(blockB) {
            String()::class -> return stringval
            Int::class -> return intval
            LocalDate::class -> return "${dateval.dayOfMonth}.${dateval.monthValue}.${dateval.year}"
            else -> return ""
        }
    }
}

