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
Et
        package com.stagiaires.dao;
public class DaoException extends RuntimeException {
    /*
     * Constructeurs
     */
    public DaoException( String message ) {
        super( message );
    }
    public DaoException( String message, Throwable cause ) {
        super( message, cause );
    }
    public DaoException( Throwable cause ) {
        super( cause );
    }
}