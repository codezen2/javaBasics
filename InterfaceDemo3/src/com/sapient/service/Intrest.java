package com.sapient.service;

public interface Intrest extends Basic{
	
	double calcSimple(double amt,int years,float rate);
	double calcComp(double amt,int years,float rate);
	
}
