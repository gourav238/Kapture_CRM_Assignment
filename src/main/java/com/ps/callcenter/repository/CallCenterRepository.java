package com.ps.callcenter.repository;

import com.ps.callcenter.model.Call;
import com.ps.callcenter.model.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface CallCenterRepository extends JpaRepository<Call, Integer> {

    @Query(value = "SELECT DATE_PART('hour',start_call) as hour FROM CALL where date(start_call)= ?1 GROUP BY DATE_PART('hour',start_call) order by count(*) desc limit 1", nativeQuery = true)
    public Response getHourVolumeHighest(LocalDate date);

    @Query(value = "SELECT SUM(DURATION) as duration, DATE_PART('hour', start_call) as hour FROM CALL where date(start_call) =?1 GROUP BY DATE_PART('hour', start_call) order by duration desc limit 1", nativeQuery = true)
    public Response getHourCallLongest(LocalDate date);

    @Query(value = "SELECT count(*), extract(dow from date( start_call)) as day,extract(week from date (start_call)) as week,extract(month from  date(start_call)) as month,extract(year from  date(start_call)) as year FROM CALL  GROUP BY date(start_call) order by count(*) desc limit 1", nativeQuery = true)
    public Response getDayVolumeHighest();

    @Query(value = "SELECT SUM(duration) as duration , extract(dow from date( start_call)) as day,extract(week from date (start_call)) as week,extract(month from  date(start_call)) as month,extract(year from  date(start_call)) as year FROM CALL  GROUP BY date(start_call) order by duration desc limit 1 ", nativeQuery = true)
    public Response getDayCallLongest();

}
