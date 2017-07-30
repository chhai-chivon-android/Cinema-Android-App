package com.wordpress.chhaichivon.cinema_android_app.activities;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.wordpress.chhaichivon.cinema_android_app.R;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class LoginActivity extends AppCompatActivity  {


	private static final String TAC  = "Login Activity";
	private static final int REQUEST_SIGNUP = 0;

	@InjectView(R.id.input_email) EditText etEmail;
	@InjectView(R.id.input_password) EditText etPassword;
	@InjectView(R.id.btn_login) Button btnlogin;
	@InjectView(R.id.link_signup) TextView tvSignUp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		getSupportActionBar().setCustomView(R.layout.activity_login);

/*
		btnlogin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				doLogin();
			}
		});
		tvSignUp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

			}
		});*/
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(requestCode == REQUEST_SIGNUP){
			if(requestCode == RESULT_OK){
				/**
				 * TODO implement successful signup logic
				 */
				this.finish();
			}
		}
	}

	@Override
	public void onBackPressed() {
		/**
		 * disable when going back
		 */
		moveTaskToBack(true);
	}

	private void doLogin() {
		Log.d(TAC,"Login");
		if(!validate()){
			onLoginSuccess();
			return;
		}
		btnlogin.setEnabled(false);

		final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this, R.style.AppTheme_Dark_Dialog);
		progressDialog.setIndeterminate(true);
		progressDialog.setMessage("Authenticating...");
		progressDialog.show();

		String email = etEmail.getText().toString();
		String password = etPassword.getText().toString();

		new android.os.Handler().postDelayed(
				new Runnable() {
					public void run() {
						// On complete call either onLoginSuccess or onLoginFailed
						onLoginSuccess();
						// onLoginFailed();
						progressDialog.dismiss();
					}
				}, 3000);
	}

	public void onLoginSuccess(){
		btnlogin.setEnabled(true);
		finish();
	}

	public void onLoginFailed(){
		Toast.makeText(getBaseContext(),"Login Fail",Toast.LENGTH_LONG);
		btnlogin.setEnabled(true);
	}

	private boolean isEmailValid(String email) {
		//TODO: Replace this with your own logic
		return email.contains("@");
	}

	private boolean isPasswordValid(String password) {
		//TODO: Replace this with your own logic
		return password.length() > 4;
	}

	public boolean validate() {
		boolean valid = true;

		String email = etEmail.getText().toString();
		String password = etPassword.getText().toString();

		if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
			etEmail.setError("enter a valid email address");
			valid = false;
		} else {
			etEmail.setError(null);
		}

		if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
			etPassword.setError("between 4 and 10 alphanumeric characters");
			valid = false;
		} else {
			etPassword.setError(null);
		}

		return valid;
	}

}

