package org.test.openfeign.artifact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.test.openfeign.artifact.service.ArtifactService;

@RestController
public class ArtifactController
{

    public static final String ARTIFACT_ALL = "/artifact/all";
    public static final String IS_VERSION_ALLOWED = "/isVersionAllowed";

    @Autowired
    private ArtifactService artifactService;

    @GetMapping(value = IS_VERSION_ALLOWED + "/{artifact}:{version}")
    public ResponseEntity<Boolean> isVersionAllowed(@PathVariable(value = "artifact") String artifact,
                    @PathVariable(value = "version") String version)
    {
        return ResponseEntity.ok(artifactService.isTestPlanAllowed(version, artifact));
    }
}
