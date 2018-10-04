package es.esy.thesnakegame.formula1quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {
        String message = null;
        ArrayList incorrectAnswers = new ArrayList();
        int correctAnswers = 0;

        if (Question1()) {
            correctAnswers++;
        } else {
            incorrectAnswers.add("Question 1");
        }

        if (Question2()) {
            correctAnswers++;
        } else {
            incorrectAnswers.add("Question 2");
        }

        if (Question3()) {
            correctAnswers++;
        } else {
            incorrectAnswers.add("Question 3");
        }

        if (Question4()) {
            correctAnswers++;
        } else {
            incorrectAnswers.add("Question 4");
        }

        if (Question5()) {
            correctAnswers++;
        } else {
            incorrectAnswers.add("Question 5");
        }
        if (Question6()) {
            correctAnswers++;
        } else {
            incorrectAnswers.add("Question 6");
        }
        if (Question7()) {
            correctAnswers++;
        } else {
            incorrectAnswers.add("Question 7");
        }
        if (Question8()) {
            correctAnswers++;
        } else {
            incorrectAnswers.add("Question 8");
        }
        if (Question9()) {
            correctAnswers++;
        } else {
            incorrectAnswers.add("Question 9");
        }
        if (Question10()) {
            correctAnswers++;
        } else {
            incorrectAnswers.add("Question 10");
        }

        if (correctAnswers == 0) {
            message = "You are an F1 rookie!!!\nRedo \n";
        } else if (correctAnswers == 1) {
            message = "You got one right!\nRedo \n";
        } else if (correctAnswers == 2) {
            message = "Nice try.\nRedo \n";
        } else if (correctAnswers == 3) {
            message = "Really nice.\nRedo \n";
        } else if (correctAnswers == 4) {
            message = "Great!\nRedo ";
        } else if (correctAnswers == 5) {
            message = "Great!\nRedo ";
        } else if (correctAnswers == 6) {
            message = "60%\nWooow!\nYou got 6 right!!!\n";
        } else if (correctAnswers == 7) {
            message = "70%\nWooow!\nYou got 7 right!!!\n";
        } else if (correctAnswers == 8) {
            message = "80%\nWooow!\nYou got 8 right!!!\n";
        } else if (correctAnswers == 9) {
            message = "90%\nWooow!\nYou got 9 right!!!\n";
        } else if (correctAnswers == 10) {
            message = "100%\nWooow!\nYou got everything right!!!\n";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Object incorrect : incorrectAnswers) {
            stringBuilder.append(incorrect);
            stringBuilder.append("\n");
        }

        Toast.makeText(this, "You have " + correctAnswers + "/10 answers correct.\n" + message + stringBuilder.toString(), Toast.LENGTH_LONG).show();
    }



    // Question 1

    private boolean Question1() {
        RadioGroup ques1 = (RadioGroup) findViewById(R.id.q1);
        if (ques1.getCheckedRadioButtonId() == R.id.a2) {
            return true;
        } else {
            return false;
        }
    }


    // Question2

    private boolean Question2() {
        CheckBox checkBox = (CheckBox) findViewById(R.id.choice3);
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.choice2);

        if (checkBox.isChecked() && checkBox1.isChecked()) {
            return true;
        } else {
            return false;
        }
    }

    // Question 3

    private boolean Question3() {

        EditText editText = (EditText) findViewById(R.id.DRS);

        return editText.getText().toString().equalsIgnoreCase("Drag Reduction System");
    }


    // Question 4

    private boolean Question4() {

        EditText editText = (EditText) findViewById(R.id.title);

        return editText.getText().toString().equalsIgnoreCase("Ferrari");
    }
    // Question 5

    private boolean Question5() {
        RadioGroup ques1 = (RadioGroup) findViewById(R.id.pole);
        if (ques1.getCheckedRadioButtonId() == R.id.pole4) {
            return true;
        } else {
            return false;
        }
    }

    // Question 6

    private boolean Question6() {
        RadioGroup ques1 = (RadioGroup) findViewById(R.id.driver);
        if (ques1.getCheckedRadioButtonId() == R.id.driver2) {
            return true;
        } else {
            return false;
        }
    }

    // Question 7

    private boolean Question7() {
        RadioGroup ques1 = (RadioGroup) findViewById(R.id.young);
        if (ques1.getCheckedRadioButtonId() == R.id.young2) {
            return true;
        } else {
            return false;
        }
    }

    // Question 8


    private boolean Question8() {
        RadioGroup ques1 = (RadioGroup) findViewById(R.id.points);
        if (ques1.getCheckedRadioButtonId() == R.id.points4) {
            return true;
        } else {
            return false;
        }
    }

    // Question 9

    private boolean Question9() {
        RadioGroup ques1 = (RadioGroup) findViewById(R.id.vettel);
        if (ques1.getCheckedRadioButtonId() == R.id.vettel1) {
            return true;
        } else {
            return false;
        }
    }

    // Question 10

    private boolean Question10() {
        RadioGroup ques1 = (RadioGroup) findViewById(R.id.sess);
        if (ques1.getCheckedRadioButtonId() == R.id.sess2) {
            return true;
        } else {
            return false;
        }
    }


    // Reset
    public void reset(View view) {

        RadioGroup radioGroup = findViewById(R.id.q1);
        radioGroup.clearCheck();
        CheckBox checkBox = findViewById(R.id.choice3);
        checkBox.setChecked(false);
        checkBox = findViewById(R.id.choice2);
        checkBox.setChecked(false);
        checkBox = findViewById(R.id.choice4);
        checkBox.setChecked(false);
        checkBox = findViewById(R.id.choice1);
        checkBox.setChecked(false);
        EditText editText = findViewById(R.id.DRS);
        editText.setText("");
        RadioGroup radioGroup2 = findViewById(R.id.pole);
        radioGroup2.clearCheck();
        EditText editText2 = findViewById(R.id.title);
        editText2.setText("");
        RadioGroup radioGroup3 = findViewById(R.id.driver);
        radioGroup3.clearCheck();
        RadioGroup radioGroup4 = findViewById(R.id.points);
        radioGroup4.clearCheck();
        RadioGroup radioGroup5 = findViewById(R.id.vettel);
        radioGroup5.clearCheck();
        RadioGroup radioGroup6 = findViewById(R.id.young);
        radioGroup6.clearCheck();
        RadioGroup radioGroup7 = findViewById(R.id.sess);
        radioGroup7.clearCheck();

    }
}
