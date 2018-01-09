package miracleit.com.homeworkmiracle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnTranstale;
    private Button btnGoToList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTranstale = findViewById(R.id.btn_translate);
        btnGoToList = findViewById(R.id.btn_random_list);
    }

    public void startTranslate(View view) {
        Intent intent = new Intent(getApplicationContext(), Translater.class);
        startActivity(intent);
    }

    public void startList(View view) {
        Intent intent = new Intent(getApplicationContext(), RandomList.class);
        startActivity(intent);
    }
}
