package com.chenhl.template.service;

import com.chenhl.template.common.result.ActionResult;
import com.chenhl.template.domain.AcctRequest;


public interface AcctRequstService {


    ActionResult<String> accounting(AcctRequest acctRequest);
}
