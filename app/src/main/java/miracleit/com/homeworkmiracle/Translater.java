package miracleit.com.homeworkmiracle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Translater extends AppCompatActivity {

    private Button btnTranstalte;
    private EditText txtTranslate;
    private Button btnBack;
    private boolean enUk = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translater);

        btnTranstalte = findViewById(R.id.btn_en_uk);
        txtTranslate = findViewById(R.id.txt_en_uk);
        btnBack = findViewById(R.id.btn_back);

    }

    public void translateEnUk(View view) {
        if (enUk) {
            txtTranslate.getText().clear();
            txtTranslate.setText(R.string.developer_uk);
            btnTranstalte.setText(R.string.uk_en);
            enUk = false;
        } else {
            txtTranslate.getText().clear();
            txtTranslate.setText(R.string.developer);
            btnTranstalte.setText(R.string.en_uk);
            enUk = true;
        }
    }

    public void backToMain(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
