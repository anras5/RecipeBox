package com.example.recipebox

import android.content.ContentValues.TAG
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.util.Locale

class TimerFragment : Fragment(), View.OnClickListener{

    private var preparationSeconds = 0
    private var seconds = 0
    private var running = false
    private var wasRunning = false
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            seconds = it.getString("preparationTime")!!.toInt() * 60
            preparationSeconds = seconds
        }

        savedInstanceState?.let {
            preparationSeconds = it.getInt("preparationSeconds")
            seconds = it.getInt("seconds")
            running = it.getBoolean("running")
            wasRunning = it.getBoolean("wasRunning")
        }

        mediaPlayer = MediaPlayer()
        val resId = R.raw.alarm_sound
        val fileDescriptor = resources.openRawResourceFd(resId)
        mediaPlayer.setDataSource(fileDescriptor.fileDescriptor, fileDescriptor.startOffset, fileDescriptor.length)
        fileDescriptor.close()
        mediaPlayer.prepare()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_timer, container, false)
        runTimer(layout)
        val startButton: Button = layout.findViewById(R.id.start_button)
        startButton.setOnClickListener(this)
        val stopButton: Button = layout.findViewById(R.id.stop_button)
        stopButton.setOnClickListener(this)
        val resetButton: Button = layout.findViewById(R.id.reset_button)
        resetButton.setOnClickListener(this)
        val minusMinuteButton: Button = layout.findViewById(R.id.minusMinuteButton)
        minusMinuteButton.setOnClickListener(this)
        val minusSecondButton: Button = layout.findViewById(R.id.minusSecondButton)
        minusSecondButton.setOnClickListener(this)
        val plusSecondButton: Button = layout.findViewById(R.id.plusSecondButton)
        plusSecondButton.setOnClickListener(this)
        val plusMinuteButton: Button = layout.findViewById(R.id.plusMinuteButton)
        plusMinuteButton.setOnClickListener(this)
        return layout
    }


    override fun onPause() {
        super.onPause()
        wasRunning = running
        running = false
    }

    override fun onResume() {
        super.onResume()
        if (wasRunning) {
            running = true
        }
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putInt("preparationSeconds", preparationSeconds)
        savedInstanceState.putInt("seconds", seconds)
        savedInstanceState.putBoolean("running", running)
        savedInstanceState.putBoolean("wasRunning", wasRunning)
    }

    override fun onClick(view: View) {
        if (mediaPlayer.isPlaying) {
            // Stopping the alarm sound
            mediaPlayer.stop()
            mediaPlayer.reset()
            mediaPlayer.release()
            mediaPlayer = MediaPlayer()
            val resId = R.raw.alarm_sound
            val fileDescriptor = resources.openRawResourceFd(resId)
            mediaPlayer.setDataSource(fileDescriptor.fileDescriptor, fileDescriptor.startOffset, fileDescriptor.length)
            fileDescriptor.close()
            mediaPlayer.prepare()
        }

        when (view.id) {
            R.id.start_button -> onClickStart()
            R.id.stop_button -> onClickStop()
            R.id.reset_button -> onClickReset()
            R.id.minusMinuteButton -> onClickMinusMinute()
            R.id.minusSecondButton -> onClickMinusSecond()
            R.id.plusSecondButton -> onClickPlusSecond()
            R.id.plusMinuteButton -> onClickPlusMinute()
        }
    }

    private fun onClickStart() {
        if (seconds > 0)
            running = true
    }

    private fun onClickStop() {
        running = false
    }

    private fun onClickReset() {
        running = false
        seconds = preparationSeconds
    }

    private fun onClickMinusMinute() {
        if (seconds >= 60)
            seconds -= 60
    }

    private fun onClickMinusSecond() {
        if (seconds > 0)
            seconds -= 1
    }

    private fun onClickPlusSecond() {
        seconds += 1
    }

    private fun onClickPlusMinute() {
        seconds += 60
    }

    fun setPreparaionSeconds(time: Int) {
        if (preparationSeconds == 0) {
            this.preparationSeconds = time * 60
            this.seconds = time * 60
        }
    }

    private fun runTimer(view: View) {
        val timeView = view.findViewById<TextView>(R.id.time_view)
        val handler = Handler()
        handler.post(object : Runnable {
            override fun run() {
                val hours = seconds / 3600
                val minutes = (seconds % 3600) / 60
                val secs = seconds % 60
                val time = String.format(Locale.getDefault(), "%d:%02d:%02d", hours, minutes, secs)
                timeView.text = time
                if (running) {
                    seconds--
                }
                if (seconds == 0) {
                    // Starting the alarm sound
                    mediaPlayer.start()
                    running = false
                }
                handler.postDelayed(this, 1000)
            }
        })
    }

}
