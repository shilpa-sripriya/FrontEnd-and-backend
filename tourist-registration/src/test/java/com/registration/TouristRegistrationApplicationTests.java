package com.registration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.registration.controller.TouristController;
import com.registration.entity.Tourist;
import com.registration.repository.TouristRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
class TouristRegistrationApplicationTests {

	@MockBean
	private TouristRepository trepo; 
	@Autowired
	private TouristController tc;
	
	//@Test
	//void contextLoads() {
	//}
	@Test
	public void getTouristsTest() {
		when(trepo.findAllByOrderByNameDesc()).thenReturn(Stream.of(new Tourist(3,"Zaheer","male",12,"Sweden",22)
				,new Tourist(4, "SriVatsa","male",12,"Sweden",22)).collect(Collectors.toList()));
		int k=tc.getAllTourists().size();
		assertEquals(2,k);
	}
	
	@Test
	public void registerTouristTest() {
		Tourist t1=new Tourist(3,"Zaheer","male",12,"Sweden",22);
		boolean res=tc.registerTourist(t1);
		assertTrue(res);
	}

}
