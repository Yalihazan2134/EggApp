package com.example.eggapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int counter;

/*private Button btnGetOut;
btnGetOut=(Button) findViewById(R.id.btnGETOUT);
EvanHandler();
private void EvanHandler()
{
    btnGetOut.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            private void EvantHandler() {
                btnGetDut.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder Builder = new AlertDialog.Builder(MainActivity.this);
                        Builder.setMessage("Are You Sure You Wanna Leave?")
                                .setCancelable(false)
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        MainActivity.this.finish();
                                    }
                                })
                                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog Alert = Builder.create();
                        Alert.show();
                    }
                });
            }
        }
    });
}

*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 10;
        TextView counterTextView = findViewById(R.id.textview_counter);
        counterTextView.setText(String.valueOf(counter));
    }

    public void knock(View view) {
        if (counter > 0) {
            counter--;
            TextView counterTextView = findViewById(R.id.textview_counter);
            counterTextView.setText(String.valueOf(counter));

            if (counter == 0) {
                ImageView eggImageView = findViewById(R.id.imageview_egg);
                eggImageView.setImageResource(R.drawable.dino_laba);
            }
        }
    }

    public void reset(View view) {
        counter = 10;
        TextView counterTextView = findViewById(R.id.textview_counter);
        counterTextView.setText(String.valueOf(counter));
        ImageView eggImageView = findViewById(R.id.imageview_egg);
        eggImageView.setImageResource(R.drawable.egg_laba);
    }
}