package miracleit.com.homeworkmiracle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList extends AppCompatActivity {

    private Button btnNewText;
    private EditText txtNewText;
    private TextView txtShowPhrase;
    private static List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_list);

        btnNewText = findViewById(R.id.btn_random_list);
        txtNewText = findViewById(R.id.txt_new_text);
        txtShowPhrase = findViewById(R.id.txt_show_phrase);
    }

    public void newText(View view) {
        String randomString = saveNewTest();
        System.out.println(randomString);
        txtShowPhrase.setText(randomString);
        txtNewText.getText().clear();
        System.out.println(list);

    }

    private String saveNewTest() {
        list.add(txtNewText.getText().toString());
        int size = list.size();
        int item = new Random().nextInt(size);
        System.out.println(item);
        int i = 0;
        for (String elem : list) {
            if (i == item) {
                return elem;
            }
            i++;
        }
        return null;
    }
}
