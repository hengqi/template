package com.chenhl.template.controller;

import com.chenhl.template.common.result.ActionResult;
import com.chenhl.template.domain.AcctRequest;
import com.chenhl.template.service.AcctRequstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AcctRequestController {


    @Autowired
    AcctRequstService acctRequstService;

    @RequestMapping(value="/acct/request/{externalTradeNum}", produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Object getItemParam(@PathVariable String externalTradeNum) {
        ActionResult<List<AcctRequest>> result = new ActionResult<>(true, "success");

//        List<AcctRequest> list = acctRequstService.getAcctRequestByExternalTradeNum(externalTradeNum);
//        result.setRetValue(list);
        return result;
    }

    @RequestMapping(value="/acct/accounting", produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Object accounting(@RequestBody AcctRequest acctRequest) {
        acctRequstService.accounting(acctRequest);
        return ActionResult.Success;
    }
}
