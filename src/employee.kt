class employee constructor(var emp_id: Int,
                           private var first_name: String,
                           private var last_name: String,
                           public var shift: Int) {
    init {
        println("New employee added $first_name")
    }

    fun First_Name(): String {
        return this.first_name
    }

    fun change_shift(shift: Int) {
        println("Changing Shift for " +first_name + " to: " +shift)
    }

    fun printAll() {
        println(emp_id.toString() + "  " + first_name + " " + last_name + "\n" + "     shift: " +shift.toString())
    }
}