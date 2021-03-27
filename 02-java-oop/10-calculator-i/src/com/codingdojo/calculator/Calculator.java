package com.codingdojo.calculator;

public class Calculator implements java.io.Serializable {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;
	
	public Calculator() {
		
	}
	public Calculator(double operandOne, double operandTwo, String operation) {
		setOperandOne(operandOne);
		setOperandTwo(operandTwo);
		setOperation(operation);
	}
	
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operand){
		this.operandOne = operand;
	}
	
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operand) {
		this.operandTwo = operand;
	}
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void performOperation() {
		if (this.operation == "+") {
			this.result = this.operandOne + this.operandTwo;
			System.out.println("operation + performed");
		} else if (this.operation == "-") {
			this.result = this.operandOne - this.operandTwo;
			System.out.println("operation - performed");
		} else {
			System.out.println("Please enter a valid operation type (+ or -)");
		}
	}
	
	public double getResults() {
		return this.result;
	}
}
