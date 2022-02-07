fun main(args: Array<String>) {

    var emp1 = employee(1,"Al", "Bundy", 1)
    var emp2 = employee(2,"Peg", "Bundy", 2)
    var emp3 = employee(3, "Steve", "Rhodes", 3)

    emp1.printAll()
    println(emp2.First_Name())
    println(emp3.shift)

    emp1.change_shift(8)
    emp1.printAll()

    var count: Int = 1

    println("Program arguments: ${args.joinToString()}")
}