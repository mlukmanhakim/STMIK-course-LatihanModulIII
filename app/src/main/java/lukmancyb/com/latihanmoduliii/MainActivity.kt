package lukmancyb.com.latihanmoduliii

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import lukmancyb.com.latihanmoduliii.fragment.HomeFragment
import lukmancyb.com.latihanmoduliii.fragment.ProfileFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentHome()

        btm_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.action_home -> {
                    Toast.makeText(this,"Action Home",Toast.LENGTH_LONG).show()
                    fragmentHome()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_profile ->{
                    Toast.makeText(this,"Action Profile",Toast.LENGTH_LONG).show()
                    fragmentProfile()
                    return@setOnNavigationItemSelectedListener true
                }
                else -> false
            }
        }


    }

    private fun fragmentHome(){
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = HomeFragment()
        transaction.replace(R.id.fragmentHolder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()

    } private fun fragmentProfile(){
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = ProfileFragment()
        transaction.replace(R.id.fragmentHolder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}
