package sample.tarun.module;

import com.google.inject.AbstractModule;
import sample.tarun.impl.DrawSquare;
import sample.tarun.services.DrawShape;

/**
 * Metadata of Binding
 */
public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class);
    }
}
