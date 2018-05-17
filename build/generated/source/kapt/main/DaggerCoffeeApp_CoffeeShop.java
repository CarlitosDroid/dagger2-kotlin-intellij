import coffee.CoffeeMaker;
import coffee.Heater;
import coffee.Thermosiphon;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerCoffeeApp_CoffeeShop implements CoffeeApp.CoffeeShop {
  private Provider<Heater> providesHeaterProvider;

  private DaggerCoffeeApp_CoffeeShop(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CoffeeApp.CoffeeShop create() {
    return new Builder().build();
  }

  private Thermosiphon getThermosiphon() {
    return new Thermosiphon(providesHeaterProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.providesHeaterProvider =
        DoubleCheck.provider(
            DripCoffeeModule_ProvidesHeaterFactory.create(builder.dripCoffeeModule));
  }

  @Override
  public CoffeeMaker maker() {
    return new CoffeeMaker(providesHeaterProvider.get(), getThermosiphon());
  }

  public static final class Builder {
    private DripCoffeeModule dripCoffeeModule;

    private Builder() {}

    public CoffeeApp.CoffeeShop build() {
      if (dripCoffeeModule == null) {
        this.dripCoffeeModule = new DripCoffeeModule();
      }
      return new DaggerCoffeeApp_CoffeeShop(this);
    }

    public Builder dripCoffeeModule(DripCoffeeModule dripCoffeeModule) {
      this.dripCoffeeModule = Preconditions.checkNotNull(dripCoffeeModule);
      return this;
    }
  }
}
