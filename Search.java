package com.fawzySystem.payment_service.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Component
public class Search
{

    public String Service_name ;





    public ArrayList<String> search(Search s)
    {
        ArrayList<String> matched ;
        matched = new ArrayList<String>();

        ArrayList<String> serivceNames ;
        serivceNames = new ArrayList<String>();

        serivceNames.add("mobile.");
        serivceNames.add("internet.");
        serivceNames.add("landline.");
        serivceNames.add("donation.");


        for (int i = 0 ; i < serivceNames.size(); i++)
        {
            for(int j=0;j<serivceNames.get(i).length()-s.Service_name.length();j++)
            {
                if(serivceNames.get(i).substring(j, s.Service_name.length() + j).equals(s.Service_name))
                {
                    matched.add(serivceNames.get(i));
                    break;
                }
            }
        }
        return matched;
    }



}
