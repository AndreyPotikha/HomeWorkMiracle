package miracleit.com.homeworkmiracle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Password extends AppCompatActivity {

    private Button btnPass;
    private EditText txtPass;
    private TextView txtWrongPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        btnPass = findViewById(R.id.btn_check_pass);
        txtPass = findViewById(R.id.txt_pass);
        txtWrongPass = findViewById(R.id.txt_wrong_pass);

    }

    public void enterPass(View view) {
        if (checkPass(txtPass.getText().toString())) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        } else {
            txtPass.getText().clear();
            txtPass.setHint(R.string.Wrong);
        }
    }

    private boolean checkPass(String pass) {
        List<String> listPass = new ArrayList<>();
        listPass.add("111111");
        listPass.add("qwerty");
        for (String elem : listPass) {
            if (pass.equals(elem)) {
                return true;
            }
        }
        return false;
    }
}
