package com.example.bromance.loginregistersqlite;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_loggedin extends AppCompatActivity {

    private Button Logout;
    private TextView LoggedIn_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loggedin);
        init();
        Intent i = getIntent();
        String Loggeduser=i.getExtras().getString("user");
        LoggedIn_user.setText("Üdvözöllek "+Loggeduser);

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logout = new Intent(Activity_loggedin.this,MainActivity.class);
                startActivity(logout);
                finish();
            }
        });
    }
    public void init(){
        Logout=(Button) findViewById(R.id.Logout);
        LoggedIn_user=(TextView) findViewById(R.id.Logged_user);
    }
}
