package mohit.rps1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b_rock, b_paper, b_scissors;
    ImageView iv_cpu, iv_my;
    String myChoice, cpuChoice, result;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_cpu = (ImageView) findViewById(R.id.iv_cpu);
        iv_my = (ImageView) findViewById(R.id.iv_me);

        b_rock = (Button) findViewById(R.id.b_rock);
        b_paper = (Button) findViewById(R.id.b_paper);
        b_scissors = (Button) findViewById(R.id.b_Scissors);
        r = new Random();

        b_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myChoice = "rock";
                iv_my.setImageResource(R.drawable.rock);
                calculate();
            }
        });
        b_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myChoice = "paper";
                iv_my.setImageResource(R.drawable.papers);
                calculate();
            }
        });
        b_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myChoice = "scissors";
                iv_my.setImageResource(R.drawable.scissors);
                calculate();
            }
        });
    }

    public void calculate() {
        int cpu = r.nextInt(3);
        if (cpu == 0) {
            cpuChoice = "rock";
            iv_cpu.setImageResource(R.drawable.rock);
        } else if (cpu == 1) {
            cpuChoice = "paper";
            iv_cpu.setImageResource(R.drawable.papers);
        } else if (cpu == 2) {
            ;
            cpuChoice = "scissors";
            iv_cpu.setImageResource(R.drawable.scissors);
        }

        if (myChoice.equals("rock") && cpuChoice.equals("paper")) {
            result = "you loose!!";
        }else if (myChoice.equals("rock") && cpuChoice.equals("scissors")) {
            result = "you WON";
        }else if (myChoice.equals("paper") && cpuChoice.equals("rock")) {
            result = "you WON";
        }else if (myChoice.equals("paper") && cpuChoice.equals("scissors")) {
            result = "you loose!!";
        }else if (myChoice.equals("scissors") && cpuChoice.equals("paper")) {
            result = "you WON";
        }else if (myChoice.equals("scissors") && cpuChoice.equals("rock")) {
            result = "you loose!!";
        }else if (myChoice.equals("scissors") && cpuChoice.equals("scissors")) {
            result = "DRAW";
        }else if (myChoice.equals("rock") && cpuChoice.equals("rock")) {
            result = "DRAW";
        }else if (myChoice.equals("paper") && cpuChoice.equals("paper")) {
            result = "DRAW";
        }
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}