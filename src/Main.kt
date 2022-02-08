// MAD-105 Classes Assignment due 14-Feb-2022
fun main(args: Array<String>) {

    // Use employee class template (constructor) to create emp1, emp2 & emp3
    var emp1 = employee(1,"Al", "Bundy", 1)
    var emp2 = employee(2,"Peg", "Bundy", 2)
    var emp3 = employee(3, "Steve", "Rhodes", 3)

    // Print info about all 3 employees in different ways.
    // Print emp1 via Class/printAll,
    // Print emp2 Full Name via Full_Name call within employee class
    // Print emp3 Full Name and directly print emp3.shift.
    emp1.printAll()
    println(emp2.Full_Name())
    println(emp3.Full_Name() + "  shift: " + emp3.shift)

    // change_shift for emp1 and re-print all info for emp1
    // emp1.shift = 8 => commented out, but this does the exact same as the call below
    emp1.change_shift(8)
    emp1.printAll()

    println("Program arguments: ${args.joinToString()}")
}