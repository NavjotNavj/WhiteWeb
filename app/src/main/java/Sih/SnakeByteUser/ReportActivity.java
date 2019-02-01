package Sih.SnakeByteUser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class ReportActivity extends AppCompatActivity {
    EditText descriptionReport;
    EditText nameReport;
    private StorageReference mStorageRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        descriptionReport = findViewById(R.id.descriptionReport);
        nameReport = findViewById(R.id.nameReport);

        mStorageRef = FirebaseStorage.getInstance().getReference();
    }
}
