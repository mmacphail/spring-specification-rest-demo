package eu.macphail.springspecdemo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException() {
    }

    public BookNotFoundException(String s) {
        super(s);
    }

    public BookNotFoundException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public BookNotFoundException(Throwable throwable) {
        super(throwable);
    }

    public BookNotFoundException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
