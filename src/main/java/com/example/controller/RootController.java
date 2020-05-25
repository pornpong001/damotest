package com.example.controller;


import com.example.model.Numbers;
import com.example.services.NumberManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RootController {

    @Autowired
    private NumberManage numberManage;

    @RequestMapping(value = "/setNo", method = RequestMethod.POST)
    public int getNo(@RequestBody Numbers no) {
        try {
            return numberManage.getNo(no);
        } catch (final Exception e) {
            return HttpStatus.INTERNAL_SERVER_ERROR.value();
        }
    }


}
