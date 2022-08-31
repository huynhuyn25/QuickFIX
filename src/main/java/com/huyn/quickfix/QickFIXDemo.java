package com.huyn.quickfix;

import org.apache.maven.plugin.MojoExecutionException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QickFIXDemo {
    public static void main(String[] args) throws MojoExecutionException {
        GenerateMojo generateMojo = new GenerateMojo();
        generateMojo.execute();


    }
}
