package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HamiltonianPathContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamiltonian_path_content);
    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.hamiltonian_cycle_entry:
                startActivity(new Intent(this,HamiltonianCycleContent.class));
                break;
            case R.id.longest_path_entry:
                startActivity(new Intent(this, LongestPathContent.class));
                break;
            default:
                break;
        }
    }
}
