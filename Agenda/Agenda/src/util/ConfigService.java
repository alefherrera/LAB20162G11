package util;

import java.io.File;
import java.io.FileNotFoundException;

public class ConfigService {

	private static final String CONFIG_FILENAME = "config.xml";

	public static Configuration GetConfiguration() {
		File configFile = new File(CONFIG_FILENAME);
		if (configFile.isFile()) {
			try {
				return PersistenciaService.getInstance().get(CONFIG_FILENAME);
			} catch (FileNotFoundException e) {
				System.out.println("WARNING: No se pudo leer el archivo de configuracion.");
				return null;
			}
		}
		return null;
	}

	public static void SaveConfiguration(Configuration config_to_save) {
		if (config_to_save == null)
			return;
		
		try {
			PersistenciaService.getInstance().put(config_to_save, CONFIG_FILENAME);
		} catch (FileNotFoundException e) {
			System.out.println("WARNING: No se pudo guardar el archivo de configuracion.");
		}
	}

}
