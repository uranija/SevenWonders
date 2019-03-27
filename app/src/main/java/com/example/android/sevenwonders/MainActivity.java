package com.example.android.sevenwonders;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    *This method is used to check the answers, show the correct ones and display a toast message with the score.
     */
    public void submit(View view) {
        //Checks whether the correct radio button is clicked in Question 1
        RadioButton radioButtonOne = (RadioButton) findViewById(R.id.giza_pyramid_radio_button);
        boolean checkedOne = radioButtonOne.isChecked();
        if (checkedOne)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonOne.setTextColor(Color.parseColor("GREEN"));

        //Checks whether the correct radio button is clicked in Question 2
        RadioButton radioButtonTwo = (RadioButton) findViewById(R.id.taj_mahal_radio_button);
        boolean checkedTwo = radioButtonTwo.isChecked();
        if (checkedTwo)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonTwo.setTextColor(Color.parseColor("GREEN"));

        //Checks that the entered answer in question 3 is correct
        EditText historianName = (EditText) findViewById(R.id.historian);
        if (historianName.getText().toString().equals(getString(R.string.herodotus))) {
            score += 1;
            //Changes the color of the answer to green if correct
            historianName.setTextColor(Color.parseColor("GREEN"));
        } else {
            //Displays the correct answer compared to the incorrect one in red color
            historianName.setText((getString(R.string.herodotus)) + ", not " + historianName.getText());
            historianName.setTextColor(Color.parseColor("RED"));
        }

        //Checks whether the correct checkboxes are checked in Question 4
        CheckBox checkBoxFourEverest = (CheckBox) findViewById(R.id.mount_everest_checkbox);
        CheckBox checkBoxFourCanyon = (CheckBox) findViewById(R.id.grand_canyon_checkbox);
        CheckBox checkBoxFourAurora = (CheckBox) findViewById(R.id.aurora_checkbox);
        CheckBox checkBoxFourPanama = (CheckBox) findViewById(R.id.panama_checkbox);

        if ((checkBoxFourEverest.isChecked() == true) && (checkBoxFourCanyon.isChecked() == true) && (checkBoxFourAurora.isChecked() == true) && (checkBoxFourPanama.isChecked() == false)) {
            score += 1;
        }
        //Changes the color of the text of the correct checkboxes to green
        checkBoxFourAurora.setTextColor(Color.parseColor("GREEN"));
        checkBoxFourCanyon.setTextColor(Color.parseColor("GREEn"));
        checkBoxFourEverest.setTextColor(Color.parseColor("GREEN"));
        checkBoxFourPanama.setTextColor(Color.parseColor("RED"));


        //Checks whether the correct checkboxes are checked in Question 5
        CheckBox checkBoxFiveWall = (CheckBox) findViewById(R.id.wall_checkbox);
        CheckBox checkBoxFivePetra = (CheckBox) findViewById(R.id.petra_checkbox);
        CheckBox checkBoxFiveColosseum = (CheckBox) findViewById(R.id.colosseum_checkbox);
        CheckBox checkBoxFiveCatacombs = (CheckBox) findViewById(R.id.catacombs_checkbox);

        if ((checkBoxFiveWall.isChecked() == true) && (checkBoxFivePetra.isChecked() == true) && (checkBoxFiveColosseum.isChecked() == true) && (checkBoxFiveCatacombs.isChecked() == false)) {
            score += 1;
        }
        //Changes the color of the text of the correct checkboxes to green
        checkBoxFiveWall.setTextColor(Color.parseColor("GREEN"));
        checkBoxFivePetra.setTextColor(Color.parseColor("GREEN"));
        checkBoxFiveColosseum.setTextColor(Color.parseColor("GREEN"));
        checkBoxFiveCatacombs.setTextColor(Color.parseColor("RED"));

        //Checks whether the correct checkboxes are checked in Question 6
        CheckBox checkBoxSixBelt = (CheckBox) findViewById(R.id.belt_checkbox);
        CheckBox checkBoxSixOlympus = (CheckBox) findViewById(R.id.olympus_checkbox);
        CheckBox checkBoxSixRings = (CheckBox) findViewById(R.id.rings_checkbox);
        CheckBox checkBoxSixPolar = (CheckBox) findViewById(R.id.polar_checkbox);

        if ((checkBoxSixBelt.isChecked() == true) && (checkBoxSixOlympus.isChecked() == true) && (checkBoxSixRings.isChecked() == true) && (checkBoxSixPolar.isChecked() == false)) {
            score += 1;
        }

        //Changes the color of the text of the correct checkboxes to green
        checkBoxSixBelt.setTextColor(Color.parseColor("GREEN"));
        checkBoxSixRings.setTextColor(Color.parseColor("GREEN"));
        checkBoxSixOlympus.setTextColor(Color.parseColor("GREEN"));
        checkBoxSixPolar.setTextColor(Color.parseColor("RED"));

        //Checks that the entered answer in question 7 is correct
        EditText anotherName = (EditText) findViewById(R.id.another_name);
        if (anotherName.getText().toString().equals(getString(R.string.rose_city))) {
            score += 1;
            //Changes the color of the answer to green if correct
            anotherName.setTextColor(Color.parseColor("GREEN"));
        } else {
            //Displays the correct answer compared to the incorrect one in red color
            anotherName.setText((getString(R.string.rose_city)) + ", not " + anotherName.getText());
            anotherName.setTextColor(Color.parseColor("RED"));
        }

        //Checks whether the correct radio button is clicked in Question 8
        RadioButton radioButtonEight = (RadioButton) findViewById(R.id.km22_radio_button);
        boolean checkedEight = radioButtonEight.isChecked();
        if (checkedEight)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonEight.setTextColor(Color.parseColor("GREEN"));

        //Checks whether the correct radio button is clicked in Question 9
        RadioButton radioButtonNine = (RadioButton) findViewById(R.id.bc2560_radio_button);
        boolean checkedNine = radioButtonNine.isChecked();
        if (checkedNine)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonNine.setTextColor(Color.parseColor("GREEN"));

        //Checks Whether the correct radio button is clicked in Question 10
        RadioButton radioButtonTen = (RadioButton) findViewById(R.id.no_radio_button);
        boolean checkedTen = radioButtonTen.isChecked();
        if (checkedTen)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonTen.setTextColor(Color.parseColor("GREEN"));

        //Prevents the Submit method from being pressed more than once
        Button myButton = (Button) findViewById(R.id.submit_button);
        myButton.setClickable(false);

        //Displays toast message with the score
        Toast.makeText(this, getString(R.string.score_is) + " " + score + " " + getString(R.string.from_10), Toast.LENGTH_LONG).show();
    }
}