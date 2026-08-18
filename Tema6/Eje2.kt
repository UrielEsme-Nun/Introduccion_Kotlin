data class Name(val firstName: String, val lastName: String)
data class City(val name: String, val country: String)
data class Address(val street: String, val city: City)
data class Person(val name: Name, val address: Address, val ownsPet: Boolean)

fun main() {
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsPet = false
    )
}
