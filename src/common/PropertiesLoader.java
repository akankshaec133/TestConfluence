package common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;


public class PropertiesLoader {
	private static PropertiesLoader instance;
	private static Properties properties = new Properties();

	public static PropertiesLoader getInstance() {
		if (instance == null) {
			synchronized (PropertiesLoader.class) {
				if (instance == null) {
					try {
						instance = new PropertiesLoader();
						InputStream inputProp = PropertiesLoader.class.getClassLoader()
								.getResourceAsStream("Locators.properties");

						properties.load(inputProp);

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				return instance;
			}
		} else {
			return instance;
		}
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	public Set<String> getAllPropertyNames() {
		return properties.stringPropertyNames();
	}

	public boolean containsKey(String key) {
		return properties.containsKey(key);
	}

	public void addKey(String key, String value) {
		properties.setProperty(key, value);
	}
}
