package com.singly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EmployeeLinkedList {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Nodes create() throws Exception {

		Nodes first = new Nodes();

		System.out.print("Enter employee id : ");
		int eid = Integer.parseInt(br.readLine());

		System.out.print("Enter employee name : ");
		String name = br.readLine();

		System.out.print("Enter employee salary : ");
		float sal = Float.parseFloat(br.readLine());

		Employee e = new Employee();
		e.setEmpid(eid);
		e.setEname(name);
		e.setSalary(sal);
		first.setE1(e);
		first.setNext(null);

		return first;

	}

	public void display(Nodes first) {
		if (first == null) {
			System.out.println("Linked List is empty.");
			return;
		}

		Nodes temp;
		for (temp = first; temp != null; temp = temp.getNext()) {
			Employee e = temp.getE1();
	        System.out.print("[ID: " + e.getEmpid() + ", Name: " + e.getEname() + ", Salary: " + e.getSalary() + "]");
	        if(temp!=null) {
				System.out.print(" => ");
			}
		}
	}

	public Nodes addAtPosition(Nodes first) throws Exception {
		
		Nodes temp = new Nodes();
		
		System.out.print("Enter employee id : ");
		int eid = Integer.parseInt(br.readLine());

		System.out.print("Enter employee name : ");
		String name = br.readLine();

		System.out.print("Enter employee salary : ");
		float sal = Float.parseFloat(br.readLine());

		Employee e = new Employee();
		e.setEmpid(eid);
		e.setEname(name);
		e.setSalary(sal);
		
		temp.setE1(e);
		temp.setNext(null);
	
		// Case 1: Insert at the first position
		if(first==null || eid<first.getE1().getEmpid()) {
			temp.setNext(first);
			return temp; //new node become head
		}
		
		Nodes start=first;
		while(start.getNext() != null && start.getNext().getE1().getEmpid() < eid) {
			start=start.getNext();
		}
		
		
		//Insert node at the desired position
		temp.setNext(start.getNext());
		start.setNext(temp);
		
		return first;
		
	}

}
