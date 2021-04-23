package br.com.tce.igorsabarense.service.impl;

import br.com.tce.igorsabarense.dto.UserDTO;
import br.com.tce.igorsabarense.entity.User;
import br.com.tce.igorsabarense.service.UserService;
import br.com.tce.igorsabarense.service.facade.Facade;
import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private Facade facade;


    @Override
    public Set<User> getAllUsers() {
        return Sets.newHashSet(facade.repository.user.findAll());
    }
}
