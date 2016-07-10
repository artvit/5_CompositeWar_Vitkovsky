package by.epam.compositewar.creation;

public class UnsupportedUnitTypeException extends RuntimeException {
    public UnsupportedUnitTypeException() {
    }

    public UnsupportedUnitTypeException(String message) {
        super(message);
    }

    public UnsupportedUnitTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedUnitTypeException(Throwable cause) {
        super(cause);
    }
}
