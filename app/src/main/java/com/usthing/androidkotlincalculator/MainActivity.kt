package com.usthing.androidkotlincalculator

import android.app.Activity
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.usthing.androidkotlincalculator.MainActivity.Action.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val btn0: Button by bind(R.id.button_0)
    private val btn1: Button by bind(R.id.button_1)
    private val btn2: Button by bind(R.id.button_2)
    private val btn3: Button by bind(R.id.button_3)
    private val btn4: Button by bind(R.id.button_4)
    private val btn5: Button by bind(R.id.button_5)
    private val btn6: Button by bind(R.id.button_6)
    private val btn7: Button by bind(R.id.button_7)
    private val btn8: Button by bind(R.id.button_8)
    private val btn9: Button by bind(R.id.button_9)

    private val add: Button by bind(R.id.button_add)
    private val subtract: Button by bind(R.id.button_subtract)
    private val multiply: Button by bind(R.id.button_multiply)
    private val divide: Button by bind(R.id.button_divide)

    private val dot: Button by bind(R.id.button_dot)
    private val clear: Button by bind(R.id.button_clear)
    private val compute: Button by bind(R.id.button_compute)

    private val input: EditText by bind(R.id.input)
    private val result: EditText by bind(R.id.result)

    private enum class Action {
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION
    }

    private var valueOne = Double.NaN
    private var valueTwo = Double.NaN

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setNumberPadOnClickListener()
        setActionButtonOnClickListener()
        setMiscButtonOnClickListener()
    }

    private fun setNumberPadOnClickListener() {
        val btnList = Arrays.asList(btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
        for(i in 0 until btnList.size) {
            btnList[i].setOnClickListener {
                //TODO: numpad button on click
            }
        }
    }

    private fun setActionButtonOnClickListener() {
        val btnList = Arrays.asList(add, subtract, multiply, divide)
        val actionList = Arrays.asList(ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION)
        for (i in 0 until btnList.size) {
            val btn = btnList[i]
            btn.setOnClickListener {
                //TODO: action button on click
            }
        }
    }

    private fun setMiscButtonOnClickListener() {
        dot.setOnClickListener {
            //TODO: dot button on click
        }
        compute.setOnClickListener {
            //TODO: compute button on click
        }
        clear.setOnClickListener {
            //TODO: clear button on click
        }
    }
    /** Utility */

    fun <T : View> Activity.bind(@IdRes res : Int) : Lazy<T> {
        @Suppress("UNCHECKED_CAST")
        return lazy(LazyThreadSafetyMode.NONE){ findViewById<View>(res) as T }
    }
}
