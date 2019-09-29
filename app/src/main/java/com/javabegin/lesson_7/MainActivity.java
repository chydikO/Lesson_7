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
    private static final String ZERO = "0";
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
            R.id.btn_three, R.id.btn_two, R.id.btn_zero, R.id.btn_clear }) void buttonClick(Button button) {

        switch (button.getId()) {
            case R.id.btn_addition:
            case R.id.btn_division:
            case R.id.btn_multiplication:
            case R.id.btn_subtraction:
            case R.id.btn_result:
                arithmeticOperation(button);
                break;
            case R.id.btn_clear:
                inputArea = ZERO;
                textViewResult.setText(inputArea);
                break;
            default:
                inputArea += button.getContentDescription().toString();
                textViewResult.setText(inputArea);
                break;
        }
    }

    private void arithmeticOperation(Button button) {
        inputArea += button.getContentDescription().toString();
        textViewResult.setText(inputArea);
    }
}
