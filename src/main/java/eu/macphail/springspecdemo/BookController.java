package eu.macphail.springspecdemo;

import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@RestController
public class BookController {

    private final static Logger log = LoggerFactory.getLogger(BookController.class);

    @Autowired
    BookRepository bookRepository;

    @PostConstruct
    public void init() {
        bookRepository.saveAll(Arrays.asList(
                new Book("C.S. Forester", "Capitaine Hornblower"),
                new Book("Alain Damasio", "La horde du contrevent"),
                new Book("J.K. Rowling", "Harry Potter et les reliques de la mort"),
                new Book("J.K. Rowling", "Harry Potter à l'école des sorciers"),
                new Book("J.K. Rowling", "Harry Potter et la chambre des secrets"),
                new Book("J.K. Rowling", "Harry Potter et le prisonnier d'Azkaban")
        ));
    }

    @GetMapping(value = "/book", params = "title")
    public Page<Book> search(
            @And({
                    @Spec(path = "author", spec = Like.class),
                    @Spec(path = "title", spec = Like.class)
            }) Specification<Book> bookSpecification,
            Pageable page
    ) {
        log.info("Spec is " + bookSpecification);
        return bookRepository.findAll(bookSpecification, page);
    }
}
