package com.RunnerGit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "C:\\Users\\Baskar Balan\\eclipse-workspace-2019-06\\Maven-demo2\\src\\main\\java\\features\\Login.Feature", glue = {
	//	"com.Login" }
//format = { "pretty", "html:tes-output" }
//)

@CucumberOptions(features = "D:\\GIT-Storage\\Baskar\\Project\\src\\main\\java\\features\\Login.Feature", glue = {
"com.Logingit" }
//format = { "pretty", "html:tes-output" }
)

public class TestRunnerGit {

}
