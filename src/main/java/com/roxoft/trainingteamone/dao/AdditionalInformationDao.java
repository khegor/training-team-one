package com.roxoft.trainingteamone.dao;

import com.roxoft.trainingteamone.models.AdditionalInformation;

import java.util.List;

/**
 * Created by Esenin on 15.10.2017.
 */
public interface AdditionalInformationDao {

    void createAdditionalInformation(AdditionalInformation additionalInformation);
    AdditionalInformation getAdditionalInformationById(long id);
    List<AdditionalInformation> getAllAdditionalInformations();
    void updateAdditionalInformation(AdditionalInformation additionalInformation);
    void deleteAdditionalInformation(long id);
}
