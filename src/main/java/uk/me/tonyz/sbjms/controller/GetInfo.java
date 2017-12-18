/*******************************************************************************
 * Copyright Tony Z 2017. All Rights reserved.
 * 
 *  This software is only to be used for the purpose for which it has been 
 *  provided. No part of it is to be reproduced, disassembled, transmitted
 *  or stored in a retrieval system, nor translated in any human or computer
 *  language in any way or for any other purpose whatsoever without the 
 *  prior written consent of Tony Z.
 ******************************************************************************/
package uk.me.tonyz.sbjms.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * rest controller
 *
 */
@RestController
public class GetInfo {
    private static final Logger logger = LoggerFactory.getLogger(GetInfo.class);

    @Value("${uk.me.tonyz.count}")
    private String counter;

    /**
     * 
     */
    @RequestMapping(path = "/api/getInfo", method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<String> getInfoRequest(
            @RequestParam(value = "Id", required = true) final Integer Id,
            @RequestParam(value = "name", required = false) final String name)
            throws Exception {

        ArrayList<String> a = new ArrayList<String>();
        a.add("hello");
        a.add("buy");

        logger.info("return string" + counter);
        return a;
    }
}
