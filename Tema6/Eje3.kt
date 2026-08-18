import kotlin.random.Random

data class Employee(val name: String, var salary: Int)

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("John", "Mary", "Alex", "Steve", "Sarah")

    fun generateEmployee(): Employee {
        val randomName = names.random()
        val randomSalary = Random.nextInt(minSalary, maxSalary + 1)
        return Employee(randomName, randomSalary)
    }
}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}
