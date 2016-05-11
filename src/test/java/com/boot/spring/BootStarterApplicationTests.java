package com.boot.spring;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.boot.spring.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
// Enable JMX so we can test the MBeans (you can't do this in a properties file)
@TestPropertySource(properties = { "spring.jmx.enabled:true",
		"spring.datasource.jmx-enabled:true" })
@ActiveProfiles("scratch")
@SpringApplicationConfiguration(BootStarterApplication.class)
//@ContextConfiguration(locations = { "/spring/applicationContext-memcached.xml" })  
// Separate profile for web tests to avoid clashing databases
public class BootStarterApplicationTests {

	@Autowired
	private WebApplicationContext context;

	private MockMvc mvc;
	
	@Autowired
	private UserService userService;

	@Before
	public void setUp() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	@Test
	public void testHome() throws Exception {

//		this.mvc.perform(get("/")).andExpect(status().isOk())
//				.andExpect(content().string("Bath"));
	}

	@Test
	public void testJmx() throws Exception {
//		assertThat(ManagementFactory.getPlatformMBeanServer()
//				.queryMBeans(new ObjectName("jpa.sample:type=ConnectionPool,*"), null))
//						.hasSize(1);
	}

}