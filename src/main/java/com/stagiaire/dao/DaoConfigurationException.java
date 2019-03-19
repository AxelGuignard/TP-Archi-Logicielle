package main.java.com.stagiaire.dao;
public class DaoConfigurationException extends RuntimeException {
    /*
     * Constructeurs
     */
    public DaoConfigurationException( String message ) {
        super( message );
    }
    public DaoConfigurationException( String message, Throwable cause ) {
        super( message, cause );
    }
    public DaoConfigurationException( Throwable cause ) {
        super( cause );
    }
}