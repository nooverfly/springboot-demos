package org.fly.springboot.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by overfly on 2017/11/1.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "second_mongo")
public class SecondaryMongoObject {

    @Id
    private String id;

    private String value;

    public SecondaryMongoObject() {
    }

    public SecondaryMongoObject(String id, String value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "SecondaryMongoObject{" + "id='" + id + '\'' + ", value='" + value + '\''
                + '}';
    }
}

