package com.example.pianoapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import org.billthefarmer.mididriver.MidiDriver;

public class MainActivity extends AppCompatActivity implements MidiDriver.OnMidiStartListener, View.OnTouchListener{

    private MidiDriver midiDriver;
    private byte[] event;
    private int[] config;
    View c4,d4,e4,f4,g4,a4,b4,c5,c4_b,eb4_b,f4_b,g4_b,bb4_b,c5_b;

    @SuppressLint({"NewApi", "ClickableViewAccessibility"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c4 = (View)findViewById(R.id.c4);
        c4.setOnTouchListener(this);

        d4 = (View)findViewById(R.id.d4);
        d4.setOnTouchListener(this);

        e4 = (View)findViewById(R.id.e4);
        e4.setOnTouchListener(this);

        f4 = (View)findViewById(R.id.f4);
        f4.setOnTouchListener(this);

        g4 = (View)findViewById(R.id.g4);
        g4.setOnTouchListener(this);

        a4 = (View)findViewById(R.id.a4);
        a4.setOnTouchListener(this);

        b4 = (View)findViewById(R.id.b4);
        b4.setOnTouchListener(this);

        c5 = (View)findViewById(R.id.c5);
        c5.setOnTouchListener(this);

        c4_b = (View)findViewById(R.id.c4_b);
        c4_b.setOnTouchListener(this);

        eb4_b = (View)findViewById(R.id.eb4_b);
        eb4_b.setOnTouchListener(this);

        f4_b = (View)findViewById(R.id.f4_b);
        f4_b.setOnTouchListener(this);

        g4_b = (View)findViewById(R.id.g4_b);
        g4_b.setOnTouchListener(this);

        bb4_b = (View)findViewById(R.id.bb4_b);
        bb4_b.setOnTouchListener(this);

        c5_b = (View)findViewById(R.id.c5_b);
        c5_b.setOnTouchListener(this);
        // Instantiate the driver.
        midiDriver = new MidiDriver();
        // Set the listener.
        midiDriver.setOnMidiStartListener(this);


        c4.setOnTouchListener((v, event) -> {
            Log.d(this.getClass().getName(), "Motion event: " + event);
            if (v.getId() == R.id.c4) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                    playNote(0x90,0x00,0x3C);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                    stopNote(0x80, 0x00, 0x3C);
                }
            }
            c4.setBackgroundColor(getColor(R.color.touched));
            new CountDownTimer(1*100,100){

                @Override
                public void onTick(long millisUntilFinished) {
                    String.valueOf(millisUntilFinished/100);
                }

                @SuppressLint("NewApi")
                @Override
                public void onFinish() {
                    c4.setBackgroundColor(getColor(R.color.return_key));
                }
            }.start();
            return false;
        });

