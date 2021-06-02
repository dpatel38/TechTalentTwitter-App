package com.tts.TechTalent.Twitter.App.repository;

import com.tts.TechTalent.Twitter.App.model.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {

    Tag findByPhrase(String phrase);
}
