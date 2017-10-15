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
        return null;
    }

    public List<AdditionalInformation> getAllAdditionalInformations() {
        return null;
    }

    public AdditionalInformation updateAdditionalInformation(AdditionalInformation additionalInformation) {
        return null;
    }

    public void deleteAdditionalInformation(long id) {

    }
}
