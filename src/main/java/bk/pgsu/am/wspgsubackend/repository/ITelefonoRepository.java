package bk.pgsu.am.wspgsubackend.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import bk.pgsu.am.wspgsubackend.model.Telefono;

public interface ITelefonoRepository extends MongoRepository<Telefono, ObjectId>{

}
