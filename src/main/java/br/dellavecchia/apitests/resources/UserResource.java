package br.dellavecchia.apitests.resources;


import br.dellavecchia.apitests.domain.Users;
import br.dellavecchia.apitests.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;
    @GetMapping(value = "/{id}")
    public ResponseEntity<Users> findById(@PathVariable Integer id){

        return ResponseEntity.ok().body(service.findById(id));

    }

}
