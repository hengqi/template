package com.chenhl.template.template;

import com.chenhl.template.domain.AcctRequest;
import com.chenhl.template.mapper.AcctRequestMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractBusinessTemplate {

    @Autowired
    AcctRequestMapper acctRequestMapper;


    public final void execute(AcctRequest acctRequest){
        process();
        save(acctRequest);
    }

    protected abstract void process();


    public void save(AcctRequest acctRequest){
        acctRequestMapper.insert(acctRequest);
        System.out.println("save");
    }


}
