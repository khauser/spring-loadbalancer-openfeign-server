package org.test.openfeign.artifact.service;

import org.springframework.stereotype.Service;

@Service
public class ArtifactService
{
    public boolean isTestPlanAllowed(String version, String artifact)
    {
        return true;
    }
}
