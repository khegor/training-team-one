package com.roxoft.trainingteamone.daoImpl;

import com.roxoft.trainingteamone.dao.AutobusDao;
import com.roxoft.trainingteamone.factory.SessionFactory;
import com.roxoft.trainingteamone.models.Autobus;
import org.apache.ibatis.session.SqlSession;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 * Created by Esenin on 14.10.2017.
 */
public class AutobusDaoImpl implements AutobusDao {

    public void createAutobus(Autobus autobus) {

    }

    public Autobus getAutobusById(long id) {

        SqlSession sqlSession = SessionFactory.getSession();
        Autobus autobus = sqlSession.selectOne("autobusMapper.getAutobusById", id);
        sqlSession.close();
        return autobus;
    }

    public List<Autobus> getAllAutobuses() {
        return null;
    }

    public void updateAutobus(Autobus autobus) {

    }

    public void deleteAutobus(long id) {

    }
}
