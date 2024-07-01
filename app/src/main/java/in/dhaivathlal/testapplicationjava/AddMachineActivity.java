package in.dhaivathlal.testapplicationjava;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import in.dhaivathlal.testapplicationjava.services.MachineService;

public class AddMachineActivity extends AppCompatActivity {

    private MachineService machineService;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        machineService = MachineService.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_machine);


        Switch s = findViewById(R.id.switch1);
        s.setOnCheckedChangeListener((button,state) -> {
            TextInputLayout textInputLayout = findViewById(R.id.password);
            textInputLayout.setEnabled(state);
        });

        Button save = findViewById(R.id.button);
        save.setOnClickListener(view -> {

        });
    }
}
