package my.edu.taruc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {
    //Global or module level variable
    private EditText editTextName, editTextAge;
    private TextView textViewMessage;

    //onCreate = main() function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView method display the UI
        //R = resourse class
        setContentView(R.layout.activity_main);

        //Linking program with UI
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }
    //A method to handle View click event
    public void displayMessage(View view){
        String name;
        int age;

        name = editTextName.getText().toString();
        age = Integer.parseInt(editTextAge.getText().toString());
        textViewMessage.setText("Hi, "+name+" you will be "+age+" years old in 2018!!!");

    }

    public void resetinput(View view){
        editTextName.setText("");
        editTextAge.setText("");
        textViewMessage.setText("Hello world");
    }
}
