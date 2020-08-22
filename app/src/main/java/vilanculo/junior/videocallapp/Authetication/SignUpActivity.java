package vilanculo.junior.videocallapp.Authetication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import vilanculo.junior.videocallapp.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        findViewById(R.id.textSignIn).setOnClickListener(view -> onBackPressed());
        findViewById(R.id.imageBack).setOnClickListener(view -> onBackPressed());
    }
}