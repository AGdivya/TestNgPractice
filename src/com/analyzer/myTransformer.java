package com.analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

// this class is used to run multiple test cases for  multiple times to reduce number  of failure test cases
public class myTransformer implements IAnnotationTransformer
{
 public void transform(ITestAnnotation annotation , Class testclass , Constructor testConstructor , Method testMethod)
 {
	 annotation.setRetryAnalyzer(RetryAnalyzer.class);
 }
}
