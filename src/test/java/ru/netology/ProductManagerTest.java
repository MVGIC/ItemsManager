package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.manager.ProductManager;

import static org.junit.jupiter.api.Assertions.*;

public class ProductManagerTest {

    @Test
    public void shouldSearchBy() {
        ProductManager manager = new ProductManager();
        Book first = new Book(1, "Sherlock_Holmes", 150, "Arthur Conan Doyle");
        Book second = new Book(2, "Toilers of the Sea", 200, "Victor Hugo");
        Smartphone third = new Smartphone(3, "Nokia", 2000, "Finland");
        Smartphone fourth = new Smartphone(4, "Sony", 3000, "Japan");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        manager.searchBy("Nokia");

        Product[] actual = manager.matches(Smartphone,"Nokia");
        Product[] expected = new Product[]{third};

        assertArrayEquals(expected, actual);
    }
}
