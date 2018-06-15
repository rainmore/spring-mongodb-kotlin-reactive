package au.com.wytn.centus.domains.users

import au.com.wytn.centus.domains.Entity
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Suppress("UNUSED_PARAMETER")
@Document(collection = "userRoles")
data class Role(val name: String, val active: Boolean = true, val unarchived: Boolean = true) : Entity {

    @Id
    val _id: ObjectId? = null
}