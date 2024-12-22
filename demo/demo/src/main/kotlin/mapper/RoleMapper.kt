package mapper

import dto.RoleDTO
import entity.Role

object RoleMapper {
    fun toDTO(role: Role): RoleDTO {
        val dto = RoleDTO()
        dto.setId(role.getId())
        dto.setName(role.getName())
        return dto
    }

    fun toEntity(dto: RoleDTO): Role {
        val role = Role()
        role.setId(dto.getId())
        role.setName(dto.getName())
        return role
    }
}