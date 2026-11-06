package ud2.examen;

/** @author Brais García Piñeiro */

public class DistanciaGPS {

    public static double distancia(double lat1, double lon1, double lat2, double lon2) {

        Double lat1Radianes = Math.toRadians(lat1);
        Double lat2Radianes = Math.toRadians(lat2);

        Double lon1Radianes = Math.toRadians(lon1);
        Double lon2Radianes = Math.toRadians(lon2);

        Double diferenciaLatitud = lat2Radianes - lat1Radianes;
        Double diferenciaLongitud = lon2Radianes - lon1Radianes;

        final int RADIO_TIERRA = 6371000; // metros

        Double senoLatitudes = Math.sin(diferenciaLatitud / 2);
        Double senoLatitudCuadrado = Math.pow(senoLatitudes, 2);

        Double cosenoLat1 = Math.cos(lat1Radianes);
        Double cosenoLat2 = Math.cos(lat2Radianes);

        Double senoLongitudes = Math.sin(diferenciaLongitud / 2);
        Double senoLongitudCuadrado = Math.pow(senoLongitudes, 2);

        Double a = senoLatitudCuadrado + (cosenoLat1 * cosenoLat2 * senoLongitudCuadrado);
        

        Double c = 2 * (Math.atan2(Math.sqrt(a), Math.sqrt(1 - a)));

        Double distanciaFinal = RADIO_TIERRA *  c;

        return distanciaFinal / 1000;

        
    }


}

