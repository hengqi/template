package com.chenhl.template.service.impl;

import com.chenhl.template.common.result.ActionResult;
import com.chenhl.template.domain.AcctRequest;
import com.chenhl.template.service.AcctRequstService;
import com.chenhl.template.template.AbstractBusinessTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

@Service
public class AcctRequestServiceImpl implements AcctRequstService {

    @Override
    public ActionResult<String> accounting(AcctRequest acctRequest) {

        WebApplicationContext applicationContext = ContextLoader.getCurrentWebApplicationContext();
        AbstractBusinessTemplate abstractBusinessTemplate = (AbstractBusinessTemplate) applicationContext.getBean(acctRequest.getBusinesspartid());
        abstractBusinessTemplate.execute(acctRequest);

        return null;
    }
}
