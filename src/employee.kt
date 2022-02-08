class employee constructor(var emp_id: Int,
                           private var first_name: String,
                           private var last_name: String,
                           public var shift: Int) {
    init {
        println("New employee added $first_name")
    }

    fun Full_Name(): String {
        var full_name: String
        full_name = first_name + " " + last_name
        return full_name
    }

    fun change_shift(new_shift: Int) {
        println("Changing Shift for " +first_name + " to: " +new_shift.toString())
        this.shift = new_shift
    }

    fun printAll() {
        println(emp_id.toString() + "  " + first_name + " " + last_name + "\n" + "     shift: " +shift.toString())
    }
}