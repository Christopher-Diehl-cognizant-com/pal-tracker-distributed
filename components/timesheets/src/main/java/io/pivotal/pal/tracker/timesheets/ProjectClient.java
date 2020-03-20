package io.pivotal.pal.tracker.timesheets;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestOperations;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author 780449
 */
public class ProjectClient{

	private final Logger logger = LoggerFactory.getLogger(getClass());
	private final Map<Long, ProjectInfo> projectsCache = new ConcurrentHashMap<>();
	private final RestOperations restOperations;
	private final String endpoint;

	/**
	 *
	 * @param restOperations
	 * @param registrationServerEndpoint
	 */
	public ProjectClient(RestOperations restOperations, String registrationServerEndpoint){
		this.restOperations = restOperations;
		this.endpoint = registrationServerEndpoint;
	}

	/**
	 *
	 * @param projectId
	 * @return
	 */
	@CircuitBreaker(name = "project", fallbackMethod = "getProjectFromCache")
	public ProjectInfo getProject(long projectId){
		ProjectInfo project = restOperations.getForObject(endpoint + "/projects/" + projectId, ProjectInfo.class);

		projectsCache.put(projectId, project);

		return project;
	}

	/**
	 *
	 * @param projectId
	 * @param cause
	 * @return
	 */
	public ProjectInfo getProjectFromCache(long projectId, Throwable cause){
		logger.info("Getting project with id {} from cache", projectId);
		return projectsCache.get(projectId);
	}
}
