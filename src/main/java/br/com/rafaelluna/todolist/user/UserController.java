package br.com.rafaelluna.todolist.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/users")

public class UserController {
    
    @Autowired
    private IUserRepository userRepository;
    
    @PostMapping("/")
    
    public UserModel create(@RequestBody UserModel userModel) {
        var userCreated  = this.userRepository.save(userModel);
        return userCreated;
    }
}

//Public
//Private
//Protected

//      Getters     and     Setters 
//  Buscar valor    //      Inserir valor

//String - texto
    //Integer - inteiros
    //Double - decimais
    //Float - 
    //char - caracter
    //date
    //void
