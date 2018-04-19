package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LongestPathContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longest_path_content);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.hamiltonian_path_entry:
                startActivity(new Intent(this,HamiltonianPathContent.class));
                break;
            default:
                break;
        }
    }

}
