package com.smh.alarm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO View 초기화
        initOnOffButton()
        initChangeAlarmTimeButton()
        //TODO 데이터 가져오기
        //TODO View에 데이터 그려주기


    }

    private fun initOnOffButton() {
        val onOffButton = findViewById<Button>(R.id.onOffButton)
        onOffButton.setOnClickListener {
            //TODO 데이터 확인하기
            //on,off에 따라 작업을 처리
            //off -> 알람제거
            //on -> 알람등록
            //데이터 저장
        }
    }

    private fun initChangeAlarmTimeButton() {
        val changeAlarmButton = findViewById<Button>(R.id.changeAlarmTimeButton)
        changeAlarmButton.setOnClickListener {
            //현재시간을 가져옴.
            //TimePickerDialog 사용해서 시간을 설정, 그시간을 가져옴
            // 데이터 저장
            // 뷰 업데이트
            //기존에 있던 알람 삭제.
        }
    }
}