package au.com.wytn.centus.controllers.users

import au.com.wytn.centus.domains.users.Role
import au.com.wytn.centus.modules.users.RoleRepository
import org.bson.types.ObjectId
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class RoleRestController @Autowired constructor(private val repository: RoleRepository) {
    companion object {
        private const val URL_LIST       = "/api/users/roles"
        private const val URL_ADD        = "/api/users/roles/add"
        private const val URL_ITEM       = "/api/users/roles/{id}"
        private const val URL_ACTIVATE   = "/api/users/roles/{id}/activate"
        private const val URL_DEACTIVATE = "/api/users/roles/{id}/deactivate"
    }

    @GetMapping(URL_LIST)
    fun list(): Flux<Role> {
        return repository.findAll()
    }

    @GetMapping(URL_ITEM)
    fun item(@PathVariable id: ObjectId): Mono<Role> {
        return repository.findById(id)
    }

    @PutMapping(URL_ACTIVATE)
    fun activate(@PathVariable id: ObjectId): Mono<Role> {
        val item = repository.findById(id)
        return item
    }

    @PutMapping(URL_DEACTIVATE)
    fun deactivate(@PathVariable id: ObjectId): Mono<Role> {
        val item = repository.findById(id)
        return item
    }

}