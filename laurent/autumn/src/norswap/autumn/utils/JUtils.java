package norswap.autumn.utils;

public class JUtils {
    /**
     * An exception type that does not create a stack trace when instantiated.
     */
    public static class NoStackTrace extends Throwable {
        public NoStackTrace(String msg) {
            super(msg, null, false, false);
}   }   }
