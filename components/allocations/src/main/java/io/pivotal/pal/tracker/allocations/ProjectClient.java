package io.pivotal.pal.tracker.allocations;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestOperations;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class ProjectClient {

    private static final Logger logger = LoggerFactory.getLogger(ProjectClient.class);
    private final RestOperations restOperations;
    private final String registrationServerEndpoint;

    private final Map<Long, ProjectInfo> cache = new ConcurrentHashMap<>();
    public ProjectClient(RestOperations restOperations, String registrationServerEndpoint) {
        this.restOperations= restOperations;
        this.registrationServerEndpoint = registrationServerEndpoint;
    }

    @CircuitBreaker(name = "project", fallbackMethod = "getProjectFromCache")
    public ProjectInfo getProject(long projectId) {
        ProjectInfo projectInfo = restOperations.getForObject(registrationServerEndpoint + "/projects/" + projectId, ProjectInfo.class);
        cache.put( projectId, projectInfo );
        return projectInfo;
    }

    public ProjectInfo getProjectFromCache(long projectId, Throwable cause) {
        logger.info("Getting project with id {} from cache because of {}", projectId, cause);
        return cache.get(projectId);
    }
}
