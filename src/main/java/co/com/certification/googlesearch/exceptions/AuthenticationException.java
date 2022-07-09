package co.com.certification.googlesearch.exceptions;

public class AuthenticationException extends AssertionError{
    public  static  final String THE_AUTHENTICATION_WAS_FAILED="The Authentication Was Failed";

    public AuthenticationException(String message){
        super(message);
    }
    public AuthenticationException(String message, Throwable cause ){
        super(message, cause);
    }
}
