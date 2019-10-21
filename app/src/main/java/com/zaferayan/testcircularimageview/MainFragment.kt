package com.zaferayan.testcircularimageview


import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import kotlinx.android.synthetic.main.activity_main.*
import androidx.databinding.adapters.ViewBindingAdapter.setPadding
import androidx.core.view.ViewCompat.setFitsSystemWindows



/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //activity!!.window.requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
        setHasOptionsMenu(true)
        val supportActionbar = (activity as AppCompatActivity).supportActionBar!!
        supportActionbar.setDisplayHomeAsUpEnabled(true)
        supportActionbar.setHomeAsUpIndicator(R.drawable.ic_notifications_black_24dp)





        val view = inflater.inflate(R.layout.fragment_main, container, false)
        activity!!.window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        //activity!!.window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        supportActionbar.setBackgroundDrawable( ColorDrawable(Color.TRANSPARENT))
        //val actionBar = supportActionbar
        //actionBar.setBackgroundDrawable(ColorDrawable(Color.parseColor("#000000")))
        //activity!!.window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        //activity!!.window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //activity!!.window.setStatusBarColor(Color.TRANSPARENT);
        //view.setFitsSystemWindows(true)
        //view.setPadding(0, 0, 0, 0)
        return view
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment, null)
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_main, menu)
    }

}
