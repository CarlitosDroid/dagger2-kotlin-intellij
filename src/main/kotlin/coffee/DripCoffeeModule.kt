import coffee.Heater
import coffee.PumpModule
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [PumpModule::class])
class DripCoffeeModule {
    @Provides
    @Singleton
    fun providesHeater(): Heater = ElectricHeater()
}