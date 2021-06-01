package com.tts.TechTalent.Twitter.App.repository;


import com.tts.TechTalent.Twitter.App.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
