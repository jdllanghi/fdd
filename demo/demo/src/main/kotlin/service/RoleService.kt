package service

import dto.RoleDTO

interface RoleService {
    val allRoles: List<RoleDTO?>?

    fun getRoleById(id: Long?): RoleDTO?
    fun saveRole(roleDTO: RoleDTO?): RoleDTO?
    fun deleteRole(id: Long?)
}