package jpabook.jpashop.exception;

public class NotEnoughtStockException extends RuntimeException {

    public NotEnoughtStockException() {
    }

    public NotEnoughtStockException(String message) {
    }

    public NotEnoughtStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughtStockException(Throwable cause) {
        super(cause);
    }
}
