package com.example.newpro.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git")
public class GitInfoController {

    private final BuildProperties buildProperties;

    @Autowired
    public GitInfoController(BuildProperties buildProperties) {
        this.buildProperties = buildProperties;
    }

    @GetMapping("/commit-id")
    public String getCommitId() {
        return buildProperties.get("git.commit.id");
    }

    @GetMapping("/branch")
    public String getBranch() {
        return buildProperties.get("git.branch");
    }
}
