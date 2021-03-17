package lopez.laura.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*
import kotlin.collections.ArrayList

class SeatSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_selection)

        val title: TextView = findViewById(R.id.titleSeats)
        val bundle = intent.extras
        var posMovie = -1
        var titlePelicula = bundle?.getString("name")
        var asiento: String = ""

        if(bundle!=null){
            title.setText(titlePelicula)
            posMovie = bundle.getInt("pos")
        }

        val btnConfirm: Button = findViewById(R.id.btnConfirm) as Button
        btnConfirm.setOnClickListener {

            var intent = Intent(this, ConfirmacionCompra::class.java)
            intent.putExtra("name", titlePelicula)
            intent.putExtra("header", bundle!!.getInt("header"))
            intent.putExtra("asiento", asiento)
            this.startActivity(intent)
        }

        val radio1: RadioButton = findViewById(R.id.r1)
        val radio2: RadioButton = findViewById(R.id.r2)
        val radio3: RadioButton = findViewById(R.id.r3)
        val radio4: RadioButton = findViewById(R.id.r4)
        val radio5: RadioButton = findViewById(R.id.r5)
        val radio6: RadioButton = findViewById(R.id.r6)
        val radio7: RadioButton = findViewById(R.id.r7)
        val radio8: RadioButton = findViewById(R.id.r8)
        val radio9: RadioButton = findViewById(R.id.r9)
        val radio10: RadioButton = findViewById(R.id.r10)
        val radio11: RadioButton = findViewById(R.id.r11)
        val radio12: RadioButton = findViewById(R.id.r12)
        val radio13: RadioButton = findViewById(R.id.r13)
        val radio14: RadioButton = findViewById(R.id.r14)
        val radio15: RadioButton = findViewById(R.id.r15)
        val radio16: RadioButton = findViewById(R.id.r16)
        val radio17: RadioButton = findViewById(R.id.r17)
        val radio18: RadioButton = findViewById(R.id.r18)
        val radio19: RadioButton = findViewById(R.id.r19)
        val radio20: RadioButton = findViewById(R.id.r20)

        radio1.setOnClickListener {
            asiento = radio1.getText().toString()
        }
        radio2.setOnClickListener {
            asiento = radio2.getText().toString()
        }
        radio3.setOnClickListener {
            asiento = radio3.getText().toString()
        }
        radio4.setOnClickListener {
            asiento = radio4.getText().toString()
        }
        radio5.setOnClickListener {
            asiento = radio5.getText().toString()
        }
        radio6.setOnClickListener {
            asiento = radio6.getText().toString()
        }
        radio7.setOnClickListener {
            asiento = radio7.getText().toString()
        }
        radio8.setOnClickListener {
            asiento = radio8.getText().toString()
        }
        radio9.setOnClickListener {
            asiento = radio9.getText().toString()
        }
        radio10.setOnClickListener {
            asiento = radio10.getText().toString()
        }
        radio11.setOnClickListener {
            asiento = radio11.getText().toString()
        }
        radio12.setOnClickListener {
            asiento = radio12.getText().toString()
        }
        radio13.setOnClickListener {
            asiento = radio13.getText().toString()
        }
        radio14.setOnClickListener {
            asiento = radio14.getText().toString()
        }
        radio15.setOnClickListener {
            asiento = radio15.getText().toString()
        }
        radio16.setOnClickListener {
            asiento = radio16.getText().toString()
        }
        radio17.setOnClickListener {
            asiento = radio17.getText().toString()
        }
        radio18.setOnClickListener {
            asiento = radio18.getText().toString()
        }
        radio19.setOnClickListener {
            asiento = radio19.getText().toString()
        }
        radio19.setOnClickListener {
            asiento = radio19.getText().toString()
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

                posMovie = checkedId

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