package com.ps.callcenter.service;

import com.ps.callcenter.model.Response;
import com.ps.callcenter.repository.CallCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CallCenterService {

    @Autowired
    private CallCenterRepository repo;


    public String getHourLongest(LocalDate date) {

        Response hourCallLongest = repo.getHourCallLongest(date);

        String time = null;

        if (hourCallLongest.getHour() >= 12)
            time = "PM";
        else
            time = "AM";

        return "Hour of the day when the call volume is highest is " + hourCallLongest.getHour() + time + "-" + (hourCallLongest.getHour() + 1) + time;
    }

    public String getHourVolumeHighest(LocalDate date) {

        Response hourVolumeHighest = repo.getHourVolumeHighest(date);

        String time = null;
        if (hourVolumeHighest.getHour() >= 12)
            time = "PM";
        else
            time = "AM";

        return "Hour of the day when the call volume is highest is " + hourVolumeHighest.getHour() + time + "-" + (hourVolumeHighest.getHour() + 1) + time;
    }

    public String getCallVolumeHighest() {

        Response dayVolumeHighest = repo.getDayVolumeHighest();

        String Month = null;
        if (dayVolumeHighest.getMonth() == 1)
            Month = "January";
        else if (dayVolumeHighest.getMonth() == 2)
            Month = "February";
        else if (dayVolumeHighest.getMonth() == 3)
            Month = ("March");
        else if (dayVolumeHighest.getMonth() == 4)
            Month = "April";
        else if (dayVolumeHighest.getMonth() == 5)
            Month = "May";
        else if (dayVolumeHighest.getMonth() == 6)
            Month = "June";
        else if (dayVolumeHighest.getMonth() == 7)
            Month = "July";
        else if (dayVolumeHighest.getMonth() == 8)
            Month = "August";
        else if (dayVolumeHighest.getMonth() == 9)
            Month = "September";
        else if (dayVolumeHighest.getMonth() == 10)
            Month = "October";
        else if (dayVolumeHighest.getMonth() == 11)
            Month = "November";
        else if (dayVolumeHighest.getMonth() == 12)
            Month = "December";

        String Day = null;
        if (dayVolumeHighest.getDay() == 0)
            Day = "Sunday";
        else if (dayVolumeHighest.getDay() == 1)
            Day = "Monday";
        else if (dayVolumeHighest.getDay() == 2)
            Day = "Tuesday";
        else if (dayVolumeHighest.getDay() == 3)
            Day = "Wednesday";
        else if (dayVolumeHighest.getDay() == 4)
            Day = "Thursday";
        else if (dayVolumeHighest.getDay() == 5)
            Day = "Friday";
        else if (dayVolumeHighest.getDay() == 6)
            Day = "Saturday";

        return "Day : " + Day + ", Month : " + Month + ", Year : " + dayVolumeHighest.getYear();
    }

    public String getDayCallLongest() {

        Response dayCallLongest = repo.getDayCallLongest();

        String Month = null;
        if (dayCallLongest.getMonth() == 1)
            Month = "January";
        else if (dayCallLongest.getMonth() == 2)
            Month = "February";
        else if (dayCallLongest.getMonth() == 3)
            Month = ("March");
        else if (dayCallLongest.getMonth() == 4)
            Month = "April";
        else if (dayCallLongest.getMonth() == 5)
            Month = "May";
        else if (dayCallLongest.getMonth() == 6)
            Month = "June";
        else if (dayCallLongest.getMonth() == 7)
            Month = "July";
        else if (dayCallLongest.getMonth() == 8)
            Month = "August";
        else if (dayCallLongest.getMonth() == 9)
            Month = "September";
        else if (dayCallLongest.getMonth() == 10)
            Month = "October";
        else if (dayCallLongest.getMonth() == 11)
            Month = "November";
        else if (dayCallLongest.getMonth() == 12)
            Month = "December";

        String Day = null;
        if (dayCallLongest.getDay() == 0)
            Day = "Sunday";
        else if (dayCallLongest.getDay() == 1)
            Day = "Monday";
        else if (dayCallLongest.getDay() == 2)
            Day = "Tuesday";
        else if (dayCallLongest.getDay() == 3)
            Day = "Wednesday";
        else if (dayCallLongest.getDay() == 4)
            Day = "Thursday";
        else if (dayCallLongest.getDay() == 5)
            Day = "Friday";
        else if (dayCallLongest.getDay() == 6)
            Day = "Saturday";

        return "Day : " + Day + ", Week : " + dayCallLongest.getWeek() + ", Month : " + Month + ", Year : " + dayCallLongest.getYear();

    }
}