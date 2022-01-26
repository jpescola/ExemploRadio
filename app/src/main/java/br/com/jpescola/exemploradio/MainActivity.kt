package br.com.jpescola.exemploradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity(), RadioGroup.OnCheckedChangeListener {

    lateinit var radPeriodo: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // instancia o objeto RadioGroup
        radPeriodo = findViewById<RadioGroup>(R.id.radPeriodo)

        // define a Activity atual como listener do objeto
        radPeriodo.setOnCheckedChangeListener(this)

    }

    // gerencia os eventos do RadioGroup
    override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
        if (p1 == R.id.radManha) // se o período da manhã for escolhido
            Toast.makeText(this, "$p1", Toast.LENGTH_SHORT).show() // mostra msg
    }
}