package br.com.ktquarkus.domain;

//@EqualsAndHashCode(callSuper = true)
//@RegisterForReflection
//@Data
//@ToString
//public class User extends PanacheMongoEntity {
//    private String name;
//    private LocalDate birth;
//}

import io.quarkus.mongodb.panache.common.MongoEntity;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;
import lombok.ToString;
import org.bson.types.ObjectId;

import java.time.LocalDate;

@RegisterForReflection
@Data
@ToString
@MongoEntity(collection = "user")
public class User {
    private ObjectId id;
    private String name;
    private LocalDate birth;
}
