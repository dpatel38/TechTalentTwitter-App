package com.tts.TechTalent.Twitter.App.repository;

import com.tts.TechTalent.Twitter.App.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}
