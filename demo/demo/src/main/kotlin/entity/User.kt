package entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    @Column(nullable = false, unique = true)
    private var username: String? = null

    @Column(nullable = false)
    private var password: String? = null

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private val role: Role? = null // Getters y Setters
}