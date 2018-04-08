package com.jedijava.common.test;

import com.jedijava.common.model.ResultModel;
import com.jedijava.common.result.DefaultResultCode;
import org.junit.Test;

/**
 * @author liukaiyang
 * @date 2018/4/8 15:49
 */
public class BeanTest {
    @Test
    public void testResultModel(){
        ResultModel result=ResultModel.error(DefaultResultCode.REQUEST_ERROR_NOT_FIND);
        System.out.println(result);
    }
}
