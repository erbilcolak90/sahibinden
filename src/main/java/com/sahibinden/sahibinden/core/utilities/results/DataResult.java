package com.sahibinden.sahibinden.core.utilities.results;

public class DataResult<T> extends Result{
    /*
    Data ile ilgili sorgularda kullanılmak üzere DataResult classı oluşturdum.
    Gelebilecek data herhangi bir türde olacabileceği için obje tipi de Generic olarak belirlendi
     */

    private T data;

    public DataResult(boolean success, T data) {
        super(success);
        this.data = data;
    }

    public DataResult(boolean success, String message, T data) {
        super(success, message);
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
