package com.pro.spring.ch4.profiles.highSchool;

import java.util.ArrayList;
import java.util.List;

import com.pro.spring.ch4.profiles.Food;
import com.pro.spring.ch4.profiles.FoodProviderService;

public class FoodProviderServiceImpl implements FoodProviderService{

	public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<Food>();
        lunchSet.add(new Food("Coke"));
        lunchSet.add(new Food("Hamburger"));
        lunchSet.add(new Food("French Fries"));

        return lunchSet;
    }
}
