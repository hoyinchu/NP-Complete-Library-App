package hoyinpersonal.npcompletelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FeedbackVertexSetContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_vertex_set_content);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.vertex_cover_entry:
                startActivity(new Intent(this,VertexCoverContent.class));
                break;
            case R.id.feedback_arc_set_entry:
                startActivity(new Intent(this,FeedbackArcSetContent.class));
                break;
            default:
                break;
        }
    }

}
