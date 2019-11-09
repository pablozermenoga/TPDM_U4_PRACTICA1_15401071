package mx.edu.ittepic.tpdm_u4_practica1_15401071

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

import android.view.View

class Lienzo(p:MainActivity):View(p) {
    var luna = BitmapFactory.decodeResource(resources, R.drawable.luna)
    var santa = BitmapFactory.decodeResource(resources,R.drawable.santa)
    override fun onDraw(c: Canvas?) {
        super.onDraw(c)
        var p = Paint()

        setBackgroundColor(Color.rgb(63, 65, 75))
        //LUNA
       c?.drawBitmap(luna, 1080f, 1200f, p)
        //SANTA
        c?.drawBitmap(santa,1200f, 1400f,p)
        //montañas
        p.color=Color.WHITE
        c?.drawCircle(200f,500f,1000f,p)
        p.color=Color.WHITE
        c?.drawCircle(100f,2100f,1000f,p)

        //ESTRELLAS
        p.color=Color.rgb(113,202,241)
        c?.drawCircle(1300f,500f,10f,p)

        p.color=Color.rgb(113,202,241)
        c?.drawCircle(1400f,100f,10f,p)

        p.color=Color.rgb(113,202,241)
        c?.drawCircle(1200f,1000f,10f,p)

        p.color=Color.rgb(113,202,241)
        c?.drawCircle(1300f,2100f,10f,p)

        p.color=Color.rgb(113,202,241)
        c?.drawCircle(1400f,1600f,10f,p)

        p.color=Color.rgb(113,202,241)
        c?.drawCircle(1300f,2400f,10f,p)
        //-----------------arbol 1--------------------------------
        p.color=Color.rgb(120,0,0)
        c?.drawRect(150f,1260f, 400f,1315f,p )
                    //izquierda, arriba,    derecha,  abajo
        p.color=Color.GREEN
        c?.drawCircle(400f,1245f,40f,p)
        p.color=Color.GREEN
        c?.drawCircle(450f,1285f,40f,p)
        p.color=Color.GREEN
        c?.drawCircle(400f,1310f,40f,p)

        //-----------------Arbol2------------------------------
        p.color=Color.rgb(120,0,0)
        c?.drawRect(650f,750f, 800f,810f,p )
                    //izquierda, arriba,    derecha,  abajo
        p.color=Color.GREEN
        c?.drawCircle(820f,740f,40f,p)
        p.color=Color.GREEN
        c?.drawCircle(870f,770f,40f,p)
        p.color=Color.GREEN
        c?.drawCircle(820f,810f,40f, p)
        //----------arbol3-----------------------------------
        p.color=Color.rgb(120,0,0)
        c?.drawRect(1000f,2250f, 1100f,2300f,p )
        p.color=Color.GREEN
        c?.drawCircle(1100f,2240f,40f,p)
        p.color=Color.GREEN
        c?.drawCircle(1150f,2270f,40f,p)
        p.color=Color.GREEN
        c?.drawCircle(1100f,2300f,40f,p)

        //-------------casa1----------------------------

        p.color=Color.BLUE
        c?.drawRect(150f,200f, 400f,500f,p )
                     //izquierda, arriba,    derecha,  abajo
         //chimenea
        p.color=Color.rgb(123,110,128)
        c?.drawRect(400f,450f, 480f,500f,p )
        //PUERTA
        p.color=Color.rgb(145,23,4)
        c?.drawRect(150f,250f, 260f,320f,p )
                    //izquierda, arriba,    derecha,  abajo
        //VENTANA
        p.color=Color.YELLOW
        c?.drawRect(290f,390f, 360f,460f,p )
                   //izquierda, arriba,    derecha,  abajo

        //-----------CASA 2------------------
        p.color=Color.BLUE
        c?.drawRect(500f,2000f, 700f,2300f,p )
                        //izquierda, arriba,    derecha,  abajo
       //chimenea
        p.color=Color.rgb(123,110,128)
        c?.drawRect(700f,2250f, 780f,2300f,p )
                    //izquierda, arriba,    derecha,  abajo
     //PUERTA
       p.color=Color.rgb(145,23,4)
       c?.drawRect(500f,2090f, 600f,2150f,p )
                 //izquierda, arriba,    derecha,  abajo
     //VENTANA
       p.color=Color.YELLOW
       c?.drawRect(600f,2200f, 670f,2270f,p )

    }
}