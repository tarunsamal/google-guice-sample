package sample.tarun;

import com.google.inject.Guice;
import com.google.inject.Injector;
import sample.tarun.module.AppModule;
import sample.tarun.request.SquareRequest;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppModule());
        SquareRequest request = injector.getInstance(SquareRequest.class);
        request.makeRequest();
    }
}