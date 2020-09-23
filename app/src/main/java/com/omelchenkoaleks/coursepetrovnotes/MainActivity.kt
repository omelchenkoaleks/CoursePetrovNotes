package com.omelchenkoaleks.coursepetrovnotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.omelchenkoaleks.coursepetrovnotes.databinding.ActivityMainBinding
import com.omelchenkoaleks.coursepetrovnotes.utilits.APP_ACTIVITY

class MainActivity : AppCompatActivity() {

    lateinit var mToolbar: Toolbar
    lateinit var navController: NavController
    private var _binding: ActivityMainBinding? = null
    val mBinding get() = _binding!! // Это для удобства, теперь не нужно будет проверять ссылку на null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        APP_ACTIVITY = this
        mToolbar = mBinding.toolbar
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        setSupportActionBar(mToolbar)
        title = getString(R.string.title)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null // Это делается уже после того, как была удалена активити. Избегаем утечки памяти.
    }
}