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

    public void createAutobus(Autobus autobus) {

    }

    public Autobus getAutobusById(long id) {
        return autobusDao.getAutobusById(id);
    }

    public List<Autobus> getAllAutobuses() {
        return null;
    }

    public void updateAutobus(Autobus autobus) {

    }

    public void deleteAutobus(long id) {

    }
}
