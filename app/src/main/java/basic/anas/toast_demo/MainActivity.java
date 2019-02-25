package basic.anas.toast_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void buclick(View view) {

        EditText editext3 =(EditText)findViewById(R.id.editText3);
        Toast.makeText(MainActivity.this,"hi there " +editext3.getText().toString(),Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
