import com.roxoft.trainingteamone.dao.AutobusDao;
import com.roxoft.trainingteamone.daoImpl.RoadDaoImpl;
import com.roxoft.trainingteamone.logic.Algorithm;
import com.roxoft.trainingteamone.models.*;
import com.roxoft.trainingteamone.services.*;
import org.apache.log4j.BasicConfigurator;

import java.util.List;

/**
 * Created by Esenin on 02.09.2017.
 */
public class MainClass {
    public static void main(String args[]){

        BasicConfigurator.configure();

        RoadService roadService = new RoadService();
        List<Road> roads = roadService.getAllRoads();
        Algorithm algorithm = new Algorithm(roads);
        Crossroad fromCrossroad = new Crossroad();
        fromCrossroad.setId(1);
        Crossroad toCrossroad = new Crossroad();
        toCrossroad.setId(6);
        System.out.println(algorithm.getMaxFlow(fromCrossroad, toCrossroad));
    }
}
