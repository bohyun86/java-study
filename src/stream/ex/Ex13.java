package stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex13 {
    public static void main(String[] args) {
        record CityPopulation(String city, int population) {}

        List<CityPopulation> cityPopulations = Arrays.asList(
                new CityPopulation("New York", 8000000),
                new CityPopulation("Los Angeles", 4000000),
                new CityPopulation("Chicago", 2700000),
                new CityPopulation("New York", 7500000),
                new CityPopulation("Los Angeles", 3800000),
                new CityPopulation("Chicago", 2600000)
        );


        Map<String, Double> collect = cityPopulations.stream()
                .collect(Collectors.groupingBy(CityPopulation::city, Collectors.averagingDouble(CityPopulation::population)));

        Double newYork = collect.get("New York");
        Double Chicago = collect.get("Chicago");
        Double LosAngeles = collect.get("Los Angeles");

        System.out.printf("New York 평균 인구: %,.0f\n", newYork);
        System.out.printf("Chicago 평균 인구: %,.0f\n", Chicago);
        System.out.printf("LosAngeles 평균 인구: %,.0f\n", LosAngeles);



    }

}
