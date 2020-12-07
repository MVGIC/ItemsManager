package ru.netology.manager;

import ru.netology.domain.Product;
import ru.netology.repository.ItemsRepository;

public class ItemsManager {
    private ItemsRepository repository;

    public ItemsManager(ItemsRepository repository) {
        this.repository = repository;
    }

    public void add(Product item) {
        repository.save(item);

    }

    public Product[] searchBy(String text) {

    }

    public boolean matches(Product item, String search){

    }

}
