package com.tricodedevs.servitapantallas.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tricodedevs.servita.ui.theme.*

@Preview
@Composable
fun VistaEncuesta() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color_Background_App)
            .padding(48.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // --- Título principal ---
        Text(
            text = "Ser+ Vita",
            style = MaterialTheme.typography.titleLarge,
            color = Texto_Principal,
            fontSize = 48.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(32.dp))

        // --- Contenedor principal ---
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color_Background_Box,
                    shape = RoundedCornerShape(20.dp)
                )
                .border(
                    width = 3.dp,
                    color = Color_Contorno_Base,
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(24.dp)
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {

                // --- Subtítulo ---
                Text(
                    text = "Antes de Comenzar",
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 24.sp,
                    color = Texto_Principal,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(16.dp))

                // --- Barra de progreso ---
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(10.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(10.dp)
                            .background(Color_Contorno_Base, RoundedCornerShape(5.dp))
                    )
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(10.dp)
                            .background(Color_Background_Seleccionado, RoundedCornerShape(5.dp))
                    )
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(10.dp)
                            .background(Color_Background_Seleccionado, RoundedCornerShape(5.dp))
                    )
                }

                Spacer(modifier = Modifier.height(24.dp))

                // --- Sección: Hábitos Alimenticios ---
                Text(
                    text = "1. Hábitos Alimenticios",
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 18.sp,
                    color = Texto_Principal,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.fillMaxWidth()
                )

                Text(
                    text = "Evalúa calidad, frecuencia y estilo de alimentación.",
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 12.sp,
                    lineHeight = 14.sp,
                    color = Texto_Principal,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "° ¿Cuántas comidas completas haces al día?",
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 16.sp,
                    color = Texto_Principal,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(8.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color_Background_Seleccionado,
                            shape = RoundedCornerShape(5.dp)
                        )
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Una comida en promedio",
                        style = MaterialTheme.typography.titleMedium,
                        fontSize = 16.sp,
                        color = Texto_Principal
                    )
                    Spacer(
                        modifier = Modifier
                            .height(2.dp)
                            .fillMaxWidth()
                            .background(Color_Contorno_Base)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "De 2 a 3 comidas al día",
                        style = MaterialTheme.typography.titleMedium,
                        fontSize = 16.sp,
                        color = Texto_Principal
                    )
                    Spacer(
                        modifier = Modifier
                            .height(2.dp)
                            .fillMaxWidth()
                            .background(Color_Contorno_Base)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Más de 3 comidas al día",
                        style = MaterialTheme.typography.titleMedium,
                        fontSize = 16.sp,
                        color = Texto_Principal
                    )
                }

                Spacer(modifier = Modifier.height(24.dp))

                // --- Pregunta 2 ---
                Text(
                    text = "° ¿Tomas bebidas azucaradas regularmente?",
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 16.sp,
                    color = Texto_Principal,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(8.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color_Background_Seleccionado,
                            shape = RoundedCornerShape(5.dp)
                        )
                        .padding(10.dp)
                ) {
                    Text(
                        text = "No",
                        style = MaterialTheme.typography.titleMedium,
                        fontSize = 16.sp,
                        color = Texto_Principal
                    )
                    Spacer(
                        modifier = Modifier
                            .height(2.dp)
                            .fillMaxWidth()
                            .background(Color_Contorno_Base)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "A veces",
                        style = MaterialTheme.typography.titleMedium,
                        fontSize = 16.sp,
                        color = Texto_Principal
                    )
                    Spacer(
                        modifier = Modifier
                            .height(2.dp)
                            .fillMaxWidth()
                            .background(Color_Contorno_Base)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Siempre",
                        style = MaterialTheme.typography.titleMedium,
                        fontSize = 16.sp,
                        color = Texto_Principal
                    )
                }

                Spacer(modifier = Modifier.height(32.dp))

                // --- Botón siguiente ---
                Card(
                    modifier = Modifier
                        .fillMaxWidth(0.7f)
                        .height(70.dp)
                        .padding(8.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color_Background_Seleccionado
                    ),
                    elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                    shape = RoundedCornerShape(5.dp)
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Siguiente",
                            style = MaterialTheme.typography.titleMedium,
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}
