package com.encore.service;

import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeService {
	int midx = 0, tempMidx = 0;
	int egidx = 0, tempEgidx = 0;
	int numberOfEmployees;

	public EmployeeService(int n) {
		this.numberOfEmployees = n;
	}

	Engineer[] egs = new Engineer[numberOfEmployees];
	Manager[] ms = new Manager[numberOfEmployees];

	public void addManager(Manager manager) {
		if (midx == tempMidx) {
			ms[midx++] = manager;
		} else {
			ms[midx] = manager;
			midx = tempMidx;
		}

	}

	public void addEngineer(Engineer engineer) {
		if (egidx == tempEgidx) {
			egs[egidx++] = engineer;
		} else {
			egs[egidx] = engineer;
			egidx = tempEgidx;
		}
	}

	public void deleteManager(String manager) {
		
	}

	public void deleteEngineer(String engineer) {

	}

	public void updateManager(double salary, String name, int deptno, String dept) {

	}

	public void updateEngineer(Manager manager) {

	}

//	public Manager findManager(String dept) {
//		return;
//	}

//	public Manager[] findManager(int deptno) {
//		return;
//	}
//
//	public Engineer findEngineer(String tech) {
//		return;
//	}

	public void printManagers() {

	}

	public void printEngineers() {

	}

}
