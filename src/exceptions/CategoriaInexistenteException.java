package exceptions;

// Unchecked exception
public class CategoriaInexistenteException extends RuntimeException {

    public CategoriaInexistenteException(String msg) {
        super("A categoria " + msg + " não é reconhecida pelo programa.");
    }

}
