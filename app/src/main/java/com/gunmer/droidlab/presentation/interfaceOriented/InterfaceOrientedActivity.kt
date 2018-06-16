package com.gunmer.droidlab.presentation.interfaceOriented

import android.databinding.BaseObservable
import android.databinding.DataBindingUtil
import android.databinding.ObservableField
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.gunmer.droidlab.R
import com.gunmer.droidlab.databinding.ActivityInterfaceOrientedBinding
import java.util.*

class InterfaceOrientedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityInterfaceOrientedBinding>(this, R.layout.activity_interface_oriented)
        binding.viewModel = InterfaceOrientedVM()
    }

    @Suppress("UNUSED_PARAMETER")
    class InterfaceOrientedVM : BaseObservable(), Logger.Loggable {
        var text = ObservableField("")

        fun onClickGenerate(v: View?) {
            log.debug("Enter into onClickGenerate")
            val letters = "qwertyuiopasdfghjklñzxcvbnm "
            val numberOfLetters = Random().nextInt(500)

            val textGenerated = StringBuilder()
            for (i in 0..numberOfLetters) {
                val index = Random().nextInt(letters.length)
                textGenerated.append(letters[index])
            }

            text.set(textGenerated.toString())
        }
    }

}
