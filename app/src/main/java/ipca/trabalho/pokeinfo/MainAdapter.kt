package ipca.trabalho.pokeinfo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.poke_row.view.*
import java.text.FieldPosition

class MainAdapter : RecyclerView.Adapter<CustomViewHolder>() {

    val pokeNames = listOf<String>("poke1","poke2","poke3")
    //numero de items
    override fun getItemCount(): Int {
        return pokeNames.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.poke_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int){

        val pokeName = pokeNames.get(position)
        holder.itemView.textView_name.text = pokeName

    }
}

class CustomViewHolder(v:View) : RecyclerView.ViewHolder(v)
{

}