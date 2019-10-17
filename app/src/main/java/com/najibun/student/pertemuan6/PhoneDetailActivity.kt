package com.najibun.student.pertemuan6

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_phone_detail.*

/**
 * Created by Student on 17/10/2019.
 */

class PhoneDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_detail)

        var intentstart = getIntent()

        if (intentstart.hasExtra(Intent.EXTRA_TEXT)) {
            var partid = intentstart.getStringExtra(Intent.EXTRA_TEXT)
            tv_item_id.text = partid
        }
    }
}