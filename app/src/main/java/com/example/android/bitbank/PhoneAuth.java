package com.example.android.bitbank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class PhoneAuth extends AppCompatActivity {


    private AutoCompleteTextView phoneNumber;
    private EditText otp;
    private Button btnSubmit;
    //    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallback;
//    private FirebaseAuth mAuth;
    private String mVerificationId;
    //    private PhoneAuthProvider.ForceResendingToken mResendToken;
    private boolean auto = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_auth);

//        mAuth = FirebaseAuth.getInstance();

        phoneNumber = findViewById(R.id.phoneNumber);
        otp = findViewById(R.id.otp);
        btnSubmit = findViewById(R.id.btnSubmit);
        otp.setVisibility(View.INVISIBLE);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!auto) {

                    String phone = phoneNumber.getText().toString();

//                    PhoneAuthProvider.getInstance().verifyPhoneNumber(
//                            phone,
//                            120,
//                            TimeUnit.SECONDS,
//                            PhoneAuth.this,
//                            mCallback
//                    );
                    auto = true;
                } else {
                    btnSubmit.setEnabled(false);
                    String verificationCode = otp.getText().toString();
//                    PhoneAuthCredential phoneAuthCredential = PhoneAuthProvider.getCredential(mVerificationId,verificationCode);
//                    signInWithPhoneAuthCredential(phoneAuthCredential);
                }

            }
        });

//        mCallback = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
//            @Override
//            public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
//
//                signInWithPhoneAuthCredential(phoneAuthCredential);
//            }

//            @Override
//            public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
//                super.onCodeSent(s, forceResendingToken);
//                Toast.makeText(PhoneAuth.this, "A Code was send", Toast.LENGTH_SHORT).show();
//                phoneNumber.setEnabled(false);
//                otp.setVisibility(View.VISIBLE);
//                btnSubmit.setEnabled(true);
//                mVerificationId = s;
//                mResendToken = forceResendingToken;
//                btnSubmit.setText("Verify Code");
//
//            }
//
//
//            @Override
//            public void onVerificationFailed(FirebaseException e) {
//
//            }
//        };
//
//    }

//    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
//        mAuth.signInWithCredential(credential)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//
//                            startActivity(new Intent(getBaseContext(),MenuActivity.class));
//                            finish();
//
//                        } else {
//                            // Sign in failed, display a message and update the UI
//                            Toast.makeText(getBaseContext(),task.getException().getMessage(),Toast.LENGTH_SHORT).show();
//                            if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {
//                            }
//                        }
//                    }
//                });
//    }


    }
}