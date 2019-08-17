package com.flight.ticketsAnalysis.service.impl;

import com.flight.ticketsAnalysis.dao.ManageMapper;
import com.flight.ticketsAnalysis.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    private ManageMapper manageMapper;

}
