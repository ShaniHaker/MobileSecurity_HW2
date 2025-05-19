package com.example.android_assi2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_Game extends AppCompatActivity {
    public static final String EXTRA_ID = "EXTRA_ID";
    public static final String EXTRA_STATE = "EXTRA_STATE";

    private ImageButton[] arrows;
    private int currentLevel = 0;
    private boolean goodToGo = true;
    private int[] steps = {1, 1, 1, 2, 2, 2, 3, 3, 3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        String id = getIntent().getStringExtra(EXTRA_ID);
        if (id.length() == steps.length) {
            for (int i = 0; i < steps.length; i++) {
                steps[i] = Integer.parseInt(String.valueOf(id.charAt(i))) % 4;
            }
        }

        findViews();
        initViews();
    }

    private void findViews() {

        arrows = new ImageButton[]{
                findViewById(R.id.game_BTN_left),
                findViewById(R.id.game_BTN_right),
                findViewById(R.id.game_BTN_up),
                findViewById(R.id.game_BTN_down)
        };
    }

    private void initViews() {
        for (int i = 0; i < arrows.length; i++) {
            final int finalI = i;
            arrows[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    arrowClicked(finalI);
                }
            });
        }
    }

    private void arrowClicked(int direction) {
        if (goodToGo && direction != steps[currentLevel]) {
            goodToGo = false;
        }
        currentLevel++;
        if (currentLevel >= steps.length) {
            finishGame();
        }
    }

    private void finishGame() {
        String state = getIntent().getStringExtra(EXTRA_STATE);
        if (goodToGo) {
            Toast.makeText(this, "Survived in " + state, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You Failed", Toast.LENGTH_SHORT).show();
        }
        finish();
    }
}
