package com.roxoft.trainingteamone.converter;

import java.io.File;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

public class ConverterUtil {

	public static final Logger LOGGER = Logger.getLogger(ConverterUtil.class);

	public static void toJSON(Object o, String path) {

		ObjectMapper mapper = new ObjectMapper();

		try {
			mapper.writeValue(new File(path), o);
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}
}
