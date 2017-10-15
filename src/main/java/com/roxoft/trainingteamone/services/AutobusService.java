package com.roxoft.trainingteamone.services;

import com.roxoft.trainingteamone.dao.AutobusDao;
import com.roxoft.trainingteamone.daoImpl.AutobusDaoImpl;
import com.roxoft.trainingteamone.models.Autobus;

import java.util.List;

/**
 * Created by Esenin on 14.10.2017.
 */
public class AutobusService {

    AutobusDao autobusDao = new AutobusDaoImpl();
    AdditionalInformationService additionalInformationService = new AdditionalInformationService();

    public Autobus createAutobus(Autobus autobus) {
        additionalInformationService.createAdditionalInformation(autobus.getAdditionalInformation());
        autobusDao.createAutobus(autobus);
        return autobus;
    }

    public Autobus getAutobusById(long id) {
        return autobusDao.getAutobusById(id);
    }

    public List<Autobus> getAllAutobuses() {
        return autobusDao.getAllAutobuses();
    }

    public void updateAutobus(Autobus autobus) {
        autobusDao.updateAutobus(autobus);
    }

    public void deleteAutobus(long id) {

    }
}
