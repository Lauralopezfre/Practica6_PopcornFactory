package lopez.laura.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetalleContenido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_contenido)
        var ns = 0
        var pos = -1
        val bundle = intent.extras
        var title =""

        if(bundle != null) {
            var image: ImageView = findViewById(R.id.lv_imagen) as ImageView
            var txNombrePelicula: TextView = findViewById(R.id.tv_nombre) as TextView
            var txPeliculaDesc: TextView = findViewById(R.id.tv_desc) as TextView
            var movieSeatsLeft: TextView = findViewById(R.id.seatsLeft) as TextView

            ns = bundle.getInt("numberSeats")
            title = bundle.getString("titulo")!!
            image.setImageResource(bundle.getInt("header"))
            txNombrePelicula.setText(title)
            txPeliculaDesc.setText(bundle.getString("sinopsis"))
            movieSeatsLeft.setText("$ns seats available")
            pos = bundle.getInt("pos")
        }

        var btnTicket: Button = findViewById(R.id.buy_ticket) as Button
        if(ns==0){
            btnTicket.isEnabled = false
        }else{
            btnTicket.setOnClickListener {
                val intent: Intent = Intent(this, SeatSelection::class.java)
                intent.putExtra("pos", pos)
                intent.putExtra("name", title)
                intent.putExtra("header", bundle?.getInt("header"))
                this.startActivity(intent)
            }
        }
    }
}