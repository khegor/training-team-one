package com.roxoft.trainingteamone.daoImpl;

import com.roxoft.trainingteamone.dao.AdditionalInformationDao;
import com.roxoft.trainingteamone.factory.SessionFactory;
import com.roxoft.trainingteamone.models.AdditionalInformation;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Esenin on 15.10.2017.
 */
public class AdditionalInformationImpl implements AdditionalInformationDao {
    public void createAdditionalInformation(AdditionalInformation additionalInformation) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert("additionalInformationMapper.createAdditionalInformation", additionalInformation);
        sqlSession.commit();
        sqlSession.close();
    }

    public AdditionalInformation getAdditionalInformationById(long id) {
        return null;
    }

    public List<AdditionalInformation> getAllAdditionalInformations() {
        return null;
    }

    public void updateAdditionalInformation(AdditionalInformation additionalInformation) {

    }

    public void deleteAdditionalInformation(long id) {

    }
}
