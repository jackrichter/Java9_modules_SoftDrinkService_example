package softdrink.customer;

import softdrink.api.SoftDrinkService;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {

        ServiceLoader<SoftDrinkService> services = ServiceLoader.load(SoftDrinkService.class);

        // Using Stream Api
        services.stream()                                                           // OUT: Stream<ServiceLoader.Provider<SoftDrinkService>>
                .filter(provider -> provider.type().getName().contains("Small"))
                .map(ServiceLoader.Provider::get)                                   // Instantiates the service. OUT: SoftDrinkService
                .forEach(softDrinkService -> System.out.println(softDrinkService.getSize()));
    }
}