package com.reetika.lifecyclefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragment1 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false)
    }

    /*  override fun onstart()
    toast.makeText(mainActivity, resources.getString(R.string.onstart_fragment),Toast.LENGTH_LONG).show()
    super.onstart()
    }

       override fun onResume()
      toast.makeText(mainActivity, resources.getString(R.string.onresume_fragment),Toast.LENGTH_LONG).show()
      super.onResume()
    }
       override fun onStart()
       toast.makeText(mainActivity, resources.getString(R.string.onstart_fragment),Toast.LENGTH_LONG).show()
       super.onStart()
    }
      override fun onPause()
       toast.makeText(mainActivity, resources.getString(R.string.onpause_fragment),Toast.LENGTH_LONG).show()
       super.onPause()
    }
      override fun onDestroy()
       toast.makeText(mainActivity, resources.getString(R.string.ondestroy_fragment),Toast.LENGTH_LONG).show()
       super.onDestroy()
     }
      override fun onDetach()
       toast.makeText(mainActivity, resources.getString(R.string.ondetach_fragment),Toast.LENGTH_LONG).show()
       super.onDetach()
     */

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}