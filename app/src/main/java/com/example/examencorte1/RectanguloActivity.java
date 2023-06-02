package com.example.examencorte1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RectanguloActivity extends AppCompatActivity {

    private Rectangulo rectangulo;
    private TextView lblBase;
    private EditText txtBase;
    private TextView lblAltura;
    private EditText txtAltura;
    private TextView lblCalculoArea;
    private TextView lblCalArea;
    private TextView lblCalPerimetro;
    private Button btnCalcular;
    private Button btnLimpiar;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);

        // Inicializar los elementos de la interfaz
        lblBase = findViewById(R.id.lblBase);
        txtBase = findViewById(R.id.txtBase);
        lblAltura = findViewById(R.id.lblAltura);
        txtAltura = findViewById(R.id.txtAltura);
        lblCalculoArea = findViewById(R.id.lblCalculoArea);
        lblCalArea = findViewById(R.id.lblCalArea);
        lblCalPerimetro = findViewById(R.id.lblCalPerimetro);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        btnRegresar = findViewById(R.id.btnRegresar);

        // Crear una nueva instancia de Rectangulo
        rectangulo = new Rectangulo();

        // Configurar el OnClickListener para el botón Calcular
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores de base y altura desde los EditText
                int base = Integer.parseInt(txtBase.getText().toString());
                int altura = Integer.parseInt(txtAltura.getText().toString());

                // Establecer los valores de base y altura en el objeto Rectangulo
                rectangulo.setBase(base);
                rectangulo.setAltura(altura);

                // Calcular el área y perímetro del rectángulo
                float area = rectangulo.calcularArea();
                float perimetro = rectangulo.calcularPerimetro();

                // Mostrar los resultados en los TextView correspondientes
                lblCalArea.setText(String.valueOf(area));
                lblCalPerimetro.setText(String.valueOf(perimetro));
            }
        });

        // Configurar el OnClickListener para el botón Limpiar
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Limpiar los EditText y los TextView de resultados
                txtBase.setText("");
                txtAltura.setText("");
                lblCalArea.setText("");
                lblCalPerimetro.setText("");
            }
        });

        // Configurar el OnClickListener para el botón Regresar
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finalizar la actividad y volver a la actividad anterior
                finish();
            }
        });
    }
}


