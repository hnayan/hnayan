package com.cdn.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listner implements ITestListener{

	public void onTestStart(ITestResult result) {

		System.out.println("New Test Started: " +result.getName());

	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Test Successfully Finished: " +result.getName());
		System.out.println("**************************");
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Test Failed: " +result.getName());
		BaseClass.captureScreenShots();
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("Test Skipped: " +result.getName());
		System.out.println("**************************");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("Test Failed but within success percentage: " +result.getName());

	}

	//TODO
	public void onStart(ITestContext context) {

		//System.out.println("This is onStart method" +context.getOutputDirectory());

	}

	//TODO
	public void onFinish(ITestContext context) {

		//System.out.println("This is onFinish method" +context.getPassedTests());
		//System.out.println("This is onFinish method" +context.getFailedTests());
	}
}
