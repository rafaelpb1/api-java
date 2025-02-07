package br.com.rafaelluna.todolist.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/users")

//Public
//Private
//Protected

//      Getters     and     Setters 
//  Buscar valor    //      Inserir valor

public class UserController {
    
    //String - texto
    //Integer - inteiros
    //Double - decimais
    //Float - 
    //char - caracter
    //date
    //void
    @PostMapping("/")
    
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.getUsername());
    }
}
