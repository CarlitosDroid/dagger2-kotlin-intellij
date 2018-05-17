import coffee.Heater;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DripCoffeeModule_ProvidesHeaterFactory implements Factory<Heater> {
  private final DripCoffeeModule module;

  public DripCoffeeModule_ProvidesHeaterFactory(DripCoffeeModule module) {
    this.module = module;
  }

  @Override
  public Heater get() {
    return Preconditions.checkNotNull(
        module.providesHeater(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static DripCoffeeModule_ProvidesHeaterFactory create(DripCoffeeModule module) {
    return new DripCoffeeModule_ProvidesHeaterFactory(module);
  }

  public static Heater proxyProvidesHeater(DripCoffeeModule instance) {
    return Preconditions.checkNotNull(
        instance.providesHeater(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
