package com.demo10;

import com.demo10.autoinject.AutoInject;
import org.springframework.stereotype.Component;

/**
 * @author Yuan
 * @description BeanA
 * @date 2022/9/6
 */
@Component
public class BeanA {

	@AutoInject(required = false)
	private BeanB beanB;


	@AutoInject(required = false)
	public void test(BeanB beanB1, BeanB beanB2) {
		System.out.println("beanB: "+beanB);
		System.out.println("beanB1: "+beanB1);
		System.out.println("beanB2: "+beanB2);
	}
}
