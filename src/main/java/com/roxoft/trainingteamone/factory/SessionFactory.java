package com.roxoft.trainingteamone.factory;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;


import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Esenin on 14.10.2017.
 */
public class SessionFactory {

    public static final Logger LOGGER = Logger.getLogger(SessionFactory.class);

    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream("com/roxoft/trainingteamone/mybatisconfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }

    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
