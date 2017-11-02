package org.fly.springboot.demo.mapper.secondary;

import org.fly.springboot.demo.domain.SecondaryMongoObject;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by overfly on 2017/11/1.
 */
public interface SecondaryRepository extends MongoRepository<SecondaryMongoObject, String> {
}

