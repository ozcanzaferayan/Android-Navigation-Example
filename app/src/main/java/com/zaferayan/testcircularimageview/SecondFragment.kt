package com.zaferayan.testcircularimageview


import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        setHasOptionsMenu(true)
        val supportActionbar = (activity as AppCompatActivity).supportActionBar!!
        supportActionbar.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(context!!, R.color.colorPrimary)))

        supportActionbar.setDisplayHomeAsUpEnabled(true);
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            activity!!.onBackPressed()
            return true;
        }
        return super.onOptionsItemSelected(item)
    }


}
