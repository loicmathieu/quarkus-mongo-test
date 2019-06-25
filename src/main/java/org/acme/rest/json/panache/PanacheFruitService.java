package org.acme.rest.json.panache;

import org.acme.rest.json.Fruit;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PanacheFruitService {

    @Inject FruitRepository fruitRepository;

    public List<Fruit> list(){
        return fruitRepository.listAll();
    }

    public void add(Fruit fruit){
        fruitRepository.persist(fruit);
    }
}
