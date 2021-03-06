package io.pivotal.pal.tracker.restsupport;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author 780449
 */
@Configuration
public class RestConfig{

	/**
	 *
	 * @return
	 */
//	@Bean
//	@LoadBalanced
//	public RestOperations restOperations(){
//		return new RestTemplate();
//	}

	/**
	 *
	 * @return
	 */
	@Bean
	public ObjectMapper objectMapper(){
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return mapper;
	}
}
