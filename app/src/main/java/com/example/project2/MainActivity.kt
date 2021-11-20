package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.*
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nvm_1 = findViewById<EditText>(R.id.ac_main_edt_num_1)
        var nvm_2 = findViewById<EditText>(R.id.ac_main_edt_num_2)
        var tv_result = findViewById<TextView>(R.id.ac_main_tv_result)

        val sp_1 = arrayOf("+","-","/","*")
        val sp_2 = findViewById<Spinner>(R.id.ac_main_sp_calcutor)
        val sp_adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,sp_1)
        sp_2.adapter = sp_adapter

        sp_2.onItemLongClickListener =object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (sp_2.selectedItemPosition==0){
                    var n1 : Int = nvm_1.text.toString().toInt()
                    var n2 : Int = nvm_2.text.toString().toInt()
                    var result = n1 + n2
                    tv_result.text=result.toString()
                }else if (sp_2.selectedItemPosition==1){
                    var n1 : Int = nvm_1.text.toString().toInt()
                    var n2 : Int = nvm_2.text.toString().toInt()
                    var result = n1 - n2
                    tv_result.text=result.toString()
            }else if (sp_2.selectedItemPosition==2){
                    var n1 : Int = nvm_1.text.toString().toInt()
                    var n2 : Int = nvm_2.text.toString().toInt()
                    var result = n1 / n2
                    tv_result.text=result.toString()

        }else if (sp_2.selectedItemPosition==3){
                    var n1 : Int = nvm_1.text.toString().toInt()
                    var n2 : Int = nvm_2.text.toString().toInt()
                    var result = n1 * n2
                    tv_result.text=result.toString()

    }
}