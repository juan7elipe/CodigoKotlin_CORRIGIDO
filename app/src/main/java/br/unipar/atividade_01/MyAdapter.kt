package br.unipar.atividade_01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val items: List<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val inputField: EditText = itemView.findViewById(R.id.inputField)
        val buttonSubmit: Button = itemView.findViewById(R.id.buttonSubmit)
        val outputTextView: TextView = itemView.findViewById(R.id.outputTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.buttonSubmit.setOnClickListener {
            holder.outputTextView.text = holder.inputField.text.toString()
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
