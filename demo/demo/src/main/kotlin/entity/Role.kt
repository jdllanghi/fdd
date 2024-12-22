package entity

import jakarta.persistence.*

@Entity
@Table(name = "roles")
class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    @Column(nullable = false, unique = true)
    private var name: String? = null

    // Relación con la tabla "users"
    @OneToMany(mappedBy = "role", cascade = [CascadeType.ALL], orphanRemoval = true)
    private val users: List<User>? = null // Getters y Setters
}