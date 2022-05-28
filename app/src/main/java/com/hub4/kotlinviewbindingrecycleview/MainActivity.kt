package com.hub4.kotlinviewbindingrecycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.hub4.kotlinviewbindingrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  var binding: ActivityMainBinding? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding?.root)

    val adapter = MainAdapter(TaskList.taskList)
    binding?.taskRv?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    binding?.taskRv?.adapter = adapter
  }

  override fun onDestroy() {
    super.onDestroy()
    binding = null
  }
}
