package com.example.newpro.utils;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.actuate.info.GitInfoContributor;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private final String gitBranch;
    private final String gitCommit;

    public MyCommandLineRunner(
            @Value("${git.branch}") String gitBranch,
            @Value("${git.commit.id}") String gitCommit
    ) {
        this.gitBranch = gitBranch;
        this.gitCommit = gitCommit;
    }

    @Override
    public void run(String... args) throws Exception {
        String filePath = "src/main/webapp/WEB-INF/web.xml";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("<web-app>\n");
            writer.write("  <display-name>"+"Branch: "+gitBranch+ ", Commit Id: "+gitCommit+"</display-name>\n");
            writer.write("</web-app>\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

