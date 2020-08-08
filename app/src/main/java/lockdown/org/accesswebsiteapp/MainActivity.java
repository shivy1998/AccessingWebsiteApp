package lockdown.org.accesswebsiteapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.net.URI;

public class MainActivity extends AppCompatActivity
{
    Button btnGo;
    EditText etWebsite;
    protected void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        btnGo = findViewById(R.id.btnGo);
        etWebsite = findViewById(R.id.etWebsite);
        btnGo.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String website = etWebsite.getText().toString();
                Intent i = new Intent("android.intent.action.VIEW");
                i.setData(Uri.parse("http://"+website));
                startActivity(i);
            }
        });
    }
}
