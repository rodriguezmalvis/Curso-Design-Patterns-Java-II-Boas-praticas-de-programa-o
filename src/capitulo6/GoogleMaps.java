package capitulo6;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa{

	@Override
	public String devolvemapa(String rua) {
		try {
			
			String googlmaps = "";
			URL url;
			url = new URL(googlmaps);
			InputStream inputStream = url.openStream();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "mapa";
	}

}
