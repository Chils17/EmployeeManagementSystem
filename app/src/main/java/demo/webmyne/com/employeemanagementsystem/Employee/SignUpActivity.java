package demo.webmyne.com.employeemanagementsystem.Employee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import demo.webmyne.com.employeemanagementsystem.R;

public class SignUpActivity extends AppCompatActivity {

    private Button btnSignUp;
    private TextView link_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSignUp=(Button)findViewById(R.id.btnSignup);
        link_login=(TextView)findViewById(R.id.link_login);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, EmployeeDrawerActivity.class);
                startActivity(intent);
                finish();
            }
        });

        link_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
