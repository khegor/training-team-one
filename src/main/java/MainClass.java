import com.roxoft.trainingteamone.converter.ConverterUtil;
import com.roxoft.trainingteamone.logic.Algorithm;
import com.roxoft.trainingteamone.models.*;
import com.roxoft.trainingteamone.services.*;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Esenin on 02.09.2017.
 */
public class MainClass {
    public static void main(String args[]) {


        BasicConfigurator.configure();
        final Logger LOGGER = Logger.getLogger(MainClass.class);

        CarService carService = new CarService();
        RoadService roadService = new RoadService();
        List<Road> roads = roadService.getAllRoads();
        Algorithm algorithm = new Algorithm(roads);

        Random random = new Random();

        for (Road road : roads) {

            int capacity = random.nextInt(100);
            road.setDailyCarryingCapacity(capacity);
            roadService.updateRoad(road);
        }

        roadService.getAllRoads();
        Crossroad fromCrossroad = new Crossroad();
        fromCrossroad.setId(1);
        Crossroad toCrossroad = new Crossroad();
        toCrossroad.setId(6);
        double maxFlow = algorithm.getMaxFlow(fromCrossroad, toCrossroad);

        List<Car> randomCars = new ArrayList<>();
        for (int i = 0; i < random.nextInt(10000); i++) {
            randomCars.add(carService.getCarById(random.nextInt(20)));
        }

        LOGGER.info("\n MAX ROAD CAPACITY FOR EXISTING PATH " + maxFlow);
        double sumWeight = 0;
        List<Car> resultCars = new ArrayList<>();
        for (Car car : randomCars) {
            sumWeight = sumWeight + car.getMaxWeight();
            if (sumWeight > maxFlow) {
                LOGGER.error("ROADS HAVEN'T NEEDED CARRYING CAPACITY TO TRANSMIT TRANSPORT FOR EXISTING WAY OR TRANSPORT");
                break;
            }
            LOGGER.info("\n TRANSPORT " + car.getModel() + " CAN RIDE WITH WEIGHT " + car.getMaxWeight()+ "\n");
            resultCars.add(car);
        }
        ConverterUtil.toJSON(resultCars, "src\\main\\resources\\cars.json");
    }
}
