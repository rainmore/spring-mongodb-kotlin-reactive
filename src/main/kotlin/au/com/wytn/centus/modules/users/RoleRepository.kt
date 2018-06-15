package au.com.wytn.centus.modules.users

import au.com.wytn.centus.domains.users.Role
import au.com.wytn.centus.modules.BaseRepository
import org.bson.types.ObjectId

interface RoleRepository : BaseRepository<Role, ObjectId> {
}