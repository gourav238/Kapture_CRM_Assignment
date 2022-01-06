package com.ps.callcenter.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CALL")
public class Call {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String fromNumber;
    private LocalDateTime startCall;
    private LocalDateTime endCall;
    private int duration;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFromNumber() {
        return fromNumber;
    }

    public void setFromNumber(String fromNumber) {
        this.fromNumber = fromNumber;
    }

    public LocalDateTime getStartCall() {
        return startCall;
    }

    public void setStartCall(LocalDateTime startCall) {
        this.startCall = startCall;
    }

    public LocalDateTime getEndCall() {
        return endCall;
    }

    public void setEndCall(LocalDateTime endCall) {
        this.endCall = endCall;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "CallCenter{" +
                "id=" + id +
                ", phoneNumber=" + fromNumber +
                ", startTime=" + startCall +
                ", endTime=" + endCall +
                ", duration=" + duration +
                '}';
    }
}
