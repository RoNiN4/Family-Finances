package com.ronin.familyfinances.data.models;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Администратор on 22.11.2017.
 */

public class Revenue {
    boolean isExpense;
    private UUID mId;
    private Date mDate;
    private double mSum;
    private String mTypeOfRevenue;
}
