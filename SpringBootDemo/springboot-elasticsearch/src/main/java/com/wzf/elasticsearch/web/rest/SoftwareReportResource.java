package com.wzf.elasticsearch.web.rest;

import com.wzf.elasticsearch.dto.SoftwareReportDataDTO;
import com.wzf.elasticsearch.service.SoftwareReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * SoftwareReportResource
 *
 */
@RestController
@RequestMapping("/api")
public class SoftwareReportResource {

    @Autowired
    private SoftwareReportService softwareReportService;

    @GetMapping("/software/reports")
    public ResponseEntity<List<SoftwareReportDataDTO>> getSoftwareReportData(
            @RequestParam(value = "startTimestamp") Long startTimestamp,
            @RequestParam(value = "endTimestamp") Long endTimestamp,
            @RequestParam(value = "intervalMinutes", defaultValue = "1") Integer intervalMinutes,
            @RequestParam(value = "top", defaultValue = "10") Integer top
    ) {
        List<SoftwareReportDataDTO> softwareReportDataDTOS = softwareReportService.searchSoftwareReport(startTimestamp, endTimestamp, intervalMinutes, top);

        return ResponseEntity.ok(softwareReportDataDTOS);
    }
}
