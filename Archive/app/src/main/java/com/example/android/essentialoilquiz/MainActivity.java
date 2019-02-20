package com.example.android.essentialoilquiz;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * This app displays quiz questions and final grade in a toast message.
 */
public class MainActivity extends AppCompatActivity {

    private int grade;

    private EditText questionOneEditText;

    private CheckBox egypt_checkbox, israel_checkbox, china_checkbox, greece_checkbox, rome_checkbox, lavender_checkbox, lemon_checkbox, rosemary_checkbox, myrrh_checkbox, bergamot_checkbox, lime_checkbox, orange_checkbox, grapefruit_checkbox;

    private RadioButton radio_ginger, radio_lavender_frankincense;

    private Button submitQuizButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void onButtonClickSubmit(View view) {
        //Check for correct answer in question one text field
        EditText questionOneEditText = (EditText) findViewById(R.id.answer_question_one);
        questionOneEditText.setHint("Enter Your Answer Here");

        if (questionOneEditText.getText().toString().isEmpty())  {
            return;

        } else if (questionOneEditText.getText().toString().equals("bergamot")) {
            grade += 6;
        }

        if (questionOneEditText.getText().toString().equals("bergamot")) {
            Toast toast = Toast.makeText(this, "Your grade is " + grade + " out of 30 points." + "Thank you for playing!", Toast.LENGTH_SHORT);
            toast.show();

        } else if (questionOneEditText.getText().toString().isEmpty()) {
            Toast toast = Toast.makeText(this, "Your grade is " + grade + " out of 30 points." + "Thank you for playing!", Toast.LENGTH_SHORT);
            toast.show();
        }

        // Text field where user can enter their name.
        EditText nameEditText = (EditText) findViewById(R.id.name_edit_text);
        String name = nameEditText.getText().toString();
        nameEditText.setHint("Enter Your Name Here");

        if (nameEditText.getText().toString().equals("")) {
            Toast toast = Toast.makeText(this, "Your grade is " + grade + " out of 30 points." + "Thank you for playing!", Toast.LENGTH_SHORT);
            toast.show();

        } else if (nameEditText.getText().toString().equals(name)) {
            Toast toast = Toast.makeText(this, "Your grade is " + grade + " out of 30 points." + "Thank you for playing, " + name + "!", Toast.LENGTH_SHORT);
            toast.show();
        }

        //disable submit button to prevent resubmissions
        Button submitButton = (Button) findViewById(R.id.submit_quiz_button);
        submitButton.setEnabled(false);
    }

    /**
     * For question two, check for correct answers
     */
    public void checkQuestionTwo() {
        CheckBox egypt = (CheckBox) findViewById(R.id.egypt_checkbox);
        CheckBox israel = (CheckBox) findViewById(R.id.israel_checkbox);
        CheckBox china = (CheckBox) findViewById(R.id.china_checkbox);
        CheckBox greece = (CheckBox) findViewById(R.id.greece_checkbox);
        CheckBox ireland = (CheckBox) findViewById(R.id.ireland_checkbox);

        if (ireland.isChecked()) {
            return;
        } else if (egypt.isChecked() && israel.isChecked() && china.isChecked() && greece.isChecked()) {
            grade += 4;
            return;
        } else if (egypt.isChecked() || israel.isChecked() || china.isChecked() || greece.isChecked()) {
            grade += 1;
        }

    }

    /**
     * For question three, check for correct answers
     */
    public void checkQuestionThree() {
        CheckBox lavender = (CheckBox) findViewById(R.id.lavender_checkbox);
        CheckBox lemon = (CheckBox) findViewById(R.id.lemon_checkbox);
        CheckBox rosemary = (CheckBox) findViewById(R.id.rosemary_checkbox);
        CheckBox lemongrass = (CheckBox) findViewById(R.id.lemongrass_checkbox);
        CheckBox myrrh = (CheckBox) findViewById(R.id.myrrh_checkbox);

        if (lemongrass.isChecked()) {
            return;
        } else if (lavender.isChecked() && lemon.isChecked() && rosemary.isChecked() && myrrh.isChecked()) {
            grade += 4;
            return;
        } else if (lavender.isChecked() || lemon.isChecked() || rosemary.isChecked() || myrrh.isChecked()) {
            grade += 1;
        }

    }

