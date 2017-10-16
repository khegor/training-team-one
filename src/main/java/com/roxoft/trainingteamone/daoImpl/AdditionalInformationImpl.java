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

        SqlSession sqlSession = SessionFactory.getSession();
        AdditionalInformation additionalInformation = sqlSession.selectOne("additionalInformationMapper.getAdditionalInformationById", id);
        sqlSession.commit();
        sqlSession.close();
        return additionalInformation;
    }

    public List<AdditionalInformation> getAllAdditionalInformations() {

        SqlSession sqlSession = SessionFactory.getSession();
        List<AdditionalInformation> additionalInformations = sqlSession.selectList("additionalInformationMapper.getAllAdditionalInformations");
        sqlSession.close();
        return additionalInformations;
    }

    public void updateAdditionalInformation(AdditionalInformation additionalInformation) {

        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.update("additionalInformationMapper.updateAdditionalInformation", additionalInformation);
        sqlSession.commit();
        sqlSession.close();
    }

    public void deleteAdditionalInformation(long id) {

        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.delete("additionalInformationMapper.deleteAdditionalInformation", id);
        sqlSession.commit();
        sqlSession.close();
    }
}
