package demo.webmyne.com.employeemanagementsystem.Employee;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import demo.webmyne.com.employeemanagementsystem.R;

public class UpdateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
       // toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        toolbar.setTitle("Update Number");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),EmployeeDrawerActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
