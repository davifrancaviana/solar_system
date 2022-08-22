package br.unifor.cct.solar_system.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unifor.cct.solar_system.R
import br.unifor.cct.solar_system.adapter.PlanetAdapter
import br.unifor.cct.solar_system.listener.PlanetItemListener
import br.unifor.cct.solar_system.repository.PlanetRepository

class MainActivity : AppCompatActivity(), PlanetItemListener {

    private lateinit var mPlanetList: RecyclerView
    private val planetList = PlanetRepository.findAll()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val llm = LinearLayoutManager(this)
        val planetAdapter = PlanetAdapter(planetList)

        mPlanetList = findViewById(R.id.main_view_planetList)
        mPlanetList.apply {
            hasFixedSize()
            adapter = planetAdapter
            layoutManager = llm
        }
    }

    override fun onItemClick(view: View, position: Int) {
        val it = Intent(this, ViewPlanetActivity::class.java)
        it.putExtra("user_id", position)
        startActivity(it)
    }
}