package com.roxoft.trainingteamone.factory;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;


import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Esenin on 14.10.2017.
 */
public class SessionFactory {

    public static final Logger LOGGER = Logger.getLogger(SessionFactory.class);

    public static SqlSession getSession(){

        SqlSessionFactory sqlSessionFactory = null;

        try {
            InputStream inputStream = Resources.getResourceAsStream("com/roxoft/trainingteamone/mybatisconfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            LOGGER.error(e);
        }

        return sqlSessionFactory.openSession();
    }
}
