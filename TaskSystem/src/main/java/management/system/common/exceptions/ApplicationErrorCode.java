package management.system.common.exceptions;

/**
 * Generic error codes to be extended by service specific error codes
 */
public abstract class ApplicationErrorCode {
    /**
     * Protected constructor
     */
    protected ApplicationErrorCode() {
    }

    /**
     * 500 - Internal server error
     */
    public static final String INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";

    /**
     * 404 - Not found
     */
    public static final String NOT_FOUND = "NOT_FOUND";

    /**
     * 400 - Bad request
     */
    public static final String BAD_REQUEST = "BAD_REQUEST";

    /**
     * 401 - Unauthorized
     */
    public static final String UNAUTHORIZED = "UNAUTHORIZED";

    /**
     * 403 - Forbidden
     */
    public static final String FORBIDDEN = "FORBIDDEN";

    /**
     * 409 - Already exists (conflict)
     */
    public static final String ALREADY_EXISTS = "ALREADY_EXISTS";

}
