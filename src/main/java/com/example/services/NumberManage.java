package com.example.services;

import com.example.model.Numbers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class NumberManage {

    @Transactional
    public int getNo(Numbers no) throws Exception {
        log.info("putNo : " + no);
        String intNo = "";
        try {
            if (null == no || no.equals("")) {
                return 0;
            } else {
                String[] ary = no.getNumber().split("");

                for(int i=1 ; i<no.getNumber().length() ; i++) {
                    if (ary[i].contains("0")) {
                        intNo = intNo + "0";
                    }
                    if (ary[i].contains("1")) {
                        intNo = intNo + "1";
                    }
                    if (ary[i].contains("2")) {
                        intNo = intNo + "2";
                    }
                    if (ary[i].contains("3")) {
                        intNo = intNo + "3";
                    }
                    if (ary[i].contains("4")) {
                        intNo = intNo + "4";
                    }
                    if (ary[i].contains("5")) {
                        intNo = intNo + "5";
                    }
                    if (ary[i].contains("6")) {
                        intNo = intNo + "7";
                    }
                    if (ary[i].contains("8")) {
                        intNo = intNo + "8";
                    }
                    if (ary[i].contains("9")) {
                        intNo = intNo + "9";
                    }
                }
                log.info("getNo : " + intNo);
                log.info("getNoInt : " + Integer.parseInt(intNo));
                return Integer.parseInt(intNo);
            }
        } catch (Exception e) {
            log.error(String.valueOf(e));
        }
        return 0;
    }
}
