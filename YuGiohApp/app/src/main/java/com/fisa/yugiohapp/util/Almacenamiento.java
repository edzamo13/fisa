package com.fisa.yugiohapp.util;


import android.content.Context;
import android.content.SharedPreferences;

import com.fisa.yugiohapp.dto.ArchetypeDto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class Almacenamiento {
    public static void saveInMemory(ArchetypeDto archetypeDto, Context context) {
        // se envia el tipo de contexto y el valor que se manda a guardar , se transforma en gson y se guarda en contexto
        SharedPreferences sharedPreferences = context.getSharedPreferences("sharedPreferences", context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(archetypeDto);
        editor.putString("json", json);
        editor.apply();
    }
    public static ArchetypeDto loadInMemory(Context context) {
        // crea el contexto , que tipo de modo es , parciar el obejeto a objeto OrdenDto , y recupera memoria.
        ArchetypeDto archetypeDto = new ArchetypeDto();
        SharedPreferences sharedPreferences = context.getSharedPreferences("sharedPreferences", context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString("json", null);
        Type type = new TypeToken<ArchetypeDto>() {
        }.getType();
        archetypeDto = gson.fromJson(json, type);
        return archetypeDto;

    }

}
