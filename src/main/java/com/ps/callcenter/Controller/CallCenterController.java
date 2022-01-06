package com.ps.callcenter.Controller;

import com.ps.callcenter.service.CallCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1")
public class CallCenterController {
    private CallCenterService callCenterService;

    @Autowired
    public CallCenterController(CallCenterService callCenterService) {
        this.callCenterService = callCenterService;
    }


    @GetMapping("/calls/hour/longest")
    String getHourLongest(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return callCenterService.getHourLongest(date);
    }

    @GetMapping("/calls")
    String getHourVolume(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return callCenterService.getHourVolumeHighest(date);
    }

    @GetMapping("/calls/week/volume")
    String getDayVolume() {
        return callCenterService.getCallVolumeHighest();
    }

    @GetMapping("/calls/week/longest")
    String getDayLongest() {
        return callCenterService.getDayCallLongest();
    }

}