        d4.setOnTouchListener((v, event) -> {
            Log.d(this.getClass().getName(), "Motion event: " + event);
            if (v.getId() == R.id.d4) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                    playNote(0x90,0x00,0x3E);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                    stopNote(0x80, 0x00, 0x3E);
                }
            }
            d4.setBackgroundColor(getColor(R.color.touched));
            new CountDownTimer(1*100,100){

                @Override
                public void onTick(long millisUntilFinished) {
                    String.valueOf(millisUntilFinished/100);
                }

                @SuppressLint("NewApi")
                @Override
                public void onFinish() {
                    d4.setBackgroundColor(getColor(R.color.return_key));
                }
            }.start();
            return false;
        });

        e4.setOnTouchListener((v, event) -> {
            Log.d(this.getClass().getName(), "Motion event: " + event);
            if (v.getId() == R.id.e4) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                    playNote(0x90,0x00,0x40);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                    stopNote(0x80, 0x00, 0x40);
                }
            }
            e4.setBackgroundColor(getColor(R.color.touched));
            new CountDownTimer(1*100,100){

                @Override
                public void onTick(long millisUntilFinished) {
                    String.valueOf(millisUntilFinished/100);
                }

                @SuppressLint("NewApi")
                @Override
                public void onFinish() {
                    e4.setBackgroundColor(getColor(R.color.return_key));
                }
            }.start();
            return false;
        });

        f4.setOnTouchListener((v, event) -> {
            Log.d(this.getClass().getName(), "Motion event: " + event);
            if (v.getId() == R.id.f4) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                    playNote(0x90,0x00,0x41);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                    stopNote(0x80, 0x00, 0x41);
                }
            }
            f4.setBackgroundColor(getColor(R.color.touched));
            new CountDownTimer(1*100,100){

                @Override
                public void onTick(long millisUntilFinished) {
                    String.valueOf(millisUntilFinished/100);
                }

                @SuppressLint("NewApi")
                @Override
                public void onFinish() {
                    f4.setBackgroundColor(getColor(R.color.return_key));
                }
            }.start();
            return false;
        });

        g4.setOnTouchListener((v, event) -> {
            Log.d(this.getClass().getName(), "Motion event: " + event);
            if (v.getId() == R.id.g4) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                    playNote(0x90,0x00,0x43);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                    stopNote(0x80, 0x00, 0x43);
                }
            }
            g4.setBackgroundColor(getColor(R.color.touched));
            new CountDownTimer(1*100,100){

                @Override
                public void onTick(long millisUntilFinished) {
                    String.valueOf(millisUntilFinished/100);
                }

                @SuppressLint("NewApi")
                @Override
                public void onFinish() {
                    g4.setBackgroundColor(getColor(R.color.return_key));
                }
            }.start();
            return false;
        });

        a4.setOnTouchListener((v, event) -> {
            Log.d(this.getClass().getName(), "Motion event: " + event);
            if (v.getId() == R.id.a4) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                    playNote(0x90,0x00,0x45);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                    stopNote(0x80, 0x00, 0x45);
                }
            }
            a4.setBackgroundColor(getColor(R.color.touched));
            new CountDownTimer(1*100,100){

                @Override
                public void onTick(long millisUntilFinished) {
                    String.valueOf(millisUntilFinished/100);
                }

                @SuppressLint("NewApi")
                @Override
                public void onFinish() {
                    a4.setBackgroundColor(getColor(R.color.return_key));
                }
            }.start();
            return false;
        });

        b4.setOnTouchListener((v, event) -> {
            Log.d(this.getClass().getName(), "Motion event: " + event);
            if (v.getId() == R.id.b4) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                    playNote(0x90,0x00,0x47);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                    stopNote(0x80, 0x00, 0x47);
                }
            }
            b4.setBackgroundColor(getColor(R.color.touched));
            new CountDownTimer(1*100,100){

                @Override
                public void onTick(long millisUntilFinished) {
                    String.valueOf(millisUntilFinished/100);
                }

                @SuppressLint("NewApi")
                @Override
                public void onFinish() {
                    b4.setBackgroundColor(getColor(R.color.return_key));
                }
            }.start();
            return false;
        });

        c5.setOnTouchListener((v, event) -> {
            Log.d(this.getClass().getName(), "Motion event: " + event);
            if (v.getId() == R.id.c5) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                    playNote(0x90,0x00,0x48);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                    stopNote(0x80, 0x00, 0x48);
                }
            }
            c5.setBackgroundColor(getColor(R.color.touched));
            new CountDownTimer(1*100,100){

                @Override
                public void onTick(long millisUntilFinished) {
                    String.valueOf(millisUntilFinished/100);
                }

                @SuppressLint("NewApi")
                @Override
                public void onFinish() {
                    c5.setBackgroundColor(getColor(R.color.return_key));
                }
            }.start();
            return false;
        });

        c4_b.setOnTouchListener((v, event) -> {
            Log.d(this.getClass().getName(), "Motion event: " + event);
            if (v.getId() == R.id.c4_b) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                    playNote(0x90,0x00,0x3D);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                    stopNote(0x80, 0x00, 0x3D);
                }
            }
            c4_b.setBackgroundColor(getColor(R.color.t_touched));
            c4.setEnabled(false);
            d4.setEnabled(false);
            new CountDownTimer(1*100,100){

                @Override
                public void onTick(long millisUntilFinished) {
                    String.valueOf(millisUntilFinished/100);
                }

                @SuppressLint("NewApi")
                @Override
                public void onFinish() {
                    c4.setEnabled(true);
                    d4.setEnabled(true);
                    c4_b.setBackgroundColor(getColor(R.color.black));
                }
            }.start();
            return false;
        });

        eb4_b.setOnTouchListener((v, event) -> {
            Log.d(this.getClass().getName(), "Motion event: " + event);
            if (v.getId() == R.id.eb4_b) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                    playNote(0x90,0x00,0x3F);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                    stopNote(0x80, 0x00, 0x3F);
                }
            }
            eb4_b.setBackgroundColor(getColor(R.color.t_touched));
            d4.setEnabled(false);
            e4.setEnabled(false);
            new CountDownTimer(1*100,100){

                @Override
                public void onTick(long millisUntilFinished) {
                    String.valueOf(millisUntilFinished/100);
                }

                @SuppressLint("NewApi")
                @Override
                public void onFinish() {
                    d4.setEnabled(true);
                    e4.setEnabled(true);
                    eb4_b.setBackgroundColor(getColor(R.color.black));
                }
            }.start();
            return false;
        });

        f4_b.setOnTouchListener((v, event) -> {
            Log.d(this.getClass().getName(), "Motion event: " + event);
            if (v.getId() == R.id.f4_b) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                    playNote(0x90,0x00,0x42);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                    stopNote(0x80, 0x00, 0x42);
                }
            }
            f4_b.setBackgroundColor(getColor(R.color.t_touched));
            f4.setEnabled(false);
            g4.setEnabled(false);
            new CountDownTimer(1*100,100){

                @Override
                public void onTick(long millisUntilFinished) {
                    String.valueOf(millisUntilFinished/100);
                }

                @SuppressLint("NewApi")
                @Override
                public void onFinish() {
                    f4.setEnabled(true);
                    g4.setEnabled(true);
                    f4_b.setBackgroundColor(getColor(R.color.black));
                }
            }.start();
            return false;
        });

        g4_b.setOnTouchListener((v, event) -> {
            Log.d(this.getClass().getName(), "Motion event: " + event);
            if (v.getId() == R.id.g4_b) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                    playNote(0x90,0x00,0x44);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                    stopNote(0x80, 0x00, 0x44);
                }
            }
            g4_b.setBackgroundColor(getColor(R.color.t_touched));
            g4.setEnabled(false);
            a4.setEnabled(false);
            new CountDownTimer(1*100,100){

                @Override
                public void onTick(long millisUntilFinished) {
                    String.valueOf(millisUntilFinished/100);
                }

                @SuppressLint("NewApi")
                @Override
                public void onFinish() {
                    g4.setEnabled(true);
                    a4.setEnabled(true);
                    g4_b.setBackgroundColor(getColor(R.color.black));
                }
            }.start();
            return false;
        });

        bb4_b.setOnTouchListener((v, event) -> {
            Log.d(this.getClass().getName(), "Motion event: " + event);
            if (v.getId() == R.id.bb4_b) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                    playNote(0x90,0x00,0x46);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                    stopNote(0x80, 0x00, 0x46);
                }
            }
            bb4_b.setBackgroundColor(getColor(R.color.t_touched));
            a4.setEnabled(false);
            b4.setEnabled(false);
            new CountDownTimer(1*100,100){

                @Override
                public void onTick(long millisUntilFinished) {
                    String.valueOf(millisUntilFinished/100);
                }

                @SuppressLint("NewApi")
                @Override
                public void onFinish() {
                    a4.setEnabled(true);
                    b4.setEnabled(true);
                    bb4_b.setBackgroundColor(getColor(R.color.black));
                }
            }.start();
            return false;
        });

        c5_b.setOnTouchListener((v, event) -> {
            Log.d(this.getClass().getName(), "Motion event: " + event);
            if (v.getId() == R.id.c5_b) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_DOWN");
                    playNote(0x90,0x00,0x49);
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    Log.d(this.getClass().getName(), "MotionEvent.ACTION_UP");
                    stopNote(0x80, 0x00, 0x49);
                }
            }
            c5_b.setBackgroundColor(getColor(R.color.t_touched));
            c5.setEnabled(false);
            new CountDownTimer(1*100,100){

                @Override
                public void onTick(long millisUntilFinished) {
                    String.valueOf(millisUntilFinished/100);
                }

                @SuppressLint("NewApi")
                @Override
                public void onFinish() {
                    c5.setEnabled(true);
                    c5_b.setBackgroundColor(getColor(R.color.black));
                }
            }.start();
            return false;
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        midiDriver.start();

        // Get the configuration.
        config = midiDriver.config();

        // Print out the details.
       /* Log.d(this.getClass().getName(), "maxVoices: " + config[0]);
        Log.d(this.getClass().getName(), "numChannels: " + config[1]);
        Log.d(this.getClass().getName(), "sampleRate: " + config[2]);
        Log.d(this.getClass().getName(), "mixBufferSize: " + config[3]);*/
    }
    @Override
    protected void onPause() {
        super.onPause();
        midiDriver.stop();
    }
    private void playNote(int noteon, int channel, int middle) {

        // Construct a note ON message for the middle C at maximum velocity on channel 1:
        event = new byte[3];
        event[0] = (byte) (noteon | channel);  // 0x90 = note On, 0x00 = channel 1
        event[1] = (byte) middle;  // eg:0x3C = middle C
        event[2] = (byte) 0x7F;  // 0x7F = the maximum velocity (127)

        // Internally this just calls write() and can be considered obsoleted:
        //midiDriver.queueEvent(event);

        // Send the MIDI event to the synthesizer.
        midiDriver.write(event);

    }

    private void stopNote(int noteoff, int channel, int middle) {

        // Construct a note OFF message for the middle C at minimum velocity on channel 1:
        event = new byte[3];
        event[0] = (byte) (noteoff | channel);  // 0x80 = note Off, 0x00 = channel 1
        event[1] = (byte) middle;  // eg:0x3C = middle C
        event[2] = (byte) 0x00;  // 0x00 = the minimum velocity (0)

        // Send the MIDI event to the synthesizer.
        midiDriver.write(event);

    }


    @Override
    public void onMidiStart() {

    }

    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}