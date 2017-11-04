package com.example.ted1g.visualdata.model;

import org.json.JSONObject;

/**
 * Created by ted1g on 11/2/2017.
 */

public class Owner
{
    public String name;
    public Owner(JSONObject jsonObject){
        //Try/Catch

        try{
            name = jsonObject.getString( name; "name");
        }catch(Exception e){

        }
    }
}
