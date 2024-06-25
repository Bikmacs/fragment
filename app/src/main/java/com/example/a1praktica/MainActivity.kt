package com.example.a1praktica

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.a1praktica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragment = BlankFragment()
        val fragment2 = BlankFragment2()

        // переключения между фрагментами
        binding.bReplcaeFragment.setOnClickListener {
            if (supportFragmentManager.findFragmentById(R.id.FramePlace) == fragment2) {
                supportFragmentManager.commit {
                    replace(R.id.FramePlace, fragment)
                    setReorderingAllowed(true)
                    addToBackStack(null)
                }
            } else {
                supportFragmentManager.commit {
                    replace(R.id.FramePlace, fragment2)
                    setReorderingAllowed(true)
                    addToBackStack(null)
                }
            }
        }
    }
}
