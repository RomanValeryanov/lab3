package com.etu.grigorova.otdel_kadrov.dao;

/**
 * Exeption for my DAO realization. If something goes wrong
 * Take it from stackoverflow.com
 *
 */

public class DaoExeption extends Exception {

    private static final long serialVersionUID = 1L;

    public DaoExeption() {  super();    }

    public DaoExeption(String message) {    super(message); }

    public DaoExeption(Throwable cause) {   super(cause);   }

    public DaoExeption(String message, Throwable cause) {   super(message, cause);  }

}