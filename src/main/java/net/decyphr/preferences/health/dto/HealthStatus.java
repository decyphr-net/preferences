package net.decyphr.preferences.health.dto;

public class HealthStatus {
    public boolean isHealthy;
    public String message;

    public HealthStatus(boolean isHealthy, String message) {
        this.isHealthy = isHealthy;
        this.message = message;
    }
}
