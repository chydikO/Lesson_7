package com.javabegin.lesson_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Домашнее задание Lesson 7:
 *
 *     Добавить иконку калькулятора для проекта
 *     Создать интерфейс калькулятора
 *     Реализовать печать цифры при нажатии на кнопку
 */

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textViewResult) TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
