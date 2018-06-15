package au.com.wytn.centus.modules

import au.com.wytn.centus.domains.Entity
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import java.io.Serializable

interface BaseRepository<T : Entity, ID: Serializable> : ReactiveMongoRepository<T, ID> {
}