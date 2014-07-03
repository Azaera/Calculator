/* 
Author: Björn Kristensson Alfsson
Version: 1.2
Date: 2014-06-28 
Last updated: 2014-06-30
Description: Simple android calculator. Built for learning purposes. Need a lot of work to make smaller methods.
Finished the simple calculations. not possible to use more then one operator.

Thought to add:
Textview for current evaluation is added.
Going to add more functions, like parenthesis
*/

package com.example.calculator;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.view.View.OnClickListener;

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
	private Button about;
	private Button btnClosePopup;
	private TextView result;
	private TextView currentAlgorithm;
	private float number1 = 0;
	private float number2 = 0;
	private int mathematicOperator = 0;
	private PopupWindow popup;
	
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
		currentAlgorithm = (TextView) findViewById(R.id.currentAlgorithm);
		about = (Button) findViewById(R.id.about);
		
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
		about.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		
		/*
		 * String number is for the calculation to take place
		 * String current is for the entire algorithm pressed in. 
		 * Ideas: Removing number and using current for inputting algorithm, and then calculate when equals is pressed. 
		 */
		
		String number = result.getText().toString();
		String current = currentAlgorithm.getText().toString();
		float calculatedResult = 0;
		
		switch (v.getId()) {
		
		case R.id.button1:
			number += "1";
			current += "1";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		
		case R.id.button2:
			number += "2";
			current += "2";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		
		case R.id.button3:
			number += "3";
			current += "3";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		
		case R.id.button4:
			number += "4";
			current += "4";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		
		case R.id.button5:
			number += "5";
			current += "5";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		
		case R.id.button6:
			number += "6";
			current += "6";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		
		case R.id.button7:
			number += "7";
			current += "7";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		
		case R.id.button8:
			number += "8";
			current += "8";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		
		case R.id.button9:
			number += "9";
			current += "9";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		
		case R.id.button0:
			number += "0";
			current += "0";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		
		case R.id.about:
			aboutThisApplication();
		break;
		
		case R.id.plus:
			number1 = Float.parseFloat(number);
			mathematicOperator = 1;
			number = "";
			current += " + ";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		
		case R.id.minus:
			number1 = Float.parseFloat(number);
			mathematicOperator = 2;
			number = "";
			current += " - ";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		
		case R.id.divider:
			number1 = Float.parseFloat(number);
			mathematicOperator = 4;
			number = "";
			current += " / ";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		
		case R.id.multiplication:
			number1 = Float.parseFloat(number);
			mathematicOperator = 3;
			number = "";
			current += " * ";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		
		case R.id.equals:
			number2 = Float.parseFloat(number);
			if ( mathematicOperator == 1)
			{
				calculatedResult = number1 + number2;
			}
			else if (mathematicOperator == 2 )
			{
				calculatedResult = number1 - number2;
			}
			
			else if (mathematicOperator == 3 )
			{
				calculatedResult = number1 * number2;
			}	
			else
			{
				calculatedResult = number1 / number2;
			}
			
			result.setText(Float.toString(calculatedResult));
		break;
		
		case R.id.clear:
			number = "";
			result.setText(number);
			currentAlgorithm.setText(number);
		break;
		
		case R.id.dot:
			number += ".";
			current += ".";
			result.setText(number);
			currentAlgorithm.setText(current);
		break;
		}
	}

	//popup window. Maybe will be in it's own class file for future updates
	private void aboutThisApplication() {
		Resources res= getResources();
		int color = res.getColor(R.color.red);
		
		try 
		{
			LayoutInflater inflater = ( LayoutInflater ) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View layout = inflater.inflate(R.layout.about_this_application, (ViewGroup) findViewById(R.id.popup_element));
			popup = new PopupWindow(layout, 300,300, true);
			popup.showAtLocation(layout, Gravity.CENTER, 0, 0);
			
			btnClosePopup = (Button)layout.findViewById(R.id.back);
			btnClosePopup.setOnClickListener(cancel_button_click_listener);	
		} 
		
		catch ( Exception e )
		
		{
			e.printStackTrace();
		}
	}
	
	private OnClickListener cancel_button_click_listener = new OnClickListener() {
		
		public void onClick(View y) 
		{
			popup.dismiss();
		}
	};
}