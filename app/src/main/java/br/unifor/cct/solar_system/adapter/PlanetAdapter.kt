package br.unifor.cct.solar_system.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unifor.cct.solar_system.R
import br.unifor.cct.solar_system.listener.PlanetItemListener
import br.unifor.cct.solar_system.model.Planet

class PlanetAdapter(private val planets: List<Planet>):RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {

    private var listener:PlanetItemListener? = null

    class PlanetViewHolder(item: View, listener: PlanetItemListener?) : RecyclerView.ViewHolder(item) {
        val mPlanetPhoto:ImageView = item.findViewById(R.id.item_planet_imageview)
        val mPlanetName:TextView = item.findViewById(R.id.item_planet_nametext)
        val mPlanetInfo:TextView = item.findViewById(R.id.item_planet_infotext)

        init {
            item.setOnClickListener {
                listener?.onItemClick(it, adapterPosition)
            }
        }
    }

    fun setOnPlanetItemClick(list: PlanetItemListener){
        listener = list
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val item:View = LayoutInflater.from(parent.context).inflate(R.layout.item_planet_list, parent, false)
        return PlanetViewHolder(item, listener)
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.mPlanetPhoto.setImageResource(planets[position].photo)
        holder.mPlanetName.text = planets[position].name
        holder.mPlanetInfo.text = planets[position].resume
    }

    override fun getItemCount(): Int {
        return planets.size
    }
}