package com.example.masimpl.Configs;

import com.example.masimpl.Models.Car;
import com.example.masimpl.Models.CarDamage;
import com.example.masimpl.Models.TechnicalService;
import com.example.masimpl.Repositories.CarRepository;
import com.example.masimpl.Repositories.CarDamageRepository;
import com.example.masimpl.Repositories.TechnicalServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Configuration
public class DataCreationConfig {

    private final CarRepository carRepository;
    private final TechnicalServiceRepository technicalServiceRepository;
    private final CarDamageRepository carDamageRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void setup() {
        Car ford = Car.builder()
                .withBrand("Ford")
                .withColor("Red")
                .withModel("Mondeo")
                .withAverageFuelConsumption(7.8)
                .build();

        Car mercedes = Car.builder()
                .withBrand("Mercedes")
                .withColor("Silver")
                .withModel("S")
                .withAverageFuelConsumption(17.8)
                .build();

        TechnicalService mark = TechnicalService.builder()
                .withDateOfHire(LocalDateTime.of(2017, 11, 15, 21, 37))
                .withName("Marc")
                .withLastName("McAfke")
                .withPESEL("56343454321")
                .build();

        TechnicalService richard = TechnicalService.builder()
                .withDateOfHire(LocalDateTime.of(2005, 5, 15, 4, 20))
                .withName("Richard")
                .withLastName("Appleseed")
                .withPESEL("65123412345")
                .build();

        CarDamage markFixesFord = CarDamage.builder()
                .withCar(ford)
                .withTechnicalService(mark)
                .withLocationOfTheCarDamage("Rear bumper")
                .build();

        CarDamage richardFixesMercedes = CarDamage.builder()
                .withCar(mercedes)
                .withTechnicalService(richard)
                .withLocationOfTheCarDamage("Front bumper")
                .build();

        carRepository.saveAll(List.of(ford,mercedes));
        technicalServiceRepository.saveAll(List.of(mark,richard));
        carDamageRepository.saveAll(List.of(markFixesFord,richardFixesMercedes));
//        technicalServiceRepository.findAll().stream().findFirst().map(TechnicalService::calculateTimeInCompany).ifPresent(System.out::println);
    }
}
