package com.lppz.ehr.ws.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.lppz.ehr.bean.Person;
import com.lppz.ehr.ws.PersonService;


/**
 * 类名称：PersonServiceImp.java<br>
 * 类描述：<br>
 * 创建时间：2016年11月11日, 下午2:47:53
 * 
 * @version 1.0 
 * @since JDK版本
 * @author flx 
 */

@WebService(endpointInterface="com.lppz.ehr.ws.PersonService",serviceName="person")
public class PersonServiceImp implements PersonService {
	
	public List<Person> findAll(String name){  
        ArrayList<Person> persons = new ArrayList<Person>();  
        
        Person p1 = new Person();
        p1.setName(name + "3");
        p1.setAge(18);
        
        Person p2 = new Person();
        p2.setName(name + "4");
        p2.setAge(20);
        
        persons.add(p1);
        persons.add(p2);
        
        return persons;  
    }  
}
