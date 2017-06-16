package com.ttl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SmsController {
	@RequestMapping(value = "/insertsms", method=RequestMethod.GET)
	public String insertSms(
			@RequestParam (required=false) String number,
			@RequestParam (required=false) String message,
			@RequestParam (required=false) String username,
			@RequestParam (required=false) String smsmask,
			@RequestParam (required=false) String smstype) {
            Boolean flag = true;
            if (flag) {
                    message = "SMS Sent Successfully";
            } else {
                    message = "Error in sending SMS";
            }
            return message;
	}
}
