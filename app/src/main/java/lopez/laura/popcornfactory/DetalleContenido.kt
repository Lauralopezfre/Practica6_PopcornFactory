package lopez.laura.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetalleContenido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_contenido)


        var bundle = intent.extras

        if(bundle != null) {
            var image: ImageView = findViewById(R.id.lv_imagen) as ImageView
            var txNombrePelicula: TextView = findViewById(R.id.tv_nombre) as TextView
            var txPeliculaDesc: TextView = findViewById(R.id.tv_desc) as TextView

            image.setImageResource(bundle.getInt("header"))
            txNombrePelicula.setText(bundle.getString("titulo"))
            txPeliculaDesc.setText(bundle.getString("sinopsis"))
        }
    }
}