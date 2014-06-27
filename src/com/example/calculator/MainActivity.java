/* 
Author: Björn Kristensson Alfsson
Version: 1.2
Date: 2014-06-27 
Description: Simple android calculator. Built for learning purposes. Need a lot of work to make smaller methods.
Just finished a basic addition calculator for now. Going to change around to add minus, multiplication and dividing later.
*/

package com.example.calculator;

import android.widget.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.*;

public class MainActivity extends Activity implements View.OnClickListener {
	
	private Button button0;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private Button plus;
	private Button minus;
	private Button divider;
	private Button multiplication;
	private Button dot;
	private Button equals;
	private Button clear;
	private TextView result;
	private TextView firstNumber;
	private TextView secondNumber;
	private TextView thirdNumber;
	private int number1 = 0;
	private int number2 = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button0 = (Button) findViewById(R.id.button0);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);
		plus = (Button) findViewById(R.id.plus);
		minus = (Button) findViewById(R.id.minus);
		divider = (Button) findViewById(R.id.divider);
		multiplication = (Button) findViewById(R.id.multiplication);
		dot = (Button) findViewById(R.id.dot);
		equals = (Button) findViewById(R.id.equals);
		clear = (Button) findViewById(R.id.clear);
		result = (TextView) findViewById(R.id.textView1);
		firstNumber = (TextView) findViewById(R.id.number1);
		secondNumber = (TextView) findViewById(R.id.number2);
		thirdNumber = (TextView) findViewById(R.id.number3);
		
		button0.setOnClickListener(this);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		button5.setOnClickListener(this);
		button6.setOnClickListener(this);
		button7.setOnClickListener(this);
		button8.setOnClickListener(this);
		button9.setOnClickListener(this);
		plus.setOnClickListener(this);
		minus.setOnClickListener(this);
		multiplication.setOnClickListener(this);
		divider.setOnClickListener(this);
		dot.setOnClickListener(this);
		equals.setOnClickListener(this);
		clear.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		
		String number = result.getText().toString();
		int calculatedResult;
		
		switch (v.getId()) {
		case R.id.button1:
			number += "1";
			result.setText(number);
		break;
		case R.id.button2:
			number += "2";
			result.setText(number);
		break;
		case R.id.button3:
			number += "3";
			result.setText(number);
		break;
		case R.id.button4:
			number += "4";
			result.setText(number);
		break;
		case R.id.button5:
			number += "5";
			result.setText(number);
		break;
		case R.id.button6:
			number += "6";
			result.setText(number);
		break;
		case R.id.button7:
			number += "7";
			result.setText(number);
		break;
		case R.id.button8:
			number += "8";
			result.setText(number);
		break;
		case R.id.button9:
			number += "9";
			result.setText(number);
		break;
		case R.id.button0:
			number += "0";
			result.setText(number);
		break;
		
		case R.id.plus:
				number1 = Integer.parseInt(number);
			number = "";
			result.setText(number);
		break;
		
		case R.id.minus:
		break;
		
		case R.id.divider:
		break;
		
		case R.id.multiplication:
		break;
		
		case R.id.equals:
			number2 = Integer.parseInt(number);
			calculatedResult = number1 + number2;
			//Keep until all mathemathic algorithms is solved.
			firstNumber.setText(Integer.toString(number1));
			secondNumber.setText(Integer.toString(number2));
			thirdNumber.setText(Integer.toString(calculatedResult));
			//Delete until here when finished
			result.setText(Integer.toString(calculatedResult));
		break;
		
		case R.id.clear:
			number = "";
			result.setText(number);
		break;
		}
	}
}