package br.com.tce.igorsabarense.resource.admin;


import br.com.tce.igorsabarense.service.facade.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@PreAuthorize("hasAuthority('ADMIN')")
@RestController
@RequestMapping("/admin")
public class AdministratorResource {

    @Autowired
    private Facade facade;




}