package com.roxoft.trainingteamone.services;

import com.roxoft.trainingteamone.daoImpl.AdditionalInformationImpl;
import com.roxoft.trainingteamone.factory.SessionFactory;
import com.roxoft.trainingteamone.models.AdditionalInformation;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Esenin on 15.10.2017.
 */
public class AdditionalInformationService {

    private AdditionalInformationImpl additionalInformationDao = new AdditionalInformationImpl();


    public AdditionalInformation createAdditionalInformation(AdditionalInformation additionalInformation) {

        additionalInformationDao.createAdditionalInformation(additionalInformation);
        return additionalInformation;
    }


    public AdditionalInformation getAdditionalInformationById(long id) {

        return additionalInformationDao.getAdditionalInformationById(id);
    }


    public List<AdditionalInformation> getAllAdditionalInformations() {

        return additionalInformationDao.getAllAdditionalInformations();
    }


    public AdditionalInformation updateAdditionalInformation(AdditionalInformation additionalInformation) {

        additionalInformationDao.updateAdditionalInformation(additionalInformation);
        return additionalInformation;
    }


    public void deleteAdditionalInformation(long id) {

        additionalInformationDao.deleteAdditionalInformation(id);

    }
}
