package br.com.matheusvargas481.mecanicaserver.util;

import org.json.JSONObject;

public class Json {
    public final static String toJson(String objeto) {
        return JSONObject.stringToValue(objeto).toString();
    }
}
