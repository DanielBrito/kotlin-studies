// Useful to test incomplete flows locally within a Spring application

@Component
class DebugStartupRunner(
    private val personService: PersonService
) : CommandLineRunner {

    override fun run(vararg args: String?) {
        val personId = "1234567890"
        val person = personService.getById(personId)

        println("Person with ID $personId: $people")
    }
}
