package com.etu.titkov.uniteacher.dao.exceptions;

/**
 * @author Eugene Ray
 *
 * Кастомное исключение для DAO-объектов. Создано для
 * удобства.
 */
public class DaoStoreException extends Exception {

    private static final long serialVersionUID = 1L;

    public DaoStoreException() {
        super();
    }

    public DaoStoreException(String message) {
        super(message);
    }

    public DaoStoreException(Throwable cause) {
        super(cause);
    }

    public DaoStoreException(String message, Throwable cause) {
        super(message, cause);
    }

}