    /**
     * For question four, check for correct answers
     */
    public void checkQuestionFour() {
        CheckBox thyme = (CheckBox) findViewById(R.id.thyme_checkbox);
        CheckBox bergamot = (CheckBox) findViewById(R.id.bergamot_checkbox);
        CheckBox lime = (CheckBox) findViewById(R.id.lime_checkbox);
        CheckBox orange = (CheckBox) findViewById(R.id.orange_checkbox);
        CheckBox grapefruit = (CheckBox) findViewById(R.id.grapefruit_checkbox);

        if (thyme.isChecked()) {
            return;
        } else if (bergamot.isChecked() && lime.isChecked() && orange.isChecked() && grapefruit.isChecked()) {
            grade += 4;
            return;
        } else if (bergamot.isChecked() || lime.isChecked() || orange.isChecked() || grapefruit.isChecked()) {
            grade += 1;
        }

    }

    /**
     * This method is called when a checkbox is clicked.
     */
    public void onCheckboxClicked(View view) {
        // Check which checkbox was clicked in question one
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked on question one
        switch (view.getId()) {
            case R.id.egypt_checkbox:
                if (checked)
                    grade++;
                // Egypt
                break;
            case R.id.israel_checkbox:
                if (checked)
                    grade++;
                // Israel
                break;
            case R.id.china_checkbox:
                if (checked)
                    grade++;
                // China
                break;
            case R.id.greece_checkbox:
                if (checked)
                    grade++;
                // Greece
                break;
            case R.id.ireland_checkbox:
                if (checked)
                    // Ireland
                    break;
        }

        // Check which checkbox was clicked on question two
        switch (view.getId()) {
            case R.id.lavender_checkbox:
                if (checked)
                    grade++;
                // Lavender
                break;
            case R.id.lemon_checkbox:
                if (checked)
                    grade++;
                // Lemon
                break;
            case R.id.rosemary_checkbox:
                if (checked)
                    grade++;
                // Rosemary
                break;
            case R.id.lemongrass_checkbox:
                if (checked)
                    // Lemongrass
                    break;
            case R.id.myrrh_checkbox:
                if (checked)
                    grade++;
                // Myrrh
                break;
        }

        // Check which checkbox was clicked on question three
        switch (view.getId()) {
            case R.id.thyme_checkbox:
                if (checked)
                    // Thyme
                    break;
            case R.id.bergamot_checkbox:
                if (checked)
                    grade++;
                // Bergamot
                break;
            case R.id.lime_checkbox:
                if (checked)
                    grade++;
                // Lime
                break;
            case R.id.orange_checkbox:
                if (checked)
                    grade++;
                // Orange
                break;
            case R.id.grapefruit_checkbox:
                if (checked)
                    grade++;
                // Grapefruit
                break;
        }
    }

    /**
     * This method is called when the radio buttons are clicked.
     */
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked on question five
        switch (view.getId()) {
            case R.id.radio_vetiver:
                if (checked)
                    // Vetiver
                    break;
            case R.id.radio_valerian:
                if (checked)
                    // Valerian
                    break;
            case R.id.radio_ginger:
                if (checked)
                    grade = grade + 6;
                // Ginger
                break;
            case R.id.radio_cedarwood:
                // Cedarwood
                break;
        }

        // Check which radio button was clicked on question six
        switch (view.getId()) {
            case R.id.radio_lavender_frankincense:
                if (checked)
                    grade = grade + 6;
                // Lavender and Frankincense
                break;
            case R.id.radio_patchouli_cinnamonbark:
                if (checked)
                    // Patchouli and Cinnamon Bark
                    break;
            case R.id.radio_ylangylang_juniper:
                if (checked)
                    // Ylang Ylang and Juniper
                    break;
            case R.id.radio_spearmint_cypress:
                // Spearmint and Cypress
                break;
        }
    }
}