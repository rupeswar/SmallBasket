package com.example.smallbasket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.smallbasket.databinding.ActivityPaymentBinding

class PaymentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPaymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.amount.text = "₹ ${intent.getIntExtra("amount", 0)}"

        binding.pay.setOnClickListener {
            Toast.makeText(this, "Payment Successful!!", Toast.LENGTH_SHORT).show()
            onBackPressed()
        }
    }
}