package coursework;

import java.lang.Exception;

/**
 *
 * @Meher Khan
 */
public class CurtainException extends Exception {

    /**
     * Constructor
     *
     * @param detail is a String that get passed up to constructor for Throwable
     */
    public CurtainException(String detail) {
        super(detail);
    }

}
