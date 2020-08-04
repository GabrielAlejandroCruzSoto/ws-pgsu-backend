package bk.pgsu.am.wspgsubackend.repository;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import bk.pgsu.am.wspgsubackend.model.Producto;

public interface IProductoRepository extends MongoRepository<Producto, ObjectId>{

}
