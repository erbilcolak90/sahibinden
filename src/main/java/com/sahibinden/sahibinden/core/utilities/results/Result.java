package com.sahibinden.sahibinden.core.utilities.results;

public class Result {

    //get veya post fonksiyonları sonucunda işlemin durumuyla ilgili ekrana bilgilendirme sunmak adına Result oluşturduk
    //Bu result kendi içersinde success ve error olarak ayrılıp işlem durumuna göre ilgili result sonucu yansıtılacak.
    private boolean success;
    private String message;

    //sorgu sonucunda mesajla bilgilendirme yapılmayacak, sadece success bilgisi olacak ise bu constructorı kullanacağız
    public Result(boolean success) {
        this.success = success;
    }
    //sorgu sonucunda success bilgisi ve sonuç bilgisi yansıtılacaksa bu constructoru kullanacağız.
    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }
}
