@Entity
@Table(name = "users")
data class User(
    @Column(name = "name", nullable = false)
    val name: String,

    @Column(name = "age", nullable = false)
    val age: Int
) {

    @Id
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    var id = UUID = UUID.randomUUID()
        private set

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    lateinit var createdAt: LocalDateTime
        private set

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    lateinit var updatedAt: LocalDateTime
        private set
}

/* ----------------------------------------------------------------------------------------------- */

class UserBuilder() {

    fun build(
        name: String = "John Doe",
        age: Int = 30
    ) = User(
        name = name,
        age = age
    ).apply {
        // Manually set the id, createdAt, and updatedAt fields using reflection

        val now = LocalDateTime.now()
        val id = UUID.randomUUID()

        javaClass.getDeclaredField("id").apply { isAccessible = true }.set(this, id)
        javaClass.getDeclaredField("createdAt").apply { isAccessible = true }.set(this, now)
        javaClass.getDeclaredField("updatedAt").apply { isAccessible = true }.set(this, now)
    }
}
