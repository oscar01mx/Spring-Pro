package com.pro.spring.ch4.profiles.kindergarden;

import java.util.ArrayList;
import java.util.List;

import com.pro.spring.ch4.profiles.Food;
import com.pro.spring.ch4.profiles.FoodProviderService;

public class FoodProviderServiceImpl implements FoodProviderService {

	public List<Food> provideLunchSet() {
        List<Food> lunchSet = new ArrayList<Food>();
        lunchSet.add(new Food("Milk"));
        lunchSet.add(new Food("Biscuits"));

        return lunchSet;
    }

}
