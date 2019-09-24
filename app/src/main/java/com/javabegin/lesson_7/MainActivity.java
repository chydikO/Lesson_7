package com.javabegin.lesson_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Домашнее задание Lesson 7:
 *
 *     Добавить иконку калькулятора для проекта
 *     Создать интерфейс калькулятора
 *     Реализовать печать цифры при нажатии на кнопку
 */

public class MainActivity extends AppCompatActivity {

    private String inputArea = "";
    @BindView(R.id.textViewResult) TextView textViewResult;
    @BindViews({ R.id.btn_addition, R.id.btn_division, R.id.btn_double_zero,
                R.id.btn_eight, R.id.btn_five, R.id.btn_four, R.id.btn_multiplication, R.id.btn_nine,
                R.id.btn_one, R.id.btn_result, R.id.btn_seven, R.id.btn_six, R.id.btn_subtraction,
                R.id.btn_three, R.id.btn_two, R.id.btn_zero})
    List<Button> buttons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({ R.id.btn_addition, R.id.btn_division, R.id.btn_double_zero,
            R.id.btn_eight, R.id.btn_five, R.id.btn_four, R.id.btn_multiplication, R.id.btn_nine,
            R.id.btn_one, R.id.btn_result, R.id.btn_seven, R.id.btn_six, R.id.btn_subtraction,
            R.id.btn_three, R.id.btn_two, R.id.btn_zero }) void buttonClick(Button button) {

        switch (button.getId()){
            case R.id.btn_zero:
                inputArea += "0";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_double_zero:
                inputArea += "00";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_one:
                inputArea += "1";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_two:
                inputArea += "2";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_three:
                inputArea += "3";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_four:
                inputArea += "4";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_five:
                inputArea += "5";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_six:
                inputArea += "6";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_seven:
                inputArea += "7";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_eight:
                inputArea += "8";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_nine:
                inputArea += "9";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_addition:
                inputArea += "+";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_division:
                inputArea += "/";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_multiplication:
                inputArea += "*";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_subtraction:
                inputArea += "-";
                textViewResult.setText(inputArea);
                break;
            case R.id.btn_result:
                inputArea += "=";
                textViewResult.setText(inputArea);
                break;
        }
    }
}
