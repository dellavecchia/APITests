package br.dellavecchia.apitests.services.impl;

import br.dellavecchia.apitests.domain.Users;
import br.dellavecchia.apitests.repositories.UserRepository;
import br.dellavecchia.apitests.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Override
    public Users findById(Integer id) {

        Optional<Users> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
