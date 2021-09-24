package com.ivamotelo.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("LifeCycle", "ONCREATE() - criação da tela")
        //finish() - Pula direito para OnDestroy(), usado em casos muito específicos
    }

    override fun onStart() {
        super.onStart()
        Log.v("LifeCycle", "ONSTART() - Tela visível para o usuário")
    }

    override fun onPause() {
        super.onPause()
        Log.v("LifeCycle", "ONPAUSE() - Tela perdeu o foco para o usuário e a interação")
    }

    override fun onResume() {
        super.onResume()
        Log.v("LifeCycle", "ONRESUME() - Tela tem o foco para o usuário interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.v("LifeCycle", "ONSTOP() - Tela invisível para o usuário, mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("LifeCycle", "ONRESTART() - O sistema reconstruiu a tela")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("LifeCycle", "ONDESTROY() - Tela foi destruida pela aplicação")
    }
}