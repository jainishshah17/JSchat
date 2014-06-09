package com.jainishshah.www;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class JSchatLogin extends Activity{
	
	public static String Pass;
	public static String Login;
	private EditText loginname;
	private EditText Password;
	
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.login);
	        Button Btn1 = (Button) findViewById(R.id.signin);
	        Btn1.setOnClickListener((OnClickListener) this);
	        
	    }
	 public void onClick(View v) {
		 
		 	loginname =(EditText) this.findViewById(R.id.login);
	    	Editable login = loginname.getText();
	    	Login = login.toString();
	    	Password = (EditText) this.findViewById(R.id.pass);
	    	Editable pass = Password.getText();
	    	Pass = pass.toString();
	    	
	        Intent i=new Intent(JSchatLogin.this, JSchatActivity.class);
	        startActivity(i);
	    }
	    
	
}
