package service

import dto.UserDTO

interface UserService {
    val allUsers: List<UserDTO?>?

    fun getUserById(id: Long?): UserDTO?
    fun saveUser(userDTO: UserDTO?): UserDTO?
    fun deleteUser(id: Long?)
}