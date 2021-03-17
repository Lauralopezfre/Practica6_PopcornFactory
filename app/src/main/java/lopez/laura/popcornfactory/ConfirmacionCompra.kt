package lopez.laura.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class ConfirmacionCompra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacion_compra)

        val bundle = intent.extras

        val txtTitle: TextView = findViewById(R.id.titlePelicula) as TextView
        val imgPelicula: ImageView = findViewById(R.id.imgPelicula) as ImageView
        val txtasiento: TextView = findViewById(R.id.asiento) as TextView
        val btnConfirm: Button = findViewById(R.id.btnConfirm) as Button

        txtasiento.setText(bundle?.getString("asiento"))
        txtTitle.setText(bundle?.getString("name"))
        imgPelicula.setImageResource(bundle!!.getInt("header"))

        btnConfirm.setOnClickListener {
            var intent = Intent(this, SeatSelection::class.java)
            intent.putExtra("posConfirm", bundle!!.getInt("asiento"))
            //Tengo dudas en el camino que tengo que seguir de regreso al seatselection
            Toast.makeText(this,"enjoy the movie", Toast.LENGTH_LONG).show()
            this.startActivity(intent)
        }

    }
}