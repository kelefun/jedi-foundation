package com.jedijava.common.annotation;

import java.lang.annotation.*;

/**
 * 异常解析时,决定返回json格式的结果信息
 * @author liukaiyang 2017年12月16日
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE })
public @interface ResponseJson {
	
}
