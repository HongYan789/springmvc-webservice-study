package com.lppz.ehr.client;

import com.lppz.ehr.bean.Person;
import com.lppz.ehr.ws.PersonService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.List;

//import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

//import com.lppz.ehr.client.Person;
//import com.lppz.ehr.client.impl.PersonService;


public class WebServiceTest {
	public static void main(String[] args) {  
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(PersonService.class);
		factory.setAddress("http://127.0.0.1:8082/ws/person");
		PersonService service = (PersonService)factory.create();
		List<Person> list = (List<Person>)service.findAll("张");

		for(Person person : list) {
			System.out.println("name=" + person.getName());
			System.out.println("age=" + person.getAge());
			System.out.println("-------------------");
		}
    }  

}
