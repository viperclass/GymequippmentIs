/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymequipments.util;

import java.util.regex.Pattern;

/**
 *
 * @author SHUBHAM BHATTA
 */
public class Validate {
    
    private static final Pattern GYMEQUIPMENTSNAMEPattern = Pattern.compile("^[a-zA-Z]+[ a-zA-Z]*$");
    private static final Pattern GYMEQUIPMENTSIDpattern = Pattern.compile("^KTM\\d{4}$");
    private static final Pattern GYMEQUIPMENTSCATAEGORYPATTERN = Pattern.compile("^[a-zA-Z]+[ a-zA-Z]*$");
    private static final Pattern GYMEQUIPMENTSUSESPATTERN = Pattern.compile("^[a-zA-Z]+[ a-zA-Z]*$");
    private static final Pattern GYMEQUIPMENTSMODELNOSPATTERN = Pattern.compile("^[a-zA-Z]+\\d+$");
    
    public static boolean isNullorEmpty(String value){
         return value == null || value.trim().isEmpty();
    }
    public static boolean isValidName(String name) {
        return GYMEQUIPMENTSNAMEPattern.matcher(name).matches();
    }
    public static boolean isValidID(String ID){
        return GYMEQUIPMENTSIDpattern.matcher(ID).matches();
    }
    public static boolean isValidCATEGORY(String CATEGORY){
        return GYMEQUIPMENTSCATAEGORYPATTERN.matcher(CATEGORY).matches();
    }
    public static boolean isValidUSE(String USE){
        return GYMEQUIPMENTSUSESPATTERN.matcher(USE).matches();
    }
    public static boolean isValidMODELNO(String MODELNO){
        return GYMEQUIPMENTSMODELNOSPATTERN.matcher(MODELNO).matches();
    }
    


    
    
}

