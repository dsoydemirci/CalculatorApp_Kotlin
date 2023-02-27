package com.soydemircidogukan.hesapmakinesi1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.soydemircidogukan.hesapmakinesi1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var number1 :Int? =null
    var number2 :Int? =null
    var result :Int? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



    }

    fun toplafunc(view: View){
         number1=binding.sayigiris1.text.toString().toIntOrNull()
         number2=binding.sayigiris2.text.toString().toIntOrNull()
        println(number1)
        if(number1==null ||number2==null){
            binding.sonuctext.text="hatali giris"

        }else
        {
             result= number2!!+number1!!
            binding.sonuctext.text="Sonuc: ${result}"
        }


    }
    fun cikarfunc(view: View){
        number1=binding.sayigiris1.text.toString().toIntOrNull()
        number2=binding.sayigiris2.text.toString().toIntOrNull()
        println(number1)
        if(number1==null ||number2==null){
            binding.sonuctext.text="hatali giris"

        }else
        {
            result= number1!! - number2!!
            binding.sonuctext.text="Sonuc: ${result}"
        }

    }
    fun carpfunc(view: View){
        number1=binding.sayigiris1.text.toString().toIntOrNull()
        number2=binding.sayigiris2.text.toString().toIntOrNull()
        println(number1)
        if(number1==null ||number2==null){
            binding.sonuctext.text="hatali giris"

        }else
        {
            result= number1!! * number2!!
            binding.sonuctext.text="Sonuc: ${result}"
        }

    }
    fun bolfunc(view: View){
        number1=binding.sayigiris1.text.toString().toIntOrNull()
        number2=binding.sayigiris2.text.toString().toIntOrNull()
        println(number1)
        if(number1==null ||number2==null){
            binding.sonuctext.text="hatali giris"

        }else
        {
            result= number1!! / number2!!
            binding.sonuctext.text="Sonuc: ${result}"
        }

    }
    fun modalfunc(view: View){
        number1=binding.sayigiris1.text.toString().toIntOrNull()
        number2=binding.sayigiris2.text.toString().toIntOrNull()
        println(number1)
        if(number1==null ||number2==null){
            binding.sonuctext.text="hatali giris"

        }else
        {
            result= number1!! % number2!!
            binding.sonuctext.text="Sonuc: ${result}"
        }

    }
}