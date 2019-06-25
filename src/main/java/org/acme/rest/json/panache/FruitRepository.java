package org.acme.rest.json.panache;

import io.quarkus.mongo.panache.PanacheMongoRepository;
import org.acme.rest.json.Fruit;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FruitRepository implements PanacheMongoRepository<Fruit> {
}
