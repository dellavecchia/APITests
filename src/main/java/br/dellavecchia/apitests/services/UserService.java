package br.dellavecchia.apitests.services;

import br.dellavecchia.apitests.domain.Users;

public interface UserService {

    Users findById(Integer id);
}
