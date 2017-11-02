package org.fly.springboot.demo.mapper.primary;

import org.fly.springboot.demo.domain.PrimaryMongoObject;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by overfly on 2017/11/1.
 */
public interface PrimaryRepository extends MongoRepository<PrimaryMongoObject, String> {
}

