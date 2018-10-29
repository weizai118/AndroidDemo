package stan.androiddemo.Media.OpenCV

import stan.androiddemo.R
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_open_cv.*

class OpenCVActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_cv)
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener { onBackPressed() }
        title = ""

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                arrayListOf("照片变灰阶图"))
        list_view_layout.adapter = adapter

        list_view_layout.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val title = (view as TextView).text
            when(title){
                "照片变灰阶图"-> {
                    val intent = Intent(this,ImageToGrayActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}
