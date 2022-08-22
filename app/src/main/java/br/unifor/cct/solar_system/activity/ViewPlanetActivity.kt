package br.unifor.cct.solar_system.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import br.unifor.cct.solar_system.R
import br.unifor.cct.solar_system.repository.PlanetRepository

class ViewPlanetActivity : AppCompatActivity() {
    private lateinit var mPlanetPhoto: ImageView
    private lateinit var mPlanetName: TextView
    private lateinit var mPlanetDiameter: TextView
    private lateinit var mPlanetMassines: TextView
    private lateinit var mPlanetDensity: TextView
    private lateinit var mPlanetDescription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_planet)

        mPlanetPhoto = findViewById(R.id.view_planet_photo)
        mPlanetName = findViewById(R.id.view_planet_name)
        mPlanetDiameter = findViewById(R.id.view_planet_diameter)
        mPlanetDensity = findViewById(R.id.view_planet_density)
        mPlanetMassines = findViewById(R.id.view_planet_massines)
        mPlanetDescription = findViewById(R.id.view_planet_description)

        val position = intent.getIntExtra("user_id", -1)


        if(position >= 0){
            PlanetRepository.findAll().forEach {
                if(it.id == position+1){
                    mPlanetPhoto.setImageResource(it.photo)
                    mPlanetName.text = it.name
                    mPlanetMassines.text = it.massiness
                    mPlanetDiameter.text = it.diameter
                    mPlanetDensity.text = it.density
                    mPlanetDescription.text = it.description
                }
            }
        }
    }
}