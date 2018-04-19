package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SatisfiabilityContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satisfiability_content);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.three_satisfiability_entry:
                Intent intent2 = new Intent(this,ThreeSatisfiabilityContent.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
