package com.atc.trafficcontrol.model;

import java.util.Random;

public enum RoadSensorDataValue {
    YES, NO;

    private static final Random RANDOM = new Random();

    public static RoadSensorDataValue randomValue()  {
        RoadSensorDataValue[] directions = values();
        return directions[RANDOM.nextInt(directions.length)];
    }
}
