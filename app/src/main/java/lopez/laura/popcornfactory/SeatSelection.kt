package lopez.laura.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class SeatSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_selection)

        val title: TextView = findViewById(R.id.titleSeats)
        val bundle = intent.extras
        var posMovie = -1

        if(bundle!=null){
            title.setText(bundle.getString("name"))
            posMovie = bundle.getInt("pos")
        }

        val btnConfirm: Button = findViewById(R.id.btnConfirm) as Button
        btnConfirm.setOnClickListener {
            //añadir logica para reservar el lugar seleccionadó por el usuario
            //hacer una nueva actividad donde se vea el resumen de la compra
            //que se agregue el nombre del cliente y nombre que se seleccion
            Toast.makeText(this,"enjoy the movie", Toast.LENGTH_LONG).show()
        }

        val row1: RadioGroup = findViewById(R.id.rowl)
        val row2: RadioGroup = findViewById(R.id.row2)
        val row3: RadioGroup = findViewById(R.id.row3)
        val row4: RadioGroup = findViewById(R.id.row4)

        row1.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId > -1){
                row2.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row1.check(checkedId)
            }
        }

        row2.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId > -1){
                row1.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row2.check(checkedId)
            }
        }

        row3.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId > -1){
                row2.clearCheck()
                row1.clearCheck()
                row4.clearCheck()

                row3.check(checkedId)
            }
        }

        row4.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId > -1){
                row2.clearCheck()
                row3.clearCheck()
                row1.clearCheck()

                row4.check(checkedId)
            }
        }
    }
}