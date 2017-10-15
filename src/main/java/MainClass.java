import com.roxoft.trainingteamone.dao.AutobusDao;
import com.roxoft.trainingteamone.models.*;
import com.roxoft.trainingteamone.services.AutobusService;
import com.roxoft.trainingteamone.services.BikeService;
import com.roxoft.trainingteamone.services.CarService;
import org.apache.log4j.BasicConfigurator;

import java.util.List;

/**
 * Created by Esenin on 02.09.2017.
 */
public class MainClass {
    public static void main(String args[]){

        BasicConfigurator.configure();

//        AutobusService autobusService = new AutobusService();
//        Autobus autobus = new Autobus();
//        AdditionalInformation additionalInformation = new AdditionalInformation();
//        additionalInformation.setType(Type.PUBLIC);
//        autobus.setModel("MAZ");
//        autobus.setMaxWeight(20);
//        autobus.setPunchType("manual");
//        autobus.setAdditionalInformation(additionalInformation);
//        autobusService.createAutobus(autobus);
//        System.out.println(autobus.getId() + " " + additionalInformation.getId());

        AutobusService autobusService = new AutobusService();
        List<Autobus> autobuses= autobusService.getAllAutobuses();
        for(Autobus a : autobuses){
            System.out.println(a.getModel() + " " + a.getAdditionalInformation().getType());
        }

    }
}
