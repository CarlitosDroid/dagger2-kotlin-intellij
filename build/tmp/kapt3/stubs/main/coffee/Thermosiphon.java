package coffee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcoffee/Thermosiphon;", "Lcoffee/Pump;", "heater", "Lcoffee/Heater;", "(Lcoffee/Heater;)V", "pump", "", "gradle-kotlin-sample"})
public final class Thermosiphon implements coffee.Pump {
    private final coffee.Heater heater = null;
    
    @java.lang.Override()
    public void pump() {
    }
    
    @javax.inject.Inject()
    public Thermosiphon(@org.jetbrains.annotations.NotNull()
    coffee.Heater heater) {
        super();
    }
}