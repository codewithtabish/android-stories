import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newsalter.R
import com.example.newsalter.models.StoryNameModel

class StoryNameAdapter(val content: Context, val storyNameList:ArrayList<StoryNameModel>):
    RecyclerView.Adapter<StoryNameAdapter.InternalRowViewHolder>()  {


        inner class  InternalRowViewHolder(view:View):RecyclerView.ViewHolder(view){
            val story_row_name=view.findViewById<TextView>(R.id.story_row_name)


        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InternalRowViewHolder {
        return  InternalRowViewHolder(LayoutInflater.from(content).inflate(R.layout.story_name_row,parent,false))
    }

    override fun getItemCount(): Int {
        return  storyNameList.size

    }

    override fun onBindViewHolder(holder: InternalRowViewHolder, position: Int) {
        val obj=storyNameList[position]
        holder.story_row_name.text=obj.storyName
    }


}